package class14_Random;
/*
 * Random:���������
 * 
 * ���췽����
 * 		public Random()��û�и����ӣ��õ�Ĭ������(���Ӳ�һ��)���ǵ�ǰʱ��ĺ���ֵ��1��=1000����
 * 		public Random(long seed)������ָ��������(����һ��)
 * 
 * 		�������Ӻ�ÿ�εõ������������ͬ��
 * 	
 * ��Ա������
 * 		public int nextInt()�����ص���Int��Χ�ڵ������
 * 		public int nextInt(int n)�����ص���[0��n}��Χ�ڵ������
 * 			
 */

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		// ��������
//		Random r = new Random();
		Random r = new Random(1111);
		for (int x = 0; x < 10; x++) {
//			int num = r.nextInt();
			int num = r.nextInt(100) + 1;
			System.out.println(num);
		}
	}
}
