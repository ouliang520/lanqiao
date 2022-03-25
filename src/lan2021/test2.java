package lan2021;

public class test2 {
    public static void main(String[] args) {
        int[] num =new int[10];
        for (int i=0;i<10;i++){
            num[i]=2021;
        }
        int b;
        for (int i=1;;i++){
            int a=i;
            while(a!=0){
                b=a%10;
                if (num[b]!=0){
                    num[b]-=1;
                    a/=10;
                }else {
                    System.out.println(i-1);
                    return;
                }

            }
        }
    }
}
