package starbuzz;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public HouseBlend(Beverage beverage){
        if(beverage.getDescription().contains("House Blend Coffee")) {
            if (beverage.getDescription().contains("Double House Blend Coffee")) {
                description = "Triple House Blend Coffee";
            }
            description = "Double House Blend Coffee";
        }
    }

    public double cost() {
        if(description == "Double House Blend Coffee"){return 1.78;}
        else if(description == "Triple House Blend Coffee"){return 2.67;}
        else {return .89;}
    }
}
