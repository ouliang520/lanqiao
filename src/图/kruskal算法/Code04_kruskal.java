package 图.kruskal算法;

import 图.结构.Edge;
import 图.结构.Graph;
import 图.结构.Node;

import java.util.*;

public class Code04_kruskal {
    public static class MySets{
        public HashMap<Node, List<Node>> setMap;

        public MySets(List<Node> nodes){
            for (Node cur :nodes){
                List<Node> set=new ArrayList<Node>();
                set.add(cur);
                setMap.put(cur,set);
            }
        }

        public boolean isSameSet(Node from,Node to){
            List<Node> fromSet=setMap.get(from);
            List<Node> toSet=setMap.get(to);
            return fromSet==toSet;
        }

        public  void union(Node from,Node to){
            List<Node> fromSet=setMap.get(from);
            List<Node> toSet=setMap.get(to);

            for (Node toNode:toSet){
                fromSet.add(toNode);
                setMap.put(toNode,fromSet);
            }
        }


    }

//    //kruskalMST算法
//    public static Set<Edge> kruskalMST(Graph graph){
//        UnionFind unionFind=new UnionFind();
//        unionFind.makeSets(graph.nodes.values());
//        PriorityQueue<Edge> priorityQueue =new PriorityQueue<Edge>(new EdgeComparator());
//        for (Edge edge:graph.edges){//M条边
//            priorityQueue.add(edge);//O(logM)
//        }
//        Set<Edge> result=new HashSet<>();
//        while (!priorityQueue.isEmpty()){
//            Edge edge=priorityQueue.poll();//O(logM)
//            if (!unionFind.isSameSet(edge.from,edge.to)){
//                result.add(edge);
//                unionFind.union(edge.from,edge.to);
//            }
//        }
//        return result;
//    }
}
