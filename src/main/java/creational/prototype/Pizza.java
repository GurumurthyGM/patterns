package creational.prototype;

public class Pizza extends Meal {

    private PizzaFlavor pf;
    Pizza(int price, PizzaFlavor pf) {
        super(price);
        this.pf = pf;
    }

    public PizzaFlavor getPf() {
        return pf;
    }
    public void setPf(PizzaFlavor pf) {
        this.pf = pf;
    }

    @Override
    public String toString() {
        return "Pizza:{prince:"+getPrice() + ", flavor:"+ pf.getFlaver() + "}";
    }

    @Override
    protected Pizza clone() {
        return new Pizza(this.getPrice(), new PizzaFlavor(this.pf.getFlaver()));
    }

     public static void main(String[] args) {

        PizzaFlavor pf = new PizzaFlavor("Onion");
        Pizza p1 = new Pizza(5, pf);
        Pizza p2 = p1.clone();
        p1.setPf(new PizzaFlavor("capsicum"));

         System.out.println(p1);
         System.out.println(p2);
    }


}
