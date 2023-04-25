import java.util.Objects;

public class Author {
    private final String name;

    public Author(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ": ";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (this.getClass() != other.getClass() && other != null) {
            return false;
        }
        Author author = (Author) other;
        return Objects.equals(name, author.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
