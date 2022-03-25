package question.second;

public class text {
    public static int program(int a,int b){
        int number = 0;
        if (a==5||b==4){
           return 1;
        }

        return program(a+1,b)+program(a,b+1);
    }

    public static void main(String[] args) {
        System.out.println(program(1,1));
    }
}
