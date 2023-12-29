package com.sunil.redis.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloneGraph {

    public static void main(String[] args) {

    }

    public static Node cloneGraph(Node node) {
        HashMap<Node, Node> visited = new HashMap<>();
        if (node == null)
            return node;

        if (visited.containsKey(node))
            return visited.get(node);

        Node cloneNode = new Node(node.getVal(), new ArrayList<>());
        visited.put(node, cloneNode);

        for (Node neighbor: node.getNeighbors()) {
            cloneNode.getNeighbors().add(cloneGraph(neighbor));
        }
        return cloneNode;
    }
}

class Node {
    public int val;
    public List<Node> neighbors;

    public Node(int val, List<Node> neighbors) {
        this.val = val;
        this.neighbors = neighbors;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public List<Node> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Node> neighbors) {
        this.neighbors = neighbors;
    }
}