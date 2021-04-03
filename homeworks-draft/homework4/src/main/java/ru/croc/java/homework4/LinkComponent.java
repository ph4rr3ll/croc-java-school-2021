package ru.croc.java.homework4;

import java.util.HashSet;
import java.util.Set;

public class LinkComponent<T> {
    private final Set<Node<T>> nodes;
    private final Set<Edge<T>> edges;

    public LinkComponent(Set<Node<T>> nodes, Set<Edge<T>> edges) {
        this.nodes = new HashSet<>(nodes);
        this.edges = new HashSet<>(edges);
    }

    public Set<Node<T>> getNodes() {
        return nodes;
    }

    public Set<Edge<T>> getEdges() {
        return edges;
    }
}
