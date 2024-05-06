package com.advanced.mockserver.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.advanced.mockserver.ChatMessage;
import com.advanced.mockserver.Conversation;
import com.advanced.mockserver.IRemoteService;
import com.advanced.mockserver.User;
import com.advanced.mockserver.data.database.AppDatabase;

/**
 * *
 * Created by HoangRyan aka LilDua on 10/27/2023.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/advanced/mockserver/service/RemoteService;", "Landroid/app/Service;", "()V", "chatDatabase", "Lcom/advanced/mockserver/data/database/AppDatabase;", "mBinder", "Lcom/advanced/mockserver/IRemoteService$Stub;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onUnbind", "", "app_debug"})
public final class RemoteService extends android.app.Service {
    private com.advanced.mockserver.data.database.AppDatabase chatDatabase;
    @org.jetbrains.annotations.NotNull
    private final com.advanced.mockserver.IRemoteService.Stub mBinder = null;
    
    public RemoteService() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override
    public boolean onUnbind(@org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
        return false;
    }
}