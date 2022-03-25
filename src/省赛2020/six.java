package 省赛2020;

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        int big=0;
        int small=0;
        int num=0;
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        char[] chars=new char[string.length()];
        for (int i=0;i<string.length();i++){
            chars[i]=string.charAt(i);
            String a= chars[i]+"";
            if (a.compareTo("A")>=0&&a.compareTo("Z")<=0){
                big+=1;
            }else if (a.compareTo("a")>=0&&a.compareTo("z")<=0){
                small+=1;
            }else if (a.compareTo("1")>=0&&a.compareTo("9")<=0){
                num+=1;
            }

        }
        System.out.println(big);
        System.out.println(small);
        System.out.println(num);

    }
}
