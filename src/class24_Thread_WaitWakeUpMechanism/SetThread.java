package class24_Thread_WaitWakeUpMechanism;

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
				//�ж���û��
				if(s.flag) {
					try {
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
				if(x%2==0) {
					s.name = "��ԲԲ";//���ߵ�����ͱ�����������ִ��Ȩ
					s.age = 27;
				}else {
					s.name = "�����";//���ߵ�����ͱ�����������ִ��Ȩ
					s.age = 30;
				}
				x++;
				
				//�޸ı��
				s.flag = true;
				//�����߳�
				s.notify();
				//����t2,���Ѳ�����ʾ���������ִ�У����뻹����CPU��ִ��Ȩ
			}
		}
		//t1��,����t2��
	}
}
