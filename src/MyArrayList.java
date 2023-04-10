import java.util.Arrays;

public class MyArrayList<T> {

    private Object[] values = new Object[10];

    private int size = 0;

    public void add(T toAdd) {
        rebalanceIfNeed();
        values[size] = toAdd;
        size++;
    }

    public T get(int index) {
        return (T) values[index];
    }

    public void remove(int index){
        values[index] = null;
    }

    private void rebalanceIfNeed(){
        if(values.length - 1 == size) {
            values = Arrays.copyOf(values, values.length + 2);
        }
    }
}
