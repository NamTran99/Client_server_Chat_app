package com.advanced.mockserver.ui.authentication

import android.preference.PreferenceManager
import android.util.Log
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AuthenticationViewModel: ViewModel(){
    var loginResult = MutableLiveData<Int>()
    var passwordValidation = MutableLiveData<Int>()
    var userNameValidation = MutableLiveData<Int>()
    var passwordConfirmation = ObservableField<String>()
    
    var userName: String = ""
    var passWord: String= ""

    fun login() {
        validatePassword()
        validateuserName()

        if (isInputValid()) {
            checkIfUserLogged()
        }

    }

    fun signUp() {
        validateuserName()
        validatePassword()

        if (isInputValid() && isPasswordConfirmed()) { //check if data is valid and password typed correctly
            //write user data to shared pref
//            writeUserToSharedPref()
            loginResult.value = LoginResult.SUCCESSFUL.value
        }
    }

//    private fun writeUserToSharedPref() {
//        val editor = preferences.edit()
//        editor.putString(PREF_userName,  userName)
//        editor.putString(PREF_USER_PASSWORD,  password)
//        editor.apply()
//    }

    private fun checkIfUserLogged() {
        val loggedInuserName =
            preferences.getString(PREF_userName, "Default")
        val loggedInPassword =
            preferences.getString(PREF_USER_PASSWORD, "")

        Log.d("mtag", "$loggedInuserName + $loggedInPassword")

        if (loggedInuserName != userName.trim() || loggedInPassword !=  passWord.trim()) {
            loginResult.value = LoginResult.LOGIN_ERROR.value
            return
        }

        loginResult.value = LoginResult.SUCCESSFUL.value
    }

    //fun isPasswordValid() =  userPassword.length > 5

    private fun validatePassword() {
        when {
             passWord.isEmpty() -> passwordValidation.value = LoginResult.EMPTY_PASSWORD.value
             passWord.length < 5 -> passwordValidation.value = LoginResult.SHORT_PASSWORD.value
            else -> passwordValidation.value = LoginResult.OK.value
        }
    }

    private fun validateuserName() {
        when {
             userName.isEmpty() -> userNameValidation.value = LoginResult.EMPTY_USERNAME.value
             userName.length > 10 -> userNameValidation.value = LoginResult.LONG_USERNAME.value
            else -> userNameValidation.value = LoginResult.OK.value
        }
    }

    private fun isInputValid() =
        passwordValidation.value == LoginResult.OK.value && userNameValidation.value == LoginResult.OK.value

    private fun isPasswordConfirmed(): Boolean {
        if (passwordConfirmation.get() !=  passWord) {
            passwordValidation.value = LoginResult.PASSWORD_CONFIRMATION_ERROR.value
            return false
        }
        return true
    }
}