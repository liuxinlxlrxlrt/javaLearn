package class23_Thread;
/*
 * public static void yield():��ͣ��ǰ����ִ�е��̶߳��󣬲�ִ�������̡߳�
 * �ö���̵߳�ִ�и���г�����ǲ��ܿ�����֤һ��һ��
 */

public class ThreadYieldDemo {

	public static void main(String[] args) {
		ThreadYield ty1 = new ThreadYield();
		ThreadYield ty2 = new ThreadYield();
		
		ty1.setName("��ٻ");
		ty2.setName("��Ƹ��");
		
		ty1.start();
		ty2.start();
	}

}
