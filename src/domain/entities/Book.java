package domain.entities;

import java.util.Date;

public class Book extends CollectionItem {
    protected final String publishing;

    protected final int pages;

    protected final String language;

    protected final Date publishingDate;

    public Book(String description, String author, String publishing, String language, Date publishingDate, int pages) {
        super(description, author);
        this.publishing = publishing;
        this.pages = pages;
        this.language = language;
        this.publishingDate = publishingDate;
    }

    // TODO: Change publishingDate to receive a String and then instantiate a date
    public static Book createBook(String description, String author, String publishing, String language, Date publishingDate, int pages) {
        return new Book(description, author, publishing, language, publishingDate, pages);
    }

    protected String getPublishing() {
        return this.publishing;
    }

    protected String getLanguage() {
        return this.language;
    }

    protected int getPages() {
        return this.pages;
    }

    protected Date getPublishingDate() {
        return this.publishingDate;
    }
}
