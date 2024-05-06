package com.advanced.mockserver.ui.home;

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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  private final Provider<ConversationRepository> conversationRepositoryProvider;

  public HomeViewModel_Factory(Provider<UserRepository> userRepositoryProvider,
      Provider<ConversationRepository> conversationRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
    this.conversationRepositoryProvider = conversationRepositoryProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(userRepositoryProvider.get(), conversationRepositoryProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<UserRepository> userRepositoryProvider,
      Provider<ConversationRepository> conversationRepositoryProvider) {
    return new HomeViewModel_Factory(userRepositoryProvider, conversationRepositoryProvider);
  }

  public static HomeViewModel newInstance(UserRepository userRepository,
      ConversationRepository conversationRepository) {
    return new HomeViewModel(userRepository, conversationRepository);
  }
}
