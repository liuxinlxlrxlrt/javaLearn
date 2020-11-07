package class23_Thread;
/*
 * public final void stop():让线程停止，过时了，但是还可以使用
 * 
 * public void interrupt()：中断线程。把线程状态终止，并抛出一个InterruptedException
 */

public class ThreadStopDemo {

	public static void main(String[] args) {
		ThreadStop ts = new ThreadStop();
		
		ts.start();
		
		//超过3秒不醒过来，我就干死你
		try {
			Thread.sleep(3000);
//			ts.stop();//后面还有很多代码执行呢，不建议使用
			ts.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
