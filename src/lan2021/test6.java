package lan2021;

import java.util.Scanner;

public class test6
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long i=scanner.nextLong();
        i/=1000;
        long a= (i%(3600*24))/3600;
        long b=(i%3600)/60;
        long c=i%60;
        System.out.printf("%02d:%02d:%02d",a,b,c);
    }


}
