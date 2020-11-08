package class25_reflex.classknowledge.test;

import class25_reflex.classknowledge.popj.User;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

//����ֻ�����ڱ����еģ�֤����������ô��������
public class ListTest {
    public static void main(String[] args) throws Exception {
        List<User> userList = new ArrayList<>();
        userList.add(new User("��С��", 32, "111"));
        userList.add(new User("�µ���", 33, "112"));
//        userList.add(123);//����
        System.out.println(userList);
        System.out.println("--------------------------------------");
        //����ͨ������������������͵�����
        Class<? extends List> listClass = userList.getClass();
        Method addMethod = listClass.getDeclaredMethod("add", Object.class);
        addMethod.invoke(userList, "123");
        addMethod.invoke(userList, "hahaha");
        System.out.println(userList);
        System.out.println("--------------------------------------");
        //֤ʵ�����ͻ������н׶α����������ʱ���񼯺�һ��Ķ���Ϳ���ǿ������������ִ������
        //java.lang.ClassCastException����ת���쳣
//        for (User user : userList) {
//            System.out.println(user);
//        }
    }
}
