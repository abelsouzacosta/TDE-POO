package domain.entities;

import java.util.Random;

public abstract class CollectionItem {
    Random random = new Random();
    private final int id;
    private final String description;
    private final Author author;

    protected CollectionItem(String description, Author author) {
        this.id = random.nextInt(100) + 1;
        this.description = description;
        this.author = author;
    }

    protected int getId() { return this.id; }

    protected String getDescription() { return this.description; }

    protected Author getAuthor() { return this.author; }
}
