package starbuzz;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        if(beverage.getDescription().contains(" Mocha")) {
            if (beverage.getDescription().contains(" Double Mocha")) {
                return beverage.getDescription().replace(" Double Mocha", " Triple Mocha");
            }
            return beverage.getDescription().replace(" Mocha", " Double Mocha");
        } else {
            return beverage.getDescription() + ", Mocha";
        }
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
