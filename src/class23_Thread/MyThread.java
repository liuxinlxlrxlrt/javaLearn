package class23_Thread;
/*
 * ����Ҫ��дrun()������Ϊʲô�أ�
 * �������е����д��붼��Ҫ���߳�ִ�С�
 * ���������������Щ�����ܹ����߳�ִ�У�
 * java�ṩ��Thread����run()����������Щ���߳�ִ�еĴ���
 */

public class MyThread extends Thread {
	@Override
	public void run() {
		//�Լ�д����
		//System.out.println("�ú�ѧϰ����������");
		//һ����˵�����߳�ִ�еĴ���϶��ǱȽϺ�ʱ�ģ�����������ѭ���Ľ�
		for(int x=0;x<500;x++) {
			System.out.println(x);
		}
	}
}
