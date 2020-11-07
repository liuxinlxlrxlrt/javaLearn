package class23_Thread02;

public class SellTicket05 implements Runnable {
	// ����100��Ʊ
	private static int tickets = 100;
	// ����������
	private Object obj = new Object();
	private Demo d = new Demo();
	private int x = 0;

	// ͬ���������obj����
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
//				System.out.println(Thread.currentThread().getName()+"���ڳ��۵�"+(tickets--)+"��Ʊ");
//			  }
//			}	
//		}
//	}

	// �������������
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
//				System.out.println(Thread.currentThread().getName()+"���ڳ��۵�"+(tickets--)+"��Ʊ");
//			  }
//			}	
//		}
//	}

	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				//ͬ����������������this
				//synchronized (this)
				//��̬�������������ǵ�ǰ���class�ļ�
				synchronized (SellTicket05.class) {
					if (tickets > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (tickets--) + "��Ʊ");
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
//						System.out.println(Thread.currentThread().getName()+"���ڳ��۵�"+(tickets--)+"��Ʊ");
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
//			System.out.println(Thread.currentThread().getName()+"���ڳ��۵�"+(tickets--)+"��Ʊ");
//		  }
//		}
//	}

	// ���һ������һ��ȥ�Ϳ������뱻ͬ���ˣ���ô�Ҿ������ܲ��ܰ����ͬ���ӵ��������أ�
//	private synchronized void SellTicket() {
////	synchronized(d) {
//		if (tickets > 0) {
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (tickets--) + "��Ʊ");
////	  }
//	}

	
	private static synchronized void SellTicket() {
		//������static��tickets������Ա������ticketsҲҪ��static
		if (tickets > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (tickets--) + "��Ʊ");
		}

	}
}

class Demo {

}
