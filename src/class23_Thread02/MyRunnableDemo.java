package class23_Thread02;
/*
 * ��ʽ2��ʵ�� Runnable �ӿڵ���
 * ���裺
 * 		A���Զ�����MyRunnableʵ��Runnabel�ӿ�
 * 		B����дrun()����
 * 		C������MyRunnable�����
 * 		D������Thread��Ķ��󣬲���C����Ķ�����Ϊ�����������
 */

public class MyRunnableDemo {

	public static void main(String[] args) {
		//����MyRunnable��Ķ���
		MyRunnable my = new MyRunnable();
		
		//����Thread��Ķ��󣬲���C����Ķ�����Ϊ�����������
		//Thread(Runnable target) 
//		Thread t1 = new Thread(my);
//		Thread t2 = new Thread(my);
//		t1.setName("����");
//		t2.setName("��ʫʫ");
		
		//Thread(Runnable target, String name) 
		Thread t1 = new Thread(my,"����");
		Thread t2 = new Thread(my,"��ʫʫ");
		
		
		t1.start();
		t2.start();
		
		
		
		
	}

}
