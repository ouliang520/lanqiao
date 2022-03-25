package 省赛2020;

import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int[] a = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            a[i] = num.charAt(i) - '0';
        }
        for (int i = 0; i < a.length; i++) {
            //处理当最后一个数为零不能单独存在时的特殊情况
            if (i == a.length - 3 && a[a.length - 1] == 0) {
                int c = a[i];
                int d = a[i + 1] * 10 + a[i + 2];
                stringBuffer.append(zh(c));
                stringBuffer.append(zh(d));
                break;
            }
            //当当前位置的数为1或者2,尝试将其与后一位组成两位数
            if (a[i] == 1 || (a[i] == 2 && a[i + 1] < 7)) {
                int b = a[i] * 10 + a[i + 1];
                i++;//与后一位组成两位数,跳过
                stringBuffer.append(zh(b));
            } else {
                int b = a[i];
                stringBuffer.append(zh(b));
            }
        }
        System.out.println(stringBuffer);
    }

    static char zh(int x) {
        char a = (char) (x + 64);
        return a;
    }

}
