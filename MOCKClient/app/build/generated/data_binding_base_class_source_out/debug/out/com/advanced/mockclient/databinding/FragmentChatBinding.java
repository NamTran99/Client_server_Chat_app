// Generated by data binding compiler. Do not edit!
package com.advanced.mockclient.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.advanced.mockclient.R;
import com.advanced.mockserver.ui.chat.ChatFragment;
import com.advanced.mockserver.ui.chat.ChatViewModel;
import com.makeramen.roundedimageview.RoundedImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentChatBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout frameBack;

  @NonNull
  public final FrameLayout frameImage;

  @NonNull
  public final FrameLayout frameInfo;

  @NonNull
  public final FrameLayout frameSend;

  @NonNull
  public final ImageView imageBack;

  @NonNull
  public final RoundedImageView imageContact;

  @NonNull
  public final ImageView imageInfo;

  @NonNull
  public final EditText inputMessage;

  @NonNull
  public final RecyclerView recyclerViewChat;

  @NonNull
  public final TextView textAvailability;

  @NonNull
  public final TextView textNameUser;

  @NonNull
  public final View viewBackground;

  @NonNull
  public final View viewHeader;

  @NonNull
  public final View viewSupportHeader;

  @Bindable
  protected ChatViewModel mViewModel;

  @Bindable
  protected ChatFragment mChatFragment;

  protected FragmentChatBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FrameLayout frameBack, FrameLayout frameImage, FrameLayout frameInfo, FrameLayout frameSend,
      ImageView imageBack, RoundedImageView imageContact, ImageView imageInfo,
      EditText inputMessage, RecyclerView recyclerViewChat, TextView textAvailability,
      TextView textNameUser, View viewBackground, View viewHeader, View viewSupportHeader) {
    super(_bindingComponent, _root, _localFieldCount);
    this.frameBack = frameBack;
    this.frameImage = frameImage;
    this.frameInfo = frameInfo;
    this.frameSend = frameSend;
    this.imageBack = imageBack;
    this.imageContact = imageContact;
    this.imageInfo = imageInfo;
    this.inputMessage = inputMessage;
    this.recyclerViewChat = recyclerViewChat;
    this.textAvailability = textAvailability;
    this.textNameUser = textNameUser;
    this.viewBackground = viewBackground;
    this.viewHeader = viewHeader;
    this.viewSupportHeader = viewSupportHeader;
  }

  public abstract void setViewModel(@Nullable ChatViewModel viewModel);

  @Nullable
  public ChatViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setChatFragment(@Nullable ChatFragment chatFragment);

  @Nullable
  public ChatFragment getChatFragment() {
    return mChatFragment;
  }

  @NonNull
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_chat, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentChatBinding>inflateInternal(inflater, R.layout.fragment_chat, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_chat, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentChatBinding>inflateInternal(inflater, R.layout.fragment_chat, null, false, component);
  }

  public static FragmentChatBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentChatBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentChatBinding)bind(component, view, R.layout.fragment_chat);
  }
}
