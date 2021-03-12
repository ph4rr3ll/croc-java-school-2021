package ru.croc.javaschool.lesson3;

import ru.croc.javaschool.lesson3.model.Client;
import ru.croc.javaschool.lesson3.model.HasTradePlatformAccess;

public class ClientManager {

    public String getClientGreeting(Client client) {
        return "Hello, " + client.getFullName();
    }

    public void accessToTradePlatform(HasTradePlatformAccess tradePlatformAccess) {
        tradePlatformAccess.access();
    }
}
