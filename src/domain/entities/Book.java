package domain.entities;

public class Book extends CollectionItem {
    protected String publishing;

    public Book(String description, String author, String publishing) {
        super(description, author);
        this.publishing = publishing;
        this.publishing = publishing;
    }

    protected void setPublishing(String publishing) {
        this.publishing = publishing;
    }


}
