package 省赛2020;

import java.util.*;

public class ten参考2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //定义共有n个节点
        int n = in.nextInt();
        Date c = new Date();
        //定义共有m条操作
        int m = in.nextInt();
        List<wangLuoNode> node = new ArrayList<wangLuoNode>();
        int[][] log = new int[m][3];
        //创建节点
        for (int i = 0; i < n; i++) {
            wangLuoNode next = new wangLuoNode(i, 0);
            node.add(next);
        }
        //输入操作
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 3; j++) {
                log[i][j] = in.nextInt();
            }
        }

        //查看节点信息量
        for (wangLuoNode temp : node) {
            System.out.println(temp.num + "号节点信息量为：" + temp.sum);
        }
        //执行命令
        for (int i = 0; i < m; i++) {
            //连接节点
            if (log[i][0] == 1) {
                if (log[i][1] != log[i][2]) {
                    node.get(log[i][1] - 1).node.add(node.get(log[i][2] - 1));
                    System.out.println();
                    System.out.println(log[i][1] + "和" + log[i][2] + "建立连接了！");
                    node.get(log[i][2] - 1).node.add(node.get(log[i][1] - 1));
                    System.out.println();
                    System.out.println(log[i][2] + "和" + log[i][1] + "建立连接了！");
                }
            }
            //传输数据
            else {
                int[] flag = new int[n];
                //给某个节点传输多少的量
                transhu(flag, node.get(log[i][1] - 1), log[i][2]);
                //查看节点信息量
                System.out.println();
                for (wangLuoNode temp : node) {
                    System.out.println(temp.num + "号节点信息量为：" + temp.sum);
                }
                System.out.println();
                System.out.println(log[i][1] + "传输了" + log[i][2] + "的信息！");
            }
        }
        Date d = new Date();
        System.out.println("计时"+(d.getTime() - c.getTime()));

    }


    //进行遍历传输
    public static void transhu(int[] flag, wangLuoNode node, int text) {
        if (node.node.size() == 0) {
            node.sum += text;
            return;
        }
        for (int i = 0; i < node.node.size(); i++) {
            if (flag[node.node.get(i).num] != 1) {
                node.node.get(i).sum += text;
                flag[node.node.get(i).num] = 1;
            } else {
                continue;
            }
            transhu(flag, node.node.get(i), text);
        }
    }
}

class wangLuoNode {
    int num;
    int sum;
    List<wangLuoNode> node = new LinkedList<wangLuoNode>();

    public wangLuoNode(int num, int sum) {
        this.sum = sum;
        this.num = num;
    }
}


