package com.advanced.mockserver.di;

import android.app.Application;
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
public final class AppModule_ProvideChatApplicationFactory implements Factory<ChatApplication> {
  private final Provider<Application> applicationProvider;

  public AppModule_ProvideChatApplicationFactory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public ChatApplication get() {
    return provideChatApplication(applicationProvider.get());
  }

  public static AppModule_ProvideChatApplicationFactory create(
      Provider<Application> applicationProvider) {
    return new AppModule_ProvideChatApplicationFactory(applicationProvider);
  }

  public static ChatApplication provideChatApplication(Application application) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideChatApplication(application));
  }
}
