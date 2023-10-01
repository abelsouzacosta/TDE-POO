package domain.entities;

import java.util.Random;

public class CollectionItem {

    Random random = new Random();
    private final int id;

    private String description;

    /**
     * TODO: Author can be turned into a class
     */
    private String author;

    public CollectionItem(String description, String author) {
        int min = 1;
        int max = 100;
        this.id = random.nextInt(max - min + 1) + min;
        this.description = description;
        this.author = author;
    }

    protected int getId() {
        return this.id;
    }

    protected String getDescription() {
        return this.description;
    }

    protected String getAuthor() {
        return this.author;
    }

    protected void setDescription(String description) {
        this.description = description;
    }

    protected void setAuthor(String author) {
        this.author = author;
    }
}
