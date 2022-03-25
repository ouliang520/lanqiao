package 蓝桥杯训练.二进制中1的个数;

import java.util.Scanner;
//计算一个数的二进制中1的个数
public class text {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//输入
        System.out.println(count2(n));

    }

    //利用二进制做差进行与运算次数计算
    public static int count(int x){
        int count=0;
        while (x!=0){
            x=(x-1)&x;//与运算
            count++;
        }
        return count;
    }

    //利用字符对比进行计算
    public static int count1(int n){
        String str=Integer.toString(n,2)+"";//转换为二进制
        int y=0;
        for (int i =0;i<str.length();i++){
            if (str.charAt(i)-'0'==1) {
                y++;
            }
        }
        return y;
    }

    //利用位移运算,比较是否为1
    public static int count2(int n){
        int count=0;

        for (int i=0;n>>i!=0;i++){
            if ((n>>i&1)==1){
                count++;
            }
        }
        return count;
    }
}
