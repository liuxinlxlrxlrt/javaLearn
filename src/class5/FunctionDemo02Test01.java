package class5;

/*
 * �����ڿ���̨������µ���״
 * 			*****
 * 			*****
 * 			*****
 * 			*****
 * 
 * void���͵ķ���ֵ�ķ����ĵ��ã�
 *    	��������
 *    	������ã�����
 *    	��ֵ���ã�����
 * 		
 */

public class FunctionDemo02Test01 {

	public static void main(String[] args) {
		//forѭ��Ƕ�����ͼ��
		for(int x =0;x<4;x++) {
			for(int y=0;y<5;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------");
		
		//�����ڿ���̨���6��7�е�������״
		for(int x =0;x<6;x++) {
			for(int y=0;y<7;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------");
		
		//������������ı䣬���ǾͿ���ʹ�÷����Ľ�
		//��������
		pringxing(3,4);
		System.out.println("----------------");
		pringxing(5,6);
		System.out.println("----------------");
		pringxing(7,8);
		System.out.println("----------------");
		
		//�������
		//�˴�������ʹ�á��ա�����
		//System.out.println(pringxing(1,2));
		
		//��ֵ����
		//�Ƿ��ı��ʽ��ʼ
		//void v = pringxing(3,2);
	
				
	}
	/*
	 * дһ��ʲô���ķŴ��أ�дһ��m��n�еĴ���
	 * ������ȷ��
	 * 		����ֵ���ͣ����ʱ��û����ȷ�ķ���ֵ����д���������У������ס��void
	 * 		�����б�int m, int n
	 */
	
	public static void pringxing(int m,int n) {
		for(int x =0;x<m;x++) {
			for(int y=0;y<n;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
