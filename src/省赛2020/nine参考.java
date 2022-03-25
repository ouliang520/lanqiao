package 省赛2020;

import java.io.BufferedInputStream;
import java.util.*;

public class nine参考 {
    /**
     * 根据二叉树的性质，建立映射关系，用数组存储所有节点的索引，并根据当前输入值，确定是父节点的左边还是右边
     * 然后on 复杂度算出需要多少个
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int N = sc.nextInt();
        int findNode = sc.nextInt();
        node[] list = new node[N + 1];
        for (int i = 1; i < list.length; i++) {
            if (i == 1) {
                list[i] = new node(sc.nextInt(), sc.nextInt());
                continue;
            }
            list[i] = new node(sc.nextInt(), sc.nextInt());
            node fa = list[list[i].fa];
            if (list[i].val > fa.val) {
                fa.right = list[i];
            } else {
                fa.left = list[i];
            }

        }
        int findValue = list[findNode].val;
        dfs(list[1]);
        int size = li.size();
        for (int i = 0; i < size; i++) {
            if (li.get(i) == findValue) {
                if (i == 0 || i == size - 1) {//如果大小排序中为最大或者最小,子节点可以取正负无穷
                    System.out.println(-1);
                    return;
                } else {
                    int sum = 0;
                    if (list[findNode].left != null) {
                        int pre = li.get(i - 1);//深搜前一位的值
                        sum += findValue - pre - 1;//与上一位的最大差值
                    }
                    if (list[findNode].right != null) {
                        int la = li.get(i + 1);//深搜下一位的值
                        sum += la - findValue - 1;//与下一位的最大差值
                    }
                    System.out.println(sum);
                    return;
                }
            }
        }

    }

    static ArrayList<Integer> li = new ArrayList<Integer>();
    //深搜
    public static void dfs(node root) {
        if (root == null) return;

        dfs(root.left);
        li.add(root.val);

        dfs(root.right);
    }

    public static class node {
        int fa;
        int val;
        node right;
        node left;

        public node(int fa, int val) {
            this.fa = fa;
            this.val = val;
        }
    }
}


