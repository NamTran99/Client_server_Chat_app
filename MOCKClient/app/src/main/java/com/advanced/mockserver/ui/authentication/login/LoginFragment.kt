package com.advanced.mockserver.ui.authentication.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.advanced.mockclient.R
import com.advanced.mockclient.databinding.FragmentLoginBinding
import com.advanced.mockserver.ui.authentication.AuthenticationViewModel
import com.advanced.mockserver.ui.authentication.LoginResult
import com.google.android.material.snackbar.Snackbar

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    private val viewModel by viewModels<AuthenticationViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initListener()
        initObserver()
    }

    private fun initObserver() {
        viewModel.loginResult.observe(viewLifecycleOwner) {
            when (it) {
                LoginResult.LOGIN_ERROR.value -> showSnackbar()
                LoginResult.SUCCESSFUL.value -> {
//                    startMainActivity()
                }
            }
        }

        viewModel.passwordValidation.observe(viewLifecycleOwner) {
            when (it) {
                LoginResult.EMPTY_PASSWORD.value -> setPasswordError(getString(R.string.password_error_no_password))
                LoginResult.SHORT_PASSWORD.value -> setPasswordError(getString(R.string.password_error_short_password))
                else -> binding.editPassword.error = null

            }
        }

        // Reacting to username validation result
        viewModel.userNameValidation.observe(viewLifecycleOwner) { newValue: Int ->
            when (newValue) {
                LoginResult.EMPTY_USERNAME.value -> setUserNameError(getString((R.string.username_error_no_username)))
                LoginResult.LONG_USERNAME.value -> setUserNameError(getString((R.string.username_error_long_username)))
                else -> binding.editUsername.error = null
            }
        }
    }


    private fun showSnackbar() {
        Snackbar.make(binding.root, R.string.login_error_incorrect_input, Snackbar.LENGTH_LONG)
            .setAction("Sign up") {
//                signUp(it)
            }.show()
    }

    private fun setUserNameError(errorMsg: String) {
        binding.editUsername.error = errorMsg
        binding.editUsername.requestFocus()
    }

    private fun setPasswordError(errorMsg: String) {
        binding.editPassword.error = errorMsg
        binding.editPassword.requestFocus()
    }

    private fun initListener() {
        binding.apply {
            buttonLogin.setOnClickListener {

                viewModel.apply {
                    userName = binding.editUsernameInput.text.toString()
                    passWord = binding.editPasswordInput.text.toString()

                    login()
                }
            }
        }
    }

}