package class23_Thread;

import java.util.Date;

public class ThreadStop extends Thread {
	@Override
	public void run() {
		System.out.println("开始执行"+new Date());
		
		//我要休息10s中，请不要打扰我
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("线程被中断");
		}
		System.out.println("结束执行"+new Date());
	}
}
