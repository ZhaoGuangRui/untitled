package 泛型;

import java.time.LocalDate;
import java.util.ArrayList;

public class PairTest1 {
    public static void main(String[] args) {
        class Employee{}

//        Pair<Number>num = new Pair<Integer>();
        //类型限定:自定义泛型类,自定义泛型方法
        class User<T extends Cloneable>{

        }
          //统配泛型:统配泛型一定带?(问号)
        //统配泛型 是一种种类,用在赋值运算符的左侧
        Pair<? extends Number>num1 = new Pair<Integer>();
        //<子类 extend 父类>

        Pair<? super Number> num3 = new Pair<Object>();
        //<父类 super 子类>

        Pair<?>num4 = new Pair<LocalDate>();
        //T和Object的区别?

        Number n = new Integer(1);

        ArrayList list1 = new ArrayList<Employee>();
        ArrayList list2 = new ArrayList<Number>();
    }
}
