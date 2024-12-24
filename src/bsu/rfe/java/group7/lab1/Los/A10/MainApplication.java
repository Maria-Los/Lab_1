package bsu.rfe.java.group7.lab1.Los.A10;

import java.util.ArrayList;

public class MainApplication {
    public static void main(String[] args) {
        // Создаем список продуктов (завтрак)
        ArrayList<Food> breakfast = new ArrayList<>();

        // Добавляем продукты в завтрак
        breakfast.add(new Lemonade("апельсиновый"));
        breakfast.add(new Lemonade("яблочный"));
        breakfast.add(new Lemonade("апельсиновый"));
        breakfast.add(new Lemonade("виноградный"));
        breakfast.add(new Cheese());
        breakfast.add(new Cheese());
     
        // Подсчитываем количество продуктов по типу
        Food lemonadeTemplate = new Lemonade(""); // Для подсчета лимонадов
        Food cheeseTemplate = new Cheese();       // Для подсчета сыра
        Food appleTemplate = new Apple("");       // Для подсчета яблок

        int lemonadeCount = 0;
        int cheeseCount = 0;
        int appleCount = 0;

        for (Food item : breakfast) {
            if (item.equals(lemonadeTemplate)) {
                lemonadeCount++;
            } else if (item.equals(cheeseTemplate)) {
                cheeseCount++;
            } else if (item.equals(appleTemplate)) {
                appleCount++;
            }
        }

        // Выводим результаты
        System.out.println("Количество лимонадов в завтраке: " + lemonadeCount);
        System.out.println("Количество сыров в завтраке: " + cheeseCount);
        System.out.println("Количество яблок в завтраке: " + appleCount);

        // Прощальное сообщение
        System.out.println("Всего хорошего");
    }
}