package DecoratorDesignPattern.WithoutDDP;

public class CheesePizza extends BasicPizza{

    @Override
    public String getDescription(){
        return super.getDescription() + " with cheese ";
    }
    @Override
    public double getCost() {
        return super.getCost() + 1.98;
    }
}
