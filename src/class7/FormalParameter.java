package class7;

//��ʽ����Formal parameters
/*
 * ��ʽ���������⣺
 * 		�������ͣ���ʽ�����ĸı䲻Ӱ��ʵ�ʲ���
 * 		�������ͣ���ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ���
 */
//��ʽ�����ǻ�������
class Demo01{
	public int sum(int a, int b) {
		return a+b;
	}
}
//��ʽ��������������
class Student01{
	public void show() {
		System.out.println("�Ұ�ѧϰ");
	}
}
class StudentDemo01{
	//����㿴����һ��������ʽ������һ�����ࡰ����(��������).������ʵ��Ҫ���Ǹ���Ķ���
	public void mothod(Student01 s) {//���õ�ʱ�򣬰�main�����е�s�ĵ�ַ���ݵ�������Student s = new Student();
		s.show();
		//��δ���class StudentDemo����mothod������
	}
}
public class FormalParameter {
	public static void main(String[] args) {
		//��ʽ�����������͵ĵ���
		Demo01 d = new Demo01();
		int result = d.sum(10, 20);
		System.out.println("result:"+result);
	
		//��ʽ�������������͵ĵ���
		//������Ҫ����StudentDemo���е�mothod()����
		StudentDemo01 sd = new StudentDemo01();
		//����ѧ������
		Student01 s = new Student01();
		sd.mothod(s);
	}
}
