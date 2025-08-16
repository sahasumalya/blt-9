import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class MyConsumer extends Thread {
    ArrayBlockingQueue<Integer> queue;
    public MyConsumer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            int temp = 0;
            try {
                temp = queue.poll(2, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("removed " + temp);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
