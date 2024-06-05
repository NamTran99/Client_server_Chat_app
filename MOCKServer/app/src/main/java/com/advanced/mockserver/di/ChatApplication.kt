package com.advanced.mockserver.di

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/***
 * Created by HoangRyan aka LilDua on 10/29/2023.
 */
@HiltAndroidApp
class ChatApplication : Application(){
    companion object {
        lateinit var instance: ChatApplication
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}