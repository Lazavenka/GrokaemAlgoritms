package graphsChapter6;

import java.util.*;

public class Graph {
    private final Map<Seller, List<Seller>> graph;

    public Graph() {
        this.graph = new HashMap<>();
    }

    public void setConnections(Seller seller, List<Seller> connections) {
        this.graph.put(seller, connections);
    }

    public List<Seller> getConnections(Seller seller) {
        List<Seller> connections = graph.get(seller);
        return connections != null ? connections : Collections.emptyList();
    }

    @Override
    public String toString() {
        return "Graph{" +
                "graph=" + graph +
                '}';
    }
}
