package class2;

/*
 * ǿ��ת����
 *      �Ӵ���������͵�С���������͡�
 *      
 *      ��ʽ��
 *          Ŀ����������  ���� =(Ŀ�� ��������) (��ת��������)
 *      ע�⣺
 *         ��Ҫ�����ȥʹ��ʹ��ǿ��ת������Ϊ�������˾�����ʧ����
 */
public class DataTypeDemo4 {

	public static void main(String[] args) {
		byte a = 3;
		int b = 4;
		
		//����϶�û����
		//int c = a + b;
		
		//byte c = 7;
		//����϶�������
		//byte c =a+b;
		//��ǿ������ת���Ľ�
		//int����(a+b)��ǿ��ת��byte���ͣ�(byte) (a+b)���ٸ���byte����c
		byte c = (byte) (a+b);
		System.out.println(c);
	}
}
