package 蓝桥杯训练.交换整数的二进制奇偶位;

import java.util.Scanner;

public class text {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //将该数与1010101010101010与运算保留偶数位
        //0xaaaaaaaa;
        //将该数与0101010101010101与运算保留奇数位
        //0x55555555;

        int num=sc.nextInt();
        int x=num&0xaaaaaaaa;
        int y=num&0x55555555;
        int c=x>>1|y<<1;
        System.out.println(c);
    }

}
