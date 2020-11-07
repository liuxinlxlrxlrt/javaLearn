package class24_Thread;

public class MyLock {
	//创建两把锁对象
	//加static是为了类名调用class文件
	//加final是为了将来不变
	public static final Object objA = new Object();
	public static final Object objB = new Object();
}
