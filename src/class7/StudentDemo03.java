package class7;
/*
 * �����ɣ���Ա��������Ա����
 * ���������ּ���һ���µĳ�Ա�����췽��
 * �Ժ����������ɣ�
 * 		��Ա����
 * 		���췽��
 * 		��Ա����
 * 			���ݷ���ֵ���ͣ�
 * 				void����
 * 				��void����
 * 			��ʽ������
 * 				�ղη���
 * 				�ǿղη���   
 */

class Student10{
	public String getString() {
		return "helloworld";
	}
	public void show() {
		System.out.println("show");
	}
	
	public void method(String name) {
		System.out.println(name);
	}
	
	public String function(String s1,String s2) {
		return s1+s2;
	}
}

public class StudentDemo03 {

	public static void main(String[] args) {
		//��������
		Student10 s = new Student10();
		
		//�����޲��޷���ֵ����
		s.show();
		
		//�����޲��з���ֵ����
		String result = s.getString();
		System.out.println(result);
		
		//���ô����޷���ֵ����
		s.method("�Խ");
		
		//���ô��δ�����ֵ�ķ���
		String result2 = s.function("hello", "world");
		System.out.println(result2);
	}
}
