package question.seven;

public class text {
    public static void main(String[] args) {
        int num=0;
        for (int i=1;i<2019;i++){
            if (choose(i)){
                for (int j=i+1;j<2019;j++){
                    if (choose(j)){
                        int k=2019-i-j;
                        //注意这是并的关系
                        if (k>j&&choose(k)){
                            num++;
                        }
                    }
                }
            }
        }

        System.out.println(num);//40785
    }
    //判断是否包含2和4
    public static boolean choose(int i){
        while (i>0){
            if(i%10==2||i%10==4){
                return false;
            }
            i/=10;
        }
        return true;
    }
}
