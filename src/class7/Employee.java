package class7;
/*
 *���� :
 *	����һ��Ա����,�Լ�������������Ա��Ȼ�������Ա������
 *	���췽����getXxx()/setXxx()������
 *	�Լ�һ����ʾ���г�Ա��Ϣ�ķ�����������
 *
 *������
 *	Ա����
 *		��Ա������
 *			Ա����ţ����֣�����
 *		���췽����
 *			�޲ι��췽��
 *		��Ա������
 *			getXxx()/setXxx()����
 *			show()
 * 
 */

public class Employee {
	//Ա�����
	private String employeeId;
	//����
	private String name;
	//����
	private int age;
	//���췽��
	public Employee() {}
	
	//getXxx()/setXxx()����
	public String getemployeeId() {
		return employeeId;
	}
	public void setemployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public void setName(String name) {
		this.name =name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	//��ʾ���г�Ա��Ϣ�ķ���
	public void show(){
		System.out.println("Ա�������:"+employeeId+"���������:"+name+"��������"+age);
	}
}
