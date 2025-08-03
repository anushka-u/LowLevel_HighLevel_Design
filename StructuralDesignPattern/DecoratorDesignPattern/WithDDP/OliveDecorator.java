package DecoratorDesignPattern.WithDDP;

public class OliveDecorator extends PizzaDecorator{
    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return decoratedPizza.getDescription() + " Olive";
    }

    public double getCost() {
        return decoratedPizza.getCost() + 7.98;
    }
}
