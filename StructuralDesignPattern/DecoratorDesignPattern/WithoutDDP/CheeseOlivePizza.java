package DecoratorDesignPattern.WithoutDDP;

public class CheeseOlivePizza extends CheesePizza{

    @Override
    public String getDescription(){
        return super.getDescription() + "with OLIVE";
    }
    @Override
    public double getCost() {
        return super.getCost() + 8.98;
    }
}
