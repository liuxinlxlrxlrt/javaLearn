package class24_Thread_WaitWakeUpMechanism;

public class GetThread implements Runnable {
	
	private Student s;
	
	public GetThread(Student s) {
		this.s = s;
	}
	@Override
	public void run() {
		while(true) {
			//synchronized (new Object()) ����ȡ
			synchronized (s) {
				
				if(!s.flag) {
					try {
						s.wait();
						//t2�͵ȴ��ˣ�
						//wait()�����и��ص��������ͷ����������ѹ�����ʱ���Ǵ������ѹ����ġ�
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println(s.name+"---"+s.age);
			
				//�޸ı��
				s.flag = false;
				//�����߳�
				s.notify();
			
			}

		}
		
	}
}
