package ru.croc.javaschool.lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.croc.javaschool.lesson3.model.Gender;
import ru.croc.javaschool.lesson3.model.PhysicalClient;

public class ClientManagerTest {

    private ClientManager clientManager;

    @BeforeEach
    public void setup() {
        clientManager = new ClientManager();
    }

    @Test
    @DisplayName("Тест метода приветствия клиента физического лица")
    public void testGreetPhysicalClient() {
        PhysicalClient physical = new PhysicalClient(1,
                "ivan@mail.ru",
                "79990000001",
                "Ivan",
                "Ivanov",
                "Ivanovich",
                Gender.MALE);
        Assertions.assertEquals(
                "Hello, Ivanov Ivan Ivanovich",
                clientManager.getClientGreeting(physical));
    }
}
