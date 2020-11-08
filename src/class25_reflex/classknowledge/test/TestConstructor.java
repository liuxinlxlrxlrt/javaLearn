package class25_reflex.classknowledge.test;

import class25_reflex.classknowledge.popj.User;

import java.lang.reflect.Constructor;


public class TestConstructor {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<User> userClass = User.class;

        //��ø�������й��й��췽��
        Constructor<?>[] constructors1 = userClass.getConstructors();
        for (Constructor<?> constructor1 : constructors1) {
            int parameterCount1 =constructor1.getParameterCount();
            System.out.println(parameterCount1+"�������Ĺ��췽��"+constructor1.getName());
        }
        //3�������Ĺ��췽��class25_reflex.classknowledge.popj.User
        //0�������Ĺ��췽��class25_reflex.classknowledge.popj.User

        System.out.println("-----------------------------------------------");
        //��ø������й��췽��
        Constructor<?>[] declaredConstructors = userClass.getDeclaredConstructors();
        for (Constructor<?> constructor2 : declaredConstructors) {
            int parameterCount2 =constructor2.getParameterCount();
            System.out.println(parameterCount2+"�������Ĺ��췽��"+constructor2.getName());
        }
        //3�������Ĺ��췽��class25_reflex.classknowledge.popj.User
        //2�������Ĺ��췽��class25_reflex.classknowledge.popj.User
        //1�������Ĺ��췽��class25_reflex.classknowledge.popj.User
        //0�������Ĺ��췽��class25_reflex.classknowledge.popj.User
        System.out.println("-----------------------------------------------");
        //��ȡĳ�����췽�����÷���ʹ���������������������
        //getDeclaredConstructor(Class...<?> parameterTypes)
        Constructor<User> declaredConstructor = userClass.getDeclaredConstructor(String.class,Integer.class,String.class);
        System.out.println(declaredConstructor.getName()+":"+declaredConstructor.getParameterCount());
        //class25_reflex.classknowledge.popj.User:3
    }
}
