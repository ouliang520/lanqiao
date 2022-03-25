package question.four;

public class text {
    public static void main(String[] args) {
        long num=0;
        //利用对10求余得到位数的值
        for (int i=1;i<2020;i++){
            if (check(i)){
                num+=i*i;
            }
        }
        System.out.println(num);//2658417853
    }
    //判断该数是否包含2\0\1\9,
    public static boolean check(int x){
        while (x>0) {
            if (x % 10 == 2 || x % 10 == 0 || x % 10 == 1 || x % 10 == 9) {
                return true;
            }
            //当x为个位数,除10后,int类型没有小数点,变为0,跳出循环
            x /= 10;
        }
        return false;
    }
}
