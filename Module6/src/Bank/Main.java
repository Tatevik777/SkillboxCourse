package Bank;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount(160000);
        System.out.println(bankAccount);
        bankAccount.replenish(1534.54);
        bankAccount.withdraw(24000.45);
        DepositAccount dpa = new DepositAccount(150000.35);
        dpa.replenish(555.00);
        dpa.withdraw(14000);
        CardAccount gpa = new CardAccount(4100.00);
        gpa.replenish(800.12);
        gpa.withdraw(574.24);

    }


}
