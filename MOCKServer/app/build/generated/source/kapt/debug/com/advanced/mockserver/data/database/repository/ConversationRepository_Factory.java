package com.advanced.mockserver.data.database.repository;

import com.advanced.mockserver.data.database.dao.ConversationDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class ConversationRepository_Factory implements Factory<ConversationRepository> {
  private final Provider<ConversationDao> conversationDaoProvider;

  public ConversationRepository_Factory(Provider<ConversationDao> conversationDaoProvider) {
    this.conversationDaoProvider = conversationDaoProvider;
  }

  @Override
  public ConversationRepository get() {
    return newInstance(conversationDaoProvider.get());
  }

  public static ConversationRepository_Factory create(
      Provider<ConversationDao> conversationDaoProvider) {
    return new ConversationRepository_Factory(conversationDaoProvider);
  }

  public static ConversationRepository newInstance(ConversationDao conversationDao) {
    return new ConversationRepository(conversationDao);
  }
}
