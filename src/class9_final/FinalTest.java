package class9_final;
/*
 * ������:final���� �ֲ�����������
 * 
 * 	�������ͣ��������͵�ֵ���ܷ����ı�
 * 	�������ͣ��������͵ĵ�ֵַ���ܷ����ı䣬���Ǹö���Ķ��ڴ��ֵ�ǿ��Ըı��
 */
class Student{
	int age =10;
}

public class FinalTest {
	public static void main(String[] args) {
		//
		int x =10;
		System.out.println(x);
		final int y = 10;
		//�޷�Ϊ���ձ���y����ֵ
		//final���λ������ͣ��������͵����ݲ��ܸı�
		//y= 100;
		System.out.println(y);
		System.out.println("----------------");
		//s��ss�ֲ�������������������
		Student s = new Student();
		s.age = 100;
		System.out.println(s.age);
		
		final Student ss = new Student();
		System.out.println(ss.age);
		ss.age =100;
		System.out.println(ss.age);
		//���·����ڴ�ռ�
		//final�����������ͣ��������͵ĵ�ֵַ���ܸı�
		//���ǵ�ֵַ����������ǿ��Ըı��
		//ss = new Student();
	}
}
