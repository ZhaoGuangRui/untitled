import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class Sum1 implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        return 0;
    }
}
public class Test2{
    public static void main(String[] args)throws InterruptedException {
        FutureTask<Integer>task = new FutureTask<>(new Sum1());
        new Thread(task).start();
        try {
            System.out.println(task.isDone());
            System.out.println(task.get());
        }catch (ExecutionException e){
            e.printStackTrace();
        }

    }
}