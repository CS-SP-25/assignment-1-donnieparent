public class SevenPercent implements SalesTaxBehavior {
    private static final double TAXPERCENT = 0.07;
    @Override
    public Double compute(Double value) {
        // 7% sales tax
        return TAXPERCENT * value;
    }
}
