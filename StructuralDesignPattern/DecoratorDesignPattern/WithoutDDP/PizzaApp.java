package DecoratorDesignPattern.WithoutDDP;

public class PizzaApp {

    public static void main(String[] args) {
        Pizza pizza = new CheeseOlivePizza();
        System.out.println(pizza.getCost());
        System.out.println(pizza.getDescription());

    }
}
