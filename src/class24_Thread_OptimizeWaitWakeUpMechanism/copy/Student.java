package class24_Thread_OptimizeWaitWakeUpMechanism.copy;

public class Student {
	//�������η�����Ĭ�����η���ͬһ�����µ�����Է���
	private String name;
	private int age;
	private boolean flag;//Ĭ��û�����ݣ������true��˵��������
	
	public synchronized void set(String name,int age) {
		//��������ݾ͵ȴ�
		if(this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//��������
		this.name = name;
		this.age = age;
		
		//�޸ı��
		this.flag = true;
		this.notify();
	}
	
	public synchronized void get() {
		//���û�����ݣ��͵ȴ�
		if(!this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(this.name+"---"+this.age);
		
		//�޸ı��
		this.flag =false;
		this.notify();
	}
}
