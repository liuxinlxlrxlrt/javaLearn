package class10_FormalParameter;
/*
 * ��ʽ������
 * 		��������
 * 		�������ͣ�
 * 			�ࣺ(���������ʱ����ʵ�����Ѿ�������)��Ҫ���Ǹ���Ķ���
 * 			�����ࣺ
 * 			�ӿڣ�
 */
//����Ϊ��ʽ����
class Student{
	public void study(){
		System.out.println("Good Good study,Day up");
	}
}
class StudentDemo{
	public void method(Student s) {//����Ϊ�β�
		//ss,ss= newnew Student();Student s = new Student();
		s.study();
	}
}

public class StudentTest {
	public static void main(String[] args) {
		//������Ҫ����Student���study()����
		Student s = new Student();
		s.study();
		System.out.println("------------------");
		//������Ҫ����StudentDemo���study()����
		StudentDemo sd = new StudentDemo();
		Student ss = new Student();
		sd.method(ss);
		System.out.println("------------------");
		//���������÷�
		//�������������,�����Ƕ���
		new StudentDemo().method(new Student());
	}
}
