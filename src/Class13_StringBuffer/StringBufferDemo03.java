package Class13_StringBuffer;
/*
 * ɾ������
 *public StringBuffer deleteCharAt(int index):ɾ��ָ��λ�õ��ַ��������ر���
 *public StringBuffer delete(int start,int end):ɾ����ָ��λ�ÿ�ʼλ�õ�����λ�õ����ݣ������ر���
 */

public class StringBufferDemo03 {
	public static void main(String[] args) {
		//��������
		StringBuffer sb = new StringBuffer();
		
		//��ӹ���
		sb.append("hello").append("world").append("java");
		
		//public StringBuffer deleteCharAt(int index):
		//public StringBuffer delete(int start,int end):ɾ����ָ��λ�ÿ�ʼλ�õ�����λ�õ����ݣ������ر���ɾ��ָ��λ�õ��ַ��������ر���
		//��������Ҫɾ��e����ַ�����ô�죿
		sb.deleteCharAt(1);
		////sb:hlloworldjava
		System.out.println("sb:"+sb);
		
		//�����Ұ�ɾ����һ��l����ַ�����ô�죿
		sb.deleteCharAt(1);
		//sb:hloworldjava
		System.out.println("sb:"+sb);
		
		//public StringBuffer delete(int start,int end):
		//ɾ����ָ��λ�ÿ�ʼλ�õ�����λ�õ����ݣ������ر���
		//������Ҫɾ��world����ַ���
		sb.delete(3, 8);//���󲻰���
		System.out.println("sb:"+sb);
		
		//������Ҫɾ����������
		sb.delete(0, sb.length());
		System.out.println("sb:"+sb);
	}
}
