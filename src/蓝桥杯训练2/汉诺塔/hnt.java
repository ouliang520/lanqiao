package 蓝桥杯训练2.汉诺塔;

import java.beans.PropertyVetoException;
/*
汉诺塔问题,将一个n层的汉诺塔问题转换为两个n-1层的汉诺塔问题
首先将n-1层汉诺塔借助终点柱移动到中间柱
接着将第n层移动到终点
最后将n-1层汉诺塔借助起点柱移动到终点柱

n-1层汉诺塔问题同样科研转化成两个n-2层汉诺塔的问题
.
.
.
2层汉诺塔问题可以转换层两个1层汉诺塔的问题
1层汉诺塔问题直接从起点移动到终点
 */
public class hnt {
    //汉诺塔
    public static void hannuo(int x,String A,String B,String C){
        if (x==1){
            System.out.println(A+"移动到"+C);
        }else{
            hannuo(x-1,A,C,B);
            System.out.println(A+"移动到"+C);
            hannuo(x-1,B,A,C);
        }
    }

    public static void main(String[] args) {
        hannuo(3,"A","B","C");
    }
}
