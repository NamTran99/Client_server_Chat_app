package com.advanced.mockserver.di;

import android.app.Application;
import com.advanced.mockserver.data.database.AppDatabase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

/**
 * *
 * Created by HoangRyan aka LilDua on 10/29/2023.
 */
@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/advanced/mockserver/di/AppModule;", "", "()V", "provideChatApplication", "Lcom/advanced/mockserver/di/ChatApplication;", "application", "Landroid/app/Application;", "provideChatDao", "Lcom/advanced/mockserver/data/database/dao/ChatDao;", "database", "Lcom/advanced/mockserver/data/database/AppDatabase;", "provideConversationDao", "Lcom/advanced/mockserver/data/database/dao/ConversationDao;", "provideDatabase", "provideUserDao", "Lcom/advanced/mockserver/data/database/dao/UserDao;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.advanced.mockserver.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.advanced.mockserver.di.ChatApplication provideChatApplication(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.advanced.mockserver.data.database.AppDatabase provideDatabase(@org.jetbrains.annotations.NotNull
    com.advanced.mockserver.di.ChatApplication application) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.advanced.mockserver.data.database.dao.UserDao provideUserDao(@org.jetbrains.annotations.NotNull
    com.advanced.mockserver.data.database.AppDatabase database) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.advanced.mockserver.data.database.dao.ChatDao provideChatDao(@org.jetbrains.annotations.NotNull
    com.advanced.mockserver.data.database.AppDatabase database) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.advanced.mockserver.data.database.dao.ConversationDao provideConversationDao(@org.jetbrains.annotations.NotNull
    com.advanced.mockserver.data.database.AppDatabase database) {
        return null;
    }
}