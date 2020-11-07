package class24_Thread_OptimizeWaitWakeUpMechanism.copy;

public class GetThread implements Runnable {
	
	private Student s;
	
	public GetThread(Student s) {
		this.s = s;
	}
	@Override
	public void run() {
		while(true) {
			s.get();	
		}
		
	}
}
