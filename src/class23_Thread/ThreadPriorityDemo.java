package class23_Thread;
/*
 * �߳�û���������ȼ����϶���Ĭ�����ȼ�
 * ��ô��Ĭ�����ȼ��Ƕ����أ�
 * 		public final int getPriority()����ȡ�߳����ȼ�
 *��������̶߳������ȼ��أ�
 *		public final void setPriority(int newPriority)�������߳����ȼ�
 *
 *ע�⣺
 *		�߳�Ĭ�����ȼ���5��
 *		�߳����ȼ��ķ�Χ��1-10
 *		�߳����ȼ��߽�����ʶ�̻߳�ȡCPUʱ��Ƭ�ļ��ʸߣ�����Ҫ�Ǵ����Ƚ϶࣬���߶�����е�ʱ����ܿ����ȽϺõ�Ч����
 *
 *IllegalArgumentException:�Ƿ������쳣
 *�׳����쳣�����򷽷�������һ�����Ϸ�����ȷ�Ĳ�����
 *
 */

import javax.sound.midi.Synthesizer;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();
		
		tp1.setName("�ż���");
		tp2.setName("����Ӱ");
		tp3.setName("����");
		
		//��ȡĬ�����ȼ�
//		System.out.println(tp1.getPriority());  
//		System.out.println(tp2.getPriority());
//		System.out.println(tp3.getPriority());
		
		//�����߳��߳����ȼ�
//		tp1.setPriority(100000);
		
		//������ȷ�����ȼ�
		tp1.setPriority(10);
		tp2.setPriority(1);
		
		
		tp1.start();
		tp2.start();
		tp3.start();
	}

}
