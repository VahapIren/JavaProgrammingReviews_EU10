package week21_01_28_2023;

import java.util.Scanner;

public class Maain {
    static TJMaxx store = new TJMaxx();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Number of regular items
        int regularItems = input.nextInt();
        // Number of on sale items
        int saleItems = input.nextInt();
        // add all regular items

        for(int i=0; i < regularItems; i++) {
                store.addRegularItem(new Item(input.next(), input.nextInt(), input.nextInt(), input.nextDouble()));
            System.out.println(store.getRegularItems());
        }



        // add all on sale items
        for(int i=0; i < saleItems; i++){
            OnSaleItem item1=new OnSaleItem(input.next(), input.nextInt(), input.nextInt(), input.nextDouble(), input.nextDouble());
            store.addOnSaleItem(item1);
        }


        //Test the different methods
        int test = input.nextInt();

        switch (test){
            case 1:
                System.out.println(store.getAllItemNames());
                break;
            case 2:
                System.out.println(store.getItemPrice(input.nextInt()));
                break;
            case 3:
                System.out.println(store.getOnSaleItem(input.next()));
                break;
            case 4:
                int before = store.regularItemsCount() + store.onSaleItemsCount();
                store.buyItem(input.nextInt());
                int after =  store.regularItemsCount() + store.onSaleItemsCount();
                System.out.print(before == after);
            case 5:
                int num = input.nextInt();
                store.buyItem(num);
                System.out.println(ExtraUtil.getItemFromCatNum(num).getQuantity());
                break;
            case 6:
                int num2 = input.nextInt();
                store.buyItem(num2);
                System.out.println(ExtraUtil.getSaleFromCatNum(num2).getQuantity());
                break;
        }

        input.close();

    }


}

class ExtraUtil {

    public static Item getItemFromCatNum(int num) {
        for (Item each : Maain.store.getRegularItems()) {
            if (each.getCatalogNumber() == num) {
                return each;
            }
        }
        return null;
    }

    public static OnSaleItem getSaleFromCatNum(int num) {
        for (OnSaleItem each : Maain.store.getOnSaleItems()) {
            if (each.getCatalogNumber() == num) {
                return each;
            }
        }
        return null;
    }

}
