package week21_01_28_2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TJMaxx {

    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx() {
        regularItems=new ArrayList<>();
        onSaleItems=new ArrayList<>();

    }

    /**
     * adds an item object to regularItems list
     * @param item
     */
    public void addRegularItem(Item item) {
        regularItems.add(item);

    }

    /**
     * adds OnSaleItem object to onSaleItems list
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item) {
        onSaleItems.add(item);

    }

    /**
     * getter for regularItems
     * @return
     */
    public List<Item> getRegularItems() {

        return regularItems;
    }

    /**
     * getter for onSaleItems
     * @return
     */
    public List<OnSaleItem> getOnSaleItems() {

        return onSaleItems;
    }

    /**
     * return count of regularItem object
     * @return
     */
    public int regularItemsCount() {

        return regularItems.size();
    }

    /**
     * returns count of onSaleItems in TJ Maxx
     * @return
     */
    public int onSaleItemsCount() {

        return onSaleItems.size();
    }

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     */
    public List<String> getAllItemNames() {
        ArrayList<String> list=new ArrayList<>();
        for (Item item : regularItems) {
            list.add(item.getName());
        }
        for (OnSaleItem item : onSaleItems) {
            list.add(item.getName());
        }

        return list;
    }

    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber) {
        for (Item item : regularItems) {
            if (catalogNumber==item.getCatalogNumber())
                return item.getPrice();
        }
        for (OnSaleItem item : onSaleItems) {
            if (catalogNumber==item.getCatalogNumber())
                return item.getPrice();
        }

        return 0.0;
    }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */
    public OnSaleItem getOnSaleItem(String name) {
        for (OnSaleItem item : onSaleItems) {
            if (name.equals(item.getName()))
                return item;
        }

        return null;
    }

    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {

        regularItems.removeIf(p->p.getCatalogNumber()==catalogNumber);
        onSaleItems.removeIf(p->p.getCatalogNumber()==catalogNumber);
        /*
        for (Item item : regularItems) {
                if (catalogNumber==item.getCatalogNumber()){
                        regularItems.remove(item);
                    }
                }


        for (OnSaleItem onSaleItem : onSaleItems) {
            if (catalogNumber==onSaleItem.getCatalogNumber()){
                onSaleItems.remove(onSaleItem);
        }
            }

         */

        }

    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {

        for (Item item : regularItems) {
            if (catalogNumber == item.getCatalogNumber()) {
                item.setQuantity(item.getQuantity() - 1);
            }
        }
        regularItems.removeIf(p->p.getQuantity()==0);

        for (OnSaleItem item : onSaleItems) {
            if (catalogNumber == item.getCatalogNumber()) {
                item.setQuantity(item.getQuantity() - 1);

            }
        }
        onSaleItems.removeIf(p->p.getQuantity()==0);

    }

}
