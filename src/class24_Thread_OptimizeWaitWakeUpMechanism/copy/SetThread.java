package class24_Thread_OptimizeWaitWakeUpMechanism.copy;

public class SetThread implements Runnable{
	
	private Student s;
	private int x = 0;
	
	public SetThread (Student s) {
		this.s = s;
	}
	
	@Override
	public void run() {
		while(true) {
				if(x%2==0) {
					s.set("∏ﬂ‘≤‘≤", 27);
				}else {
					s.set("¿ÓºŒ–¿", 30);
				}
				x++;
		}
	}
}
