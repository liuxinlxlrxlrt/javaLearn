package class25_reflex.classknowledge.test;

import class25_reflex.classknowledge.popj.User;
import class25_reflex.classknowledge.utils.MethodUtils;

import java.lang.reflect.Method;

public class MethodTest {
    public static void main(String[] args) throws Exception {
        getName();
        System.out.println("--------------");
        getIdNumber();
        System.out.println("--------------");
        //执行一个有参数的方法
        setIdNumberMethod();
        System.out.println("--------------");
        User user = new User("张三",23,"233");
        Object result1 =MethodUtils.invokeMethod(user,"getName");
        System.out.println(result1);
        System.out.println("--------------");
        Object result2 =MethodUtils.invokeMethod(user,"setName","王麻子");
        System.out.println(result2);
        Object result3 =MethodUtils.invokeMethod(user,"getName");
        System.out.println(result3);




    }

    private static void setIdNumberMethod()throws Exception {
        Class<User> userClass =User.class;
        User user = new User("张三",23,"233");
        Method setIdNumber = userClass.getDeclaredMethod("setIdNumber", String.class);
        setIdNumber.setAccessible(true);
       //invoke，执行指定对象的该方法，参数从第二个开始，就是该方法的参数值
        Object invoke = setIdNumber.invoke(user, "666");
        System.out.println(invoke);
        System.out.println(user);
        //User{name='张三', age=23, idNumber='666'}

    }

    private static void getIdNumber() throws Exception {
        Class<User> userClass =User.class;
        User user = new User("张三",23,"233");
        Method method = userClass.getDeclaredMethod("getIdNumber");
        method.setAccessible(true);
        Object obj = method.invoke(user);
        System.out.println(obj);
        //233
    }

    public static void getName() throws Exception{
        Class<User> userClass =User.class;
        User user = new User("张三",23,"233");
        Method method = userClass.getDeclaredMethod("getName");
        Object obj = method.invoke(user);
        System.out.println(obj);
        //张三
    }
}
