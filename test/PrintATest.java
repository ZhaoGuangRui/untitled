import org.junit.Test;

import static org.junit.Assert.*;

public class PrintATest{
    @Test
    public void print() {
        new Thread(new PrintA()).start();
        new Thread(new PrintB()).start();

    }


}