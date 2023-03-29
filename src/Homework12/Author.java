package Homework12;

public class Author {

    private String nameAuthor;
    private String surnameAuthor;
    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getSurnameAuthor() {
        return surnameAuthor;
    }

    public String getFullName() {
        return nameAuthor+" "+surnameAuthor;
    }

    public Author(String nameAuthor, String surnameAuthor){
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }
}
