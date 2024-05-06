package com.advanced.mockserver.di;

import com.advanced.mockserver.data.database.AppDatabase;
import com.advanced.mockserver.data.database.dao.ChatDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideChatDaoFactory implements Factory<ChatDao> {
  private final Provider<AppDatabase> databaseProvider;

  public AppModule_ProvideChatDaoFactory(Provider<AppDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public ChatDao get() {
    return provideChatDao(databaseProvider.get());
  }

  public static AppModule_ProvideChatDaoFactory create(Provider<AppDatabase> databaseProvider) {
    return new AppModule_ProvideChatDaoFactory(databaseProvider);
  }

  public static ChatDao provideChatDao(AppDatabase database) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideChatDao(database));
  }
}
