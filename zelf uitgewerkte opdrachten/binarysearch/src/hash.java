import java.util.Objects;
import java.util.TreeSet;

public class hash implements Comparable<hash>{
    String name;
    int age;
    String email;

    TreeSet<hash> treeSet = new TreeSet<>((e1,e2) -> e1.name.compareTo(e2.name));
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        hash hash = (hash) o;
        return age == hash.age &&
                Objects.equals(name, hash.name) &&
                Objects.equals(email, hash.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }

    @Override
    public int compareTo(hash o) {
        return age > o.age ? 1 : age == o.age ? 0 : -1;
    }
}
