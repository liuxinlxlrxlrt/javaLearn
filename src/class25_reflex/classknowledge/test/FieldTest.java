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
        User user = new User("����",26,"123");
        System.out.println("����ǰ��"+user);
        Field field = userClass.getDeclaredField("name");
        field.setAccessible(true);
        field.set(user,"����");
        System.out.println("�����"+user);

    }

    public static void testFieldGet() throws Exception{
        Class<User> userClass = User.class;
        User user = new User("����",23,"233");
        System.out.println("����ǰ��"+user);
        System.out.println("-----------------------------");
        Field field = userClass.getDeclaredField("name");
        //�������䣬���Է���Ȩ�����η�
        field.setAccessible(true);
        //��ȡָ������ǰ�ֶε�ֵ��ָ������һ������
        System.out.println(field.get(user));
    }
}
