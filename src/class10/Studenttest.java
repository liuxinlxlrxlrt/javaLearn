package class10;
/*
 * ��ʽ��̣�
 * 	ÿ�ε�����Ϸ����󣬷��ص���һ������
 */
class Student{
	public void study(){
		System.out.println("Good Good study,Day up");
	}
}
class StudentDemo{
	public Student getStudent(){
		return new Student();
	}
}

public class Studenttest {

	public static void main(String[] args) {
		//��ε��õ��أ�
		StudentDemo sd = new StudentDemo();
//		Student s = sd.getStudent();
//		s.study();
		
		//���ע����
		//���������,�ٵ�����
		sd.getStudent().study();
		
	}

}
