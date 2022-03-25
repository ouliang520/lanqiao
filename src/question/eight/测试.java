package question.eight;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class 测试 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("先输入列,后输入行,在输入迷宫");
        int n = in.nextInt();//列

        int m = in.nextInt();//行
        String str = "";//将迷宫转换成字符串
        in.nextLine();
        for (int i = 0; i < m; i++) {
            str += in.nextLine();
        }

        //将迷宫放入二维数组
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = str.charAt(i * n + j) - '0';
            }
        }

        System.out.println(btf(array, m, n));
    }
    //广搜算法

    /**
     * @param array 迷宫数组
     * @param row   迷宫行数
     * @param list  迷宫列数
     * @return 迷宫走法
     */
    public static String btf(int[][] array, int row, int list) {
        int[][] directionArray = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};//方向数组
        String[] strDirection = {"下", ",上", "左", "右"};//方向字符
        Stack<NodeText> stack = new Stack<>();//用于回溯路径的堆栈
        Queue<NodeText> queue = new LinkedList<>();//用于广搜的队列
        int[][] visit = new int[list][row];//用于标记是否到达过
        NodeText node = new NodeText(0, 0, -1, -1, 0, null);//出发点
        queue.offer(node);
        StringBuffer stringBuffer = new StringBuffer();//用于打印路径
        while (!queue.isEmpty()) {
            NodeText head = queue.poll();
            stack.push(head);
            visit[head.x][head.y] = 1;//标记头节点

            for (int i = 0; i < 4; i++) {
                int x = head.x + directionArray[i][0];
                int y = head.y + directionArray[i][1];
                String direction = strDirection[i];

                if (x == row - 1 && y == list - 1 && array[x][y] == 0 && visit[x][y] == 0) {
                    NodeText top = stack.pop();//获取栈顶对象
                    stringBuffer.append(direction);
                    stringBuffer.append(top.direction);
                    int headX = top.preX;
                    int headY = top.preY;
                    //进入回溯阶段,headX与headY始终为当前节点的头节点
                    while (!stack.isEmpty()) {
                        top = stack.pop();
                        //如果栈底一个节点的位置等于栈顶节点的头节点,则为该路径
                        if (top.x==headX&&top.y==headY){
                            if(top.direction!=null) {
                                stringBuffer.append(top.direction);
                                headX = top.preX;
                                headY = top.preY;
                            }
                        }
                    }
                    return stringBuffer.reverse().toString();
                }
                //目标点未到达,且无障碍,并未超出迷宫
                if (x >= 0 && x < row && y >= 0 && y < list && array[x][y] == 0 && visit[x][y] == 0) {
                    NodeText newNode = new NodeText(x, y, head.x, head.y, head.step + 1, direction);
                    queue.offer(newNode);//将该节点插入插入队列
                }
            }
        }


        return "";
    }
}

class NodeText {
    int x, y;//当前节点
    int preX, preY;//头节点
    int step;
    String direction;

    public NodeText(int x, int y, int preX, int preY, int step, String direction) {
        this.x = x;
        this.y = y;
        this.preX = preX;
        this.preY = preY;
        this.step = step;
        this.direction = direction;
    }
}
