package class4;

/*
 * if����ʽ2:
 *     if(����ʽ){
 *         �����1;
 *     }else{
 *        �����2;
 *     }
 * 
 * ִ�����̣�
 *          �ȼ���Ƚϱ��ʽ��ֵ,���䷵��ֵ��ture����false;
 *          �����ture,��ִ�����;
 *          �����false,�Ͳ�ִ�����;
 *          
 * ע�⣺else����û�бȽϱ��ʽ,ֻ��if������
 */

public class ChooseStructureDemo1ifFormat2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		if (a == b) {
			System.out.println("a����b");
		}else {
			System.out.println("a������b");
		}
	}
}
