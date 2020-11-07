package class24_ThreadPool;
/*
 * 定时器：可以让我们在制动的时间做某件事情，还可以重复的时间做某件事情
 * 依赖Timer和TimerTask这两个类
 * Timer：定时器
 * 		public Timer()
 * 		public void schedule(TimerTask task, long delay)
 * 		public void schedule(TimerTask task,long delay,long period)
 * 		public boolean cancel()
 * TimerTask：任务
 */

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
	public static void main(String[] args) {
		//创建定时器对象
		Timer t = new Timer();
		//3s后执行爆炸任务
//		t.schedule(new MyTask(), 3000);
		//结束任务
		t.schedule(new MyTask(t), 3000);
	}
}
//做一个任务
class MyTask extends TimerTask{
	
		private Timer t;
		
		public MyTask() {};
		
		public MyTask(Timer t) {
			this.t = t;
		}
		
		@Override
		public void run() {
			System.out.println("beng,暴躁");
			t.cancel();
		}
}
