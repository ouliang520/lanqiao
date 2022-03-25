package 省赛2020;

import java.io.*;
import java.util.Arrays;

public class nine参考2 {

    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int n = (int)in.nval, v, w;
        in.nextToken();
        int k = (int)in.nval;
        Node[] tree = new Node[n + 1];
        tree[0] = new Node(0);
        for (int i = 1; i <= n; i++){
            in.nextToken();
            w = (int)in.nval;
            in.nextToken();
            v = (int)in.nval;
            if (v < tree[w].value) tree[i] = tree[w].left = new Node(v);
            else tree[i] = tree[w].right = new Node(v);
        }
        if (tree[k].left != null && tree[k].right!= null)
            System.out.print('0');//左右节点不为空返回0,无法插入新节点
        else {
            Node node = tree[k];//目标节点
            Arrays.sort(tree);//中序遍历,将树的值由小到大排序
            int left = 1, right = n, mid = 0;
            while (left <= right) {
                mid = (left + right) / 2;
                if (tree[mid].value < node.value) left = mid + 1;
                else if (tree[mid].value > node.value) right = mid - 1;
                else break;
            }
            if (mid == 1 || mid == n)//目标点为最小值或最大值可取正无穷和负无穷
                System.out.print("-1");
            else {
                left = node.left == null? tree[mid - 1].value: node.value;
                right = node.right == null? tree[mid + 1].value: node.value;
                System.out.print(right - left - 1);
            }
        }
    }

    static class Node implements Comparable<Node> {

        int value;

        Node left, right;

        Node(int value) { this.value = value; }

        public int compareTo(Node node) {
            return this.value - node.value;
        }
    }
}

