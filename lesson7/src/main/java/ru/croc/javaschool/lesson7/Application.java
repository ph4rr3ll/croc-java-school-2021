package ru.croc.javaschool.lesson7;

import ru.croc.javaschool.lesson7.dbprovider.DataSourceProvider;
import ru.croc.javaschool.lesson7.model.Task;
import ru.croc.javaschool.lesson7.repository.TaskRepository;
import ru.croc.javaschool.lesson7.service.TaskService;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        DataSourceProvider dataSourceProvider = new DataSourceProvider();
        TaskRepository taskRepository = new TaskRepository(dataSourceProvider.getDataSource());
        TaskService service = new TaskService(taskRepository);

        Task task = service.createNew(new Task(1, "Check program result"));
        service.getAll().forEach(System.out::println);
    }
}
