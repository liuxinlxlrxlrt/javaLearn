package class25_reflex.classknowledge.test;

import class25_reflex.classknowledge.popj.NewUser;
import class25_reflex.classknowledge.popj.User;

import java.lang.reflect.Constructor;

public class ConstructorTest {
    public static void main(String[] args) throws Exception{
        Class<NewUser> userClass = NewUser.class;
        //ͨ�����ÿղι���ɹ���������,���ǿղι��췽��Ϊ˽�У�����,��ν���أ�
        //Class�е�newInstance���ܼ򵥣������Խϴ�
        //ֻ��ͨ�������޲ι��촴������
        NewUser newUser = userClass.newInstance();
        System.out.println(newUser);

        Constructor<NewUser> declaredConstructor1 = userClass.getDeclaredConstructor(String.class,Integer.class,String.class);
        //Constructor����ͨ��newInstance�вι��촴������
        NewUser newUser1 = declaredConstructor1.newInstance("�ܻ���", 33, "166");
        System.out.println(newUser1);

        //Constructor����ͨ��newInstance������ͨ��˽�й��촴�����󣬵������������ȫ
        Constructor<NewUser> declaredConstructor2 = userClass.getDeclaredConstructor(String.class);
        declaredConstructor2.setAccessible(true);
        NewUser newUser02 = declaredConstructor2.newInstance("��֮��");
        System.out.println(newUser02);

    }
}
