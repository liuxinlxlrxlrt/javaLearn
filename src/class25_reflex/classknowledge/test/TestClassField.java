package class25_reflex.classknowledge.test;

import class25_reflex.classknowledge.popj.User;

import java.lang.reflect.Field;

public class TestClassField {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<User> userClass = User.class;

        //������й��е��ֶζ���
        Field[] fields = userClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
            //ct.Field;@677327b6
        }
        System.out.println("------------------");
//        Field field = userClass.getField("name");
//        System.out.println(field.getName());
        //Exception in thread "main" java.lang.NoSuchFieldException: name

        //getDeclaredFields()	��������ֶζ���
        Field[] declaredFields = userClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }

        //���ĳ���ֶζ���
        Field field = userClass.getDeclaredField("name");
        System.out.println(field.getName());
    }
}
