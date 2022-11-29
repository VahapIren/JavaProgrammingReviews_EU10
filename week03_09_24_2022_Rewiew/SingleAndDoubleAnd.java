package week03_09_24_2022_Rewiew;

public class SingleAndDoubleAnd {
    public static void main(String[] args) {
        boolean result=true;
        int a=10;

        if(result&a++<12){// for result is false if single & compiler look next code and a come 11 in next line
                            //but double && compiler doesnt look next code and a stand at 10

        }
            System.out.println("a = "+a);
        int b=10;
        if (result&&b++<12){// for result is true if single & compiler look next code and a come 11 in next line
                            //also double && compiler  look next code and a come at 11 in next line

        }
        System.out.println("b = " + b);

    }
}
