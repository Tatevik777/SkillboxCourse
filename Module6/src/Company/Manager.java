package Company;

public class Manager implements Employee{
    private Company company;
    private Double salary;

    public Manager(Company company) {
        this.company = company;
        this.salary = getMonthSalary();
    }

    @Override
    public Double getSalary() {
        return salary;
    }

    /**
     * Метод double getMonthSalary().
     * Метод для расчета зарплаты менеджера.
     *
     * @return зарплата менеджера.
     */
    @Override
    public Double getMonthSalary() {
        return PaymentRates.MANAGER.getRate() * getRealWorkTime() +
                company.getIncome() * Bonus.MANAGER.getBonusSize();
    }
}
