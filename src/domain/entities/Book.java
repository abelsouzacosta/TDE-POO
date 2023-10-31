package domain.entities;

import java.time.LocalDate;


public final class Book extends CollectionItem {
    private final String publisher;

    private final int pages;

    private final String language;

    private final LocalDate publishingDate;

    private Book(String publisher, int pages, String language, LocalDate publishingDate, String description, Author author) {
        super(description, author);
        this.publisher = publisher;
        this.pages = pages;
        this.language = language;
        this.publishingDate = publishingDate;
    }

    public static Book getInstance(String publisher, int pages, String language, LocalDate publishingDate, String description, Author author) {
        return new Book(publisher, pages, language, publishingDate, description, author);
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPages() {
        return pages;
    }

    public String getLanguage() {
        return language;
    }

    public LocalDate getPublishingDate() {
        return publishingDate;
    }
}
