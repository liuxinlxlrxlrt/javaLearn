package class4;

/*��ϰ��
 * 	���ڿ���̨�������������������λ��
 *	��λ������λ
 *	ʮλ����ǧλ
 *	��λ+ʮλ+ǧλ+��λ=��λ
 *
 *������(��λ���͸��������Ƿ�Χ���ֽ�ÿһ����λ���ĸ����ǣ��٣�ǧ����λ�ϵ�����)
 *	A:ge = wan
 *	B:shi = qian
 *	C:ge+shi+qian+wan=bai
 */

public class ChooseStructureDemo3forFormat07 {

	public static void main(String[] args) {
		for(int x = 10000;x<100000;x++) {
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
			int qian =x/10/10/10%10;
			int wan = x/10/10/10/10%10;
			
			//��"ge*ge*ge+shi*shi*shi+bai*bai*bai"�͸����ݱȽ�
		    if((ge == wan)&&(shi == qian)&&((ge+shi+qian+wan) == bai)) {
		    	//�����ͬ���ͰѸ������ڿ���̨���
		    	System.out.println(x);
		    }
		}
	}
}
