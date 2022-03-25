package 省赛2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        Node[] tree=new Node[n+1];
        for (int i=1;i<n+1;i++){
            if (i==1){
                //根节点没有父节点
                tree[i]=new Node(sc.nextInt(),sc.nextInt());
                continue;
            }else{
                Node child=new Node(sc.nextInt(),sc.nextInt());
                if (child.value<tree[child.parent].value){
                    tree[child.parent].left=child;
                }else {
                    tree[child.parent].right=child;
                }
                tree[i]=child;
            }
        }

    }

}

class Node{
    int parent;
    int value;
    Node left;
    Node right;
    public Node(int parent,int value){
        this.parent=parent;
        this.value=value;
    }
}
