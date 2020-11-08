package class25_reflex.classknowledge.test;

import class25_reflex.classknowledge.popj.Animal;
import class25_reflex.classknowledge.popj.User;

public class TestMethodInClass {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //获取User类Class对象
        Class<User> userClass1 = User.class;
        System.out.println("User.class："+userClass1);
        //User.class：class class25_reflex.classknowledge.popj.User
        //获得类的完整路径名字
        System.out.println(userClass1.getName());
        //class25_reflex.classknowledge.popj.User
        System.out.println("---------------------------------------");
        Class<?> userClass2 = Class.forName("class25_reflex.classknowledge.popj.User");
        System.out.println("Class.forName："+userClass2);
        //Class.forName：class class25_reflex.classknowledge.popj.User
        //创建类的实例
        User user1 = (User)userClass2.newInstance();
        System.out.println(user1);
        //class25_reflex.classknowledge.popj.User@1b6d3586
        System.out.println("---------------------------------------");
        User user = new User();
        Class u = user.getClass();
        System.out.println("user.getClass()："+u);
        //user.getClass()：class class25_reflex.classknowledge.popj.User
        System.out.println("---------------------------------------------");
        //把传递的类的对象转换成代表其子类的对象
        Class<? extends Animal> aClass = userClass1.asSubclass(Animal.class);
        System.out.println(aClass);
        //class class25_reflex.classknowledge.popj.User
        System.out.println(aClass.getName());
        //class25_reflex.classknowledge.popj.User
        System.out.println("---------------------------------------------");
        //获得当前类继承的父类的名字
        Class<? super User> superclass=userClass1.getSuperclass();
        System.out.println(superclass.getName());
        //class25_reflex.classknowledge.popj.Animal
        System.out.println("---------------------------------------------");
        //获得当前类实现的类或是接口
        Class<?>[] interfaces=userClass1.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getName());
        }
        //class25_reflex.classknowledge.popj.MyInterface
    }
}
