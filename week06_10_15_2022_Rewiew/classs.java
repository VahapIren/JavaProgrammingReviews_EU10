package week06_10_15_2022_Rewiew;

public class classs
{
    public static void main(String[] args) {
int num=-5;
        System.out.println(num++ +",");
        System.out.println(num=0);
        System.out.println(","+ --num);
short s=13-9/3*10;
s+=-10;
        System.out.println(s);
        boolean one=('a'!='z')&&false;
        boolean two=one||0==(9-10+1);
        System.out.println(two);

        long l=100;
        short t=(short) l;
        System.out.println(t+10);

        int a=10;
        a=--a + a++ + a-- + a++;
        System.out.println(a);

        short v=13+3*(10-6)%2;
        boolean q=v!=25;
        System.out.println(q);

        byte bb=104;
        boolean check=bb<100;
        if (check){
            bb-=100;
        }else{
            bb=50;
        }
        System.out.println(bb);

        if(183==13+50*2+70){
            System.out.println("Java");
        }else{
            System.out.println("soft skills");
        }
        int cookies=10;
        String day="tuesday";
        switch (day){
            case "tuesday":
            case "wed":
                cookies+=10;
            case "thu":
                cookies+=5;
                break;
            case "fri":
                break;
        }
        System.out.println(cookies);

        double pi=3.14;
        boolean p=119%5==0;
        int numb=0;
        if (pi>3.14&&!p){
            numb+=50;
        }else{
            numb-=50;
        }
        if (p){
            numb+=50;
        }
        System.out.println(numb);

        double decimal=13.142;
        int whole=decimal<20?20:10;
        System.out.println(whole);

        String name="Jimmy";

       int checkk=132;
       String stre="";
       if (checkk%2==0){
           stre+=checkk;
           if (checkk%5==0){
               stre+="132";
           }else {
               stre="500";
           }
       }else {
           stre+="123";
       }
        System.out.println(stre);


    }
}
