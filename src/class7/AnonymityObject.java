package class7;
/*
 * �������󣺾���û�����ֵĶ���
			�Ƕ����һ�ּ򻯱�ʾ��ʽ
			
	�������������ʹ�����
		A:������÷�������һ�ε�ʱ��
				ע�⣺���ö�ε�ʱ�򣬲��ʺ�
				��ô����������������ʲô�ô��أ�
				     �У��������������Ϻ�������������Ա���������������
		B:������Ϊʵ�ʲ�������
 */
class Student02{
	public void show() {
		System.out.println("�Ұ�ѧϰ");
	}
}
class StudentDemo02{
	//����㿴����һ��������ʽ������һ�����ࡰ����(��������).������ʵ��Ҫ���Ǹ���Ķ���
	public void mothod(Student02 s) {//���õ�ʱ�򣬰�main�����е�s�ĵ�ַ���ݵ�������Student s = new Student();
	s.show();
	//��δ���class StudentDemo����mothod������
	}
}
public class AnonymityObject {
		public static void main(String[] args) {
			//�����ֵĶԵ���
			//ͬһ����������η���
			Student02 s = new Student02();
			s.show();
			s.show();
			System.out.println("-------");
			//��������
			//new Student();
			//����������÷���
			new Student02().show();
			new Student02().show();//������ʵ�����´�����һ���µĶ���
			System.out.println("-------");
			
			//����������Ϊʵ�ʲ�������
			//������Ҫ����StudentDemo���е�mothod()����
			StudentDemo02 sd = new StudentDemo02();
			//����ѧ������
			//Student ss = new Student();
			//sd.mothod(ss);//�����ss��һ��ʵ�ʲ���
			//��������
			sd.mothod(new Student02());
			
			//����һ��
			new StudentDemo02().mothod(new Student02());
		}
}
