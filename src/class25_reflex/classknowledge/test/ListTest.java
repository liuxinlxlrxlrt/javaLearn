package class25_reflex.classknowledge.test;

import class25_reflex.classknowledge.popj.User;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

//泛型只存在于编译中的，证明反射是怎么被擦除的
public class ListTest {
    public static void main(String[] args) throws Exception {
        List<User> userList = new ArrayList<>();
        userList.add(new User("梁小冰", 32, "111"));
        userList.add(new User("陈德容", 33, "112"));
//        userList.add(123);//报错
        System.out.println(userList);
        System.out.println("--------------------------------------");
        //可以通过反射来添加其他类型的数据
        Class<? extends List> listClass = userList.getClass();
        Method addMethod = listClass.getDeclaredMethod("add", Object.class);
        addMethod.invoke(userList, "123");
        addMethod.invoke(userList, "hahaha");
        System.out.println(userList);
        System.out.println("--------------------------------------");
        //证实：泛型会在运行阶段被擦除，这个时候像集合一类的对象就可以强制网里面放入非执行类型
        //java.lang.ClassCastException类型转换异常
//        for (User user : userList) {
//            System.out.println(user);
//        }
    }
}
