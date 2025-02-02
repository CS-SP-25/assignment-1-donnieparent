public abstract class State {
    // need a SalesTaxBehavior attribute
    static SalesTaxBehavior salesTaxBehavior;
    // need a State method
    public State(){}
    // holds the name of the state
    private static String name;
    // getter for state name
    public static String getName() {
        return name;
    }
    // setter for state name
    public static void setName(String name) {
        State.name = name;
    }
    // calls the SalesTaxBehavior compute method
    public static void showTax(double value) {
        System.out.printf("The sales tax on $%.2f in %s is $%.2f%n", value, getName(), salesTaxBehavior.compute(value));
//        System.out.println("The sales tax on $" + value + " in " + getName() + " is $" + salesTaxBehavior.compute(value));
    }
}

