package class24_Thread_WaitWakeUpMechanism;

public class GetThread implements Runnable {
	
	private Student s;
	
	public GetThread(Student s) {
		this.s = s;
	}
	@Override
	public void run() {
		while(true) {
			//synchronized (new Object()) 不可取
			synchronized (s) {
				
				if(!s.flag) {
					try {
						s.wait();
						//t2就等待了，
						//wait()方法有个特点是立即释放锁，将来醒过来的时候，是从这里醒过来的。
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println(s.name+"---"+s.age);
			
				//修改标记
				s.flag = false;
				//唤醒线程
				s.notify();
			
			}

		}
		
	}
}
