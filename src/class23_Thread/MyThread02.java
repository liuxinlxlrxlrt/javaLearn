package class23_Thread;

public class MyThread02 extends Thread {
	public MyThread02() {
	}
	 
	public MyThread02(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int x=0;x<100;x++) {
			System.out.println(getName()+":"+x);
		}
	}
}
