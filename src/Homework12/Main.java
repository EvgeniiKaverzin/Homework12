package Homework12;
public class Main {
    public static void main(String[] args) {//¯\_( ͡❛ ͜ʖ ͡❛)_/¯
        Author authorNikolaev = new Author("Виктор", "Николаев");
        Author authorPelevin = new Author("Виктор", "Пелевин");
        Book book1 = new Book("Generation 'П'", 1999, authorPelevin);
        Book book2 = new Book("Безотцовщина", 2008, authorNikolaev);
        book1.printInfo();
        book2.printInfo();
        book1.setPublishingYear(2011);
        book1.printInfo();

    }
}
