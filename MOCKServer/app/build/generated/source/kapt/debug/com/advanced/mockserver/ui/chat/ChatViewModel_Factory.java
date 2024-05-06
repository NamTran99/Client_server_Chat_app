package com.advanced.mockserver.ui.chat;

import com.advanced.mockserver.data.database.repository.ChatRepository;
import com.advanced.mockserver.data.database.repository.ConversationRepository;
import com.advanced.mockserver.data.database.repository.UserRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class ChatViewModel_Factory implements Factory<ChatViewModel> {
  private final Provider<ChatRepository> chatRepositoryProvider;

  private final Provider<UserRepository> userRepositoryProvider;

  private final Provider<ConversationRepository> conversationRepositoryProvider;

  public ChatViewModel_Factory(Provider<ChatRepository> chatRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider,
      Provider<ConversationRepository> conversationRepositoryProvider) {
    this.chatRepositoryProvider = chatRepositoryProvider;
    this.userRepositoryProvider = userRepositoryProvider;
    this.conversationRepositoryProvider = conversationRepositoryProvider;
  }

  @Override
  public ChatViewModel get() {
    return newInstance(chatRepositoryProvider.get(), userRepositoryProvider.get(), conversationRepositoryProvider.get());
  }

  public static ChatViewModel_Factory create(Provider<ChatRepository> chatRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider,
      Provider<ConversationRepository> conversationRepositoryProvider) {
    return new ChatViewModel_Factory(chatRepositoryProvider, userRepositoryProvider, conversationRepositoryProvider);
  }

  public static ChatViewModel newInstance(ChatRepository chatRepository,
      UserRepository userRepository, ConversationRepository conversationRepository) {
    return new ChatViewModel(chatRepository, userRepository, conversationRepository);
  }
}
