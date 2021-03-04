package ru.croc.java.school;

/**
 * Человек.
 */
public class Person {

    int age = 7;
    {
        System.out.println(age);
        age = 4;
    }

    public Person() {
        System.out.println(age);
        age = 2;
    }

    public static void main(String[] args) {
        System.out.println(new Person().age);
        int b;
        {
            int a = 0;
            //. ...
            b = 1;
        }
        {
            int a = 1;
        }
    }
}
