import java.util.Objects;

abstract class AHuman implements IHuman {
    protected String name;
    protected Feelings feel;
    protected Gender gender;
    protected String ending;

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AHuman aHuman = (AHuman) o;
        return Objects.equals(name, aHuman.name);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name = '" + name + '\'' +
                ", gender = " + gender +
                '}';
    }

    public String getName() {
        return this.name = name;
    }

    public Feelings setFeel(Feelings f) {
        return this.feel = f;
    }

    public Gender getGender() {
        return gender;
    }

}
