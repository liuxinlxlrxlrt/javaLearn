package class4;

/*
 * ������5�Ľ׳�(��׳�˼��)
 * 
 * ʲô�׳ˣ�
 * 		n! = n*��n-1������
 * 		n! = n*(n-1)(n-2)*...3*2*1
 */

public class ChooseStructureDemo3forFormat05 {
	public static void main(String[] args) {
				//��5�Ľ׳�
				int sum1 = 1;
				
				for(int x=1;x<=5;x++) {
					sum1 *=x;
				}
		        System.out.println("1-100֮������֮��sum1�ǣ�"+sum1);
	}
}
