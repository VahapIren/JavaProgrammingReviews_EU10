package week12_11_16_2022.statics;

public class EatCake {
    public static int totalSlices=10;


    public static  void eatCake(int eatSlice){
        totalSlices-=eatSlice;

        System.out.println("Remaining slices: "+totalSlices);
    }


}
