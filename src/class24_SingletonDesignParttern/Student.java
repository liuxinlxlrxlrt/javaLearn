package class24_SingletonDesignParttern;

public class Student {
	//����˽��
	private Student (){
	}
	
	//�Լ���һ������
	//��̬����ֻ�ܷ��ʾ�̬��Ա����
	//s�Ǿ�̬�ģ�������ļ��ض�����
	//s�Ǿ�̬����������ͨ������ֱ�ӷ���
	//Ϊ�˲�Ȼ�����ֱ���޸����ֵ����private
	//����ʽ����ģʽ
	private static Student s = new Student();
	
	//�ṩ�����ķ��ʵķ�ʽ
	//�Ǿ�̬��ͨ�������
	//Ϊ�˱�֤����ܹ�ֱ��ʹ�ø÷������Ӿ�̬
	public static Student getStudent() {
		return s;
	}
}
