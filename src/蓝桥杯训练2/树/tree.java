package 蓝桥杯训练2.树;

import java.util.*;

public class tree {
   static Map<Integer,Integer> map=new HashMap<>();
    public static void main(String[] args) {
        Integer b=new Integer(1);
        map.put(1,2);
        if (map.containsKey(2))
        System.out.println(123);

    }
}

class Node {
    int i;
    int value;
    Node right;
    Node left;

    public Node(int i, int value) {
        this.i = i;
        this.value = value;
    }
}
