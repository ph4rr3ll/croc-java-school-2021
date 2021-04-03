package ru.croc.school.java.demo6.databind;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.croc.school.java.demo6.databind.jaxb.JaxbConverter;
import ru.croc.school.java.demo6.databind.zoo.Animal;
import ru.croc.school.java.demo6.databind.zoo.Zoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZooTest {


    /**
     * Конвертация класса Zoo в xml.
     */
    @Test
    public void testConvertZooToXml() throws Exception {
        final Zoo zoo = new Zoo();
        zoo.setTitle("Название!");
        zoo.setManager("Василий");
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Лев", Arrays.asList("Шерстяной", "Зубастый")));
        animals.add(new Animal("Заяй", Arrays.asList("Шерстяной", "Белый")));
        zoo.setAnimals(animals);

        final JaxbConverter converter = new JaxbConverter();
        final String xml = converter.toXml(zoo);
        System.out.println(xml);

        Assertions.assertEquals(zoo, converter.fromXml(xml, Zoo.class));
    }
}
