package 省赛2020;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class two {
    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start= dateFormat.parse("1921-7-23 12:00:00");
        Date end=dateFormat.parse("2020-7-1 12:00:00");
        System.out.println((end.getTime()-start.getTime())/1000/60);

    }
}
