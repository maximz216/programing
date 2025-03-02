package JavaEssential.Topic9.Task2;

import java.util.Arrays;

public class MyList<T> {
    private final int len = 10;
    private int lenChange = len;
    private int pos = 0;
    private T[] elements = (T[]) new Object[len];

    public T[] add(T value) {
        if (lenChange == pos) {
            plusSize();
        }
        elements[pos] = value;
        pos++;
        return elements;
    }

    public T getElement(int index) {
        return elements[index];
    }

    private void plusSize() {
        lenChange += 10;
        elements = Arrays.copyOf(elements, lenChange);
    }

    public int getSize() {
        return pos;
    }
}


