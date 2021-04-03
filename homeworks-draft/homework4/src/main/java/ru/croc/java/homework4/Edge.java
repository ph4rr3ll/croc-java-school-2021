package ru.croc.java.homework4;

public class Edge<T> {
    private final Node<T> a;
    private final Node<T> b;

    public Edge(Node<T> a, Node<T> b) {
        this.a = a;
        this.b = b;
    }

    public Node<T> getA() {
        return a;
    }

    public Node<T> getB() {
        return b;
    }
}
