package class23_Thread;
/*
 * public final void join()£∫µ»¥˝œﬂ≥Ã÷’÷π
 *            throws InterruptedException
 * 
 */

public class ThreadJoinDemo {

	public static void main(String[] args) {
		ThreadJoin tj1 = new ThreadJoin();
		ThreadJoin tj2 = new ThreadJoin();
		ThreadJoin tj3 = new ThreadJoin();
		
		tj1.setName("–Ì«Á");
		tj2.setName("∞¨…–’Ê");
		tj3.setName("∏ Ê√Ê√");
		
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
