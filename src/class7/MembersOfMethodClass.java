package class7;
/*
 * �����ɣ���Ա��������Ա����
 * ���������ּ�����һ���µĳ�Ա�����췽��
 * �Ժ����������ɣ�
 * 		��Ա����
 * 		���췽��
 * 		��Ա����
 * 			���ݷ���ֵ
 * 				void����
 * 				��void����
 * 			��ʽ����
 * 				�ղη���
 * 				�ǿղη���
 * 
 */
class Student08{
	public String getString() { 
		return "hellworld";
	}
	public void show() {
		System.out.println("show");
	}
	public void method(String name) {
		System.out.println(name);
	}
	public String function(String s1, String s2) {
			return s1+s2;
	}
}	

public class MembersOfMethodClass {

	public static void main(String[] args) {
		//��������
		Student08 s = new Student08();
		
		//�����޲��޷���ֵ����
		s.show();
		//�����޲��з���ֵ����
		String result = s.getString();
		System.out.println(result);
		//���ô����޷���ֵ����
		s.method("��֮��");
		
		//���ô��δ�����ֵ����
		String result2 = s.function("hello", "world");
		System.out.println(result2);
	}
}


