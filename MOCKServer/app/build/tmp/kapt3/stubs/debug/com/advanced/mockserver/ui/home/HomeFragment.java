package com.advanced.mockserver.ui.home;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.advanced.mockserver.R;
import com.advanced.mockserver.Conversation;
import com.advanced.mockserver.User;
import com.advanced.mockserver.databinding.FragmentHomeBinding;
import com.advanced.mockserver.ui.home.conversation.ConversationAdapter;
import com.advanced.mockserver.ui.home.user.UserAdapter;
import com.advanced.mockserver.utils.Constants;
import dagger.hilt.android.AndroidEntryPoint;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * *
 * Created by HoangRyan aka LilDua on 10/28/2023.
 */
@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0006\u0010\u001d\u001a\u00020\u0014J\u0006\u0010\u001e\u001a\u00020\u0014J\b\u0010\u001f\u001a\u00020\u0014H\u0016J\u001a\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u000e\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020$J\b\u0010\'\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/advanced/mockserver/ui/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/advanced/mockserver/databinding/FragmentHomeBinding;", "conversationAdapter", "Lcom/advanced/mockserver/ui/home/conversation/ConversationAdapter;", "homeViewModel", "Lcom/advanced/mockserver/ui/home/HomeViewModel;", "getHomeViewModel", "()Lcom/advanced/mockserver/ui/home/HomeViewModel;", "homeViewModel$delegate", "Lkotlin/Lazy;", "keyType", "", "userAdapter", "Lcom/advanced/mockserver/ui/home/user/UserAdapter;", "getCurrentTime", "", "insertNewUser", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onFriendClick", "onRecentConversationClick", "onStart", "onViewCreated", "view", "removeConversationWithId", "conversationId", "", "removeUserWithId", "userId", "setListenerUser", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private com.advanced.mockserver.databinding.FragmentHomeBinding binding;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy homeViewModel$delegate = null;
    private com.advanced.mockserver.ui.home.user.UserAdapter userAdapter;
    private com.advanced.mockserver.ui.home.conversation.ConversationAdapter conversationAdapter;
    private int keyType = 1;
    
    public HomeFragment() {
        super();
    }
    
    private final com.advanced.mockserver.ui.home.HomeViewModel getHomeViewModel() {
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
    
    public final void onRecentConversationClick() {
    }
    
    public final void onFriendClick() {
    }
    
    private final void setListenerUser() {
    }
    
    private final void insertNewUser() {
    }
    
    public final void removeUserWithId(long userId) {
    }
    
    public final void removeConversationWithId(long conversationId) {
    }
    
    private final java.lang.String getCurrentTime() {
        return null;
    }
    
    @java.lang.Override
    public void onStart() {
    }
}