package question.frist;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class text {
    public static void question() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int[] ints = new int[b];
//生成偶数数列
        for (int i = 0; i < b; i++) {
            ints[i] = 2 * i + 1;
        }

        int l = 1;
        while (true) {
            int p = l + 1;

            for (int i = l + 1; i < b; i++) {
                if ((i + 1) % ints[l] == 0) {

                } else {
                    ints[p] = ints[i];
                    p++;
                }
                if (ints[i]>b){
                    break;
                }
            }

            l++;
            if (ints[l] >= b) {
                break;
            }
        }

        int num = 0;
        for (int i = 0; i < b; i++) {

            if (ints[i] >= b) {
                break;
            }
            if (ints[i] > a) {
                num++;
            }
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); //获取开始时间

        question();

        long endTime = System.currentTimeMillis(); //获取结束时间

        System.out.println("程序运行时间：" + (endTime - startTime) + "ms"); //输出程序运行时间
    }
}

