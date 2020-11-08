package class25_reflex.classknowledge.test;

import class25_reflex.classknowledge.popj.User;

import java.lang.reflect.Constructor;


public class TestConstructor {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<User> userClass = User.class;

        //获得该类的所有公有构造方法
        Constructor<?>[] constructors1 = userClass.getConstructors();
        for (Constructor<?> constructor1 : constructors1) {
            int parameterCount1 =constructor1.getParameterCount();
            System.out.println(parameterCount1+"个参数的构造方法"+constructor1.getName());
        }
        //3个参数的构造方法class25_reflex.classknowledge.popj.User
        //0个参数的构造方法class25_reflex.classknowledge.popj.User

        System.out.println("-----------------------------------------------");
        //获得该类所有构造方法
        Constructor<?>[] declaredConstructors = userClass.getDeclaredConstructors();
        for (Constructor<?> constructor2 : declaredConstructors) {
            int parameterCount2 =constructor2.getParameterCount();
            System.out.println(parameterCount2+"个参数的构造方法"+constructor2.getName());
        }
        //3个参数的构造方法class25_reflex.classknowledge.popj.User
        //2个参数的构造方法class25_reflex.classknowledge.popj.User
        //1个参数的构造方法class25_reflex.classknowledge.popj.User
        //0个参数的构造方法class25_reflex.classknowledge.popj.User
        System.out.println("-----------------------------------------------");
        //获取某个构造方法，该方法使用三点运算符，不定参数
        //getDeclaredConstructor(Class...<?> parameterTypes)
        Constructor<User> declaredConstructor = userClass.getDeclaredConstructor(String.class,Integer.class,String.class);
        System.out.println(declaredConstructor.getName()+":"+declaredConstructor.getParameterCount());
        //class25_reflex.classknowledge.popj.User:3
    }
}
