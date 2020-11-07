package class23_Thread;
/*
 * Ïß³ÌĞİÃß£º
 * 	public static void sleep(long millis)
 */

public class ThreadSleepDemo {

	public static void main(String[] args) {
		ThreadSleep tsl1 = new ThreadSleep();
		ThreadSleep tsl2 = new ThreadSleep();
		ThreadSleep tsl3 = new ThreadSleep();
		
		tsl1.setName("ÕÅ¼ÎÄß");
		tsl2.setName("ÕÅ¾ûÃÛ");
		tsl3.setName("³Âºì");
		
		tsl1.start();
		tsl2.start();
		tsl3.start();
	}

}
