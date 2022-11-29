package week03_09_24_2022_Rewiew;

public class CalculateCarTax {
    public static void main(String[] args) {
        int price=45000;
        double taxRate;
        if(price>=20000&&price<=39999){
            taxRate=0.2;
            System.out.println("Tax Rate : "+taxRate);
        } else if (price<=59999) {
            taxRate=0.3;
            System.out.println("Tax Rate : "+taxRate);
        } else if (price<=80000) {
            taxRate=0.4;
            System.out.println("Tax Rate : "+taxRate);
        }
    }
}
