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
					s.set("��ԲԲ", 27);
				}else {
					s.set("�����", 30);
				}
				x++;
		}
	}
}
