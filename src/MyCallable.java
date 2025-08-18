import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    public String name;
    public MyCallable(String name) {
        this.name = name;
    }
    @Override
    public String call() throws Exception {
        for(int i=0;i<10;i++)
        {
            System.out.println(i+"-"+Thread.currentThread().getName()+"-"+name);
            Thread.sleep(500);
        }
       return "finished"+Thread.currentThread().getName();
    }
}
