package class24_Thread_OptimizeWaitWakeUpMechanism.copy;

public class Student {
	//不加修饰符就是默认修饰符，同一个包下的类可以访问
	private String name;
	private int age;
	private boolean flag;//默认没有数据，如果是true，说明有数据
	
	public synchronized void set(String name,int age) {
		//如果有数据就等待
		if(this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//设置数据
		this.name = name;
		this.age = age;
		
		//修改标记
		this.flag = true;
		this.notify();
	}
	
	public synchronized void get() {
		//如果没有数据，就等待
		if(!this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(this.name+"---"+this.age);
		
		//修改标记
		this.flag =false;
		this.notify();
	}
}
