package com.advanced.mockserver.data.database

import com.advanced.mockserver.User
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow

object AppLocal {
    val userLogin  = MutableSharedFlow<User>()
}