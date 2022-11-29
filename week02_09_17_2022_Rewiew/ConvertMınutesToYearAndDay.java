package week02_09_17_2022_Rewiew;

public class ConvertMınutesToYearAndDay {
    public static void main(String[] args) {
        /*
        8. Create class named ConvertMiutesToYearAndDay, write a Java program to convert minutes into a number of years and days.

     Input the number of minutes: 3456789
     Expected Output :
     3456789 minutes is approximately 6 years and 210 days
         */
        int minutes=3456789;
        int gun=minutes/60/24;
        System.out.println(minutes+" minutes is approximately "+gun/365+" years and "+gun%365+" days");

        int givenMinutes=3456789;
        int year=givenMinutes/(60*24*365);
        System.out.println("year = " + year);
        int day=(givenMinutes%(60*24*365))/(24*60);
        System.out.println("day = " + day);

    }
}
