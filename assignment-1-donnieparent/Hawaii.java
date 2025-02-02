public class Hawaii extends State {
    public Hawaii() {
        // calls the 4.5% sales tax behavior
        salesTaxBehavior = new FourPointFivePercent();
    }
}
