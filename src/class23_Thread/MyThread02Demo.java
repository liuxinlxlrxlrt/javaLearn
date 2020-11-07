package class23_Thread;
/*
 * 如何获取线程对象的名称呢？
 * public final String getName()：获取线程的名称
 * 如何设置线程对象的名称呢？
 * public final void setName(String name)：设置线程名称
 * 
 * 针对不是Thread类中的子类如何获取线程对象名称呢？
 * public static Thread currentThread():返回当前正在执行的线程对象
 * 调用Thread.currentThread().getName()获取名称
 */

import java.security.AccessControlContext;

public class MyThread02Demo {
	//main()是虚拟机调用的 
	public static void main(String[] args) {
		//创建线程对象
		//相当于:无参构造+setXxx()
//		MyThread02 my1 = new MyThread02();
//		MyThread02 my2 = new MyThread02();
//		//调用方法设置线程名称
//		my1.setName("江疏影");
//		my2.setName("马思纯");
//		my1.start();
//		my2.start();
		
		//带参构造方法给线程其名字
//		MyThread02 my1 = new MyThread02("张梓琳");
//		MyThread02 my2 = new MyThread02("张天爱");
//		my1.start();
//		my2.start();
		
		//我要获取Main方法所在的线程的名称对象，该怎么办呢？
		//遇到这种情况，Thread类提供了很好玩的方法
		//public static Thread currentThread():返回当前正在执行的线程对象
		System.out.println(Thread.currentThread().getName());
	}
}
/*
 * 名称为什么是：Thread=? 编号呢？
 * private char name[];
 * class Thread{
 *     public Thread() {
        init(null, null, "Thread-" + nextThreadNum(), 0);
    }
    
    private void init(ThreadGroup g, Runnable target, String name,
                      long stackSize) {
        init(g, target, name, stackSize, null, true);
    }
    private void init(ThreadGroup g, Runnable target, String name,
        long stackSize, AccessControlContext acc,
        this.name = name;
    }
    public final String getName(){
    	this.name = name.toCharArray();
    }
    private static int threadInitNumber;//0,1,2
    private static synchronized int nextThreadNum() {
        return threadInitNumber++;//后++ //0,1
    }
    
        public final String getName() {
        return String.valueof(name);
    }
 * }
 * 
 * class MyThread02 extends Thread{
 * 		public MyThreads Thread(){
 * 			super();
 * 		}
 * }
 */

