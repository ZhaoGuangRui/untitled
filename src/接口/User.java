package 接口;

import java.net.UnknownServiceException;
import java.time.LocalDate;

public class User implements Cloneable{
    private int id;
    private String name;
    private LocalDate birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = (User)super.clone();

        LocalDate localDate = LocalDate.of(
                birthday.getYear(),
                birthday.getMonthValue(),
                birthday.getDayOfMonth()
        );
        user.birthday = localDate;
        return  user;
    }
    public User(int id, String name, LocalDate birthday){
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }
  public int getId(){return id;}
  public LocalDate getBirthday(){return birthday;}


    public static void main(String[] args)throws CloneNotSupportedException {
        User tom = new User(1,"tom",LocalDate.now());

        User tomClone = (User) tom.clone();

        System.out.println("tom:"+tom);
        System.out.println("tom Clone:"+tom);
        System.out.println(tom == tomClone);
        System.out.println(
                tom.getBirthday()== tomClone.getBirthday());
//        连续拷贝/克隆只考备了基本类型,对于引用类型依然是共用的
//         深拷贝/克隆要对每一个类型都进行拷贝达到两个对象的每个部分都完全被克隆
//         如何进行深拷贝/克隆 ?先进行浅拷贝,即super.clone(),在对每一个引用类型单独拷贝
//

    }


}
