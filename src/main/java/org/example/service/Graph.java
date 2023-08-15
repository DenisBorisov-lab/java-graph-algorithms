package org.example.service;

import lombok.Getter;
import org.example.model.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Getter
public class Graph {

    private final Node two = new Node("Keep calm!");
    private final Node three = new Node("Be realistic!");
    private final Node four = new Node("respect your mother");
    private final Node five = new Node("Work hard!");
    private final Node seven = new Node("Dont be angry!");
    private final Node eight = new Node("Dont be a fucking pussy!");
    private final Map<Node, List<Node>> graph;

    public Graph(){
        this.graph = Map.of(
                five, List.of(three, seven),
                three, List.of(two, four),
                seven, List.of(eight),
                two, new ArrayList<>(),
                four, List.of(eight),
                eight, new ArrayList<>());
    }

    public void dfs(Map<Node, List<Node>> graph, Set<Node> visited, Node node){
        if (!visited.contains(node)) {
            System.out.println(node.getMessage());
            visited.add(node);
            for (Node elem : graph.get(node)) {
                dfs(graph, visited, elem);
            }
        }
    }
}
