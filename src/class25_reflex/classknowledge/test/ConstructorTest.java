package class25_reflex.classknowledge.test;

import class25_reflex.classknowledge.popj.NewUser;
import class25_reflex.classknowledge.popj.User;

import java.lang.reflect.Constructor;

public class ConstructorTest {
    public static void main(String[] args) throws Exception{
        Class<NewUser> userClass = NewUser.class;
        //通过调用空参构造成功创建对象,但是空参构造方法为私有，报错,如何解决呢？
        //Class中的newInstance功能简单，局限性较大
        //只能通过公共无参构造创建对象
        NewUser newUser = userClass.newInstance();
        System.out.println(newUser);

        Constructor<NewUser> declaredConstructor1 = userClass.getDeclaredConstructor(String.class,Integer.class,String.class);
        //Constructor可以通过newInstance有参构造创建对象
        NewUser newUser1 = declaredConstructor1.newInstance("周慧敏", 33, "166");
        System.out.println(newUser1);

        //Constructor可以通过newInstance还可以通过私有构造创建对象，但是这个极不安全
        Constructor<NewUser> declaredConstructor2 = userClass.getDeclaredConstructor(String.class);
        declaredConstructor2.setAccessible(true);
        NewUser newUser02 = declaredConstructor2.newInstance("关之琳");
        System.out.println(newUser02);

    }
}
