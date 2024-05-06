package com.advanced.mockserver.utils;

/**
 * *
 * Created by HoangRyan aka LilDua on 10/27/2023.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/advanced/mockserver/utils/Constants;", "", "()V", "COLUMN_ID", "", "COLUMN_LAST_MESSAGE", "COLUMN_TIMESTAMP", "DATABASE_NAME", "DATABASE_VERSION", "", "KEY_CONVERSATION_ID", "KEY_RECEIVER_ID", "KEY_RECEIVER_IMAGE", "KEY_SENDER_ID", "TABLE_CHATS", "TABLE_CONVERSATIONS", "TABLE_USERS", "VIEW_TYPE_CONVERSATIONS", "VIEW_TYPE_FRIENDS", "VIEW_TYPE_RECEIVED", "VIEW_TYPE_SENT", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DATABASE_NAME = "chat-app.db";
    public static final int DATABASE_VERSION = 1;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String COLUMN_ID = "id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TABLE_USERS = "users";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TABLE_CONVERSATIONS = "conversations";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_CONVERSATION_ID = "conversationId";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String COLUMN_LAST_MESSAGE = "lastMessage";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String COLUMN_TIMESTAMP = "timestamp";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TABLE_CHATS = "chats";
    public static final int VIEW_TYPE_SENT = 1;
    public static final int VIEW_TYPE_RECEIVED = 2;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_SENDER_ID = "senderId";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_RECEIVER_ID = "receiverId";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_RECEIVER_IMAGE = "receiverImage";
    public static final int VIEW_TYPE_CONVERSATIONS = 1;
    public static final int VIEW_TYPE_FRIENDS = 2;
    @org.jetbrains.annotations.NotNull
    public static final com.advanced.mockserver.utils.Constants INSTANCE = null;
    
    private Constants() {
        super();
    }
}