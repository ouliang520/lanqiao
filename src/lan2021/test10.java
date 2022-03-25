package lan2021;

import java.util.Arrays;
import java.util.Scanner;

public class test10 {

    static int N = 5050;
    static String s;
    static char[] chars;
    static int Mod = (int) (Math.pow(10, 9) + 7);
    static int n = 0;
    static int[][] num = new int[N][N];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        n = s.length();
        chars = (" " + s).toCharArray();
        int res1 = work();
        s = reversal(s);
        chars = (" " + s).toCharArray();

        for (int i = 1; i <= n; i++) {
            if (chars[i] == '(') chars[i] = ')';
            else chars[i] = '(';
        }
        int res2 = work();

        System.out.println(res1 * res2);


    }

    private static String reversal(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    private static int work() {
        for (int i = 0; i <= n; i++) Arrays.fill(num[i], 0);
        num[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (chars[i] == '(') num[i][j] = num[i - 1][j - 1];
                else for (int k = j + 1; k >= 0; k--) {
                    num[i][j] += num[i - 1][k] % Mod;
                }
            }
        }
        for (int i = 0; i <= n; i++)
            if (num[n][i] != 0) return num[n][i];
        return 0;
    }

}


