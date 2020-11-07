package class23_Thread02;

public class SellTicket05 implements Runnable {
	// 定义100张票
	private static int tickets = 100;
	// 创建锁对象
	private Object obj = new Object();
	private Demo d = new Demo();
	private int x = 0;

	// 同步代码块用obj做锁
//	@Override
//	public void run() {
//		while(true) {
//			synchronized(obj) {
//			if(tickets>0) {
//				try {
//					Thread.sleep(100);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				System.out.println(Thread.currentThread().getName()+"正在出售第"+(tickets--)+"张票");
//			  }
//			}	
//		}
//	}

	// 用任意对象做锁
//	@Override
//	public void run() {
//		while(true) {
//			synchronized(d) {
//			if(tickets>0) {
//				try {
//					Thread.sleep(100);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				System.out.println(Thread.currentThread().getName()+"正在出售第"+(tickets--)+"张票");
//			  }
//			}	
//		}
//	}

	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				//同步方法的所对象是this
				//synchronized (this)
				//静态方法的锁对象是当前类的class文件
				synchronized (SellTicket05.class) {
					if (tickets > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张票");
					}
				}
			} else {
//				synchronized(d) {
//					if(tickets>0) {
//						try {
//							Thread.sleep(100);
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//						System.out.println(Thread.currentThread().getName()+"正在出售第"+(tickets--)+"张票");
//					  }
//					}

				SellTicket();
			}
			x++;

		}
	}

//	private void SellTicket() {
//		synchronized(d) {
//		if(tickets>0) {
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(Thread.currentThread().getName()+"正在出售第"+(tickets--)+"张票");
//		  }
//		}
//	}

	// 如果一个方法一进去就看到代码被同步了，那么我就在想能不能把这个同步加到方法上呢？
//	private synchronized void SellTicket() {
////	synchronized(d) {
//		if (tickets > 0) {
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张票");
////	  }
//	}

	
	private static synchronized void SellTicket() {
		//方法加static后，tickets报错，成员变量的tickets也要加static
		if (tickets > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张票");
		}

	}
}

class Demo {

}
