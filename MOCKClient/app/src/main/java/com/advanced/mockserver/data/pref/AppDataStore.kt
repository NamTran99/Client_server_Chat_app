package com.advanced.mockserver.data.pref

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStoreFile
import com.advanced.mockserver.app.MyApplication


object AppDataStore  {
    private val appStore = PreferenceDataStoreFactory.create { MyApplication.instance.preferencesDataStoreFile("Server")}

//    val loginState: Flow<LoginState> = userData.map {
//        it[KEY_LOGIN_STATE].convertToObject(defaultValue = LoginState())
//    }

    suspend fun saveLoginState(
        isLoggedIn: Boolean,
    ) {
//        appStore.edit {
//            it[KEY_LOGIN_STATE] = GsLoginState(isLoggedIn, loginKey))
//        }
    }

    suspend fun clear() {
        appStore.edit { preferences ->
            preferences.clear()
        }
    }

    private val KEY_LOGIN_STATE = booleanPreferencesKey("keyLoginState")

}