package 蓝桥杯训练2.斐波那契数列;

public class text {
    public static void main(String[] args) {
        System.out.println(fbnq(520));

    }

    public static int fbnq(int x){
        if (x==1||x==2){
            return 1;
        }
        return fbnq(x-1) +fbnq(x-2);
    }
}
