package com.advanced.mockserver.ui.chat;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.advanced.mockserver.R;
import com.advanced.mockserver.ChatMessage;
import com.advanced.mockserver.databinding.FragmentChatBinding;
import com.advanced.mockserver.ui.chat.message.MessageAdapter;
import com.advanced.mockserver.utils.Constants;
import dagger.hilt.android.AndroidEntryPoint;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * *
 * Created by HoangRyan aka LilDua on 10/28/2023.
 */
@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0017H\u0016J\u001a\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0006\u0010%\u001a\u00020\u0017J\u0006\u0010&\u001a\u00020\u0017J\u0018\u0010\'\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/advanced/mockserver/ui/chat/ChatFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/advanced/mockserver/ui/chat/message/MessageAdapter;", "binding", "Lcom/advanced/mockserver/databinding/FragmentChatBinding;", "chatViewModel", "Lcom/advanced/mockserver/ui/chat/ChatViewModel;", "getChatViewModel", "()Lcom/advanced/mockserver/ui/chat/ChatViewModel;", "chatViewModel$delegate", "Lkotlin/Lazy;", "conversationId", "", "Ljava/lang/Long;", "receiverId", "receiverImage", "", "receiverName", "", "senderId", "backToHome", "", "getCurrentTime", "initConversation", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "removeConversation", "sendMessage", "updateCurrentConversation", "message", "app_debug"})
public final class ChatFragment extends androidx.fragment.app.Fragment {
    private com.advanced.mockserver.databinding.FragmentChatBinding binding;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy chatViewModel$delegate = null;
    private com.advanced.mockserver.ui.chat.message.MessageAdapter adapter;
    @org.jetbrains.annotations.Nullable
    private java.lang.Long conversationId;
    private long receiverId = 0L;
    private long senderId = 0L;
    private int receiverImage = 0;
    @org.jetbrains.annotations.NotNull
    private java.lang.String receiverName = "";
    
    public ChatFragment() {
        super();
    }
    
    private final com.advanced.mockserver.ui.chat.ChatViewModel getChatViewModel() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initConversation() {
    }
    
    @java.lang.Override
    public void onStart() {
    }
    
    public final void sendMessage() {
    }
    
    private final void updateCurrentConversation(long conversationId, java.lang.String message) {
    }
    
    public final void removeConversation() {
    }
    
    private final java.lang.String getCurrentTime() {
        return null;
    }
    
    public final void backToHome() {
    }
}