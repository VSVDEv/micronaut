package vsvdev.co.ua.di;

import io.micronaut.context.annotation.Factory;
import jakarta.inject.Singleton;

@Factory
class InjectMeFactory {

  @Singleton
  InjectMeService createService() {
    return new InjectMeService();
  }
}
