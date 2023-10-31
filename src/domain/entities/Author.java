package domain.entities;

public final class Author {
    private final String name;
    private final String biography;

    private Author(String name, String biography) {
        this.name = name;
        this.biography = biography;
    }

    public String getName() { return this.name; }

    public String getBiography() { return this.biography; }
}
