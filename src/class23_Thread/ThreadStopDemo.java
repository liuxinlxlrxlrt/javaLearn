package class23_Thread;
/*
 * public final void stop():���߳�ֹͣ����ʱ�ˣ����ǻ�����ʹ��
 * 
 * public void interrupt()���ж��̡߳����߳�״̬��ֹ�����׳�һ��InterruptedException
 */

public class ThreadStopDemo {

	public static void main(String[] args) {
		ThreadStop ts = new ThreadStop();
		
		ts.start();
		
		//����3�벻�ѹ������Ҿ͸�����
		try {
			Thread.sleep(3000);
//			ts.stop();//���滹�кܶ����ִ���أ�������ʹ��
			ts.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
