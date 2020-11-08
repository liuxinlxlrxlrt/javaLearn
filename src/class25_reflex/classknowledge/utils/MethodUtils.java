package class25_reflex.classknowledge.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * �������̳У�����final���������û������������ʵ��������һ��˽�еĿ��޲ҹ���
 */
public final class MethodUtils {

    private MethodUtils() {
    }

    /**
     * ִ�ж����ָ������
     *
     * @param obj        ��Ҫִ�з����Ķ���
     * @param methodName ��Ҫִ�еķ�������
     * @param params     ��������
     * @return
     */
    public static Object invokeMethod(Object obj, String methodName, Object... params) throws Exception {
        Object result = null;
        try {
            long startTime = System.currentTimeMillis();
            Class<?> objClass = obj.getClass();
            System.out.println("�ࣺ" + objClass.getName());
            System.out.println("������" + methodName);
            if (params == null || params.length == 0) {
                Method method = objClass.getDeclaredMethod(methodName);
                method.setAccessible(true);
                result = method.invoke(obj);
                System.out.println("����ֵ��" + result);

            } else {
                int size = params.length;
                Class<?>[] classes = new Class[size];
                Object[] paramValue = new Object[size];
                for (int i = 0; i < params.length; i++) {
                    classes[i] = params[i].getClass();
                    paramValue[i] = params[i];
                }
                System.out.println("������" + Arrays.toString(paramValue));
                Method method = objClass.getDeclaredMethod(methodName, classes);
                method.setAccessible(true);
                result = method.invoke(obj, paramValue);
                System.out.println("����ֵ��" + result);
            }
            long endTime = System.currentTimeMillis();
            System.out.println("��ʱ��" + (+endTime - startTime));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return result;
    }
}
