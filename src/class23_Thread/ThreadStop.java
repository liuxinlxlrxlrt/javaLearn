package class23_Thread;

import java.util.Date;

public class ThreadStop extends Thread {
	@Override
	public void run() {
		System.out.println("��ʼִ��"+new Date());
		
		//��Ҫ��Ϣ10s�У��벻Ҫ������
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("�̱߳��ж�");
		}
		System.out.println("����ִ��"+new Date());
	}
}
