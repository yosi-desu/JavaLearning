package OOP;

import java.util.Objects;

public abstract class AbstractScriptFactory {
  public static AbstractScriptFactory createFactory(String className) {

    AbstractScriptFactory factory = null;
    try {
      factory =
          (AbstractScriptFactory) Class.forName(className).getDeclaredConstructor().newInstance();
    } catch (ClassNotFoundException e) {
      System.out.println("Class name is not found");
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return factory;
  }
}