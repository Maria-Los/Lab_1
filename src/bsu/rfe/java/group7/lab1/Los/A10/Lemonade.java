package bsu.rfe.java.group7.lab1.Los.A10;

public class Lemonade extends Food {
    private String taste; // Вкус лимонада

    public Lemonade(String taste) {
        super("Lemonade"); // Передаем имя продукта в конструктор предка
        this.taste = taste;
    }

    public void consume() {
        System.out.println(this + " выпит");
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String toString() {
        return super.toString() + " со вкусом '" + taste.toUpperCase() + "'";
    }
}