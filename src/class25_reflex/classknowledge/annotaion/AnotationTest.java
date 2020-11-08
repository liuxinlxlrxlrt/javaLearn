package class25_reflex.classknowledge.annotaion;

import class25_reflex.classknowledge.popj.NewUser;

import java.lang.reflect.Field;

public class AnotationTest {
    public static void main(String[] args) throws Exception{

//        Class<NewUser> newUserClass = NewUser.class;
//
//        MyAnnotation myAnnotation = newUserClass.getAnnotation(MyAnnotation.class);
//        if(myAnnotation!=null){
//            System.out.println(myAnnotation.content()+"::"+myAnnotation.num());
//        }

        System.out.println("--------------------------");
        //根据字段上的注解去改变字段的值
        NewUser newUser2 = new NewUser("你好",22,"122");
        Class<NewUser> newUserClass2 = NewUser.class;
        Field[] declaredFields = newUserClass2.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            MyAnnotation myAnnotation2 = declaredField.getAnnotation(MyAnnotation.class);
            if(myAnnotation2 != null){
                String value = myAnnotation2.content();
                declaredField.setAccessible(true);
                declaredField.set(newUser2,value);
            }
        }
        System.out.println(newUser2);
    }
}
