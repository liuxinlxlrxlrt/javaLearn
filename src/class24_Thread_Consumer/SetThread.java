package class24_Thread_Consumer;

public class SetThread implements Runnable{
	
	private Student s;
	
	public SetThread (Student s) {
		this.s = s;
	}
	
	@Override
	public void run() {
//		Student s = new Student();
		s.name = "ÁõÒà·Æ";
		s.age = 27;
		
	}
}
