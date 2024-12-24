package bsu.rfe.java.group7.lab1.Los.A10;

public abstract class Food {
    private String name; // Имя продукта

    public Food(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Food food = (Food) obj;
        return name.equals(food.name);
    }
}