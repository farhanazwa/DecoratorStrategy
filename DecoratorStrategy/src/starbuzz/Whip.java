package starbuzz;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        if(beverage.getDescription().contains(" Whip")) {
            if (beverage.getDescription().contains(" Double Whip")) {
                return beverage.getDescription().replace(" Double Whip", " Triple Whip");
            }
            return beverage.getDescription().replace(" Whip", " Double Whip");
        } else {
            return beverage.getDescription() + ", Whip";
        }
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
