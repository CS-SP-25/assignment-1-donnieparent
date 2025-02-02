public class FourPointFivePercent implements SalesTaxBehavior {
    private static final double TAXPERCENT = 0.045;
    @Override
    public Double compute(Double value) {
        // 4.5% sales tax
        return TAXPERCENT * value;
    }
}
