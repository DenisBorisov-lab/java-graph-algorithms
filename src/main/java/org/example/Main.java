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

        // Usage of dfs
        Set<Node> visited = new HashSet<>();
        Map<Node, List<Node>> map = graph.getGraph();
        Node node = graph.getFive();
        graph.dfs(map, visited, node);

    }
}