package class23_Thread02;
/*
 *ʵ��Runnable�ӿڵ�ʵ�ַ�ʽ
 *
 *ͨ�������ӳٺ󣬾Ͳ�������������
 *	A������ͬƱ���˶��
 *			CPU��һ�β���������ԭ���Ե�
 *	B�������˸���Ʊ
 *			����Ժ��ӳٵ��µ�
 */

public class SellTicketDemo02 {

	public static void main(String[] args) {
		//��������Դ����
		SellTicket02 st = new SellTicket02();
		
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
