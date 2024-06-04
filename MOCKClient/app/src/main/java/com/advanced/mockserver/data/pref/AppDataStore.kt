package com.advanced.mockserver.data.pref

import androidx.datastore.core.DataStore
import java.util.prefs.Preferences


class AppDataStore constructor(
    private val appStore: DataStore<Preferences>,
) {
    private val userData = appStore.data

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

    companion object {
        private val KEY_LOGIN_STATE = booleanPreferencesKey("keyLoginState")

    }
}