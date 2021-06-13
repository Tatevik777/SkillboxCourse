package Company;

public enum Bonus {
    OPERATOR(0),
    MANAGER(0.5),
    TOP_MANAGER(1.5);

    private double bonusSize;

    Bonus(double bonusSize) {
        this.bonusSize = bonusSize;
    }

    public double getBonusSize() {
        return bonusSize;
    }
}
