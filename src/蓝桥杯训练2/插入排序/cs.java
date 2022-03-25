package 蓝桥杯训练2.插入排序;

public class cs {

    public static void cr(int[] arr,int k){
        if (k==0){
            return;
        }
        cr(arr,k-1);
        int index=k-1;
        int x=arr[k];
        while (index>-1&&x>arr[index]){
            arr[index+1]=arr[index];
            index--;
        }
        arr[index+1]=x;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7,6};
        cr(arr,6);
    }
}
