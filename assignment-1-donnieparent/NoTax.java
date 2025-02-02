public class NoTax implements SalesTaxBehavior{
    @Override
    public Double compute(Double value) {
        // no sales tax, will always return 0.00
        return 0.0;
    }
}
