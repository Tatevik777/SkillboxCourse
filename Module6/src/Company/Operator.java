package Company;

public class Operator implements Employee{
    private Company company;
    private Double salary;

    public Operator(Company company) {
        this.company = company;
        this.salary = getMonthSalary();
    }

    @Override
    public Double getSalary() {
        return this.salary;
    }

    /**
     * Метод double getMonthSalary().
     * Метод для расчета зарплаты оператора.
     *
     * @return зарплата оператора.
     */
    @Override
    public Double getMonthSalary() {
        return PaymentRates.OPERATOR.getRate() * getRealWorkTime() +
                company.getIncome() * Bonus.OPERATOR.getBonusSize();
    }
}
