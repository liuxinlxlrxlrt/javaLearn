package class5;
/*
 * ���󣺼���¼��һ������n(1<=n<=9)�������Ӧ��nn�˷���
 * 
 * 
 */
import java.util.Scanner;

public class FunctionDemo02Test02 {

	public static void main(String[] args) {
		//��������
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������n��ֵ:(1-9)");
		int n = sc.nextInt();
		
		//����
		pringNN(n);
	}
	/*
	 * ����:�����Ӧ��nn�˷���
	 * ����ֵ���ͣ�void
	 * �����б�int n
	 */
	
	public static void pringNN(int n) {
		for(int x=1;x<=n;x++) {
			for(int y=1;y<=x;y++) {
				System.out.print(y+"*"+x+"="+x*y+"\t");
			}
			System.out.println();
		}
	}

}
