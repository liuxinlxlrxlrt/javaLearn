package class23_Thread;
/*
 * public final void join()���ȴ��߳���ֹ
 *            throws InterruptedException
 * 
 */

public class ThreadJoinDemo {

	public static void main(String[] args) {
		ThreadJoin tj1 = new ThreadJoin();
		ThreadJoin tj2 = new ThreadJoin();
		ThreadJoin tj3 = new ThreadJoin();
		
		tj1.setName("����");
		tj2.setName("������");
		tj3.setName("������");
		
		tj1.start();
		try {
			tj1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tj2.start();
		tj3.start();
	}

}
