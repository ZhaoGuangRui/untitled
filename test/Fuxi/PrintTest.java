package Fuxi;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrintTest {
    @Test
    public void print() {
        new Thread(() -> {
            for (int i = 0; i < 10; i++)
                System.out.printf("%-3d", 0);
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++)
                System.out.printf("%-3d", 1);
        }).start();

    }
}
/*为了实现多线程编程，需要写一个类实现Ｒｕｎｎａｂｌｅ接口
将这个线程要做的事情写在该接口的ruｎ方法中

我们将实现了Ｒｕｎｎａｂｌｅ接口的类称作一个任务（ｊｏｂ）

这个任务想要执行，必须要放在Ｔｈｒｅａｄ类的里面，在调用ｓｔａｒｔ方法
如
Thread t = new Thread(new 任务类)；
t.star();

大陆经常问的问题：实现多线程的两种方法：
实现Runnable和继承Ｔｈｒｅａｄ基类是错误的说法．*/