package class7;
/*
 * static�ؼ��ֵ�ע�����
 * 		A���ھ�̬��������û��this�ؼ��ֵ�
 * 			�������أ�
 * 			��̬��������ļ��ض����أ�
 * 			this�Ƕ��Ŷ���Ĵ��������ڵ�
 * 			��̬�ȶ����ȴ���
 * 		B����̬����ֻ�ܷ��ʾ�̬�ĳ�Ա�����;�̬�ĳ�Ա����
			��̬������
				��Ա������ֻ�ܷ��ʱ���
				��Ա������ֻ�ܷ��ʾ�̬��Ա����
			�Ǿ�̬������
 * 				��Ա���������Է��ʾ�̬�ģ�Ҳ���Է��ʷǾ�̬����
 * 				��Ա���� �����Է��ʾ�̬�ģ�Ҳ���Է��ʷǾ�̬����
 * 			�򵥼ǣ�
 * 				��ֻ̬�ܷ��ʾ�̬
 * 				�Ǿ�̬���Է���һ��
 * 
 */

public class Teacher {
	public int num = 10;
	public static int num2 = 20;
	
	public void show() {
		//�����ĸ�������ʵ��ǳ�Ա����
		System.out.println(num);
		//��ȷ�ĵĸ�������ʵ��ǳ�Ա����
		System.out.println(this.num);
		System.out.println(num2);
//		function();
//		function2();
	}
	
	public static void method() {
		//�޷��Ӿ�̬�����������÷Ǿ�̬ ���� num
		//System.out.println(num);
		System.out.println(num2);
		//function();
		function2();
	}
	
	public void function() {}
	
	public static void function2() {
		
	}
}
