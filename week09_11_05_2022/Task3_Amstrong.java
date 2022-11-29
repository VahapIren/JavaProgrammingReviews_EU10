package week09_11_05_2022;

public class Task3_Amstrong {
    public static void main(String[] args) {

        System.out.println(isAmstrong(371));
    }

    public static boolean isAmstrong(int num) {
        boolean isAmstrong=false;
        int numdummy=num,result=0;
        while(true){
            int reminder=numdummy%10;
            result+=(reminder*reminder*reminder);
            numdummy/=10;
            if (numdummy==0) break;
        }
        System.out.println(result);
        if (result==num)
          isAmstrong=true;
        return isAmstrong;
    }

}
/*Task 3 :   Write a method that can check if a number is Armstrong number

        Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.

        Armstrong numbers are     === 153 370 371 407 === for 3 digits*/