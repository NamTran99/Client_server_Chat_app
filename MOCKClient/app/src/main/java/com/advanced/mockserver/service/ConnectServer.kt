package com.advanced.mockserver.service

import android.app.Service
import android.content.ComponentName
import android.content.Intent
import android.content.ServiceConnection
import android.os.IBinder
import android.util.Log
import com.advanced.mockserver.IRemoteService
import com.advanced.mockserver.app.MyApplication
import com.advanced.mockserver.utils.Constants

object ConnectServer {
    var remoteService: IRemoteService? = null

    private var isServiceBound = false

    fun initConnection() {
        if (!isServiceBound) {
            val intent = Intent(IRemoteService::class.java.name)
            intent.action = "remote_service"
            intent.setPackage("com.advanced.mockserver")
            MyApplication.instance.bindService(intent, serviceConnection, Service.BIND_AUTO_CREATE)
        }
    }

    private val serviceConnection: ServiceConnection = object : ServiceConnection {
        override fun onServiceConnected(componentName: ComponentName, iBinder: IBinder) {
            Log.d(Constants.TAG, "Service Connected")
            remoteService = IRemoteService.Stub.asInterface(iBinder)
            isServiceBound = true
        }

        override fun onServiceDisconnected(componentName: ComponentName) {
            Log.d(Constants.TAG, "Service Disconnected")
            isServiceBound = false
        }
    }

}