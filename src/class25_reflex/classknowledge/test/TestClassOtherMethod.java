package class25_reflex.classknowledge.test;

import class25_reflex.classknowledge.popj.MyInterface;
import class25_reflex.classknowledge.popj.User;
import jdk.nashorn.internal.runtime.logging.Logger;

public class TestClassOtherMethod {
    public static void main(String[] args) {
        Class<User> userClass = User.class;
        System.out.println(Logger.class.isAnnotation());
        System.out.println(userClass.isAnnotation());
        System.out.println(userClass.isInterface());
        System.out.println(MyInterface.class.isInterface());

        //�ж�user�ǲ���User.class�Ķ���(ʵ��)
        User user = new User();
        System.out.println(userClass.isInstance(user));

        //�ж����Class�Ƿ�ӵ��ָ����ע��
        System.out.println(userClass.isAnnotationPresent(Logger.class));
    }
}
