package __13代理模式.动态代理;/*
    @author wxg
    @date 2021/12/26-11:08
    */

public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println(" 老师授课中  。。。。。");
    }

    @Override
    public void sayHello(String s) {
        System.out.println("hello " + s);
    }

}