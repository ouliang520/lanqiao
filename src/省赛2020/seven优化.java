package 省赛2020;
    import java.io.*;
    import java.util.Date;

public class seven优化 {

        static final int mod = 123456789;

        public static void main(String[] args) throws IOException {
            long n = nextInt(System.in), cnt = 0;
            Date c=new Date();
            for (long i = 1, k = 1; i <= n; k = ++i) {
                for (int j = 0; j < 3; j++)
                    k = (k * k) % mod;
                cnt = (cnt + k) % mod;
            }
            System.out.println(cnt);
            Date d=new Date();
            System.out.println(d.getTime()-c.getTime());
        }

        static int nextInt(InputStream in) throws IOException {
            int n = 0, c = in.read();
            while (c < '0' || c > '9') c = in.read();
            while (c >='0' && c <='9') {
                n = n * 10 + (c & 0xf);
                c = in.read();
            }
            return n;
        }
    }

