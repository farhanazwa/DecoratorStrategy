package starbuzz;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public DarkRoast(Beverage beverage){
        if(beverage.getDescription().contains("Dark Roast Coffee")) {
            if (beverage.getDescription().contains("Double Dark Roast Coffee")) {
                description = "Triple Dark Roast Coffee";
            }
            description = "Double Dark Roast Coffee";
        }
    }

    public double cost() {
        if(description == "Double Dark Roast Coffee"){return 1.98;}
        else if(description == "Triple Dark Roast Coffee"){return 2.97;}
        else {return .99;}
    }
}
