package question.eight;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            String s = "01010101001011001001010110010110100100001000101010"
                    + "00001000100000101010010000100000001001100110100101"
                    + "01111011010010001000001101001011100011000000010000"
                    + "01000000001010100011010000101000001010101011001011"
                    + "00011111000000101000010010100010100000101100000000"
                    + "11001000110101000010101100011010011010101011110111"
                    + "00011011010101001001001010000001000101001110000000"
                    + "10100000101000100110101010111110011000010000111010"
                    + "00111000001010100001100010000001000101001100001001"
                    + "11000110100001110010001001010101010101010001101000"
                    + "00010000100100000101001010101110100010101010000101"
                    + "11100100101001001000010000010101010100100100010100"
                    + "00000010000000101011001111010001100000101010100011"
                    + "10101010011100001000011000010110011110110100001000"
                    + "10101010100001101010100101000010100000111011101001"
                    + "10000000101100010000101100101101001011100000000100"
                    + "10101001000000010100100001000100000100011110101001"
                    + "00101001010101101001010100011010101101110000110101"
                    + "11001010000100001100000010100101000001000111000010"
                    + "00001000110000110101101000000100101001001000011101"
                    + "10100101000101000000001110110010110101101010100001"
                    + "00101000010000110101010000100010001001000100010101"
                    + "10100001000110010001000010101001010101011111010010"
                    + "00000100101000000110010100101001000001000000000010"
                    + "11010000001001110111001001000011101001011011101000"
                    + "00000110100010001000100000001000011101000000110011"
                    + "10101000101000100010001111100010101001010000001000"
                    + "10000010100101001010110000000100101010001011101000"
                    + "00111100001000010000000110111000000001000000001011"
                    + "10000001100111010111010001000110111010101101111000";
            int[][] labyrinth = new int[30][50];
            //这里的终点坐标是(29,49)
            for (int i = 0; i < 30; i++) {
                for (int j = 0; j < 50; j++) {
                    labyrinth[i][j] = s.charAt(50 * i + j) - '0';
                }
            }
            System.out.println(BFS(labyrinth, 30, 50));
        } catch (Exception e) {
            input.close();
        }
    }

    public static String BFS(int[][] labyrinth, int row, int column) {
        int[][] stepArr = { { -1, 0 }, { 0, 1 }, { 0, -1 }, { 1, 0 } };//方向数组
        String[] direction = { "上", "右", "左","下"};//方向字符
        int[][] visit = new int[row][column];// 标记是否已经访问过
        StringBuilder sb = new StringBuilder();
        NodeText node = new NodeText(0, 0, -1, -1, 0, null);
        Queue<NodeText> queue = new LinkedList<NodeText>();//队列
        Stack<NodeText> stack = new Stack<NodeText>();//堆
        queue.offer(node);//插入节点
        while (!queue.isEmpty()) {
            //poll方法
            //检索并删除此队列的头部，如果此队列为空，则返回 null。返回值：此队列的头部，如果此队列为空，则返回 null
            NodeText head = queue.poll();
            //push
            //将一个项目推入此堆栈的顶部。
            stack.push(head); // 用于回溯路径
            visit[head.x][head.y] = 1;//标记访问的路径
            //从节点向四个方向进行可能的移动
            for (int i = 0; i < 4; i++) {
                int x = head.x + stepArr[i][0];
                int y = head.y + stepArr[i][1];
                String d = direction[i];//方向
                // exit

                // 终点坐标(29,49),并令终点坐标与访问坐标都为0
                if (x == row - 1 && y == column - 1 && labyrinth[x][y] == 0 && visit[x][y] == 0) {
                    // 打印路径
                    NodeText top = stack.pop();//获得栈顶部对象
                    sb.append(d);//方向字符串
                    sb.append(top.direction);
                    int preX = top.preX;
                    int preY = top.preY;
                    while (!stack.isEmpty()) {
                        top = stack.pop();
                        if (preX == top.x && preY == top.y) {
                            if (top.direction != null)
                                sb.append(top.direction);
                            preX = top.preX;
                            preY = top.preY;
                        }

                    }
                    return sb.reverse().toString();//字符串反转
                }
                // bfs
                if (x >= 0 && x < row && y >= 0 && y < column && labyrinth[x][y] == 0 && visit[x][y] == 0) {
                    NodeText newNode = new NodeText(x, y, head.x, head.y, head.step + 1, d);
                    queue.offer(newNode);//将该节点插入插入队列
                }
            }
        }
        return null;
    }
}

class Node {
    int x, y;//当前坐标
    int step;
    int preX, preY;//上一个坐标
    String direction;

    Node(int x, int y, int preX, int preY, int step, String direction) {
        this.x = x;
        this.y = y;
        this.preX = preX;
        this.preY = preY;
        this.step = step;
        this.direction = direction;
    }
}

