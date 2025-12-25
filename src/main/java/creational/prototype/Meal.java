package creational.prototype;

public abstract class Meal {

    private int price;
    Meal(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {return price;}

    @Override
    protected abstract Meal clone();
}
