package model;

import java.util.List;

public class Edge {

    private float lenght;
    private List<Vertex> vertices;

     Edge(float lenght, List<Vertex> vertices) {
         if (vertices.size()!=2){
             throw new IllegalArgumentException("Edge must have only two vertices");
         }
         if (vertices.get(0).equals(vertices.get(1))){
             throw new IllegalArgumentException("Vertices have to be different");
         }
         this.lenght = lenght;
         this.vertices = vertices;
    }
    public Vertex other(Vertex given){
         if (vertices.get(0).equals(given)){
             return vertices.get(1);
         }
         else if (vertices.get(1).equals(given)){
             return vertices.get(0);
         }
         else throw new IllegalArgumentException();

    }

    public float getLenght() {
        return lenght;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertex> vertices) {
        this.vertices = vertices;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "lenght=" + lenght +
                ", vertices=" + vertices +
                '}';
    }
}
