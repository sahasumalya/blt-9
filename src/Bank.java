public class Bank {
    public int balance;

     public synchronized void deposit(int amount) {
        this.balance += amount;
    }
    public synchronized void withdraw(int amount) {
         this.balance -= amount;
    }
}
