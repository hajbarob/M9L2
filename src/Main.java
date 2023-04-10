import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> sl = new ArrayList<>();
        sl.add("aaa");

        Map<String, Human> humanMap = new HashMap<>();
        humanMap.put("Kola", new Human("Kola", "Mukolaevich", "Mikolaiev"));
        humanMap.put("Ivan", new Human("Ivan", "Ivanovich", "Ivanov"));
        humanMap.put("Ivan", new Human("Ivan", "Volodymyrovich", "Petrov"));
        humanMap.put(null, new Human("Null", "Nullovich", "Nallov"));

        System.out.println("humanMap.get(\"Kola\") = " + humanMap.get("Kola"));
        System.out.println("humanMap.get(\"Ivan\") = " + humanMap.get("Ivan"));
        System.out.println("humanMap.get(null) = " + humanMap.get("null"));

        System.out.println("humanMap.get(\"Oleg\") = " + humanMap.get("Oleg"));


        humanMap.compute("Ivan", (k, v) -> {
            System.out.println("There is \"Ivan\" key in humanMap");
            return null;
        });

        humanMap.computeIfAbsent("Inna", (k) -> {
            System.out.println("There is no \"Inna\" key in humanMap");
            return null;
        });

        Set<Map.Entry<String, Human>> entries = humanMap.entrySet();
        Set<String> keys = humanMap.keySet();
        System.out.println("keys = " + keys);
        Collection<Human> values = humanMap.values();

        System.out.println("entries = " + entries);

        humanMap.clear();
    }

    public Object compute(String s, Human h) {
        System.out.println("There is \"Ivan\" key in humanMap");
        return null;
    }
}