package class12_String;

import java.util.Scanner;

/*
 * ģ���½�������λ��ᣬ����ʾ���м���,�����½�ɹ����Ϳ����������С��Ϸ��
 * 
 * ������
 * 		A�����ȶ����û������룬�Ѵ��ڵ�
 * 		B������¼���û���������
 * 		C���Ƚ��û���������
 * 				�������ͬ�����½�¹�
 * 				�����һ����ͬ�����½ʧ��
 * 		D�������λ��ᣬ��ѭ���Ľ��������forѭ��
 */

public class StringTest2 {

	public static void main(String[] args) {
		//���ȶ����û������룬�Ѵ��ڵ�
		String username = "admin";
		String password = "admin";
		
		for(int x = 0;x<3;x++) {
		//����¼���û���������
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û�����");
		String name = sc.nextLine();
		System.out.println("���������룺");
		String pwd = sc.nextLine();
		
		//�����λ��ᣬ��ѭ���Ľ��������forѭ��
		
		//�Ƚ��û���������
		if(name.equals(username) && pwd.equals(password)) {
			//�������ͬ�����½�¹�
			System.out.println("��½�ɹ�����ʼ����Ϸ");
			//��������Ϸ
			GuessNumberGame.start();
			break;
		}else {
			//�����һ����ͬ�����½ʧ��
			//2,1,0
			//����ǵ�0�Σ�Ӧ�û�һ����ʾ
			if((2-x)==0) {
			System.out.println("�˺ű�����������೤��ϵ");	
			}else {
			System.out.println("��½ʧ��,�㻹��"+(2-x)+"�λ���");
			}
			}
		}
	}

}
