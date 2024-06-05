package com.advanced.mockserver

import android.app.Service
import android.content.ComponentName
import android.content.Intent
import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import com.advanced.mockclient.R
import com.advanced.mockserver.service.ConnectServer
import com.advanced.mockserver.utils.Constants

class MainActivity : AppCompatActivity() {

    var remoteService: IRemoteService? = null
//    private var isServiceBound = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        ConnectServer.initConnection()
//        initConnection()
    }
//    fun initConnection() {
//        if(!isServiceBound) {
//            val intent = Intent(IRemoteService::class.java.name)
//            intent.action = "remote_service"
//            intent.setPackage("com.advanced.mockserver")
//            this.bindService(intent,serviceConnection, Service.BIND_AUTO_CREATE)
//        }
//    }

//    private val serviceConnection: ServiceConnection = object : ServiceConnection {
//        override fun onServiceConnected(componentName: ComponentName, iBinder: IBinder) {
//            Log.d(Constants.TAG, "Service Connected")
//            remoteService = IRemoteService.Stub.asInterface(iBinder)
//            isServiceBound = true
//        }
//
//        override fun onServiceDisconnected(componentName: ComponentName) {
//            Log.d(Constants.TAG, "Service Disconnected")
//            isServiceBound = false
//        }
//    }

    override fun onDestroy() {
        super.onDestroy()
//        unbindService(serviceConnection)
    }

}