package starbuzz;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        if(beverage.getDescription().contains(" Soy")) {
            if (beverage.getDescription().contains(" Double Soy")) {
                return beverage.getDescription().replace(" Double Soy", " Triple Soy");
            }
            return beverage.getDescription().replace(" Soy", " Double Soy");
        } else {
            return beverage.getDescription() + ", Soy";
        }
    }

    public double cost() {
        return .15 + beverage.cost();
    }
}
