package module;

import dagger.Module;
import dagger.Provides;
import java.util.Date;

@Module
public class MyModule {
  @Provides static Date provideDate() {
    return new Date();
  }
}
