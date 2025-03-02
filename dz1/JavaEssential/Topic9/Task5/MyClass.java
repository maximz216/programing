package JavaEssential.Topic9.Task5;

import java.lang.reflect.InvocationTargetException;

class MyClass  {
    public static <T> T factoryMethod(Class<T> с) {
        try {
            return с.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            return null;
        }
    }
}
