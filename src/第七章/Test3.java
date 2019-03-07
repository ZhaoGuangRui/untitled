package 第七章;

class Outer {
    public void f(){}
    private int i = 1;

    public static class Inner{
        public void g(){
            //静态内部类无法访问外部类的内容

        }
    }

    public static void main(String[]args){
       Outer.Inner inner = new Outer.Inner();
       //静态内部类对象的创建无需外部类的对象
        //创建内部类的对象
        //内部类生成CLASS文件后,文件名称是外部类$内部类
    }
}