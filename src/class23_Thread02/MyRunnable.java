package class23_Thread02;


public class MyRunnable implements Runnable {
		@Override
		public void run() {
			for(int x=0;x<100;x++) {
				//����ʵ�ֽӿڵķ�ʽ�Ͳ���ֱ��ʹ��Thread��ķ����ˣ����ǿ��Լ�ӵ�ʹ�ã�
				//ͨ��Thread.currentThread()��ȡ�̵߳�ǰ������
				System.out.println(Thread.currentThread().getName()+":"+x);
			}
			
		}
}
