package lan2021;

import java.util.Scanner;

//杨辉三角
public class test8 {
    static int n = 0;

    public static int pl(int i,int j){
        double l=(double) i;
        double a=i-j;
        double res=1;
        for (int k=1;k<=a;k++){
            res=res*(l--/k);
        }
        return (int) res;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        for (int k=16;k>=0;k--){
            if (cheek(k,n)){
                break;
            }
        }
    }

    private static boolean cheek(int k, int n) {
        int c=pl(2*k,k);
        if (c>n) return false;

        if (c==n){ System.out.println((2*k*(2*k+1))/2+k+1);return true;}
        else for (int i=2*k;i<=32;i++){
            int d=pl(i,k);
            if (d==n){ System.out.println((i*(i+1))/2+k+1);return true;}
            else if (d>n)return false;
        }

        return false;
    }
}
