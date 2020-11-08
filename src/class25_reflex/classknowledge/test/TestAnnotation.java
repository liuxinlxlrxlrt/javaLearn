package class25_reflex.classknowledge.test;

import class25_reflex.classknowledge.popj.User;
import jdk.nashorn.internal.runtime.logging.Logger;


public class TestAnnotation {
    public static void main(String[] args) {
        //获取指定的注解，可根据此来判断，根据注解是否存在，去执行对应的注解
        //如果指定注解为空，则返回null
        Class<User> userClass = User.class;
        Logger annotation = userClass.getAnnotation(Logger.class);
        System.out.println(annotation);
        //@jdk.nashorn.internal.runtime.logging.Logger(name=)

    }
}
