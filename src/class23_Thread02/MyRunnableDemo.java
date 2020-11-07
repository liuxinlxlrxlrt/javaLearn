package class23_Thread02;
/*
 * 方式2：实现 Runnable 接口的类
 * 步骤：
 * 		A：自定义类MyRunnable实现Runnabel接口
 * 		B：重写run()方法
 * 		C：创建MyRunnable类对象
 * 		D：创建Thread类的对象，并把C步骤的对象作为构造参数传递
 */

public class MyRunnableDemo {

	public static void main(String[] args) {
		//创建MyRunnable类的对象
		MyRunnable my = new MyRunnable();
		
		//创建Thread类的对象，并把C步骤的对象作为构造参数传递
		//Thread(Runnable target) 
//		Thread t1 = new Thread(my);
//		Thread t2 = new Thread(my);
//		t1.setName("杨蓉");
//		t2.setName("刘诗诗");
		
		//Thread(Runnable target, String name) 
		Thread t1 = new Thread(my,"杨蓉");
		Thread t2 = new Thread(my,"刘诗诗");
		
		
		t1.start();
		t2.start();
		
		
		
		
	}

}
