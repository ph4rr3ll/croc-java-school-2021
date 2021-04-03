package ru.croc.java.homework4;

import java.util.*;

public class Graph<T> {
    private final List<LinkComponent<T>> components;


    public Graph() {
        components = new ArrayList<>();
    }

    public void add(Node<T> node) {
        final Set<Node<T>> nodes = new HashSet<>();
        nodes.add(node);
        components.add(new LinkComponent<T>(
                nodes,
                new HashSet<>()
        ));
    }

    public void add(Edge<T> edge) {
        // Проверяем, что вершины лежат в одном компоненте
        // тогда добавляем ребро в него

        // Если в двух компонентах, то сливаем компоненты
        // в один и добавляем в него новое ребро

        // Сортируем компоненты связности
    }

    public void remove(Node<T> node) {
        // Находим компонент с вершиной
        // Удаляем в нем вершину и все ребра, которые ее содержат
        // Пробуем разорвать компонент на несколько, если возможно

        // Сортируем компоненты связности
    }

    public void remove(Edge<T> edge) {
        // Находим компонент
        // Удаляем ребро и разбиваем компонет на несколько
        // если возможно

        // Сортируем компоненты связности
    }

    public List<LinkComponent<T>> components() {
        return components;
    }

    public int componentsCount() {
        return components.size();
    }
}
