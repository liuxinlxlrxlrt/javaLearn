package class7;
/*
 * һ����׼�Ĵ������հ�
 * 
 * ѧ���ࣺ
 * 		��Ա������
 * 			name,age
 * 		���췽����
 * 			�޲Σ���������
 * 		��Ա������
 * 			getXxx()/setXxx()
 * 			show():�����������г�Ա����ֵ
 * 
 * ����Ա������ֵ:
 * 		A��setXxx()����
 * 		B�����췽��
 * 
 * �����Ա����ֵ�ķ�ʽ��
 * 		A��ͨ��getXxx()�ֱ��ȡȻ��ƴ��
 * 		B��ͨ������show�����㶨
 */
class Student11{
	//����
	private String name;
	//����
	private int age;
	//�޲ι��췽��
	public Student11(){
	}
	//���ι���
	public Student11(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//������еĳ�Ա����ֵ
	public void show() {
		System.out.println(name+"---"+age);
	}
}

public class StudentTest03 {

	public static void main(String[] args) {
		//��ʽ1����Ա������ֵ
		//�޲ι���+setXxx()
		Student11 s1 = new Student11();
		s1.setName("�µ���");
		s1.setAge(32);
		//���ֵ
		System.out.println(s1.getName()+"---"+s1.getAge());
		s1.show();
		
		//��ʽ��2����Ա������ֵ
		Student11 s2 = new Student11("���",26);
		System.out.println(s1.getName()+"---"+s1.getAge());
		s1.show();
	}
}
