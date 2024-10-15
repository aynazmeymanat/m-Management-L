public class Book {

    private String id; // exactlly 5 charactur
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String id, String title, String author) {
        if (id.length() != 5) {
            System.out.println("invalid");
        }
        this.id = id;
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
}
