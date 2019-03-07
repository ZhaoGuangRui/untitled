//import java.util.Arrays;
//import java.util.concurrent.locks.Condition;
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
//public class Bank {
//    private final double[] accounts;
//    private Lock banklLock;
//    private Condition sufficientFunds;
//    private Object lock = new Object();
//    private boolean done;
//    public boolean isDone(){return done}
//    public void se
//
//    public Bank(double[] accounts) {
//        this.accounts = accounts;
//    }
//    public Bank(int n, double initialBalance){
//        accounts = new double[n];
//        Arrays.fill(accounts,initialBalance);
//        banklLock = new ReentrantLock();
//        sufficientFunds = banklLock.newCondition();
//    }
//    public void transfer(int from, int to, double amount) throws InterruptedException {
//        synchronized (lock) {
//            if (accounts[from]<amount){
//                try {
//                    wait();
//                }catch (InterruptedException e)
//            }
//
//        }
//    }
//   public double getTotalBalance(){
//
//        double sum = 0;
//        for (double a : accounts)
//            sum += a;
//        return sum;
//   }
//   public  int size(){
//        return accounts.length;
//
//   }
//
//}
