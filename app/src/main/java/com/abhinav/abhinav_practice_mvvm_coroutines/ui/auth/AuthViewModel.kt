package com.abhinav.abhinav_practice_mvvm_coroutines.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel
import com.abhinav.abhinav_practice_mvvm_coroutines.data.network.repositories.UserRepository

class AuthViewModel:ViewModel() {

    var name:String?=null
    var email:String?=null
    var password:String?=null
    var passwordconfirm:String?=null

    var authListener:AuthListener?=null


    fun onLoginButtonClick(view: View){
        authListener?.onStarted()
        if(email.isNullOrEmpty() || password.isNullOrEmpty()){

            authListener?.onFailure("Invalid email or password")

            return
        }
        val loginResponse=UserRepository().userLogin(email!!,password!!)

        authListener?.onSuccess(loginResponse)
    }

   fun onSignupButtonClick(view: View) {

       authListener?.onStarted()

       if(name.isNullOrEmpty()){


           authListener?.onFailure("Name is Required")
           return
       }
       if(email.isNullOrEmpty()){


           authListener?.onFailure("Email is required")
       }
       if(password.isNullOrEmpty()){

           authListener?.onFailure("Please Enter the password")

           return
       }
       if(password != passwordconfirm){

           authListener?.onFailure("Password did not match")
           return
       }

   }
    fun onLogin(view:View){




    }

}