package class24_Thread_Consumer;
/*
 * ������
 * 	��Դ�ࣺStudent
 * 	����ѧ�����ݣ�SetThread(������)
 * 	��ȡѧ�����ݣ�GetThread(������)
 * 	�����ࣺStudentDemo
 * 
 *����1������˼·д���룬��������ÿ�ζ��ǣ�null---0
 *ԭ��������ÿ���߳��ж���������Դ��������Ҫ���ʱ�����úͻ�ȡ�̵߳���ԴӦ����ͬһ����
 *���ʵ���أ�
 *		������������ݴ���������ͨ�����췽�����ݸ���������
 */

public class StudentDemo {
	public static void main(String[] args) {
		//������Դ
		Student s = new Student();
		
		//���úͻ�ȡ��
		SetThread st = new SetThread(s);
		GetThread gt = new GetThread(s);
		
		//�߳���
		//�������ԭ����û���ù���
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);
		
		//�����߳���
		t1.start();
		//����t2����������ӡ����ǣ�null---0/null---27
		t2.start();
		
		
		
	}
}
