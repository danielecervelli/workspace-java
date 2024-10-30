public class BookManager {
    public static void main (String[] args) {

        Book paperBook = new Book("The Lord of the Rings\n", "J.R.R. Tolkien\n", 900);
        paperBook.info();
        paperBook.read();

        Ebook ebook = new Ebook("Animal Farm\n", "George Orwell\n", 120 , 3.9);
        ebook.info();
        ebook.read();
    }
}