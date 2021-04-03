package ru.croc.java.home2;

import ru.croc.java.home2.event.EatEvent;

public class Zoo {
    private Emplyee[] employees;
    private Animal[] animals;
    private Box[] boxes;


    public Zoo(Emplyee[] employees, Box[] boxes) {
        this.employees = employees;
        this.boxes = boxes;
        this.animals = new Animal[0];
    }

    public void addAnimal(Animal animal, Box box, Emplyee emplyee) {
        box.add(animal);
        emplyee.add(animal);
    }

    public void removeAnimal(Animal animal) {

    }

    public void eatAnimal(Animal animal) {
        animal.add(new EatEvent());
    }
}
