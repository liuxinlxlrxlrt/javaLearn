package class3;

/*
 *  &&��&������ͬ��||��|������
 *     A�����ս��һ��
 *     B: &&���ж�·Ч���������false,�ұ߲�ִ��
 *     
 *  �����г����߼��������
 *     &&, || , !
 */

public class OperatorDemo7 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;
		
		//&&�߼���
		System.out.println((a > b)&&(a > c));//false & false = false
		System.out.println((a > b)&&(a < c));//false & ture = false
		System.out.println((a < b)&&(a > c));//ture & false = false
		System.out.println((a < b)&&(a < c));//ture & ture = ture
		System.out.println("------------------------------------");
		
		int x = 3;
		int y = 4;
		
//		boolean b1 = ((x++ == 3 & y++ == 4));
//		boolean b1 = ((x++ == 3 && y++ == 4));
//		boolean b1 = ((++x == 3 & y++ == 4));
		boolean b1 = ((++x == 3 && y++ == 4));
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println(b1);
	}
}
