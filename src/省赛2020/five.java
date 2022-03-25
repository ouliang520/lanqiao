package 省赛2020;
//数太大,用BigInteger
import java.math.BigInteger;

public class five {
    static BigInteger[] f=new BigInteger[2021];
    static BigInteger fb(int i){
        if (i==1||i==2){
            f[1]= BigInteger.valueOf(1);
            f[2]= BigInteger.valueOf(1);
            return BigInteger.valueOf(1);
        }

        f[i]=fb(i-1).add(f[i-2]);
        return f[i];

    }

    public static void main(String[] args) {
        System.out.println(GCD(fb(2020),fb(520)));
    }
    static BigInteger GCD(BigInteger a,BigInteger b){
        if (b.compareTo(new BigInteger("0"))==0){
            return a;
        }
        return GCD(b,a.mod(b));

    }
}
