package class19_IOStream_finally;
/*
 * �����⣺
 * 1. final,finally��finalize������
 * 
 * final�� ���յ���˼������������,��Ա����,��Ա����
 * 			�����ࣺ�಻�ܱ��̳�
 * 			���α����������ǳ���
 * 			���η������������ܱ���д
 * finally�����쳣������һ����,�����ͷ���Դ
 * 		һ����˵,����϶���ִ��,�����������ִ�е�finally֮ǰjvm�˳���
 * finalize����Objectl���һ��������������������
 * 
 * 2. ���catch������return��䣬����finally����Ĵ��뻹��ִ����
 * 		����ᣬ��������returnǰ����return��
 * �𣺻ᣬǰ
 * ׼ȷ��˵����return���м䡣
 */

public class FinallyDemo2 {
	public static void main(String[] args) {
		System.out.println(getInt());
	}
	
	public static int getInt() {
		int a = 10;
		try {
			System.out.println(a/0);
			a= 20;
		} catch (Exception e) {
			a= 30;
			return a;
			/*
			 * return a �ڳ���ִ�е���һ����ʱ�����ﲻ��return a,����return 30,
			 * �������·�����γ��ˣ������أ������ֺ��滹��finally,���Լ���ִ��finally�����ݣ�a = 40��
			 * �ٴλص���ǰ�ķ���·����������return 30,��return���м䡣
			 */
		}finally {
			a= 40;
		}
		return a;
	}
	//����ֵ��30
}
