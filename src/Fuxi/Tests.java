package Fuxi;

import java.util.concurrent.atomic.AtomicInteger;

public class Tests {
    private AtomicInteger i = new AtomicInteger(0);

    public  void inc() {i.getAndIncrement();}
    public int get(){
        return i.get();
    }
}