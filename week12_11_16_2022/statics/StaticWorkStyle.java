package week12_11_16_2022.statics;

public class StaticWorkStyle {

    static {
        System.out.println("first static");
    }
    static {
        System.out.println("Second static");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
methodStatic();


    }

    public static void methodStatic(){
        System.out.println("Method static");
    }

    static {
        System.out.println("third static");
    }

}
