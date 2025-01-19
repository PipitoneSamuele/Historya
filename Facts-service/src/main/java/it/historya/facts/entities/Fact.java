package it.historya.facts.entities;

public class Fact {

    String description;
    int year;
    boolean isVisible;
    String name;

    public Fact() {}

    public Fact(String description, int year, boolean isVisible, String name) {
        this.description = description;
        this.year = year;
        this.isVisible = isVisible;
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
