package class23_Thread;
/*
 * ��λ�ȡ�̶߳���������أ�
 * public final String getName()����ȡ�̵߳�����
 * ��������̶߳���������أ�
 * public final void setName(String name)�������߳�����
 * 
 * ��Բ���Thread���е�������λ�ȡ�̶߳��������أ�
 * public static Thread currentThread():���ص�ǰ����ִ�е��̶߳���
 * ����Thread.currentThread().getName()��ȡ����
 */

import java.security.AccessControlContext;

public class MyThread02Demo {
	//main()����������õ� 
	public static void main(String[] args) {
		//�����̶߳���
		//�൱��:�޲ι���+setXxx()
//		MyThread02 my1 = new MyThread02();
//		MyThread02 my2 = new MyThread02();
//		//���÷��������߳�����
//		my1.setName("����Ӱ");
//		my2.setName("��˼��");
//		my1.start();
//		my2.start();
		
		//���ι��췽�����߳�������
//		MyThread02 my1 = new MyThread02("������");
//		MyThread02 my2 = new MyThread02("���찮");
//		my1.start();
//		my2.start();
		
		//��Ҫ��ȡMain�������ڵ��̵߳����ƶ��󣬸���ô���أ�
		//�������������Thread���ṩ�˺ܺ���ķ���
		//public static Thread currentThread():���ص�ǰ����ִ�е��̶߳���
		System.out.println(Thread.currentThread().getName());
	}
}
/*
 * ����Ϊʲô�ǣ�Thread=? ����أ�
 * private char name[];
 * class Thread{
 *     public Thread() {
        init(null, null, "Thread-" + nextThreadNum(), 0);
    }
    
    private void init(ThreadGroup g, Runnable target, String name,
                      long stackSize) {
        init(g, target, name, stackSize, null, true);
    }
    private void init(ThreadGroup g, Runnable target, String name,
        long stackSize, AccessControlContext acc,
        this.name = name;
    }
    public final String getName(){
    	this.name = name.toCharArray();
    }
    private static int threadInitNumber;//0,1,2
    private static synchronized int nextThreadNum() {
        return threadInitNumber++;//��++ //0,1
    }
    
        public final String getName() {
        return String.valueof(name);
    }
 * }
 * 
 * class MyThread02 extends Thread{
 * 		public MyThreads Thread(){
 * 			super();
 * 		}
 * }
 */

