package class24_Thread_Consumer;

public class GetThread implements Runnable {
	
	private Student s;
	
	public GetThread(Student s) {
		this.s = s;
	}
	@Override
	public void run() {
//		Student s = new Student();
		System.out.println(s.name+"---"+s.age);
	}
}
