package class7;

public class StandardStudentTest {

	public static void main(String[] args) {
		//��ʽ1����Ա������ֵ
		//�޲ι���+setXxx()
		StandardStudent s1 = new StandardStudent();
		s1.setName("�ܻ���");
		s1.setAge(25);
		//���ֵ
		System.out.println(s1.getName()+"---"+s1.getAge());
		s1.show();
		System.out.println("--------------------");
		//��ʽ2����Ա������ֵ
		StandardStudent s2 = new StandardStudent("������",22);
		System.out.println(s2.getName()+"---"+s2.getAge());
		s2.show();
	}

}
