package class25_reflex.classknowledge.test;

import class25_reflex.classknowledge.popj.User;

import java.lang.reflect.Field;

public class TestClassField {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<User> userClass = User.class;

        //获得所有公有的字段对象
        Field[] fields = userClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
            //ct.Field;@677327b6
        }
        System.out.println("------------------");
//        Field field = userClass.getField("name");
//        System.out.println(field.getName());
        //Exception in thread "main" java.lang.NoSuchFieldException: name

        //getDeclaredFields()	获得所有字段对象
        Field[] declaredFields = userClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }

        //获得某个字段对象
        Field field = userClass.getDeclaredField("name");
        System.out.println(field.getName());
    }
}
