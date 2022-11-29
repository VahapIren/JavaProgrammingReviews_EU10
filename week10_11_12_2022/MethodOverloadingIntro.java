package week10_11_12_2022;

public class MethodOverloadingIntro {
    public static void main(String[] args) {


        int i=23;
        double d=24.5;
        float f=12.5f;
        sum(i,d);
        sum(d,f);
        sum(i,i,i);

        //same name different parameters
    }

    public static void sum(int i,int i2){

    }
    public static void sum(int i,int i2,int i3){

    }
    public static void sum(double d,float f){

    }
    public static void sum(int i,double d){

    }
    public static double sum(double d,int i){
        return 0;
    }
}
