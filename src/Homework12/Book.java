import java.util.Objects;

public class Book {//ʕ•́ᴥ•̀ʔっ
    private final String nameBook;
    private final Author authorOfBook;
    Author authorOfBook;
    private int publishingYear;
    public Book(String nameBook, int publishingYear, Author authorOfBook) {
        this.nameBook = nameBook;
        this.publishingYear = publishingYear;
        this.authorOfBook = authorOfBook;
    }
    public String getNameBook() {
        return nameBook;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear < 1950 || publishingYear > 2050) {
            System.out.println("Invalid publishing year parameter: " + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;
    }

    public void printInfo() {
        System.out.println(getNameBook() + " " + getPublishingYear() + " " + authorOfBook.getFullName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && nameBook.equals(book.nameBook)
                && Objects.equals(authorOfBook, book.authorOfBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, publishingYear, authorOfBook);
    }

    @Override
    public String toString() {
        return nameBook + " " + publishingYear + " " + authorOfBook;
    }
}