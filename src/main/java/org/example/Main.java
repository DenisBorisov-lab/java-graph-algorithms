package org.example;

import org.example.model.Node;
import org.example.service.Graph;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {


    public static void main(String[] args) {

        Graph graph = new Graph();
        Set<Node> visited = new HashSet<>();
        Map<Node, List<Node>> map = graph.getGraph();
        Node node = graph.getFive();

        // Usage of dfs
        System.out.println("Usage of dfs");
        graph.dfs(map, visited, node);

        //Usage of bfs
        System.out.println("Usage of bfs");
        graph.bfs(map, visited, node);

    }
}