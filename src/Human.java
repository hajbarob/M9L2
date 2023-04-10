import java.util.Objects;

public class Human {
    public String name;
    public String sName;
    public String lName;

    public Human(String name, String sName, String lName) {
        this.name = name;
        this.sName = sName;
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", sName='" + sName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(sName, human.sName) && Objects.equals(lName, human.lName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sName, lName);
    }
}
