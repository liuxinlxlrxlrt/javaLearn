package class25_reflex.classknowledge.test;

import class25_reflex.classknowledge.popj.User;
import jdk.nashorn.internal.runtime.logging.Logger;


public class TestAnnotation {
    public static void main(String[] args) {
        //��ȡָ����ע�⣬�ɸ��ݴ����жϣ�����ע���Ƿ���ڣ�ȥִ�ж�Ӧ��ע��
        //���ָ��ע��Ϊ�գ��򷵻�null
        Class<User> userClass = User.class;
        Logger annotation = userClass.getAnnotation(Logger.class);
        System.out.println(annotation);
        //@jdk.nashorn.internal.runtime.logging.Logger(name=)

    }
}
