package class4;

/*
 * if����ע������
 *   A:��ϵ���ʽ���ۼ򵥻��Ǹ��ӣ����������boolean����
 *   B:if�����Ƶ�����������һ����䣬�����ſ���ʡ�ԣ�
 *     ����Ƕ�����䣬�Ͳ���ʡ�ԡ�������Զ��Ҫʡ��
 *   C:һ����˵����������ž�û�зֺţ��зֺž�û���������
 */

public class ChooseStructureDemo1NoticeOfif {

	public static void main(String[] args) {
		int x = 10;
		if (x == 10) {
			System.out.println("x����10");
		}
		if (x > 5 || x == 10) {
			System.out.println("x����5�ҵ���10");
		}
		System.out.println("---------------------");
		
		int a = 100;
		if (a == 100) {
			System.out.println("a��ֵ��100");
		}
		if (a != 100) {
			System.out.println("a��ֵ��100");
			System.out.println("over");
		}
		System.out.println("---------------------");
		int b =100;
		if (b != 100) ;//��������Ԥ����ģ�ֻ�����ǿ������
		
		//�����
		{
			System.out.println("b��ֵ��100");
			System.out.println("over");
		}
	}
}
