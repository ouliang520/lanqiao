package 图.结构;


import java.util.*;

public class Graph {
    public HashMap<Integer, Node> nodes;
    public HashSet<Edge> edges;

    public Graph(){
        nodes=new HashMap<>();
        edges=new HashSet<>();
    }
}
