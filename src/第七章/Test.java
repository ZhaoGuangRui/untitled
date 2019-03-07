package 第七章;

import java.io.IOException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.TreeMap;

class MyException extends Throwable {
    public MyException(String xxxx) {
        super("余额不足");
    }


}

public class Test {

    void foo()
            throws IndexOutOfBoundsException, Error, Throwable {
        //RuntimeException及其子类没有必要被声明或捕获
    }

    public static void main(String[] args) {
       try {
           if (args.length>0)
               throw new MyException("xxxx");//抛出异常
           //try中一旦发生异常,就会立刻停止之后的语句,转而执行catch子句
           System.out.print("java");
           System.exit(1);

       }catch (Throwable e){
           //多个catch中只会有一个执行,(符合条件的第一个执行);你['
           //catch参数捕获的异常类型必须是抛出异常本身或其付类
           e.printStackTrace();
       } finally {
           System.out.print("123");
           //无论是否产生异类,finally里面的内容必须执行
       }

        //一旦程序发生异常就不再继续执行了

    }
}


