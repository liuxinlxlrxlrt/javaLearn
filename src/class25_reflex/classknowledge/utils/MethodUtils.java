package class25_reflex.classknowledge.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 不让他继承，加上final，不允许用户创建工具类的实例，创建一个私有的空无惨构造
 */
public final class MethodUtils {

    private MethodUtils() {
    }

    /**
     * 执行对象的指定方法
     *
     * @param obj        ：要执行方法的对象
     * @param methodName ：要执行的方法名称
     * @param params     方法参数
     * @return
     */
    public static Object invokeMethod(Object obj, String methodName, Object... params) throws Exception {
        Object result = null;
        try {
            long startTime = System.currentTimeMillis();
            Class<?> objClass = obj.getClass();
            System.out.println("类：" + objClass.getName());
            System.out.println("方法：" + methodName);
            if (params == null || params.length == 0) {
                Method method = objClass.getDeclaredMethod(methodName);
                method.setAccessible(true);
                result = method.invoke(obj);
                System.out.println("返回值：" + result);

            } else {
                int size = params.length;
                Class<?>[] classes = new Class[size];
                Object[] paramValue = new Object[size];
                for (int i = 0; i < params.length; i++) {
                    classes[i] = params[i].getClass();
                    paramValue[i] = params[i];
                }
                System.out.println("参数：" + Arrays.toString(paramValue));
                Method method = objClass.getDeclaredMethod(methodName, classes);
                method.setAccessible(true);
                result = method.invoke(obj, paramValue);
                System.out.println("返回值：" + result);
            }
            long endTime = System.currentTimeMillis();
            System.out.println("耗时：" + (+endTime - startTime));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return result;
    }
}
