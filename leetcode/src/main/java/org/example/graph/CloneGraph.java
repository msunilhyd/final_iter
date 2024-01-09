package org.example.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Node {
    public int val;
    public List<Node> neigbors = new ArrayList<>();
}

public class CloneGraph {
    public static Map<Node, Node> map = new HashMap<>();
    public static void main(String[] args) {
        Node n1 = new Node();
        n1.val = 1;
        Node n2 = new Node();
        n2.val = 2;
        Node n3 = new Node();
        n3.val = 3;
        Node n4 = new Node();
        n4.val = 4;

        n1.neigbors.add(n2);
        n1.neigbors.add(n3);
        n2.neigbors.add(n4);
        n2.neigbors.add(n1);
        n3.neigbors.add(n4);
        n3.neigbors.add(n2);
        n4.neigbors.add(n3);
        n4.neigbors.add(n1);
        Node clonedNode = find(n1);
        System.out.println(clonedNode.val);
        for (Node node : clonedNode.neigbors) {
            System.out.println(node.val);
        }
    }

    public static Node find(Node node) {
        if (node == null)
            return null;
        if (map.containsKey(node))
            return map.get(node);
        Node clonedNode = new Node();
        clonedNode.val = node.val;
        map.put(node, clonedNode);
        for (Node node1 : node.neigbors) {
            clonedNode.neigbors.add(find(node1));
        }
        return clonedNode;
    }
}
