package week02_09_17_2022_Rewiew;

import java.time.LocalDateTime;

public class BonusForWeek {
    public static void main(String[] args) {
        LocalDateTime today=LocalDateTime.now();
        System.out.println(today);
        System.out.println("");
        int hour=today.getHour();
        int minute=today.getMinute();
        int second=today.getSecond();
        System.out.println(hour+":"+minute+":"+second);




    }
}
