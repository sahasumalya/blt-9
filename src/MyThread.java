import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    PrintingNumbers p;
    ReentrantLock lock;
    MyThread(PrintingNumbers p, ReentrantLock lock) {
        this.p = p;
        this.lock = lock;
    }
    public void run() {
        while(!lock.tryLock()){
            System.out.println("Waiting for Lock acquiring"+currentThread().getName());
        }
        System.out.println("Lock acquired"+currentThread().getName());
        p.printOddNumbers();
        lock.unlock();

    }

}
