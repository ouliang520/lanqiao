package 省赛2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Date;

public class ten参考 {

    static int[] link, lazy, value;

    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(System.out);
        in.nextToken();
        int n = (int)in.nval;//点数
        Date c = new Date();
        in.nextToken();
        int m = (int)in.nval;//操作次数
        value = new int[n + 1];
        lazy = new int[n + 1];
        link = new int[n + 1];
        for (int i = 1; i <= n; i++) link[i] = i;//将节点放入数组中
        while (m-- > 0) {//操作循环
            in.nextToken();
            int i = (int)in.nval;//获取操作类型
            in.nextToken();
            int v = (int)in.nval;
            in.nextToken();
            int w = (int)in.nval;
            if (i == 1) {
                v = find(v);
                w = find(w);
                if (v != w) {
                    link[v] = w;
                    lazy[v] = value[v] - value[w];
                }
            } else value[find(v)] += w;
        }
        for (int i = 1; i <= n; i++)
            out.print((value[find(i)] + lazy[i]) + " ");

        Date d = new Date();
        System.out.println("计时"+(d.getTime() - c.getTime()));
        out.close();
    }

    static int find(int x) {
        if (link[x] != x) {
            int t = link[x];
            link[x] = find(link[x]);
            lazy[x] += lazy[t];
        }
        return link[x];
    }
}
