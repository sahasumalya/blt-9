public class Deposit extends Thread {
    public final Bank bank;
    public int amount;
    public Deposit(Bank bank, int amount) {
        this.bank = bank;
        this.amount = amount;
    }
    public void run() {
        bank.deposit(amount);
        System.out.println("deposit done");
        synchronized (bank) {
            bank.notifyAll();
        }

    }
}
