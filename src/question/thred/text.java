package question.thred;

import java.math.BigDecimal;
import java.math.BigInteger;

import static java.math.BigDecimal.ROUND_HALF_UP;

public class text {
    public static void main(String[] args) {
        BigInteger a=new BigInteger("1");
        BigInteger b=new BigInteger("2");
        BigInteger c=new BigInteger("0");
        for (int i=1;i<200;i++){
            c=a.add(b);
            a=b;
            b=c;
        }
        BigDecimal val=new BigDecimal(a,110);
        BigDecimal valDecimal=new BigDecimal(b,110);

        System.out.println(val.divide(valDecimal,100,ROUND_HALF_UP));
    }
}
//0.6180339887498948482045868343656381177203091798057628621354486227052604628189024497072072041893911375