package class10_FormalParameter;
/*
 * ��ʽ������
 * 		��������
 * 		�������ͣ�
 * 			�ࣺ(���������ʱ����ʵ�����Ѿ�������)��Ҫ���Ǹ���Ķ���
 * 			�����ࣺ��Ҫ���Ǹó�������������
 * 			�ӿڣ���Ҫ���Ǹ� �ӿڵ�ʵ�������
 */
//�ӿ���Ϊ��ʽ����
//����һ�����õĽӿ�
interface Love{
	public abstract void love();
}
class LoveDemo{
	public void method(Love l) {
		//l;l = new Teacher();Love l = new Teacher();//��̬
		l.love();
	}
}
//���������ʵ�ֽӿ�
class Teacher implements Love{
	public void love() {
		System.out.println("��ʦ��ѧ��,��java,������(������)");
	}
}

public class TeacherTest {
	public static void main(String[] args) {
		//������Ҫ����LoveDemo����love()����
		LoveDemo ld = new LoveDemo();
		Love l = new Teacher();
		l.love();
		System.out.println("---------------");
		new LoveDemo().method(new Teacher());
	}
}
