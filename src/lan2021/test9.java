package lan2021;

import java.util.Arrays;
import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[] num=new int[n+1];
        for (int i=1;i<=n;i++){
            num[i]=i;
        }
        int[][] c=new int[m][2];
        for (int i=0;i<m;i++){
            c[i][0]=scanner.nextInt();
            c[i][1]=scanner.nextInt();
        }

        for (int i=0;i<m;i++){
            if (c[i][0]==0){
               int[] en= Arrays.copyOfRange(num,1,c[i][1]+1);
               Arrays.sort(en);
               int k=en.length-1;
               for (int j=1;j<=c[i][1];j++){
                   num[j]=en[k];
                   k--;
               }
            }else if(c[i][0]==1){
                Arrays.sort(num,c[i][1],num.length);
            }
        }
        for (int i=1;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}
