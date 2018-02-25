package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vertex implements Comparable<Vertex> {

    private String name;
    private List <Edge> edges = new ArrayList<>();
    private float value;

    public Vertex(String name) {
        this.name = name;

    }
    public void link(Vertex other, float edgevalue){
        Edge edge = new Edge(edgevalue, Arrays.asList(this, other));
        edges.add(edge);
        other.edges.add(edge);
    }
    public void value(float value){
        this.value=value;
    }
    public float value(){
        return value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    @Override
    public String toString() {
        return name ;
    }

    @Override
    public int compareTo(Vertex vertex) {
        return Float.compare(value, vertex.value);
    }
}
