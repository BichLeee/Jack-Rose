import java.util.ArrayList;

public class Table {
    int id;
    // int Type; //1,2,3: thường, cao cấp....
    // int price; //Quality
    // boolean isEmpty;
    ArrayList<Integer> _orderedFoods;
    ArrayList<Integer> _orderedDrinks;

    public int TotalPrice() {
        Menu instanceMenu = Menu.getInstance();
        int total = 0;

        for (Integer i : _orderedFoods) {
            total += instanceMenu._foods.get(i).getPrice();
        }

        for (Integer i : _orderedDrinks) {
            total += instanceMenu._drinks.get(i).getPrice();
        }

        return total;
    }

    public void clearTable() {
        _orderedFoods.clear();
        _orderedDrinks.clear();
    }
}
