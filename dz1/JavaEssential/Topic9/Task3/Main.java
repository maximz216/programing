package JavaEssential.Topic9.Task3;

/*
Завдання 3
Створіть проект за допомогою IntelliJ IDEA.
Створіть клас MyDictionary. Реалізуйте у найпростішому наближенні можливість використання його екземпляра.
Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати метод додавання пар елементів,
індексатор для отримання значення елемента
за вказаним індексом і властивість тільки для читання для отримання загальної кількості пар елементів.
 */
public class Main {
    public static void main(String[] args) {
        MyDictionary<Integer, String> myDictionary = new MyDictionary<>();
        myDictionary.add(6, "aaa");
        myDictionary.add(5, "ccc");
        myDictionary.add(8, "bbb");
        System.out.println("Довжина " + myDictionary.getSize());
        for (int i = 0; i < 3; i++) {
            System.out.println(myDictionary.getElements(i));
        }
        System.out.println(myDictionary.getElement(5));

    }
}
