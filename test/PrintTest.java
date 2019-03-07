import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.Assert.*;

public class PrintTest {
    public static void main(String[] args) {




       //new Thread(new PrintNum()).start();
        new Thread(new PrintA()).start();
//        new Thread(new PrintB()).start();
//        start方法自动调用run方法，而且start方法不是阻塞的
//        //b.setDaemon(true);将ｂ线程设置为守护线程
//        //守护线程是所有其他线程的保姆，只有其他所有线程都执行完毕后
//        //守护线程才会结束自身的执行

        ExecutorService executor =
                Executors.newFixedThreadPool(3);
        executor.execute(new PrintA());
        executor.execute(new PrintB());
        executor.execute(new PrintNum());
        executor.shutdown();
        //等待Ａ B 和ＮＵＭ都执行完毕后关闭线程池


    }
}