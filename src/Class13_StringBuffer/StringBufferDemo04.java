package Class13_StringBuffer;
/*
 * �滻����
 *public StringBuffer replace(int start,int end,String str):��start��end��str�滻�����󲻰���
 */
public class StringBufferDemo04 {
	public static void main(String[] args) {
		//�����ַ�������������
		StringBuffer sb = new StringBuffer();
		
		//�������
		sb.append("hello").append("world").append("java");
		System.out.println("sb:"+sb);
		
		//public StringBuffer replace(int start,int end,String str):
		//��start��end��str�滻�����󲻰���
		//������Ҫ��world�滻�ɽ��տ���
		sb.replace(5, 10, "���տ���");
		System.out.println("sb:"+sb);
	}
}
