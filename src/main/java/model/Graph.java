package model;

import java.util.List;

public class Graph {

    private final List<Vertex> vertices;

    public Graph(List<Vertex> vertices) {
        if (vertices.size()==0){
            throw new IllegalArgumentException();
        }
        this.vertices = vertices;
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    @Override
    public String toString() {
        return "Graph{" +
                 vertices + "}";
    }
}
