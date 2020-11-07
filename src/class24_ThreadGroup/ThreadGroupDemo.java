package class24_ThreadGroup;
/*
 * �߳��飺�Ѷ���߳�����ϵ�һ��
 * �����Զ�һ���߳̽��з������Java�������ֱ�Ӷ��߳�����п���
 * 
 * 
 * 
 */

public class ThreadGroupDemo {
	public static void main(String[] args) {
//		method1();
		
		//��������޸��߳����ڵ����أ�
		//����һ���߳���
		//���������̵߳�ʱ�򣬰������̵߳���ָ��Ϊ�����Լ��½����߳���
		method2();
		
//		t1.start();
//		t2.start();
	}

	private static void method2() {
		//ThreadGroup(String name):����һ�����߳���
		ThreadGroup tg =  new ThreadGroup("������һ���µ���");
		
		MyRunnable my = new MyRunnable();
		//Thread(ThreadGroup group, Runnable target, String name) 
		//�����µ� Thread �����Ա㽫 target ��Ϊ�����ж��󣬽�ָ���� name ��Ϊ�����ƣ�����Ϊ group �����õ��߳����һԱ��
		
		Thread t1 = new Thread(tg,my,"���찮");
		Thread t2 = new Thread(tg,my,"������");
		
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());
		
		//ͨ�����������ú�̨�̣߳���ʾ������̶߳��Ǻ�̨�߳�(�ػ��߳�)
		tg.setDaemon(true);
	}

	private static void method1() {
		MyRunnable my = new MyRunnable();
		
		Thread t1 = new Thread(my,"�º�");
		Thread t2 = new Thread(my,"�ż���");
		//�Ҳ�֪�����������ĸ��߳��飬����֪������ô�죿
		//�߳���������ķ�����public final ThreadGroup getThreadGroup()�����ظ��߳��������߳���
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		//�߳�������ķ�����public final String getName()�����ش��߳��������
		String name1 = tg1.getName();
		String name2 = tg2.getName();
		System.out.println(name1);
		System.out.println(name2);
		//ͨ���������֪���ˣ��߳�Ĭ�����������main�߳���
		//ͨ������Ĳ��ԣ���Ӧ���ܿ���Ĭ������£����е��̶߳�����ͬһ����
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
	}
}
