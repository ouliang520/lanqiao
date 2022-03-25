package lan2021;

public class 回文素数对 {
    public static int su(int i){
        int flag=1;
        if (i%2==0)return 0;
        else for (int j=3;j*j<i;j++){
            if (i%j==0){
                flag=0;
                break;
            }
        }

        return  flag;
    }

    public static int hui(int i){
        int res=0;
        int b=i;
        while (b>0){
            res=res*10+ b%10;
            b/=10;
        }
        if (res==i)return 1;
        else return 0;
    }
    public static boolean cha(int i,int j){
        int a=i-j;
        int result=0;
        while (a>0){
            if (a%10!=0) result+=a%10;
            a/=10;
        }
        if (result==1) return true;
        else return false;
    }
    public static void main(String[] args) {
        int k=0;
        int sum=0;
        for (int i=3000000;;i++){
            if (su(i)+hui(i)==2){
                if (cha(i,sum)){System.out.println(sum+" "+i);k++;sum=0;}
                else sum=i;

                if (k>4)
                break;
            }
        }

    }
}
