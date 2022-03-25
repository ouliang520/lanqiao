package lan2021;
//不会
public class test4 {
    public static void main(String[] args) {
        long n=2021041820210418L;
        long[] num = new long[10000];
        int x=0;
        for (long i=1;i*i<=n;i++){
            if (n%i==0){
                num[x++]=i;
                if (n/i!=i)num[x++]=(n/i);
            }
        }
        int res=0;
        for (int i=0;i<x;i++){
            for (int j=0;j<x;j++){
                for (int k=0;k<x;k++){
                    if (num[i]*num[j]*num[k]==n){
                        res++;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
