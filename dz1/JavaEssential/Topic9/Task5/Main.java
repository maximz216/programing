package JavaEssential.Topic9.Task5;

/*
Завдання 5
Створіть проект за допомогою IntelliJ IDEA.
Створіть клас MyClass, що містить статичний фабричний метод - T factoryMethod(),
який породжуватиме екземпляри типу, зазначеного як параметр типу (покажчика місця заповнення типом – Т).
 */
public class Main {
    public static void main(String[] args) {
        String str = MyClass.factoryMethod(String.class);
        System.out.println(str);
        MyClass cl = MyClass.factoryMethod(MyClass.class);
        System.out.println(cl);
        Object o = MyClass.factoryMethod(Object.class);
        System.out.println(o);

    }
}
