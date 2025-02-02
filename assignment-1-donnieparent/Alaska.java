public class Alaska extends State {
    public Alaska() {
        // calls the no sales tax behavior
        salesTaxBehavior = new NoTax();
    }
}
