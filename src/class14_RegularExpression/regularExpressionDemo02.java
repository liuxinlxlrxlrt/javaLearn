package class14_RegularExpression;

/*
 * �жϹ��ܣ�
 * 		String���public boolean matches(String regex)
 *
 *����
 *		�ж��ֻ������Ƿ�����Ҫ��
 *
 *������
 *		A������¼���ֻ�����
 *		B�������ֻ�����Ĺ���
 *				13436975980
 *				13688888888
 *				13888888888
 *				13188888888
 *				18988888888
 *				18688888888
 *		C�����ù��ܣ��жϼ���
 *		D��������
 */
import java.util.Scanner;
public class regularExpressionDemo02 {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ֻ����룺");
		String phone = sc.nextLine();
		
		//�����ֻ�����Ĺ���
		String regex = "1[38]\\d{9}";
		
		//���ù��ܣ��жϼ���
		boolean flag = phone.matches(regex);
		
		//������
		System.out.println("flag��"+flag);
	}
}
