package class14_System;
/*
 * System 类包含一些有用的类字段和方法。它不能被实例化
 * 
 * 成员方法：
 * public static void gc()：运行垃圾回收器
 * public static void exit(int status)
 * public static long currentTimeMillis()
 * public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 */

public class SystemDemo {
	public static void main(String[] args) {
		Person p = new Person("杨子姗", 26);
		System.out.println(p);

		p = null;// 让p不在指向堆内存
		System.gc();
	}
}
