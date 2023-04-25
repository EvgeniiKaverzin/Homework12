import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
    private int yearOfPublishing;

    public Book(String title, Author author, int yearOfPublishing) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author.getName();
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public String toString() {
        return author.toString() + getTitle() + " " + getYearOfPublishing();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return yearOfPublishing == book.yearOfPublishing && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, yearOfPublishing, author);
    }
}
