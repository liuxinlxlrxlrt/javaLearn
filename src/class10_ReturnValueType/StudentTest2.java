package class10_ReturnValueType;
/*
 * ����ֵ���ͣ�
 * 		�������ͣ�
 * 		�������ͣ�
 * 			�ࣺ���ص��Ǹ���Ķ���
 * 			�����ࣺ
 * 			�ӿڣ�
 */
class Student{
	public void study(){
		System.out.println("Good Good study,Day up");
	}
}
class StudentDemo{
	public Student getStudent() {
		//Student s = new Student();
		//Student ss =s;
		//Student s = new Student();
		//return s;
		return new Student();
	}
}
public class StudentTest2 {

	public static void main(String[] args) {
		//������Ҫ����Student���study()����
		//���ǣ���һ���ҵ�Ҫ���ǣ���Ҫֱ�Ӵ���Student()�Ķ���
		//����ʹ��StudentDemo���㴴������
		StudentDemo sd = new StudentDemo();
		//new Student();Student s = new Student();
		Student s = sd.getStudent();
		s.study();
	}
}
