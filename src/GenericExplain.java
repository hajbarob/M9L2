import java.util.ArrayList;
import java.util.List;

public class GenericExplain {

    public static void main(String[] args) {
        List<Human> l = new ArrayList();

        List notypeList = l;

        notypeList.add("asdasd");
        notypeList.add(22);
        notypeList.add(new Human("", "", ""));

        System.out.println(notypeList.get(1));

        for (Object o : notypeList) {
            System.out.println(o);
        }

        System.out.println("l.get(0) = " + l.get(0));
    }
}
