package class7;

/*
 * һ����׼��������հ棺
 * ѧ���ࣺ
 * 		��Ա����
 * 			name,age
 * 		���췽����
 * 			�޲Σ�����������
 * 		��Ա������
 * 			getXxx()/setXxx()
 * 			show():�����������г�Ա����ֵ
 * 
 * ����Ա������ֵ��
 * 		A��setXxx()����
 * 		B�����췽��
 * �����Ա������ֵ�ķ�ʽ��
 * 		A��ͨ��getXxx()�ֱ��ȡȻ��ƴ��
 * 		B��ͨ��ͨ��show()�����㶨
 * 
 */

public class StandardStudent {
	//����
	private String name;
	//����
	private int age;
	//���췽��
	public StandardStudent() {
		
	}
	
	public StandardStudent(String name,int age) {
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
	
	//�������еĳ�Ա����ֵ
	public void show() {
		System.out.println(name+"---"+age);
	}

}


