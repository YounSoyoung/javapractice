package api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex07 {
    public static void main(String[] args) {
        Date now = new Date();
        //현재 시스템의 시간으로 객체를 만든다.
        //그 외는 잘 사용하지 않는다.
        System.out.println(now);

        SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd");
        SimpleDateFormat time = new SimpleDateFormat("a hh:mm:ss");

        System.out.println("Date: " + date.format(now));
        System.out.println("Time: " + time.format(now));

        Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        //컴퓨터의 월은 0부터 시작한다.
        int day = cal.get(Calendar.DAY_OF_MONTH);

        System.out.printf("오늘의 날짜: %d년 %d월 %d일\n", year, month, day);

        cal.get(Calendar.HOUR); //12시간제
        int hour = cal.get(Calendar.HOUR_OF_DAY); //24시제
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        System.out.printf("현재시간: %d시 %d분 %d초\n", hour, minute, second);
    }
}
