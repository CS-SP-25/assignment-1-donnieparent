public class Indiana extends State {
    public Indiana() {
        // calls the 7% sales tax behavior
        salesTaxBehavior = new SevenPercent();
    }
}
