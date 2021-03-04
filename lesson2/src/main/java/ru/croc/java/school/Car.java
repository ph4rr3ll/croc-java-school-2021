package ru.croc.java.school;

/**
 * Машина.
 */
public class Car {
    private final String number;
    private final String color;

    // Конструктор по умолчанию
    public Car() {
        this("444", "Желтый");
    }

    // Конструктор
    public Car(String number, String color) {
        this.number = number;
        this.color = color;
    }

    /**
     * Информация о машине.
     *
     * @return информация в виде текста
     */
    String information() {
        return "Цвет: " + color + "\tНомер: " + number;
    }
    public static void main(String[] args) {
        Car car = new Car("555", "Белый");
        car = new Car();
        System.out.println(car.information());
    }

    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
