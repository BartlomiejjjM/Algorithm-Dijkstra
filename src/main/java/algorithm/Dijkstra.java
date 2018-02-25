package algorithm;

import model.Edge;
import model.Graph;
import model.Vertex;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Dijkstra {

    public float calculate(Graph graph, Vertex from, Vertex to){
        Set<Vertex> vertices = new HashSet<>(graph.getVertices());
        vertices.stream()
                .filter(x -> x != from)
                .forEach(x -> x.value(Float.MAX_VALUE));
        from.value(0);

        Queue<Vertex> vertexQueue = new PriorityQueue<>(vertices);

        while (!vertexQueue.isEmpty()){
            Vertex current = vertexQueue.remove();

            for (Edge edge : current.getEdges()
                 ) {
                Vertex neighbour = edge.other(current);
                float newValue = current.value() + edge.getLenght();

                if (neighbour.value() > newValue){
                    neighbour.value(newValue);
                    vertexQueue.remove(neighbour);
                    vertexQueue.add(neighbour);
                }
            }
        }
        return to.value();
    }

}
