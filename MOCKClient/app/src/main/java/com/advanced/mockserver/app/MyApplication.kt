package com.advanced.mockserver.app

import android.app.Application
import com.advanced.mockserver.service.ConnectServer

class MyApplication: Application() {
    companion object {
        lateinit var instance: MyApplication
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        ConnectServer.initConnection()
    }

}