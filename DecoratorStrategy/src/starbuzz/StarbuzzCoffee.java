package starbuzz;

public class StarbuzzCoffee {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        beverage = new Espresso(beverage);
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new Espresso();
        beverage2 = new Milk(beverage2);
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription() + " Seharga $" + beverage2.cost());

        Beverage beverage3 = new Espresso();
        beverage3 = new Espresso(beverage);
        beverage3 = new Soy(beverage3);
        beverage3 = new Soy(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());

        Beverage beverage4 = new Decaf();
        beverage4 = new Mocha(beverage4);
        beverage4 = new Mocha(beverage4);
        beverage4 = new Whip(beverage4);
        beverage4 = new Whip(beverage4);
        beverage4 = new Whip(beverage4);
        System.out.println(beverage4.getDescription()
                + " $" + beverage4.cost());

        Beverage beverage5 = new MilkShake();
        beverage5 = new Soy(beverage5);
        System.out.println(beverage5.getDescription()
                + " $" + beverage5.cost());
    }
}
