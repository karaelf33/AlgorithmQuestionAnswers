import java.util.Objects;

public class Person {

    private String a;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(a, person.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
