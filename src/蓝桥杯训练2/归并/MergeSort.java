package 蓝桥杯训练2.归并;


import java.util.Scanner;

public class MergeSort{

    //计数
    private static int count = 0;
    //存储数组
    private static int[] array;


    private static void merge(int left , int middle, int right){
        int sizeOfLeft = middle - left + 1;
        int sizeOfRight = right - middle;
        int[] leftArray = new int[sizeOfLeft];
        int[] rightArray = new int[sizeOfRight];


        //分别将左右两边的数据存储在两个数组当中
        for(int temp = 0; temp < sizeOfLeft; temp++){
            leftArray[temp] = array[left + temp];
        }

        for(int temp = 0; temp < sizeOfRight; temp++){
            rightArray[temp] = array[middle + 1 + temp];
        }

        int indexLeft,indexRight,temp;
        indexLeft=0;indexRight=0;temp=left;

        //遍历两个数组，比较数组成员的大小，将较小值存储到数组当中
        //当左数组的成员比右数组大时，记录逆对数的个数
        while(indexLeft < sizeOfLeft && indexRight<sizeOfRight)
            if(leftArray[indexLeft]<=rightArray[indexRight])
                array[temp++]=leftArray[indexLeft++];
            else
            {
                array[temp]=rightArray[indexRight];
                //在分而治之的思想中，将数组分割到最小时，再回退比较，
                //回退时的每个小数组都已经进行过排序，因此发生左边比
                //大的情况时，意味着自当前左数组的成员到左数组的末尾
                //成员都比当前右边的成员大，出现逆对数。
                count+=middle-indexLeft+1;
                temp++;
                indexRight++;
            }
        //将余下的数据放入数组中
        while(indexLeft<sizeOfLeft)
            array[temp++]=leftArray[indexLeft++];
        while(indexRight<sizeOfRight)
            array[temp++]=rightArray[indexRight++];

    }

    public static void mergeSort(int left, int right){
        if(left < right){
            int middle = (left+right)/2;
            //分为左右两组
            mergeSort(left, middle);
            mergeSort(middle+1, right);
            merge(left, middle, right);
        }

    }

    public static void main(String[] args){
        System.out.println("input the size of array:");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        array = new int[num];
        System.out.println("input the element of array");
        int total = 0;
        while(total < num){
            array[total] = input.nextInt();
            total++;
        }

        input.close();
        mergeSort(0,num-1);
        System.out.println("count: "+count);
        for(int elem:array){
            System.out.print(elem+" ");
        }
    }



}
