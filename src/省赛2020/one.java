package 省赛2020;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
输入三行,第一二行依次为表格中的内容,第三行是待解密字符串
 */
public class one {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] key=new String[52];
        String[] value=new String[52];
        for (int i=0;i<3;i++){
            String a=sc.next();
            key[i]=a;
        }
        sc.nextLine();
        for (int i=0;i<52;i++){
            String a=sc.next();
            value[i]=a;
        }
        Map<String,String> map=new HashMap();
        for (int i=0;i<52;i++){
            map.put(value[i],key[i]);
        }
        StringBuffer stringBuffer=new StringBuffer();
        sc.nextLine();
        String a=sc.nextLine();
        for (int i=0;i<30;i++){
            String b= String.valueOf(a.charAt(i));
          stringBuffer.append(map.get(b));
        }
        System.out.println(stringBuffer);

    }
}
