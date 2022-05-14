package com.arphis.util

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences

class Prefs(activity: Activity) {
    private var sp : SharedPreferences? = null
    private val Login = "login"

    init {
        sp = activity.getSharedPreferences("MYPREF", Context.MODE_PRIVATE)
    }

    fun setIsLogin(value: Boolean){
        sp!!.edit().putBoolean(Login, true).apply()
    }

    fun getIsLogin(): Boolean{
        return sp!!.getBoolean(Login, false)
    }
}