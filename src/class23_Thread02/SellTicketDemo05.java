package class23_Thread02;
/*
 * A:同步代码块的锁的对象是谁？
 * 		任意对象
 * 
 * B：同步方法的格式吉锁对象问题？
 * 		把同步关键字加载方法上
 * 
 * 		同步方法的所对象是谁？
 * 			this
 * 
 * C：静态方法及锁对象应用?
 * 		静态方法的锁对象是谁？
 * 			类的字节码文件对象(反射会讲)
 */

public class SellTicketDemo05 {

	public static void main(String[] args) {
		//创建键资源对象
		SellTicket03 st = new SellTicket03();
		
		//创建三个线程对象
		Thread t1 = new Thread(st, "窗口1");
		Thread t2 = new Thread(st, "窗口2");
		Thread t3 = new Thread(st, "窗口3");
		
		//启动线程
		t1.start();
		t2.start();
		t3.start();
	}

}
