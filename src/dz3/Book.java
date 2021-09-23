package dz3;

public class Book {
    private int Pages;
    private String Author;
    private String Title;
    private String Publisher;
    private String Theme;

    public Book(int pages, String author, String title, String publisher, String theme) {
        Pages = pages;
        Author = author;
        Title = title;
        Publisher = publisher;
        Theme = theme;
    }

    public int getPages() {
        return Pages;
    }

    public String getAuthor() {
        return Author;
    }

    public String getTitle() {
        return Title;
    }

    public String getPublisher() {
        return Publisher;
    }

    public String getTheme() {
        return Theme;
    }

    public void setPages(int pages) {
        Pages = pages;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public void setTheme(String theme) {
        Theme = theme;
    }

    @Override
    public String toString() {
        return Title + "{" +
                "Pages=" + Pages +
                ", Author='" + Author + '\'' +
                ", Title='" + '\'' +
                ", Publisher='" + Publisher + '\'' +
                ", Theme='" + Theme + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Book b1 = new Book(250, "Vasya Pupkin", "Kniga Vasi", "Vasya and friedns", "Kniga pro zhizn");
        System.out.println(b1);
        b1.setAuthor("Zina");
        b1.setPages(3);
        b1.setPublisher("Zina inc.");
        b1.setTheme("priklucheniya Zini");
        b1.setTitle("Zina i ee druzya");
        System.out.println(b1);
    }
}
