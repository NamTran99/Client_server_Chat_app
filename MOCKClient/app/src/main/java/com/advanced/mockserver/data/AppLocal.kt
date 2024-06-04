package com.advanced.mockserver.data

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow

object AppLocal {
    val isServerConnected = MutableSharedFlow<Boolean>()
}