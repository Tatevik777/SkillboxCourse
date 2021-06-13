package Company;

public interface Employee {
    /**
     * Метод double getRealWorkTime().
     * Возвращает реальное количество часов, которое отработал сотрудник
     *
     * @return реальное количество часов.
     */
    default double getRealWorkTime() {
        return 160 * Math.random();
    }

    /**
     * Метод getMonthSalary().
     * Расчитывает зарплату сотрудников.
     *
     * @return зарплата сотрудника.
     */
    Double getMonthSalary();

    /**
     * Метод getSalary().
     * Возвращает значение поля.
     *
     * @return зарплата сотрудника.
     */
    Double getSalary();
}
