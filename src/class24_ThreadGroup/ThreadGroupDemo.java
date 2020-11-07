package class24_ThreadGroup;
/*
 * 线程组：把多个线程组组合到一起。
 * 它可以对一批线程进行分类管理，Java允许程序直接对线程组进行控制
 * 
 * 
 * 
 */

public class ThreadGroupDemo {
	public static void main(String[] args) {
//		method1();
		
		//我们如何修改线程所在的组呢？
		//创建一个线程组
		//创建其他线程的时候，把其他线程的组指定为我们自己新建的线程组
		method2();
		
//		t1.start();
//		t2.start();
	}

	private static void method2() {
		//ThreadGroup(String name):构造一个新线程组
		ThreadGroup tg =  new ThreadGroup("这是有一个新的组");
		
		MyRunnable my = new MyRunnable();
		//Thread(ThreadGroup group, Runnable target, String name) 
		//分配新的 Thread 对象，以便将 target 作为其运行对象，将指定的 name 作为其名称，并作为 group 所引用的线程组的一员。
		
		Thread t1 = new Thread(tg,my,"张天爱");
		Thread t2 = new Thread(tg,my,"张梓琳");
		
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());
		
		//通过组名称设置后台线程，表示改组的线程都是后台线程(守护线程)
		tg.setDaemon(true);
	}

	private static void method1() {
		MyRunnable my = new MyRunnable();
		
		Thread t1 = new Thread(my,"陈红");
		Thread t2 = new Thread(my,"张嘉倪");
		//我不知道他们属于哪个线程组，我想知道，怎么办？
		//线程组类里面的方法：public final ThreadGroup getThreadGroup()：返回该线程所属的线程组
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		//线程组里面的方法：public final String getName()：返回此线程组的名称
		String name1 = tg1.getName();
		String name2 = tg2.getName();
		System.out.println(name1);
		System.out.println(name2);
		//通过结果我们知道了：线程默认情况下属于main线程组
		//通过下面的测试，你应该能看到默认情况下，所有的线程都属于同一个组
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
	}
}
