package com.advanced.mockserver.ui.authentication.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.advanced.mockclient.databinding.FragmentChatBinding
import com.advanced.mockclient.databinding.FragmentLoginBinding
import com.advanced.mockserver.ui.authentication.AuthenticationViewModel

class LoginFragment: Fragment() {
    private lateinit var binding: FragmentLoginBinding
    private val viewModel by viewModels<AuthenticationViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initListener()
    }

    private fun initListener() {
        binding.apply {
            buttonLogin.setOnClickListener {
                viewModel.login()
            }

        }
    }


}