package class4;

/*
 * ���������һ��4��5�е�����ͼ��
 * 
 * ѭ��Ƕ�ף�����ѭ������ѭ���屾����һ��ѭ�����
 * 
 * ͨ���������֪��������һ������
 * 		��ѭ������������
 * 		��ѭ����������
 */

public class ChooseStructureDemo6Test01 {
	public static void main(String[] args) {
		//ԭʼ����
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("-----------------------");
		
		//��Ȼ����������󣬵��ǲ��Ǻܺ�
		//����Ƕ��ж��оͻ�Ƚ��鷳
		//��θĽ��أ�
		//�����һ���ϴ����ɡ�*�������������ظ��ģ��������Ǿ���ѭ���Ľ�
		for(int y=1;y<=5;y++) {
			System.out.print("*");
		}
		//���ǿ���ͨ���յ����ʵ�ֻ���
		System.out.println();
		System.out.println("-----------------------");
		
		//��ӡ���ڶ���
		for(int y=1;y<=5;y++) {
			System.out.print("*");
		}
		//���ǿ���ͨ���յ����ʵ�ֻ���
		System.out.println();
		System.out.println("-----------------------");
		
		//ͬ���Ĵ������4�Σ�˵�����ǳ���д�Ĳ��ã���ѭ���Ľ�
		for(int x=1;x<5;x++) {
			for(int y=1;y<=5;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
