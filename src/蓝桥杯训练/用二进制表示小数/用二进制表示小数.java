package 蓝桥杯训练.用二进制表示小数;

public class 用二进制表示小数 {
    public static void main(String[] args) {
        double num= 0.625;
        StringBuffer str=new StringBuffer();
        str.append("0.");
        while(num>0){
            double r= num*2;
            if (r>=1){
                str.append("1");
                num= r-1;
            }else {
                str.append("0");
                num=r;
            }

            if (str.length()>34) {
                System.out.println("ERROR");
                return;
            }
        }
        System.out.println(str);
    }
}
