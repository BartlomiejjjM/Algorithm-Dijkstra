package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vertex {

    private String name;
    private List <Edge> edges = new ArrayList<Edge>();

    public Vertex(String name) {
        this.name = name;

    }
    public void link(Vertex other, float edgevalue){
        Edge edge = new Edge(edgevalue, Arrays.asList(this, other));
        edges.add(edge);
        other.edges.add(edge);
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
}
