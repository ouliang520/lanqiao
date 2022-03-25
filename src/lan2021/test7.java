package lan2021;

import java.util.Scanner;
//称量最小砝码,砝码数1 2 5完成
public class test7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        System.out.println(fa(i));
    }

    public static int fa(int i){
        int[] array={1,2,5};
        int m=1;
        int sum=0;
        int k=0;
        while(sum<i){
            sum+=array[k%3]*m;
            k++;
            if (k!=0&&k%3==0){
                m*=10;
            }
        }
        return k;
    }
}
