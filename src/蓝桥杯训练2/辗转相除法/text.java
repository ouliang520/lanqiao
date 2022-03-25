package 蓝桥杯训练2.辗转相除法;

public class text {
    public static int zzxcf(int x,int y){
        if (x<y){
            zzxcf(y,x);
        }
        if (y == 0) {
            return x;
        }
        return zzxcf(y,x%y);
    }

    public static void main(String[] args) {

        System.out.println(zzxcf(45,30));//15
    }
}
