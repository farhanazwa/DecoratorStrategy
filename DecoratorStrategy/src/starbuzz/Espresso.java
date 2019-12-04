package starbuzz;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public Espresso(Beverage beverage){
        if(beverage.getDescription().contains("Espresso")) {
            if (beverage.getDescription().contains("Double Espresso")) {
                description = "Triple Espresso";
            }
            description = "Double Espresso";
        }
    }

    public double cost() {
        if(description == "Double Espresso"){return 3.98;}
        else if(description == "Triple Espresso"){return 5.97;}
        else {return 1.99;}
    }
}
