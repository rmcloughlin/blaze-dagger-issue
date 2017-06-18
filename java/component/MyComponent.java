package component;

import dagger.Component;
import module.MyModule;
import java.util.Date;

@Component(modules = MyModule.class)
public interface MyComponent {
 Date makeDate();
}
