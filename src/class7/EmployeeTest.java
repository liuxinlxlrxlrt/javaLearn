package class7;

public class EmployeeTest {
	public static void main(String[] args) {
		//��������
		Employee e = new Employee();
		//����Ա������ֵ
		e.setemployeeId("���ǲ���9727");
		e.setName("�Ʋ���");
		e.setAge(22);
		//��ȡ����
		System.out.println(e.getemployeeId()+"-"+e.getName()+"-"+e.getAge());
		e.show();
	}
}
