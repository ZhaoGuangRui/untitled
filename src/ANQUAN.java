import java.util.*;

public class ANQUAN {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        List<Integer>syncList
                = Collections.synchronizedList(list);//多线程安全的


        Map<String,Integer>map = new HashMap<>();
        Map<String,Integer>syncMap
                =Collections.synchronizedMap(map);//多线程安全的

    }
}
