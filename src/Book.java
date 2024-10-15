public class Book {

    private String id; // exactlly 5 charactur
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String id, String title, String author) {
        if (id.length() == 5) {
            this.id = id;

        }

        else
        {
            System.out.println("invalid");
            System.exit(0);
        }

        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.length() != 5) {
            System.out.println("");
        }
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void printBookInfo() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
    }
}
