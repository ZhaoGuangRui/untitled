package 方法的参数;

public class Test {
    public static void main(String[]args) {
        Count myCount = new Count();
        int times = 0;

        for(int i = 0; i < 100; i++){
            incremment(myCount,times);
        }
        System.out.println("count is" + myCount.count);
                System.out.println("time is + times");
    }
    public static void incremment(Count c, int times){
        c.count++;
        times++;
    }
}
