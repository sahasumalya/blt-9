import java.util.concurrent.ArrayBlockingQueue;

public class MyProducer extends Thread {
    ArrayBlockingQueue<Integer> queue;
    public MyProducer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }
    public void run() {
        for (int i = 0; i < 15; i++) {
            queue.offer( i);
            System.out.println("added " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
