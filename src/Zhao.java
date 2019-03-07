import java.util.ConcurrentModificationException;
import java.util.concurrent.*;
import java.util.concurrent.atomic.LongAdder;

public class Zhao {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer>concurrentHashMap = new ConcurrentHashMap<>();
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);
//        concurrentHashMap.put("Tom",0);


        Runnable r = ()-> concurrentHashMap.merge("Tom",1,Integer::sum);
//            concurrentHashMap.put("Tom",concurrentHashMap.get("Tom")+1);
        ((ScheduledExecutorService) executorService).schedule(r,3,TimeUnit.SECONDS);
      executorService.shutdown();


try {
    Thread.sleep(4000);
}catch (InterruptedException e){
    e.printStackTrace();
}

        System.out.println(concurrentHashMap.get("Tom"));

    }
}
