package Company;

public enum PaymentRates {
    OPERATOR(800.00),
    MANAGER(1000.00),
    TOP_MANAGER(2000.00);

    private double rate;

    PaymentRates(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}
