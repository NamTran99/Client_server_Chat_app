package com.advanced.mockserver.di;

import com.advanced.mockserver.data.database.AppDatabase;
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
public final class AppModule_ProvideDatabaseFactory implements Factory<AppDatabase> {
  private final Provider<ChatApplication> applicationProvider;

  public AppModule_ProvideDatabaseFactory(Provider<ChatApplication> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public AppDatabase get() {
    return provideDatabase(applicationProvider.get());
  }

  public static AppModule_ProvideDatabaseFactory create(
      Provider<ChatApplication> applicationProvider) {
    return new AppModule_ProvideDatabaseFactory(applicationProvider);
  }

  public static AppDatabase provideDatabase(ChatApplication application) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideDatabase(application));
  }
}
