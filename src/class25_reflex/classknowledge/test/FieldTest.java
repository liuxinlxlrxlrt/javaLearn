package class25_reflex.classknowledge.test;

import class25_reflex.classknowledge.popj.User;

import java.lang.reflect.Field;

public class FieldTest {
    public static void main(String[] args) throws Exception {
        //testFieldGet
        testFieldGet();
        System.out.println("-----------------------------");
        //testFieldSet
        testFieldSet();

    }

    private static void testFieldSet() throws Exception{
        Class<User> userClass = User.class;
        User user = new User("李四",26,"123");
        System.out.println("反射前："+user);
        Field field = userClass.getDeclaredField("name");
        field.setAccessible(true);
        field.set(user,"王五");
        System.out.println("反射后："+user);

    }

    public static void testFieldGet() throws Exception{
        Class<User> userClass = User.class;
        User user = new User("张三",23,"233");
        System.out.println("反射前："+user);
        System.out.println("-----------------------------");
        Field field = userClass.getDeclaredField("name");
        //暴力反射，忽略访问权限修饰符
        field.setAccessible(true);
        //获取指定对向当前字段的值，指定是哪一个对象
        System.out.println(field.get(user));
    }
}
