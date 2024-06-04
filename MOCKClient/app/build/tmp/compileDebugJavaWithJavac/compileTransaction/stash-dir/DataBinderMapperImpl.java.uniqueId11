package com.advanced.mockclient;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.advanced.mockclient.databinding.FragmentChatBindingImpl;
import com.advanced.mockclient.databinding.FragmentHomeBindingImpl;
import com.advanced.mockclient.databinding.ItemConversationBindingImpl;
import com.advanced.mockclient.databinding.ItemReceivedMessageBindingImpl;
import com.advanced.mockclient.databinding.ItemSentMessageBindingImpl;
import com.advanced.mockclient.databinding.ItemUserBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTCHAT = 1;

  private static final int LAYOUT_FRAGMENTHOME = 2;

  private static final int LAYOUT_ITEMCONVERSATION = 3;

  private static final int LAYOUT_ITEMRECEIVEDMESSAGE = 4;

  private static final int LAYOUT_ITEMSENTMESSAGE = 5;

  private static final int LAYOUT_ITEMUSER = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.advanced.mockclient.R.layout.fragment_chat, LAYOUT_FRAGMENTCHAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.advanced.mockclient.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.advanced.mockclient.R.layout.item_conversation, LAYOUT_ITEMCONVERSATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.advanced.mockclient.R.layout.item_received_message, LAYOUT_ITEMRECEIVEDMESSAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.advanced.mockclient.R.layout.item_sent_message, LAYOUT_ITEMSENTMESSAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.advanced.mockclient.R.layout.item_user, LAYOUT_ITEMUSER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTCHAT: {
          if ("layout/fragment_chat_0".equals(tag)) {
            return new FragmentChatBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_chat is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCONVERSATION: {
          if ("layout/item_conversation_0".equals(tag)) {
            return new ItemConversationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_conversation is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMRECEIVEDMESSAGE: {
          if ("layout/item_received_message_0".equals(tag)) {
            return new ItemReceivedMessageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_received_message is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSENTMESSAGE: {
          if ("layout/item_sent_message_0".equals(tag)) {
            return new ItemSentMessageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_sent_message is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMUSER: {
          if ("layout/item_user_0".equals(tag)) {
            return new ItemUserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_user is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(7);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "chatFragment");
      sKeys.put(2, "conversation");
      sKeys.put(3, "homeFragment");
      sKeys.put(4, "message");
      sKeys.put(5, "user");
      sKeys.put(6, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/fragment_chat_0", com.advanced.mockclient.R.layout.fragment_chat);
      sKeys.put("layout/fragment_home_0", com.advanced.mockclient.R.layout.fragment_home);
      sKeys.put("layout/item_conversation_0", com.advanced.mockclient.R.layout.item_conversation);
      sKeys.put("layout/item_received_message_0", com.advanced.mockclient.R.layout.item_received_message);
      sKeys.put("layout/item_sent_message_0", com.advanced.mockclient.R.layout.item_sent_message);
      sKeys.put("layout/item_user_0", com.advanced.mockclient.R.layout.item_user);
    }
  }
}
