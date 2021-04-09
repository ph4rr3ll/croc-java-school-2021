package ru.croc.javaschool.lesson7.service;

import ru.croc.javaschool.lesson7.model.Task;
import ru.croc.javaschool.lesson7.repository.TaskRepository;

import java.util.List;

public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> getAll() {
        return repository.findAll();
    }

    public Task createNew(Task task) {
        repository.createNew(task);
        return task;
    }
}
