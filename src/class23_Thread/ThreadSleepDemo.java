package class23_Thread;
/*
 * �߳����ߣ�
 * 	public static void sleep(long millis)
 */

public class ThreadSleepDemo {

	public static void main(String[] args) {
		ThreadSleep tsl1 = new ThreadSleep();
		ThreadSleep tsl2 = new ThreadSleep();
		ThreadSleep tsl3 = new ThreadSleep();
		
		tsl1.setName("�ż���");
		tsl2.setName("�ž���");
		tsl3.setName("�º�");
		
		tsl1.start();
		tsl2.start();
		tsl3.start();
	}

}
