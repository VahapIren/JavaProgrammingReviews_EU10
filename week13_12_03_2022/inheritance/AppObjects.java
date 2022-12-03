package week13_12_03_2022.inheritance;

public class AppObjects {
    public static void main(String[] args) {

        Instagram instagram=new Instagram(5.6);
        System.out.println(instagram);
        instagram.postPhoto();
        instagram.download();
        instagram.useTheApp(45);
        System.out.println(instagram.getClass());

        System.out.println("-----------------------------");
Discord discord=new Discord(4.5);
        System.out.println(discord);
        discord.chat("Adam");
    }
}
