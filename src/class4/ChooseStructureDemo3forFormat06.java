package class4;

/* 
 * �����ڿ���̨������еġ�ˮ�ɻ�����
 * 
 * ������
 * 	���ǲ�֪��ʲô�С�ˮ�ɻ���������������ô���أ�
 * 		��ν��ˮ�ɻ���ָһ����λ�������λ���ֵ������͵��ڸ�������
 * 		������153����һ��ˮ�ɻ���
 * 			153 = 1*1*1+5*5*5+3*3*3=1+125+27
 * 		A:��λ����ʵ�Ǹ��������Ƿ�Χ
 * 		B��ͨ��forѭ�����ǾͿ���ʵ�ֻ�ȡÿһλ��
 * 		   �����鷳����λ�ȡ����λ���ĸ���ʮ����λ�ϵ�����
 * 
 * 			������λ�ȡһ�����ݵĸ���ʮ�����أ�
 * 				������һ�����ݣ�153
 * 				ge��153%10=3
 * 				shi:153/10%10=5
 * 				bai:153/10/10%10=1
 * 				qian:x/10/10/10%10
 *          	wan:x/10/10/10/10/%10
 *          ...
 *          
 * 		C����"ge*ge*ge+shi*shi*shi+bai*bai*bai"�͸����ݱȽ�
 * 			�����ͬ���ͰѸ����������̨
 */

public class ChooseStructureDemo3forFormat06 {

	public static void main(String[] args) {
		for(int x = 100;x<1000;x++) {
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
			
			//��"ge*ge*ge+shi*shi*shi+bai*bai*bai"�͸����ݱȽ�
		    if(x == (ge*ge*ge+shi*shi*shi+bai*bai*bai)) {
		    	//�����ͬ���ͰѸ������ڿ���̨���
		    	System.out.println(x);
		    }
		}
	}
}