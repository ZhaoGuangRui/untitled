package 第七章;

public class Test1 {
    static void f(){
        try {
            g();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void g()throws Exception {
        Exception e = new Exception("g里面的异常");
        throw e;
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
