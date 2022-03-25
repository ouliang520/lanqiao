package 省赛2020;
//直接穷举笔算,假设有一百人(可以扩展),求使用的试剂
public class three {
    public static void main(String[] args) {
        int b=1000;
        for (int i=1;i<50;i++){
            int a=b/i;
            if (b%i!=0){
                a+=1;
            }
            System.out.println(i+" "+( a+(i-1)*10));
        }
        //列举求得当i为10时,次数最少
    }
}
