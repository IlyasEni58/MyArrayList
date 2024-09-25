import java.util.*;
import java.util.function.Consumer;

public class MyArrayList<T> {

    private Object[] array = new Object[10];
    private int size = 0;


    public MyArrayList() {
    }

    public MyArrayList(Collection <T> collection) {
            array = collection.toArray();
            size = array.length;

    }

    public Object get(int index) {
        checkIndex(index);
        return array[index];

    }


    public void add(T obj) {
        if (size >= array.length) {
            Object[] newArray = new Object[array.length * 2];
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size] = obj;
        size++;
    }

    public void addAll(T[] elements) {
        int initialSize = size;
        Object[] newArray = Arrays.copyOf(array, array.length + elements.length);
        System.arraycopy(elements, 0, newArray, initialSize, elements.length);
        array = newArray;
        size += elements.length;
    }


    public boolean remove(T obj) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(obj)) {
                return removeAt(i);
            }
        }
        return false;
    }

    public boolean removeAt(int index) {
        checkIndex(index);
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return true;
    }

    public int size() {
        return size;
    }

    public void clear() {
        array = new Object[10];
        size = 0;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

}




