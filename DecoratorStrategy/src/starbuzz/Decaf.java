package starbuzz;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    public Decaf(Beverage beverage){
        if(beverage.getDescription().contains("Decaf Coffee")) {
            if (beverage.getDescription().contains("Double Decaf Coffee")) {
                description = "Triple Decaf Coffee";
            }
            description = "Double Decaf Coffee";
        }
    }

    public double cost() {
        if(description == "Double Decaf Coffee"){return 2.01;}
        else if(description == "Triple Decaf Coffee"){return 3.15;}
        else {return 1.05;}
    }
}
