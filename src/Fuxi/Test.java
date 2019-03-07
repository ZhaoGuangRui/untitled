package Fuxi;



import javax.swing.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("abc");
        list.add("def");

      list.forEach(System.out::println);//lambda表达式遍历集合

//        LinkedList<String>linkedList = new LinkedList<>();
//        linkedList.add("abc");
//        linkedList.addFirst("aaa");
//        linkedList.addLast("zzz");
//        linkedList.forEach(System.out::println);
//        linkedList.removeFirst();
//        linkedList.removeLast();
//        linkedList.forEach(System.out::println);
//
//        Set<Integer> set = new LinkedHashSet<>();
//        set.add(1);set.add(5);set.add(9);set.add(3);
//        set.add(6);set.add(7);set.add(2);set.add(1);
//        set.forEach(System.out::println);

        Queue<Integer> queue = new PriorityQueue<>();//优先级队列 //ArrayDeque双端队列
        queue.offer(5);//元素放入队列(入队列)
        queue.offer(4);queue.offer(4);
        System.out.println(queue.peek());
        //查看队列的第一个元素(不取出)
        System.out.println(queue.poll());
        //查看队列的第一个元素(出队列)
        queue.forEach(System.out::println);
        //查看队列里所有的元素
        for(Integer q: queue)
            System.out.println(q);

        Stack<Integer>stack = new Stack<>();
        stack.push(9);//将元素压入堆栈(入栈)
        stack.push(6);
        System.out.println(stack.peek());
        System.out.println(stack.pop());//将栈顶元素弹出堆栈(弹栈,出栈)

//        for (String s : list)
//            System.out.println(s);//foreach循环遍历集合
//
//
//        Iterator<String> it = list.iterator();
//        //取到一个集合上的迭代器,迭代器用于遍历(循环)集合;
//
//        while (it.hasNext())//尝试跨越一个元素,能跨过去则返回true,否则返回false
//            System.out.println(it.next());//将刚刚被跨越的元素取出(返回)
//        //foreach循环在后台实际上就是用迭代器来完成的
    }
}
/*
* Array数组的反射类
* Arrays 是操纵数组的一些工具(方法)集合*/

/*
* Collection是所有集合的父接口
* Collections是操纵集合的一些工具(方法)集合*/