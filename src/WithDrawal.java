public class WithDrawal extends Thread {
    public Bank bank;
    public int amount;
    WithDrawal(Bank bank, int amount) {
        this.bank = bank;
        this.amount = amount;
    }
    public void run() {
        synchronized (bank) {
            while(bank.balance < amount) {
                try {
                    System.out.println("money not sufficient, going to wait state");
                    bank.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("withdrwaing the amount");
            bank.withdraw(amount);
        }

    }
}
