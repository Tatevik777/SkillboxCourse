package Client;

public class Main {
    public static void main(String[] args) {
        Individual i = new Individual(5000);
        i.replenish(1500);
        i.withdraw(700);
        LegalEntity le = new LegalEntity(10000);
        le.replenish(7500);
        le.withdraw(1000);
        IndividualEntrepreneur ie = new IndividualEntrepreneur(15000);
        ie.replenish(800);
        ie.replenish(17000);
    }

}
