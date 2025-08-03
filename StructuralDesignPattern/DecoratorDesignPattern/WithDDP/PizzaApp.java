package DecoratorDesignPattern.WithDDP;

public class PizzaApp {

    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        pizza = new CheeseDecorator(pizza);
        pizza = new OliveDecorator(pizza);

        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
