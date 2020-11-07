package class24_Thread_SafetyIssues;

public class SetThread implements Runnable{
	
	private Student s;
	private int x = 0;
	
	public SetThread (Student s) {
		this.s = s;
	}
	
	@Override
	public void run() {
		while(true) {
			//synchronized (new Object()) ����ȡ
			synchronized (s) {
				if(x%2==0) {
					s.name = "��ԲԲ";//���ߵ�����ͱ�����������ִ��Ȩ
					s.age = 27;
				}else {
					s.name = "�����";//���ߵ�����ͱ�����������ִ��Ȩ
					s.age = 30;
				}
				x++;
			}

		}
		
	}
}
