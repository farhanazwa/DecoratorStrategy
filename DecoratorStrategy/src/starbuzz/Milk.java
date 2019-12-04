package starbuzz;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        if(beverage.getDescription().contains(" Milk")) {
            if (beverage.getDescription().contains(" Double Milk")) {
                return beverage.getDescription().replace(" Double Milk", " Triple Milk");
            }
            return beverage.getDescription().replace(" Milk", " Double Milk");
        } else {
            return beverage.getDescription() + ", Milk";
        }
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
