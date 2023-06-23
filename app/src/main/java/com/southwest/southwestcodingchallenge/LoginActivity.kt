package com.southwest.southwestcodingchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.southwest.southwestcodingchallenge.databinding.ActivityLoginBinding
import com.southwest.southwestcodingchallenge.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    private val viewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    override fun onResume() {
        super.onResume()
        binding.editTextPassword.setText("")
    }

    // TODO: use SystemMessageRepository to retrieve and display the system status message
}