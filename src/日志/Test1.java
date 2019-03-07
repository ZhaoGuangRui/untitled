package 日志;

import java.util.ArrayList;


class Arrayalg {
    public static <T extends Comparable> T min(T[] a) {
        if (a == null || a.length == 0) return null;
        T smallest = a[0];
        for (int i = 1; i < a.length; i++)
            if (smallest.compareTo(a[i]) > 0) smallest = a[i];
        return smallest;
    }


    public  class Test1 {
        public void main(String[] args) {
            Arrayalg.<String>min(new String[]{"aa", "b"});
            class User implements Comparable<User> {

                @Override
                public int compareTo(User o) {
                    return 0;
                }
            }
            Arrayalg.<User>min(new User[]{});
        }

    }
}

