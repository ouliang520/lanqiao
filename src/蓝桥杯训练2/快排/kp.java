package 蓝桥杯训练2.快排;
/*
快排必须要右指针先动,否则左指针会跑向大于基准元素的位置
目的是让基准元素与指针重叠的位置交换位置,这个位置的值不大于基准元素
 */
public class kp {
    public static void main(String[] args) {
        int[] array={5,8,3,2,4,9,6,7};
        kpmain(array,0,7);
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static int kp(int[] array,int a,int b){
        int startIndex=a;
        int endIndex=b;
        int x=array[a];
        while (a!=b){
            while (array[b]>x&&a<b){
                b--;
            }
            while (array[a]<=x&&a<b){
                a++;
            }
            if (a<b){
                int num= array[a];
                array[a]=array[b];
                array[b]=num;
            }
        }
       array[startIndex] =array[a];
        array[a]=x;
        return a;//返回基准元素下标
    }

    public static void kpmain(int[] array,int a,int b){
        if (a>b){
            return;
        }
        int pivot=kp(array,a,b);
        kpmain(array,a,pivot-1);
        kpmain(array,pivot+1,b);
    }
}
