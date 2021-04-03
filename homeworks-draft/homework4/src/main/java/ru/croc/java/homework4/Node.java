package ru.croc.java.homework4;

public class Node<T> {
    private final Integer id;
    private final T data;

    public Node(Integer id, T data) {
        this.id = id;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public T getData() {
        return data;
    }
}
