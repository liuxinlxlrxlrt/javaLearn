package Class13_StringBuffer;
/*
  * ��ת����	
 *  public StringBuffer reverse()
 */

public class StringBufferDemo05 {
	public static void main(String[] args) {
		//�����ַ�������������
		StringBuffer sb = new StringBuffer();
		
		//�������
		sb.append("�Ұ�����");
		System.out.println("sb:"+sb);//sb:�Ұ�����
		
		sb.reverse();
		System.out.println("sb:"+sb);//sb:���ǰ���
	}
}
