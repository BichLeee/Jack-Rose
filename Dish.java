public class Dish {
    int _price;
    String _name;

    public Dish() {
    }

    public Dish(String name, int price) {
        _name = name;
        _price = price;
    }

    public int getPrice() {
        return _price;
    }

    public String getName() {
        return _name;
    }
}
