package Company;

public class TopManager implements Employee{
    private static final double INCOME_PART = 0.05;
    private Company company;
    private Double salary;

    public TopManager(Company company) {
        this.company = company;
        this.salary = getMonthSalary();
    }

    @Override
    public Double getSalary() {
        return this.salary;
    }

    /**
     * Метод double getMonthSalary().
     * Метод для расчета зарплаты топ-менеджера.
     *
     * @return зарплата топ-менеджера.
     */
    @Override
    public Double getMonthSalary() {
        if (company.getIncome() > 10000000.00)
            return PaymentRates.TOP_MANAGER.getRate() * getRealWorkTime() +
                    company.getIncome() * Bonus.TOP_MANAGER.getBonusSize();
        return PaymentRates.TOP_MANAGER.getRate() * getRealWorkTime();
    }
}
