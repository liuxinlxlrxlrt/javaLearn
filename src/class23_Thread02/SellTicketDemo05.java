package class23_Thread02;
/*
 * A:ͬ�����������Ķ�����˭��
 * 		�������
 * 
 * B��ͬ�������ĸ�ʽ�����������⣿
 * 		��ͬ���ؼ��ּ��ط�����
 * 
 * 		ͬ����������������˭��
 * 			this
 * 
 * C����̬������������Ӧ��?
 * 		��̬��������������˭��
 * 			����ֽ����ļ�����(����ὲ)
 */

public class SellTicketDemo05 {

	public static void main(String[] args) {
		//��������Դ����
		SellTicket03 st = new SellTicket03();
		
		//���������̶߳���
		Thread t1 = new Thread(st, "����1");
		Thread t2 = new Thread(st, "����2");
		Thread t3 = new Thread(st, "����3");
		
		//�����߳�
		t1.start();
		t2.start();
		t3.start();
	}

}
