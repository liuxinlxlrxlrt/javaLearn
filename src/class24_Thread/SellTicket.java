package class24_Thread;
/*
 * ��Ȼ���ǿ������ͬ��������ͬ�����������������⣬
 * �������ǲ�û��ֱ�ӿ�������������������������ͷ�������
 * Ϊ�˸������ı����μ������ͷ�����JDK5�Ժ��ṩ��һ���µ�������Lock
 * 
 * Lock��
 * 		void lock()����ȡ��
 * 		void unlock()���ͷ���
 * 
 * ReentrantLock��Lock��ʵ����
 * 
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable{
		
	//����Ʊ
	private int tickets = 100;
	
	//����������
	private Lock lock = new ReentrantLock();
	@Override
	public void run() {
		while(true) {
			//����
			try {
				lock.lock();
				
				if(tickets>0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"���ڳ��۵�"+(tickets--)+"��Ʊ");
				}
			}finally {
				//�ͷ���
				lock.unlock();
			}
		}
	}
}
