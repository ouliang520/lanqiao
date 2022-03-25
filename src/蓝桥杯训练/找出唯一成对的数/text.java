package 蓝桥杯训练.找出唯一成对的数;

import javax.rmi.CORBA.Util;
import java.util.Random;

public class text {
    public static void main(String[] args) {
        int n =1001;
        int[] array=new int[n];
        for (int i=1;i<n;i++){
            array[i-1]=i;//1-10
        }
        int x=new Random().nextInt(n-1)+1;

        int index=new Random().nextInt(n);
        array[n-1]=array[index];
        array[index]=x;

        int y=0;
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
            y=array[i]^y;
        }
        for (int i=1;i<n;i++){
            y=i^y;
        }
        System.out.println();
        System.out.println(y);

    }
}
