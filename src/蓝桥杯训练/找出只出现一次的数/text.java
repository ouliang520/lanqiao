package 蓝桥杯训练.找出只出现一次的数;

public class text {
    public static int Inquire(int[] array){
        int x=0;
        for (int i=0;i<array.length;i++){
            x=x^array[i];
        }
        return x;
    }
//测试
    public static void main(String[] args) {
        int[] a={1,3,3,1,5,8,8,5,9,6,9};
        System.out.println(Inquire(a));
    }
}
