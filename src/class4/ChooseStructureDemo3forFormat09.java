package class4;

/*
 * ��ͳ��1-1000֮��ͬʱ�������������������ж��ٸ���
 *		��3������2
 *		��5������3
 *		��7������2
 * ������
 * 		A������һ��ͳ�Ʊ���
 * 		B: 1-1000���������Ƿ�Χ
 * 		C: ��ȡһ����λ������
 * 		D: ����Ҫ������ж�
 *		E: �������Ҫ��ͼ��������ͳ�Ʊ���
 */

public class ChooseStructureDemo3forFormat09 {
	public static void main(String[] args) {
		//����ͳ�Ʊ�������ʼ��ֵ��0
		int count = 0;
		
		for(int x = 1;x<=1000;x++) {
		    if((x%3 == 2)&&(x%5 == 3)&&(x%7 == 2)) {
		    	//��������������������̨
		    		count++;
		    		System.out.println(x);
		    }
		}
		System.out.println("ˮ�ɻ�������"+count+"��");
	}
}
