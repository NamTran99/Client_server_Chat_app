package com.advanced.mockserver.data.database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.advanced.mockserver.data.database.dao.ChatDao;
import com.advanced.mockserver.data.database.dao.ConversationDao;
import com.advanced.mockserver.data.database.dao.UserDao;
import com.advanced.mockserver.ChatMessage;
import com.advanced.mockserver.Conversation;
import com.advanced.mockserver.User;
import com.advanced.mockserver.utils.Constants;

/**
 * *
 * Created by HoangRyan aka LilDua on 10/27/2023.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/advanced/mockserver/data/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "chatDao", "Lcom/advanced/mockserver/data/database/dao/ChatDao;", "conversationDao", "Lcom/advanced/mockserver/data/database/dao/ConversationDao;", "userDao", "Lcom/advanced/mockserver/data/database/dao/UserDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.advanced.mockserver.User.class, com.advanced.mockserver.Conversation.class, com.advanced.mockserver.ChatMessage.class}, version = 1)
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.advanced.mockserver.data.database.AppDatabase.Companion Companion = null;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.advanced.mockserver.data.database.dao.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.advanced.mockserver.data.database.dao.ConversationDao conversationDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.advanced.mockserver.data.database.dao.ChatDao chatDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/advanced/mockserver/data/database/AppDatabase$Companion;", "", "()V", "getDatabase", "Lcom/advanced/mockserver/data/database/AppDatabase;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.Synchronized
        @org.jetbrains.annotations.NotNull
        public final synchronized com.advanced.mockserver.data.database.AppDatabase getDatabase(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}