package class23_Thread02;


public class SellTicket03 implements Runnable{
	//����100��Ʊ
	private int tickets = 100;
	//����������
	private Object obj = new Object();

	@Override
	public void run() {
		while(true) {
			//t1,t2,t3����������
			//����t1����CPU��ִ��Ȩ��t1�ͽ���
			//����t2����CPU��ִ��Ȩ��t2��Ҫ�������������ǹ��ŵģ�����ȥ�����Ծ͵��š�
			//��(������)
			synchronized(obj) {//��������Ĵ���ᱻ��������,����t1�����󣬾�����.(��)
			if(tickets>0) {
				try {
					Thread.sleep(100);//t1��˯����
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"���ڳ��۵�"+(tickets--)+"��Ʊ");
				//����1���ڳ��۵�100��Ʊ
			  }
			}	//t1�ͳ�����Ȼ���š�(��)
		}
	}
}
