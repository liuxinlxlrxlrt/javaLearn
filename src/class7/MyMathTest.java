package class7;

import java.util.Scanner;

public class MyMathTest {
	public static void main(String[] args) {
		//��������¼��
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����������");
		int fristNumber = sc.nextInt();
		System.out.println("������ڶ�����������");
		int secondNumber = sc.nextInt();
		
		//����Mymath���󣬲�ʹ��
		MyMath mm = new MyMath();
		
		System.out.println("�ӷ������"+mm.add(fristNumber, secondNumber));
		System.out.println("���������"+mm.sub(fristNumber, secondNumber));
		System.out.println("�˷������"+mm.mul(fristNumber, secondNumber));
		System.out.println("���������"+mm.div(fristNumber, secondNumber));
	}
}
