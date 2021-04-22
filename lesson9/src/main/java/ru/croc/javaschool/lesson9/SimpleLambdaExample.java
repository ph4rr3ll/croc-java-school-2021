package ru.croc.javaschool.lesson9;

public class SimpleLambdaExample {

    public static void printIfHopping(Animal animal, CheckTrait trait) {
        if (trait.test(animal)) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        printIfHopping(new Animal("Fish", false, true), a -> a.canHop());
        printIfHopping(new Animal("Kangaroo", true, false), a -> a.canHop());

        printIfHopping(new Animal("Kangaroo", true, false), Animal::canHop);
    }
}
