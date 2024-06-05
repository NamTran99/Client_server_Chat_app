package com.advanced.mockserver.di

import android.app.Application
import com.advanced.mockserver.data.database.AppDatabase
import com.advanced.mockserver.data.database.dao.UserDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Provider
import javax.inject.Singleton

/***
 * Created by HoangRyan aka LilDua on 10/29/2023.
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideChatApplication(application: Application): ChatApplication {
        return application as ChatApplication
    }
    @Provides
    @Singleton
    fun provideDatabase(application: ChatApplication, userDao: Provider<UserDao>) = AppDatabase.getDatabase(application, userDao)

    @Provides
    @Singleton
    fun provideUserDao(database: AppDatabase) = database.userDao()

    @Provides
    @Singleton
    fun provideChatDao(database: AppDatabase) = database.chatDao()

    @Provides
    @Singleton
    fun provideConversationDao(database: AppDatabase) = database.conversationDao()
}