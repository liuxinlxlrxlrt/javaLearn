package class4;
/*
 * ����С��������ÿ�����2.5ԪǮ������������������ǣ�
 * 		ÿ����һ���Ǵ�Ǯ�ĵ�5�����5�ı����Ļ���
 * 		�����Ứȥ6ԪǮ��
 * 		���ʣ����������죬С���ſ��Դ浽100ԪǮ��
 * 
 * ������
 * 		A:С��������ÿ�����2.5ԪǮ
 * 			double daysMoney = 2.5;
 * 		B:�����������
 * 			double daySum = 0;
 * 		C:�ӵ�һ����Ǵ洢
 * 			int dayCount = 1;
 * 		D:���������죬С���ſ��Դ浽100ԪǮ
 * 			double result = 100;
 * 		E:��һ���Ǯ�ĵ�5�����5�ı����Ļ��������Ứȥ6ԪǮ
 * 			˵��Ҫ�ж�dayCount��ֵ�������5�����ͼ�ȥ6ԪǮ
 * 				daySum -=6;
 * 			�ɴ˻�������һ�����⣬�����������5�ı�������Ļ���ǮҪ�ۼ�
 * 				daySum +=dayMoney;
 * 		F:��Ϊ��֪���Ƕ����죬����������ѭ����һ������100Ԫ�Ҿ��˳�ѭ��
 * 
 * 		
 */

public class GotoControlFormart04Test01 {

	public static void main(String[] args) {
		//ÿ��Ҫ�洢��Ǯ��2.5Ԫ
		double dayMoney = 2.5;
		
		//�洢�ĳ�ʼ��ֵ��0
		double daySum = 0;
		
		//�ӵ�һ�쿪ʼ�洢
		int dayCount = 1;
		
		//���մ洢��С��100�Ͳ��洢��
		double result = 100;
		
		//��Ϊ��֪���Ƕ����죬�����Ҿ�������ѭ��
		while(true) {
			//�ۼ�Ǯ
			daySum +=dayMoney;
			
			//һ������100Ԫ�Ҿ��˳�ѭ��
			if(daySum >= result) {
				System.out.println("������"+dayCount+"��洢��100Ԫ");
				break;
			}
			if(dayCount%5==0) {
				//��ȥ6ԪǮ
				daySum -=6;
				System.out.println("��"+dayCount+"�컨��6Ԫ");
			}
			//�����仯
			dayCount++;
		}

	}

}
