package JavaEssential.Topic9.Task3;

import java.util.Arrays;

public class MyDictionary<T, E> extends SomeClass{
    //  Test test = new Test();
    private final int Len1 = 10;
    private final int Len2 = 2;
    private int lenChange = Len1;
    private int pos = 0;
    // private Test[][] elements;
   // private Object[][] elements;
    private Object[][] elements;

    public MyDictionary() {
        this.elements = new Object[Len1][Len2];
        this.pos = 0;
    }

    public void add(T value1, E value2) {
      if (lenChange == pos) {
            plusSize();
        }
        //elements[pos][0] = new SomeClass<>(value1, value2);
        elements[pos][0] = value1;
        elements[pos][1] = value2;
        pos++;
    }

    public String getElements(int index) {
        String x;
        x = elements[index][0] + " " + elements[index][1];
        return x;
    }

    public E getElement(T value1) {
        for (int i = 0; i < pos; i++) {
            if (elements[i][0] == value1) {
                return (E) elements[i][1];
            }
        }
        return null;
    }

    private void plusSize() {
        lenChange += 10;
        elements = Arrays.copyOf(elements, lenChange);
    }

    public int getSize() {
        return pos;
    }
}
