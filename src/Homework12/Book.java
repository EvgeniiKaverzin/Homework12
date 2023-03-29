package Homework12;

public class Book {

    private String nameBook;
    private int publishingYear;
    Author authorOfBook;
    public Book(String nameBook, int publishingYear,Author authorOfBook) {
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
    public void printInfo(){
        System.out.println(getNameBook()+" "+ getPublishingYear()+" "+authorOfBook.getFullName());

    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear < 1950 || publishingYear > 2050) {
            System.out.println("Invalid publishing year parameter: " + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;
    }
}
