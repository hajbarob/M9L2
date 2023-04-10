import java.io.Serializable;

public class MyArrayListTest implements Iterable {

    public static void main(String[] args) {
        MyArrayList<String> myar = new MyArrayList<>();
        myar.add("aa");
        myar.add("aa");
        myar.add("aa");
        myar.add("aa");
        myar.add("aa");
        myar.add("aa");
        myar.add("aa");
        myar.add("aa");
        myar.add("aa");
        myar.add("aa");
        myar.add("aa");
        myar.add("aa");
        myar.add("aa12");

        System.out.println("myar.get(12) = " + myar.get(12));

        System.out.println("myar = " + myar);
    }
}
