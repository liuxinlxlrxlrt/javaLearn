package class23_Thread02;
/*
 * ������
 * 	���ϲ�����
 * 
 * ͬ�����ص㣺
 * 		ǰ�᣺����߳�
 * 		��������ʱ��Ҫע�⣺
 * 			����߳�ʹ�õ���ͬһ��������
 * 		
 * ͬ���ĺô���ͬ���ĳ��� ����˶��̵߳İ�ȫ���⡣
 * 
 * ͬ���ı׶ˣ�
 * 		���߳��൱��ʱ����Ϊÿ���̶߳���ȥ�ж�ͬ���ϵ��������Ǻܺķ���Դ�ģ������лή�ͳ��������Ч�ʡ�
 * 
 */

public class SellTicketDemo04 {

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
