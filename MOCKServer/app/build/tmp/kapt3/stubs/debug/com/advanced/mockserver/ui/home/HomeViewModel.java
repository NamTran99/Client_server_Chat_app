package com.advanced.mockserver.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.advanced.mockserver.data.database.repository.ConversationRepository;
import com.advanced.mockserver.data.database.repository.UserRepository;
import com.advanced.mockserver.Conversation;
import com.advanced.mockserver.User;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

/**
 * *
 * Created by HoangRyan aka LilDua on 10/28/2023.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0016\u001a\u00020\u0014J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0016\u001a\u00020\u0014J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0019\u001a\u00020\nJ\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u001b\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f\u00a8\u0006\u001c"}, d2 = {"Lcom/advanced/mockserver/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/advanced/mockserver/data/database/repository/UserRepository;", "conversationRepository", "Lcom/advanced/mockserver/data/database/repository/ConversationRepository;", "(Lcom/advanced/mockserver/data/database/repository/UserRepository;Lcom/advanced/mockserver/data/database/repository/ConversationRepository;)V", "conversations", "Landroidx/lifecycle/LiveData;", "", "Lcom/advanced/mockserver/Conversation;", "getConversations", "()Landroidx/lifecycle/LiveData;", "users", "Lcom/advanced/mockserver/User;", "getUsers", "deleteConversationById", "Lkotlinx/coroutines/flow/Flow;", "", "conversationId", "", "deleteUserById", "userId", "getUserById", "insertConversation", "conversation", "insertUser", "user", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.advanced.mockserver.data.database.repository.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.advanced.mockserver.data.database.repository.ConversationRepository conversationRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.advanced.mockserver.User>> users = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.advanced.mockserver.Conversation>> conversations = null;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.advanced.mockserver.data.database.repository.UserRepository userRepository, @org.jetbrains.annotations.NotNull
    com.advanced.mockserver.data.database.repository.ConversationRepository conversationRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.advanced.mockserver.User>> getUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.advanced.mockserver.Conversation>> getConversations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Unit> insertUser(@org.jetbrains.annotations.NotNull
    com.advanced.mockserver.User user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.advanced.mockserver.User> getUserById(long userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Unit> insertConversation(@org.jetbrains.annotations.NotNull
    com.advanced.mockserver.Conversation conversation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Unit> deleteUserById(long userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Unit> deleteConversationById(long conversationId) {
        return null;
    }
}