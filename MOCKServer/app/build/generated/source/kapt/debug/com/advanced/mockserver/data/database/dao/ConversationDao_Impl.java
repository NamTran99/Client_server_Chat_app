package com.advanced.mockserver.data.database.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.advanced.mockserver.Conversation;
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
public final class ConversationDao_Impl implements ConversationDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Conversation> __insertionAdapterOfConversation;

  private final SharedSQLiteStatement __preparedStmtOfUpdateConversation;

  private final SharedSQLiteStatement __preparedStmtOfDeleteConversationById;

  public ConversationDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfConversation = new EntityInsertionAdapter<Conversation>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `conversations` (`conversationId`,`senderId`,`senderImage`,`senderName`,`receiverId`,`receiverImage`,`receiverName`,`lastMessage`,`timestamp`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Conversation value) {
        stmt.bindLong(1, value.getConversationId());
        stmt.bindLong(2, value.getSenderId());
        stmt.bindLong(3, value.getSenderImage());
        if (value.getSenderName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSenderName());
        }
        stmt.bindLong(5, value.getReceiverId());
        stmt.bindLong(6, value.getReceiverImage());
        if (value.getReceiverName() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getReceiverName());
        }
        if (value.getLastMessage() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLastMessage());
        }
        if (value.getTimestamp() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getTimestamp());
        }
      }
    };
    this.__preparedStmtOfUpdateConversation = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE conversations SET lastMessage = ?, timestamp =? WHERE conversationId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteConversationById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM conversations WHERE conversationId = ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(final Conversation conversation) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfConversation.insert(conversation);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateConversation(final long conversationId, final String lastMessage,
      final String timestamp) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateConversation.acquire();
    int _argIndex = 1;
    if (lastMessage == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, lastMessage);
    }
    _argIndex = 2;
    if (timestamp == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, timestamp);
    }
    _argIndex = 3;
    _stmt.bindLong(_argIndex, conversationId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateConversation.release(_stmt);
    }
  }

  @Override
  public void deleteConversationById(final long conversationId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteConversationById.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, conversationId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteConversationById.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Conversation>> getAllConversations() {
    final String _sql = "SELECT * FROM conversations";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"conversations"}, false, new Callable<List<Conversation>>() {
      @Override
      public List<Conversation> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfConversationId = CursorUtil.getColumnIndexOrThrow(_cursor, "conversationId");
          final int _cursorIndexOfSenderId = CursorUtil.getColumnIndexOrThrow(_cursor, "senderId");
          final int _cursorIndexOfSenderImage = CursorUtil.getColumnIndexOrThrow(_cursor, "senderImage");
          final int _cursorIndexOfSenderName = CursorUtil.getColumnIndexOrThrow(_cursor, "senderName");
          final int _cursorIndexOfReceiverId = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverId");
          final int _cursorIndexOfReceiverImage = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverImage");
          final int _cursorIndexOfReceiverName = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverName");
          final int _cursorIndexOfLastMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "lastMessage");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final List<Conversation> _result = new ArrayList<Conversation>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Conversation _item;
            final long _tmpConversationId;
            _tmpConversationId = _cursor.getLong(_cursorIndexOfConversationId);
            final long _tmpSenderId;
            _tmpSenderId = _cursor.getLong(_cursorIndexOfSenderId);
            final int _tmpSenderImage;
            _tmpSenderImage = _cursor.getInt(_cursorIndexOfSenderImage);
            final String _tmpSenderName;
            if (_cursor.isNull(_cursorIndexOfSenderName)) {
              _tmpSenderName = null;
            } else {
              _tmpSenderName = _cursor.getString(_cursorIndexOfSenderName);
            }
            final long _tmpReceiverId;
            _tmpReceiverId = _cursor.getLong(_cursorIndexOfReceiverId);
            final int _tmpReceiverImage;
            _tmpReceiverImage = _cursor.getInt(_cursorIndexOfReceiverImage);
            final String _tmpReceiverName;
            if (_cursor.isNull(_cursorIndexOfReceiverName)) {
              _tmpReceiverName = null;
            } else {
              _tmpReceiverName = _cursor.getString(_cursorIndexOfReceiverName);
            }
            final String _tmpLastMessage;
            if (_cursor.isNull(_cursorIndexOfLastMessage)) {
              _tmpLastMessage = null;
            } else {
              _tmpLastMessage = _cursor.getString(_cursorIndexOfLastMessage);
            }
            final String _tmpTimestamp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmpTimestamp = null;
            } else {
              _tmpTimestamp = _cursor.getString(_cursorIndexOfTimestamp);
            }
            _item = new Conversation(_tmpConversationId,_tmpSenderId,_tmpSenderImage,_tmpSenderName,_tmpReceiverId,_tmpReceiverImage,_tmpReceiverName,_tmpLastMessage,_tmpTimestamp);
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
  public List<Conversation> getRemoteAllConversations() {
    final String _sql = "SELECT * FROM conversations";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfConversationId = CursorUtil.getColumnIndexOrThrow(_cursor, "conversationId");
      final int _cursorIndexOfSenderId = CursorUtil.getColumnIndexOrThrow(_cursor, "senderId");
      final int _cursorIndexOfSenderImage = CursorUtil.getColumnIndexOrThrow(_cursor, "senderImage");
      final int _cursorIndexOfSenderName = CursorUtil.getColumnIndexOrThrow(_cursor, "senderName");
      final int _cursorIndexOfReceiverId = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverId");
      final int _cursorIndexOfReceiverImage = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverImage");
      final int _cursorIndexOfReceiverName = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverName");
      final int _cursorIndexOfLastMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "lastMessage");
      final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
      final List<Conversation> _result = new ArrayList<Conversation>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Conversation _item;
        final long _tmpConversationId;
        _tmpConversationId = _cursor.getLong(_cursorIndexOfConversationId);
        final long _tmpSenderId;
        _tmpSenderId = _cursor.getLong(_cursorIndexOfSenderId);
        final int _tmpSenderImage;
        _tmpSenderImage = _cursor.getInt(_cursorIndexOfSenderImage);
        final String _tmpSenderName;
        if (_cursor.isNull(_cursorIndexOfSenderName)) {
          _tmpSenderName = null;
        } else {
          _tmpSenderName = _cursor.getString(_cursorIndexOfSenderName);
        }
        final long _tmpReceiverId;
        _tmpReceiverId = _cursor.getLong(_cursorIndexOfReceiverId);
        final int _tmpReceiverImage;
        _tmpReceiverImage = _cursor.getInt(_cursorIndexOfReceiverImage);
        final String _tmpReceiverName;
        if (_cursor.isNull(_cursorIndexOfReceiverName)) {
          _tmpReceiverName = null;
        } else {
          _tmpReceiverName = _cursor.getString(_cursorIndexOfReceiverName);
        }
        final String _tmpLastMessage;
        if (_cursor.isNull(_cursorIndexOfLastMessage)) {
          _tmpLastMessage = null;
        } else {
          _tmpLastMessage = _cursor.getString(_cursorIndexOfLastMessage);
        }
        final String _tmpTimestamp;
        if (_cursor.isNull(_cursorIndexOfTimestamp)) {
          _tmpTimestamp = null;
        } else {
          _tmpTimestamp = _cursor.getString(_cursorIndexOfTimestamp);
        }
        _item = new Conversation(_tmpConversationId,_tmpSenderId,_tmpSenderImage,_tmpSenderName,_tmpReceiverId,_tmpReceiverImage,_tmpReceiverName,_tmpLastMessage,_tmpTimestamp);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<Conversation> getConversationById(final long conversationId) {
    final String _sql = "SELECT * FROM conversations WHERE conversationId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, conversationId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"conversations"}, false, new Callable<Conversation>() {
      @Override
      public Conversation call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfConversationId = CursorUtil.getColumnIndexOrThrow(_cursor, "conversationId");
          final int _cursorIndexOfSenderId = CursorUtil.getColumnIndexOrThrow(_cursor, "senderId");
          final int _cursorIndexOfSenderImage = CursorUtil.getColumnIndexOrThrow(_cursor, "senderImage");
          final int _cursorIndexOfSenderName = CursorUtil.getColumnIndexOrThrow(_cursor, "senderName");
          final int _cursorIndexOfReceiverId = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverId");
          final int _cursorIndexOfReceiverImage = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverImage");
          final int _cursorIndexOfReceiverName = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverName");
          final int _cursorIndexOfLastMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "lastMessage");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final Conversation _result;
          if(_cursor.moveToFirst()) {
            final long _tmpConversationId;
            _tmpConversationId = _cursor.getLong(_cursorIndexOfConversationId);
            final long _tmpSenderId;
            _tmpSenderId = _cursor.getLong(_cursorIndexOfSenderId);
            final int _tmpSenderImage;
            _tmpSenderImage = _cursor.getInt(_cursorIndexOfSenderImage);
            final String _tmpSenderName;
            if (_cursor.isNull(_cursorIndexOfSenderName)) {
              _tmpSenderName = null;
            } else {
              _tmpSenderName = _cursor.getString(_cursorIndexOfSenderName);
            }
            final long _tmpReceiverId;
            _tmpReceiverId = _cursor.getLong(_cursorIndexOfReceiverId);
            final int _tmpReceiverImage;
            _tmpReceiverImage = _cursor.getInt(_cursorIndexOfReceiverImage);
            final String _tmpReceiverName;
            if (_cursor.isNull(_cursorIndexOfReceiverName)) {
              _tmpReceiverName = null;
            } else {
              _tmpReceiverName = _cursor.getString(_cursorIndexOfReceiverName);
            }
            final String _tmpLastMessage;
            if (_cursor.isNull(_cursorIndexOfLastMessage)) {
              _tmpLastMessage = null;
            } else {
              _tmpLastMessage = _cursor.getString(_cursorIndexOfLastMessage);
            }
            final String _tmpTimestamp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmpTimestamp = null;
            } else {
              _tmpTimestamp = _cursor.getString(_cursorIndexOfTimestamp);
            }
            _result = new Conversation(_tmpConversationId,_tmpSenderId,_tmpSenderImage,_tmpSenderName,_tmpReceiverId,_tmpReceiverImage,_tmpReceiverName,_tmpLastMessage,_tmpTimestamp);
          } else {
            _result = null;
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
