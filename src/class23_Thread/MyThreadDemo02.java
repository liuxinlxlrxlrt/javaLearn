package class23_Thread;
/*
 * ��������Ҫʵ�ֶ��̵߳ĳ���
 * ���ʵ���أ�
 * 		�����ֳ����������̶����ڵģ���������Ӧ���ȴ���һ�����̳���
 * 		������������ϵͳ�����ģ���������Ӧ��ȥ����ϵͳ���ܴ���һ������
 * 		Java�ǲ���ֱ�ӵ���ϵͳ���ܣ����ԣ�����û�а취ֱ��ʵ�ֶ���̳���
 * 		�����أ�Java����ȥ����C/c++д�õĳ�����ʵ�ֶ��̳߳���
 * 		����C/c++ȥ����ϵͳ���ܴ������̣�Ȼ����Javaȥ���������Ķ���
 * 		Ȼ���ṩһЩ�๩����ʹ�ã����ǾͿ���ʵ�ֶ��̳߳����ˡ�
 * 
 * ��ôJava�ṩ����ʲô�أ�
 * 		Thread
 * 		ͨ���鿴API������֪������2�ַ�ʽʵ�ֶ��̳߳���
 * 
 * ��ʽ1���̳�Thread��
 * ���裺
 * 		A���Զ�����MyThread�̳�Thread��
 * 		B��MyThread��������дrun()����?
 * 				Ϊʲô��run()�����أ�
 * 		C����������
 * 		D�������߳�
 * 
 */

public class MyThreadDemo02 {
	public static void main(String[] args) {
		//�����̶߳���
//		MyThread my = new MyThread();
//		//�����߳�
//		my.run();
//		my.run();
		//����run()Ϊʲô�ǵ��̵߳��أ�
		//��Ϊrun()����ֱ�ӵ����൱����ͨ�ķ������ã������㿴�����ǵ��̵߳�Ч��
		//Ҫ�뿴�����̵߳�Ч�����ͱ���˵˵��һ������
		//�����⣺run()��start()������
		//run():�����Ƿ�װ�߳�ִ�еĴ��룬ֱ�ӵ���ʱ��ͨ�ķ���
		//start()�������������̣߳�Ȼ������jvmȥ���ø��̵߳�run()����
		
//		MyThread my = new MyThread();
//		my.start();
//		//IllegalThreadStateException:�Ƿ����߳�״̬�쳣
//		//Ϊʲô�أ���Ϊ����൱��my�̱߳�����2�Σ������������߳�����
//		my.start();
		
		//���������̶߳���
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();
		
		my1.start();
		my2.start();
		
	}
}