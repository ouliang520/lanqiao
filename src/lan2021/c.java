package lan2021;

import java.util.Map;
import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        char[] chars={' ','1','l','e','v','e','l'};
        int[] ints={0,0,0,0,0,0,0,0};
        int count=0;
        int k=0;
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int i=1;
        int last=0;
        while (true){
            int j=i%n==0?n:i%n;
            if (j==ints[1]||j==ints[2]||j==ints[3]||j==ints[4]||j==ints[5]||j==ints[6]||j==ints[7])count++;
            if (last+m+count==i){
                last=i;
                ints[k+1]=j;
                k++;
                count=0;
                if (k==7)break;
            }

            i++;
        }
        System.out.println();
    }
}
