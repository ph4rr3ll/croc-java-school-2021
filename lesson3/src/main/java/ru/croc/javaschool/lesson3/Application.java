package ru.croc.javaschool.lesson3;

import ru.croc.javaschool.lesson3.model.Gender;
import ru.croc.javaschool.lesson3.model.JuridicalClient;
import ru.croc.javaschool.lesson3.model.PhysicalClient;

public class Application {

    public static void main(String[] args) {
        PhysicalClient physical = new PhysicalClient(1,
                "ivan@mail.ru",
                "79990000001",
                "Ivan",
                "Ivanov",
                "Ivanovich",
                Gender.MALE);
        JuridicalClient juridical = new JuridicalClient(100,
                "rik@mail.ru",
                "74950000001",
                "Roga I Kopyta",
                "Ivanov Ivan");

        ClientManager clientManager = new ClientManager();

        System.out.println(clientManager.getClientGreeting(physical));
        System.out.println(clientManager.getClientGreeting(juridical));

        clientManager.accessToTradePlatform(juridical);
    }
}