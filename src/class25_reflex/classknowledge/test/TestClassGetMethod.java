package class25_reflex.classknowledge.test;

import class25_reflex.classknowledge.popj.User;

import java.lang.reflect.Method;

public class TestClassGetMethod {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<User> userClass = User.class;

        //获得该类所有公有的方法
        Method[] methods1 = userClass.getMethods();
        for (Method method1 : methods1) {
            int parameterCount1=method1.getParameterCount();
            System.out.println(parameterCount1+"个方法："+method1.getName());
        }
        System.out.println("-----------------------------------------");
        //获得该类所有方法
        Method[] methods2 = userClass.getDeclaredMethods();
        for (Method method2 : methods2) {
            int parameterCount2=method2.getParameterCount();
            System.out.println(parameterCount2+"个方法："+method2.getName());
        }
        System.out.println("-----------------------------------------");
        //获得该类某个方法
        //获取无参数方法
        Method declaredMethod1 = userClass.getDeclaredMethod("work");
        System.out.println(declaredMethod1.getName());
        //work

        //获取有参数方法
        Method declaredMethod2 = userClass.getDeclaredMethod("setAge", Integer.class);
        System.out.println(declaredMethod2.getName());

        //setAge
    }
}
