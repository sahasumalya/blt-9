public class PrintingNumbers {
    public int number;
    PrintingNumbers(int n) {
        this.number = n;
    }
    public void print() {
        System.out.println("Starting printing number " + Thread.currentThread().getName());
        synchronized (this) {
            for(int i=0;i<10;i++)
            {
                System.out.println(i+"-"+Thread.currentThread().getName());
            }
        }

        System.out.println("Finishing printing number " + Thread.currentThread().getName());
    }

    public void printOddNumbers() {
        System.out.println("Starting printing number odd " + Thread.currentThread().getName());
        for(int i=1;i<20;i=i+2){
            System.out.println(i+"-"+Thread.currentThread().getName());
        }
    }

}
