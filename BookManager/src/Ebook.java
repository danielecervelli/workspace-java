public class Ebook extends Book {

    private double fileSize;

    public Ebook(String title, String author, int pages, double fileSize) {
        super(title, author, pages);
        this.fileSize = fileSize;
    }

   public double getFileSize() {
        return fileSize;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("File size: " + getFileSize() + " MB");
    }

    @Override
    public void read() {
        System.out.println("Read the ebook: " + getTitle());
    }
}
