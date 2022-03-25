package question.six;


import java.util.HashSet;
import java.util.Set;

public class text {
    public static void main(String[] args) {
        Set<String> set=new HashSet();
        String text="0100110001010001";
        //从第几个数字开始
        for (int start=0;start<text.length();start++){
            //截取多少个字符,直到截取到最后一位
            for (int index=start+1;index<=text.length();index++){
                set.add(text.substring(start,index));
            }
        }
        System.out.println(set.size());
    }
}
