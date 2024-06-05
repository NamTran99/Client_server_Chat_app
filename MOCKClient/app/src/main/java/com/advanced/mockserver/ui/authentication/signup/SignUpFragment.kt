package com.advanced.mockserver.ui.authentication.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.advanced.mockclient.R
import com.advanced.mockclient.databinding.FragmentSignUpBinding
import com.advanced.mockserver.ui.authentication.AuthenticationViewModel
import com.advanced.mockserver.ui.authentication.LoginResult

class SignUpFragment : Fragment() {
    private lateinit var binding: FragmentSignUpBinding
    private val userVM by viewModels<AuthenticationViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSignUpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initListener()
        initObserver()
    }

    private fun initListener() {

    }

    private fun initObserver() {
        userVM.passwordValidation.observe(viewLifecycleOwner){
            when (it) {
                LoginResult.EMPTY_PASSWORD.value -> setPasswordError(getString(R.string.password_error_no_password))
                LoginResult.SHORT_PASSWORD.value -> setPasswordError(getString(R.string.password_error_short_password))
                LoginResult.PASSWORD_CONFIRMATION_ERROR.value -> setPasswordConfirmationError(getString(R.string.password_error_password_not_confirmed))
                else -> resetPasswordError()
            }
        }

        // Reacting to username validation result
        userVM.userNameValidation.observe(viewLifecycleOwner){ newValue: Int ->
            when (newValue) {
                LoginResult.EMPTY_USERNAME.value -> setUserNameError(getString(R.string.username_error_no_username))
                LoginResult.LONG_USERNAME.value -> setUserNameError(getString((R.string.username_error_long_username)))
                else -> binding.editUsername.error = null
            }
        }

        userVM.loginResult.observe(viewLifecycleOwner){
            if (it == LoginResult.SUCCESSFUL.value) {
//                startMainActivity()
            }
        }
    }

    private fun setPasswordConfirmationError(errorMsg: String) {
        binding.editPasswordConfirm.error = errorMsg
        binding.editPasswordConfirm.requestFocus()
    }

    private fun setUserNameError(errorMsg: String) {
        binding.editUsername.error = errorMsg
        binding.editUsername.requestFocus()
    }

    private fun setPasswordError(errorMsg: String) {
        binding.editPassword.error = errorMsg
        binding.editPassword.requestFocus()
    }

    private fun resetPasswordError(){
        binding.editPassword.error = null
        binding.editPasswordConfirm.error = null
    }

}