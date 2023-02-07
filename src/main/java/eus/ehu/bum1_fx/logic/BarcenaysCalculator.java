package eus.ehu.bum1_fx.logic;

public class BarcenaysCalculator implements ExchangeCalculator {
    private CommissionCalculator calculator;
    private ForexOperator operator;


    @Override
    public String[] getCurrencyLongNames() {
        return Currency.longNames();
    }

    @Override
    public double getChangeValue(String origCurrency, double amount, String endCurrency) throws Exception {
        this.operator = new ForexOperator(origCurrency, amount, endCurrency);
        return operator.getChangeValue();
    }

    @Override
    public double calculateCommission(double amount, String origCurrency) throws Exception {
        this.calculator = new CommissionCalculator(amount, origCurrency);
        return calculator.calculateCommission();
    }
}
