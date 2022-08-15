import java.util.HashMap;

public class Menu {
    // <id,price>

    private static Menu _instance;

    HashMap<Integer, Dish> _foods = new HashMap<Integer, Dish>();
    HashMap<Integer, Dish> _drinks = new HashMap<Integer, Dish>();

    private Menu() {
        // khoi tao mon an
        _foods.put(1, new Dish("Bun dau mam tom", 100));
        _foods.put(2, new Dish("Banh canh ca loc", 70));

        // khoi tao do uong
        _drinks.put(1, new Dish("Sua tuoi tran chau duong den", 50));
        _drinks.put(2, new Dish("Hong tra milkfoam", 40));
    }

    public void printMenu() {
        Dish _dish = new Dish();
        System.out.println("---FOODS---\n");

        for (int i : _foods.keySet()) {
            _dish = _foods.get(i);
            System.out.println(i + " - " + _dish.getName() + " - " + _dish.getPrice() + ".000 vnd");
        }

        System.out.println("");
        System.out.println("---DRINKS---\n");

        for (int i : _drinks.keySet()) {
            _dish = _drinks.get(i);
            System.out.println(i + " - " + _dish.getName() + " - " + _dish.getPrice() + ".000 vnd");
        }

        System.out.println("");
    }

    public static Menu getInstance() {
        if (_instance == null) {
            _instance = new Menu();
        }
        return _instance;
    }
}