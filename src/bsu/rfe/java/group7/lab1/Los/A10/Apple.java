package bsu.rfe.java.group7.lab1.Los.A10;

public class Apple extends Food {
    // Новое внутреннее поле данных РАЗМЕР
    private String size;

    public Apple(String size) {
        // Вызвать конструктор предка, передав ему имя класса
        super("Яблоко");
        // Инициализировать размер яблока
        this.size = size;
    }

    public void consume() {
        System.out.println(this + " съедено");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Apple)) return false; // Шаг 2
            return size.equals(((Apple) arg0).size); // Шаг 3
        } else
            return false;
    }

    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }
}
