package 省赛2020;

import java.math.BigInteger;
import java.util.Date;
import java.util.Scanner;

public class seven {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Date c=new Date();
        int j=sc.nextInt();
        BigInteger all=new BigInteger("0");
        for (int i=1;i<j+1;i++){
            BigInteger bigInteger=new BigInteger(i+"");
            bigInteger= bigInteger.pow(8);
            all= all.add(bigInteger);
        }
        BigInteger a= all.remainder(new BigInteger("123456789"));
        System.out.println(a);
        Date d=new Date();
        System.out.println(d.getTime()-c.getTime());

    }
}
/*
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Date c=new Date();
        int j=sc.nextInt();
        BigInteger all=new BigInteger("0");
        for (int i=1;i<j+1;i++){
            BigInteger bigInteger=new BigInteger(i+"");
            bigInteger= bigInteger.pow(8);
            all= all.add(bigInteger);
        }
        BigInteger a= all.remainder(new BigInteger("123456789"));
        System.out.println(a);
        Date d=new Date();
        System.out.println(d.getTime()-c.getTime());

    }
 */