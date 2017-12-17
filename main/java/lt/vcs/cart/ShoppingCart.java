package lt.vcs.cart;


import java.util.ArrayList;
import java.util.List;

class ShoppingCart {

    List<String> items;

    ShoppingCart() {
        items = new ArrayList<>();
    }

    void add(String item) {
        items.add(item);
    }

    int getTotalItems() {
        return items.size();
    }

    Boolean doesContain(String itemName) {
        if (items.contains(itemName)) {
            return true;
        } else {
            throw new IllegalStateException("Item does not exists");
        }
    }

    Double checkout() {
        double total = 0;
        for (String item : items) {
            if (item.equals("Bread")) {
                total += 1;
            } else if (item.equals("Milk")) {
                total += 0.6;
            } else if (item.equals("Banana")) {
                total += 0.4;
            } else
                total += 0.1;
        }
        return total;
    }

}