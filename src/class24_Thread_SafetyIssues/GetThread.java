package class24_Thread_SafetyIssues;

public class GetThread implements Runnable {
	
	private Student s;
	
	public GetThread(Student s) {
		this.s = s;
	}
	@Override
	public void run() {
		while(true) {
			//synchronized (new Object()) ≤ªø…»°
			synchronized (s) {
	
				
				System.out.println(s.name+"---"+s.age);
			

			
			}

		}
		
	}
}
