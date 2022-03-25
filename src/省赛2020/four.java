package 省赛2020;

import java.util.Arrays;
import java.util.Scanner;

public class four {
    static int cns;
    static int num;
    static int[] a=new int[15];
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        int x=0;
        for (int i=0;i<15;i++){
            a[i]= sc.nextInt();
            num+=a[i];
        }
        cns=num;
        dfs(0,0);



        System.out.println(cns);
    }
    //将所有可能列出,取差值最小(广搜思想)
    public static void dfs(int d,int v){
        if (d==14){
            //cns储存最小差值
           cns=min(cns,abs(num-v-v));
        }else {
            dfs(d + 1, v + a[d]);
            dfs(d + 1, v);
        }
    }

    static int min(int a,int b){
        if (a<b){
            return a;
        }else {
            return b;
        }
    }

    static int abs(int a){
        if (a>0){
            return a;
        }else {
            return -a;
        }
    }
}

