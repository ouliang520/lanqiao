package question.five;

import java.math.BigInteger;

public class text {
    public static void main(String[] args) {
        long a=1;
        long b=1;
        long c=1;
        long val;
        for (long i = 4; i < 20190325; i++) {
            //位数过大,无法储存,相加运算最终只和后四位有关
            val = (a+b+c)%10000;
            a = b;
            b = c;
            c = val;
        }
        System.out.println(c);//4659


    }
}
