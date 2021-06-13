package Bank;

import java.util.Objects;

public class BankAccount {

    private String accountId;
    private double amount;
    public final String CURRENCY = "RUR";

    public BankAccount(double amount) {
        this.accountId = String.valueOf(System.nanoTime());
        this.amount = amount;
        startMessage();
    }

    void startMessage() {
        System.out.println("Открыт расчетный " + CURRENCY + " счет № " + accountId + ". Баланс: " + amount + CURRENCY);
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getAmount() {
        return amount;
    }

    /**
     * Метод void replenish(double sum).
     * Пополнение счета.
     * @param sum сумма для пополнения счета.
     */
    public void replenish(double sum) {
        if (sum > 0) {
            this.amount += sum;
            System.out.println("Счет № " + accountId + " пополнен на " + sum + CURRENCY +
                    ". Остаток средств после операции: " + amount + CURRENCY);
        } else {
            System.out.println("Неудалось пополнить счет № " + accountId + ". Недействительная сумма.");
        }
    }

    /**
     * Метод void withdraw(double sum).
     * Уменьшение баланса.
     * @param sum - сумма, которую переводим или снимаем.
     */
    public void withdraw(double sum) {
        if (sum > 0 && amount >= sum) {
            this.amount -= sum;
            System.out.println("Баланс счета № " + accountId + " уменьшен на " + sum + CURRENCY +
                    ". Остаток средств после операции: " + amount + CURRENCY);
        } else {
            System.out.println("Неудалось уменьшить баланс на счете № " +
                    accountId + ". Недействительная сумма.");
        }
    }



    @Override
    public String toString() {
        return "Остаток на счете " + accountId +
                " составляет " + amount + CURRENCY;
    }
}
