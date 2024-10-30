public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void info() {
        System.out.println("Title: " + title + "Author: " + author + "Pages: " + pages);
    }

    public void read() {
        System.out.println("Read the paper book: " + title);
    }
}