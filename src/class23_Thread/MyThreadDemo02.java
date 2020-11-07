package class23_Thread;
/*
 * 需求：我们要实现多线程的程序
 * 如何实现呢？
 * 		由于现场是依赖进程而存在的，所以我们应该先创建一个进程出来
 * 		而进程是由于系统创建的，所以我们应该去调用系统功能创建一个进程
 * 		Java是不能直接调用系统功能，所以，我们没有办法直接实现多进程程序
 * 		但是呢？Java可以去调用C/c++写好的程序来实现多线程程序
 * 		由于C/c++去调用系统功能创建进程，然后由Java去调用这样的东西
 * 		然后提供一些类供我们使用，我们就可以实现多线程程序了。
 * 
 * 那么Java提供类是什么呢？
 * 		Thread
 * 		通过查看API，我们知道了有2种方式实现多线程程序
 * 
 * 方式1：继承Thread类
 * 步骤：
 * 		A：自定义类MyThread继承Thread类
 * 		B：MyThread类里面重写run()方法?
 * 				为什么是run()方法呢？
 * 		C：创建对象
 * 		D：启动线程
 * 
 */

public class MyThreadDemo02 {
	public static void main(String[] args) {
		//创建线程对象
//		MyThread my = new MyThread();
//		//启动线程
//		my.run();
//		my.run();
		//调用run()为什么是单线程的呢？
		//因为run()方法直接调用相当于普通的方法调用，所以你看到的是单线程的效果
		//要想看到多线程的效果，就必须说说另一个方法
		//面试题：run()和start()的区别？
		//run():仅仅是封装线程执行的代码，直接调用时普通的方法
		//start()：首先启动了线程，然后再由jvm去调用该线程的run()方法
		
//		MyThread my = new MyThread();
//		my.start();
//		//IllegalThreadStateException:非法的线程状态异常
//		//为什么呢？因为这个相当于my线程被调用2次，而不是两个线程启动
//		my.start();
		
		//创建两个线程对象
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();
		
		my1.start();
		my2.start();
		
	}
}
