package class10_ReturnValueType;

/*
* ����ֵ���ͣ�
 * 		�������ͣ�
 * 		�������ͣ�
 * 			�ࣺ���ص��Ǹ���Ķ���
 * 			�����ࣺ���ص��Ǹó�����ĸ��������
 * 			�ӿڣ����ص��Ǹýӿڵ�ʵ����Ķ���
 */
//�ӿ���Ϊ����ֵ����
interface Love{
	public abstract void love();
}
class LoveDemo{
	public Love getLove() {
		//l;l = new Teacher();
		//Love l = new Teacher();//��̬
		//return l;
		return new Teacher();
	}
}
	//���������ʵ�ֽӿ�
class Teacher implements Love{
	public void love() {
		System.out.println("��ʦ��ѧ��,��java,������(������)");
	}
}

public class TeacherTest2 {
	public static void main(String[] args) {
		//������Ҫ����Love����love()����
		LoveDemo ld = new LoveDemo();
		Love l = ld.getLove();
		l.love();
	}
}
