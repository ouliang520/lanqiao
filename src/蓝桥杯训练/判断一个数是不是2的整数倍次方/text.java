package 蓝桥杯训练.判断一个数是不是2的整数倍次方;

import java.util.Scanner;

public class text {
    public static void main(String[] ages){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y= x&(x-1);
        if (y==0){
            System.out.println("是");
        }else {
            System.out.println("否");
        }
    }


}
