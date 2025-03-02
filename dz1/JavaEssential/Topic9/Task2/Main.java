package JavaEssential.Topic9.Task2;

/*
Завдання 2

Створіть проект за допомогою IntelliJ IDEA.
Створіть клас MyList. Реалізуйте у найпростішому наближенні можливість використання його екземпляра
аналогічно екземпляру класу List. Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати метод додавання елемента, індексатор для отримання значення елемента за вказаним індексом і
властивість тільки для читання для отримання загальної кількості елементів.
 */
public class Main {
    public static void main(String[] args) {
        MyList<Integer> myListInt = new MyList<>();
        myListInt.add(6);
        myListInt.add(6);
        myListInt.add(8);
        System.out.println("Довжина " + myListInt.getSize());
        for (int i = 0; i < myListInt.getSize(); i++) {
            System.out.println(i + " елемент " + myListInt.getElement(i));
        }
        MyList<String> myListStr = new MyList<>();
        myListStr.add("@@@");
        myListStr.add("aaa");
        myListStr.add("bbb");
        myListStr.add("ccc");
        System.out.println("Довжина " + myListStr.getSize());
        for (int i = 0; i < myListStr.getSize(); i++) {
            System.out.println(i + " елемент " + myListStr.getElement(i));
        }

    }
}
