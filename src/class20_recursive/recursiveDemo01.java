package class20_recursive;
/*
 * ��������5�Ľ׳�
 * 
 * 5! = 1*2*3*4*5
 * 5! = 5*4!
 * 
 * �м��ַ���ʵ���أ�
 * 		A��ѭ��ʵ��
 * 		B���ݹ�ʵ��
 * 			a�����ݹ�Ҫдһ������
 * 			b����������
 * 			c������
 * 
 * 
 * �ݹ�����˼�룺
 * 		�ֽⷨ��
 * 		�ϲ�����
 */

public class recursiveDemo01 {

	public static void main(String[] args) {
//		int jc = 1;
//		for(int x=2;x<=5;x++) {
//			jc *= x;
//		}
//		System.out.println("5�Ľ׳��ǣ�"+jc);
		
		System.out.println("5�Ľ׳��ǣ�"+jieCheng(5));
	}
	
	/*
	 * ���ݹ�Ҫдһ��������
	 * 		����ֵ���ͣ�int
	 * 		�����б�int n
	 * ���������ǣ�
	 * 		if(n==1){return 1;}
	 * ���ɣ�
	 * 		if(n!=1){return n*������(n-1)}
	 */
	public static int jieCheng(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n*jieCheng(n-1);
		}
	}

}
