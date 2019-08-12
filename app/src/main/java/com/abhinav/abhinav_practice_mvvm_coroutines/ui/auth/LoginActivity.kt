package com.abhinav.abhinav_practice_mvvm_coroutines.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.abhinav.abhinav_practice_mvvm_coroutines.R
import com.abhinav.abhinav_practice_mvvm_coroutines.databinding.LoginActivityBinding
import com.abhinav.abhinav_practice_mvvm_coroutines.util.hide
import com.abhinav.abhinav_practice_mvvm_coroutines.util.show
import com.abhinav.abhinav_practice_mvvm_coroutines.util.toast
import kotlinx.android.synthetic.main.login_activity.*

class LoginActivity : AppCompatActivity(), AuthListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding:LoginActivityBinding=DataBindingUtil.setContentView(this,R.layout.login_activity)
        val viewModel= ViewModelProviders.of(this).get(AuthViewModel::class.java)
        binding.viewmodel=viewModel
        viewModel.authListener=this


    }


    override fun onStarted() {

        progress_bar.show()

    }

    override fun onSuccess(loginResponse: LiveData<String>) {


        loginResponse.observe(this, Observer{
            progress_bar.hide()
            toast(it)
        })

    }

    override fun onFailure(message: String) {

        toast(message)

        //startActivity(Intent(this,SignupActivity::class.java))
    }

}
