package class24_Thread_SafetyIssues;
/*
 * 分析：
 * 	资源类：Student
 * 	设置学生数据：SetThread(生产者)
 * 	获取学生数据：GetThread(消费者)
 * 	测试类：StudentDemo
 * 
 *问题1：按照思路写代码，发现数据每次都是：null---0
 *原因：我们在每个线程中都创建了资源，而我们要求的时候设置和获取线程的资源应该是同一个。
 *如何实现呢？
 *		在外界把这个数据创建出来，通过构造方法传递给其他的类
 *
 *问题2：为了数据的效果好一些，我加入和循环和判断，给出不同的值，这个时候产生了新的问题
 *		A：同一个数据出现多次
 *		B：姓名和年龄不匹配
 *
 *分析原因：
 *		A：同一个数据出现多次
 *			CPU的一点点时间片的执行权，就足球你执行很多次。
 *		B：姓名和年龄不匹配
 *			线程运行随机性
 *
 *线程安全问题：
 *		A：是否是多线程环境  是
 *		B：是否有共享数据  是
 *		C：是否有多条语句操作共享数据  是
 *
 *解决方案：
 *		加锁
 *		注意：
 *			A：不同种类的线程都要加锁
 *			B:不同种类的线程加的锁必须是同一把
 *
 *问题3：虽然数据安全，但是呢，一次一大片不好看，我就下个依次的一次一个输出
 *如何实现呢？
 *		通过Java提供的等待唤醒机制解决
 *
 *等待机制：
 *		Object类中提供了三个方法：
 *			wait()：等待
 *			notify()：唤醒单个线程
 *			notifyAll()：唤醒所有线程
 *		为什么这些方法不定义在Thread类中呢？
 *			这些方法的调用必须通过锁对象条用，而我们刚才使用的锁对象是任意锁对象
 *			所以，这些方法必须定义在Object类中
 *
 */

public class StudentDemo {
	public static void main(String[] args) {
		//创建资源
		Student s = new Student();
		
		//设置和获取类
		SetThread st = new SetThread(s);
		GetThread gt = new GetThread(s);
		
		//线程类
		//如果报错，原因是没有用构造
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);
		
		//启动线程类
		t1.start();
		//假设t2先抢到，打印结果是：null---0
		t2.start();
		
		
		
	}
}
