package class3;

/*
 * �߼��������
 *      &,|,^,!,&&,||
 *      
 * �ص㣺
 *    �߼������һ����������boolean���͵ı��ʽ����ֵ��
 *    
 *    ���ʽ��������������ѳ������߱������������ķ���java�﷨��ʽ�ӡ�
 *         �������ʽ��a + b
 *         �Ƚ��������a == b
 *         
 *  ���ۣ�
 *    &�߼��룺��false��false
 *    ���߼�����ture��ture
 *    ^�߼������ͬΪfalse,��ͬΪture.
 *        ���������¹�ϵ�����У���Ů����Ů��ŮŮ
 *    !�߼��ǣ���false��ture,��ture��false
 *        �ص㣺ż���������ı䱾�����������ı䱾��
 */

public class OperatorDemo6 {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;
		
		//&�߼���
		System.out.println((a > b)&(a > c));//false & false = false
		System.out.println((a > b)&(a < c));//false & ture = false
		System.out.println((a < b)&(a > c));//ture & false = false
		System.out.println((a < b)&(a < c));//ture & ture = ture
		System.out.println("------------------------------------");
		
		//|�߼���
		System.out.println((a > b)|(a > c));//false & false = false
		System.out.println((a > b)|(a < c));//false & ture = ture
		System.out.println((a < b)|(a > c));//ture & false = ture
		System.out.println((a < b)|(a < c));//ture & ture = ture
		System.out.println("------------------------------------");
		
		//^�߼����
		System.out.println((a > b)^(a > c));//false & false = false
		System.out.println((a > b)^(a < c));//false & ture = ture
		System.out.println((a < b)^(a > c));//ture & false = ture
		System.out.println((a < b)^(a < c));//ture & ture = false
		System.out.println("------------------------------------");
		
		//���߼���
		System.out.println(! (a > b));//!false = ture
		System.out.println(!(a < b));//! ture = false
		System.out.println(!! (a > b));//!!false = false
		System.out.println(!!!(a > b));//!!!false = ture
	}
}
