package ru.croc.java.school;

import java.util.Random;


/**
 * Животное. (javadoc)
 *
 * @author Саша
 * @since 1.2
 */
public class Animal {
    /** Имя. */
    String name = "Имя: Лев";
    int age = 8;
    Animal me;

    /**
     * Установка имени животного.
     *
     * @param name новое имя
     */
    public void setName(String name) {
        // Валидация
        //
        this.name = "Имя: " + name;
    }

    /**
     * Суммирует переданные числа.
     * Пример: varargs
     *
     * @return сумма чисел
     */
    public static int sum(int ... numbers) {
        int result = 0;
        for (int value : numbers) {
            result += value;
        }
        return result;
    }

    /**
     * Пример: final
     */
    public static void f() {
        // Переменные метода нужно инициализировать
        // ключевое слово final - переменная устанавливается только один раз
        final int result;

        if (new Random().nextBoolean()) {
            result = 9;
        } else {
            result = 8;
        }
        // Перед чтением переменная метода должна быть инициализированна
        System.out.println(result);
    }

    public static void main(String... args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        // Имя: <имя>
        System.out.println(animal1.name);
        animal1.setName("Слон");
        System.out.println(animal1.name);
        ru.croc.java.school.Animal animal3 = new Animal();


        // Комментарии
        // - однострочный(обычно внутри метода)
        /* многострочный */
    }
}
