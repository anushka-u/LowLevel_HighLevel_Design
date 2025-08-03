package DecoratorDesignPattern.WithDDP;

abstract class PizzaDecorator implements Pizza{

    protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza pizza){
        this.decoratedPizza = pizza;
    }


    public String getDescription() {
        return decoratedPizza.getDescription();
    }

    public double getCost() {
        return decoratedPizza.getCost();
    }
}
