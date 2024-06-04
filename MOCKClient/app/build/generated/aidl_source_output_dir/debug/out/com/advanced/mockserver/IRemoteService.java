/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.advanced.mockserver;
public interface IRemoteService extends android.os.IInterface
{
  /** Default implementation for IRemoteService. */
  public static class Default implements com.advanced.mockserver.IRemoteService
  {
    @Override public java.util.List<com.advanced.mockserver.Conversation> getConversation() throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.List<com.advanced.mockserver.User> getUsers() throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.List<com.advanced.mockserver.ChatMessage> getChatMessages() throws android.os.RemoteException
    {
      return null;
    }
    @Override public void sendMessage(com.advanced.mockserver.ChatMessage message) throws android.os.RemoteException
    {
    }
    @Override public void removeConversationById(long conversationId) throws android.os.RemoteException
    {
    }
    @Override public void removeUserById(long userId) throws android.os.RemoteException
    {
    }
    @Override public void updateConversation(long conversationId, java.lang.String lastMessage, java.lang.String timestamp) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.advanced.mockserver.IRemoteService
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.advanced.mockserver.IRemoteService interface,
     * generating a proxy if needed.
     */
    public static com.advanced.mockserver.IRemoteService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.advanced.mockserver.IRemoteService))) {
        return ((com.advanced.mockserver.IRemoteService)iin);
      }
      return new com.advanced.mockserver.IRemoteService.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
      }
      switch (code)
      {
        case TRANSACTION_getConversation:
        {
          java.util.List<com.advanced.mockserver.Conversation> _result = this.getConversation();
          reply.writeNoException();
          reply.writeTypedList(_result);
          break;
        }
        case TRANSACTION_getUsers:
        {
          java.util.List<com.advanced.mockserver.User> _result = this.getUsers();
          reply.writeNoException();
          reply.writeTypedList(_result);
          break;
        }
        case TRANSACTION_getChatMessages:
        {
          java.util.List<com.advanced.mockserver.ChatMessage> _result = this.getChatMessages();
          reply.writeNoException();
          reply.writeTypedList(_result);
          break;
        }
        case TRANSACTION_sendMessage:
        {
          com.advanced.mockserver.ChatMessage _arg0;
          _arg0 = _Parcel.readTypedObject(data, com.advanced.mockserver.ChatMessage.CREATOR);
          this.sendMessage(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_removeConversationById:
        {
          long _arg0;
          _arg0 = data.readLong();
          this.removeConversationById(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_removeUserById:
        {
          long _arg0;
          _arg0 = data.readLong();
          this.removeUserById(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_updateConversation:
        {
          long _arg0;
          _arg0 = data.readLong();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          this.updateConversation(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements com.advanced.mockserver.IRemoteService
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public java.util.List<com.advanced.mockserver.Conversation> getConversation() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<com.advanced.mockserver.Conversation> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getConversation, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createTypedArrayList(com.advanced.mockserver.Conversation.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.util.List<com.advanced.mockserver.User> getUsers() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<com.advanced.mockserver.User> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getUsers, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createTypedArrayList(com.advanced.mockserver. CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.util.List<com.advanced.mockserver.ChatMessage> getChatMessages() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<com.advanced.mockserver.ChatMessage> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getChatMessages, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createTypedArrayList(com.advanced.mockserver.ChatMessage.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void sendMessage(com.advanced.mockserver.ChatMessage message) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, message, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendMessage, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void removeConversationById(long conversationId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(conversationId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_removeConversationById, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void removeUserById(long userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_removeUserById, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void updateConversation(long conversationId, java.lang.String lastMessage, java.lang.String timestamp) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(conversationId);
          _data.writeString(lastMessage);
          _data.writeString(timestamp);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateConversation, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_getConversation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getUsers = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getChatMessages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_sendMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_removeConversationById = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_removeUserById = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_updateConversation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
  }
  public static final java.lang.String DESCRIPTOR = "com.advanced.mockserver.IRemoteService";
  public java.util.List<com.advanced.mockserver.Conversation> getConversation() throws android.os.RemoteException;
  public java.util.List<com.advanced.mockserver.User> getUsers() throws android.os.RemoteException;
  public java.util.List<com.advanced.mockserver.ChatMessage> getChatMessages() throws android.os.RemoteException;
  public void sendMessage(com.advanced.mockserver.ChatMessage message) throws android.os.RemoteException;
  public void removeConversationById(long conversationId) throws android.os.RemoteException;
  public void removeUserById(long userId) throws android.os.RemoteException;
  public void updateConversation(long conversationId, java.lang.String lastMessage, java.lang.String timestamp) throws android.os.RemoteException;
  /** @hide */
  static class _Parcel {
    static private <T> T readTypedObject(
        android.os.Parcel parcel,
        android.os.Parcelable.Creator<T> c) {
      if (parcel.readInt() != 0) {
          return c.createFromParcel(parcel);
      } else {
          return null;
      }
    }
    static private <T extends android.os.Parcelable> void writeTypedObject(
        android.os.Parcel parcel, T value, int parcelableFlags) {
      if (value != null) {
        parcel.writeInt(1);
        value.writeToParcel(parcel, parcelableFlags);
      } else {
        parcel.writeInt(0);
      }
    }
  }
}
