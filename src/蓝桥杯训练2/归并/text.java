package 蓝桥杯训练2.归并;

public class text {
    static int count;

    public static int[] merge(int[] leftNums, int[] rightNums) {
        int[] result = new int[leftNums.length + rightNums.length];
        int i = 0, j = 0, p = 0;
        while (i < leftNums.length && j < rightNums.length) {
            if (leftNums[i] < rightNums[j]) {
                result[p] = leftNums[i];
                i++;
            } else {
                result[p] = rightNums[j];
                count += (leftNums.length - i);
                j++;
            }
            p++;
        }
        while (i < leftNums.length) {
            result[p++] = leftNums[i++];
        }
        while (j < rightNums.length) {
            result[p++] = rightNums[j++];
        }
        return result;
    }

    public static int[] sort(int[] a) {
        if (a.length <= 1) {
            return a;
        }
        int index = a.length / 2;
        int[] leftNums = new int[index];
        int[] rightNums = new int[a.length - index];
        int i = 0, j = 0;
        while (i < leftNums.length) {
            leftNums[i] = a[i];
            i++;
        }
        while (j + index + 1 <= a.length) {
            rightNums[j] = a[j + index];
            j++;
        }
        /*
        merge返回有序数组未接收,传入merge的左右数组仍然无序
        sort(leftNums);
        sort(rightNums);
        merge(leftNums,rightNums);
         */
        int[] left = sort(leftNums);
        int[] right = sort(rightNums);
        return merge(left, right);
    }

    public static void main(String[] args) {
        int[] a = {4, 3, 2, 1};
        sort(a);
        System.out.println(count);

    }
}
