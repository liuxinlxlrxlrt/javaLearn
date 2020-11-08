package class25_reflex.classknowledge.singletonmode;


import java.lang.reflect.Constructor;

public class ObjectTest {
    public static void main(String[] args) throws Exception {
        Session session1 = Session.get();
        Session session2=Session.get();
        System.out.println(session1==session2);//true

        Class<Session> sessionClass = Session.class;
        Constructor<Session> declaredConstructor = sessionClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Session session3 = Session.get();
        Session session4 = declaredConstructor.newInstance();
        System.out.println(session3==session4);//false

        Session session5 = declaredConstructor.newInstance();
        Session session6 = declaredConstructor.newInstance();
        System.out.println(session5==session6);//false
    }
}
