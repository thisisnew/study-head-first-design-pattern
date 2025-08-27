package decorator;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage houseBlend = new HouseBlend();
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}
