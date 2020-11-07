package class23_Thread;
/*
 * 线程没有设置优先级，肯定有默认优先级
 * 那么，默认优先级是多少呢？
 * 		public final int getPriority()：获取线程优先级
 *如何设置线程对象优先级呢？
 *		public final void setPriority(int newPriority)：更改线程优先级
 *
 *注意：
 *		线程默认优先级是5。
 *		线程优先级的范围是1-10
 *		线程优先级高仅仅标识线程获取CPU时间片的几率高，但是要是次数比较多，或者多次运行的时候才能看到比较好的效果。
 *
 *IllegalArgumentException:非法参数异常
 *抛出的异常表明向方法传递了一个不合法或不正确的参数。
 *
 */

import javax.sound.midi.Synthesizer;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();
		
		tp1.setName("张嘉倪");
		tp2.setName("江疏影");
		tp3.setName("万茜");
		
		//获取默认优先级
//		System.out.println(tp1.getPriority());  
//		System.out.println(tp2.getPriority());
//		System.out.println(tp3.getPriority());
		
		//设置线程线程优先级
//		tp1.setPriority(100000);
		
		//设置正确的优先级
		tp1.setPriority(10);
		tp2.setPriority(1);
		
		
		tp1.start();
		tp2.start();
		tp3.start();
	}

}
