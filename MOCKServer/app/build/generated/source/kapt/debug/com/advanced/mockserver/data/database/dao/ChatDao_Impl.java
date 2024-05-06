package com.advanced.mockserver.data.database.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.advanced.mockserver.ChatMessage;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class ChatDao_Impl implements ChatDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ChatMessage> __insertionAdapterOfChatMessage;

  public ChatDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfChatMessage = new EntityInsertionAdapter<ChatMessage>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `chats` (`chatId`,`senderId`,`receiverId`,`message`,`timestamp`,`conversationId`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ChatMessage value) {
        stmt.bindLong(1, value.getChatId());
        stmt.bindLong(2, value.getSenderId());
        stmt.bindLong(3, value.getReceiverId());
        if (value.getMessage() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMessage());
        }
        if (value.getTimestamp() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTimestamp());
        }
        stmt.bindLong(6, value.getConversationId());
      }
    };
  }

  @Override
  public void insert(final ChatMessage chatMessage) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfChatMessage.insert(chatMessage);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<ChatMessage>> getAllChats() {
    final String _sql = "SELECT * FROM chats";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"chats"}, false, new Callable<List<ChatMessage>>() {
      @Override
      public List<ChatMessage> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfChatId = CursorUtil.getColumnIndexOrThrow(_cursor, "chatId");
          final int _cursorIndexOfSenderId = CursorUtil.getColumnIndexOrThrow(_cursor, "senderId");
          final int _cursorIndexOfReceiverId = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverId");
          final int _cursorIndexOfMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "message");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfConversationId = CursorUtil.getColumnIndexOrThrow(_cursor, "conversationId");
          final List<ChatMessage> _result = new ArrayList<ChatMessage>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ChatMessage _item;
            final long _tmpChatId;
            _tmpChatId = _cursor.getLong(_cursorIndexOfChatId);
            final long _tmpSenderId;
            _tmpSenderId = _cursor.getLong(_cursorIndexOfSenderId);
            final long _tmpReceiverId;
            _tmpReceiverId = _cursor.getLong(_cursorIndexOfReceiverId);
            final String _tmpMessage;
            if (_cursor.isNull(_cursorIndexOfMessage)) {
              _tmpMessage = null;
            } else {
              _tmpMessage = _cursor.getString(_cursorIndexOfMessage);
            }
            final String _tmpTimestamp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmpTimestamp = null;
            } else {
              _tmpTimestamp = _cursor.getString(_cursorIndexOfTimestamp);
            }
            final long _tmpConversationId;
            _tmpConversationId = _cursor.getLong(_cursorIndexOfConversationId);
            _item = new ChatMessage(_tmpChatId,_tmpSenderId,_tmpReceiverId,_tmpMessage,_tmpTimestamp,_tmpConversationId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<ChatMessage> getRemoteAllChats() {
    final String _sql = "SELECT * FROM chats";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfChatId = CursorUtil.getColumnIndexOrThrow(_cursor, "chatId");
      final int _cursorIndexOfSenderId = CursorUtil.getColumnIndexOrThrow(_cursor, "senderId");
      final int _cursorIndexOfReceiverId = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverId");
      final int _cursorIndexOfMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "message");
      final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
      final int _cursorIndexOfConversationId = CursorUtil.getColumnIndexOrThrow(_cursor, "conversationId");
      final List<ChatMessage> _result = new ArrayList<ChatMessage>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ChatMessage _item;
        final long _tmpChatId;
        _tmpChatId = _cursor.getLong(_cursorIndexOfChatId);
        final long _tmpSenderId;
        _tmpSenderId = _cursor.getLong(_cursorIndexOfSenderId);
        final long _tmpReceiverId;
        _tmpReceiverId = _cursor.getLong(_cursorIndexOfReceiverId);
        final String _tmpMessage;
        if (_cursor.isNull(_cursorIndexOfMessage)) {
          _tmpMessage = null;
        } else {
          _tmpMessage = _cursor.getString(_cursorIndexOfMessage);
        }
        final String _tmpTimestamp;
        if (_cursor.isNull(_cursorIndexOfTimestamp)) {
          _tmpTimestamp = null;
        } else {
          _tmpTimestamp = _cursor.getString(_cursorIndexOfTimestamp);
        }
        final long _tmpConversationId;
        _tmpConversationId = _cursor.getLong(_cursorIndexOfConversationId);
        _item = new ChatMessage(_tmpChatId,_tmpSenderId,_tmpReceiverId,_tmpMessage,_tmpTimestamp,_tmpConversationId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<ChatMessage>> getChatInConversation(final long conversationId) {
    final String _sql = "SELECT * FROM chats WHERE conversationId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, conversationId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"chats"}, false, new Callable<List<ChatMessage>>() {
      @Override
      public List<ChatMessage> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfChatId = CursorUtil.getColumnIndexOrThrow(_cursor, "chatId");
          final int _cursorIndexOfSenderId = CursorUtil.getColumnIndexOrThrow(_cursor, "senderId");
          final int _cursorIndexOfReceiverId = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverId");
          final int _cursorIndexOfMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "message");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfConversationId = CursorUtil.getColumnIndexOrThrow(_cursor, "conversationId");
          final List<ChatMessage> _result = new ArrayList<ChatMessage>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ChatMessage _item;
            final long _tmpChatId;
            _tmpChatId = _cursor.getLong(_cursorIndexOfChatId);
            final long _tmpSenderId;
            _tmpSenderId = _cursor.getLong(_cursorIndexOfSenderId);
            final long _tmpReceiverId;
            _tmpReceiverId = _cursor.getLong(_cursorIndexOfReceiverId);
            final String _tmpMessage;
            if (_cursor.isNull(_cursorIndexOfMessage)) {
              _tmpMessage = null;
            } else {
              _tmpMessage = _cursor.getString(_cursorIndexOfMessage);
            }
            final String _tmpTimestamp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmpTimestamp = null;
            } else {
              _tmpTimestamp = _cursor.getString(_cursorIndexOfTimestamp);
            }
            final long _tmpConversationId;
            _tmpConversationId = _cursor.getLong(_cursorIndexOfConversationId);
            _item = new ChatMessage(_tmpChatId,_tmpSenderId,_tmpReceiverId,_tmpMessage,_tmpTimestamp,_tmpConversationId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
