package class24_Thread_WaitWakeUpMechanism;

public class SetThread implements Runnable{
	
	private Student s;
	private int x = 0;
	
	public SetThread (Student s) {
		this.s = s;
	}
	
	@Override
	public void run() {
		while(true) {
			//synchronized (new Object()) 不可取
			synchronized (s) {
				//判断有没有
				if(s.flag) {
					try {
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
				if(x%2==0) {
					s.name = "高圆圆";//刚走到这里，就被别人抢到了执行权
					s.age = 27;
				}else {
					s.name = "李嘉欣";//刚走到这里，就被别人抢到了执行权
					s.age = 30;
				}
				x++;
				
				//修改标记
				s.flag = true;
				//唤醒线程
				s.notify();
				//唤醒t2,唤醒并不表示你立马可以执行，必须还得抢CPU的执行权
			}
		}
		//t1有,或者t2有
	}
}
