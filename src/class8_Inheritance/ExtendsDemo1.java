package class8_Inheritance;
/*
 *�̳и�����
 *		�Ѷ��������ͬ�����ݸ���ȡ�������嵽һ������
 *
 * ���ʵ�ּ̳��أ�
 * 		Java�ṩ�˹ؼ��֣�extends
 * 
 * ��ʽ��
 * 		class ������ extends ������{}
 * 
 * �ô���
 * 		A������˴���ĸ�����
 * 		B������˴����ά����
 * 		C����������֮������˹�ϵ���Ƕ�̬��ǰ��
 * 	����������˹�ϵ����ʵ��Ҳ�Ǽ̳е�һ���׶ˣ��������Ժ�ǿ
 * 
 * ������ԭ�򣺵���ϣ����ھ�
 * ��ϣ�������Ĺ�ϵ
 * �ھۣ������ڻ������ĳ�����������
 * 
 */

//ʹ�ü̳�ǰ
//class Student{
//	public void eat() {
//		System.out.println("�Է�");
//	}
//	
//	public void sleep() {
//		System.out.println("˯��");
//	}
//}
//
//class Teacher{
//	public void eat() {
//		System.out.println("�Է�");
//	}
//	
//	public void sleep() {
//		System.out.println("˯��");
//	}
//}

//ʹ�ü̳к�
class Person1 {
	public void eat() {
		System.out.println("�Է�");
	}

	public void sleep() {
		System.out.println("˯��");
	}
}

class Student extends Person1 {
}

class Teacher extends Person1 {
}

public class ExtendsDemo1 {
	public static void main(String[] args) {
		Student s = new Student();
		s.eat();
		s.sleep();
		System.out.println("-----------------");
		Teacher t = new Teacher();
		t.eat();
		t.sleep();
	}
}
