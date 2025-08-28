package factory;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }

        // 생략

        return null;
    }
}
