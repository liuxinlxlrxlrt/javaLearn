package class7;

public class EmployeeTest {
	public static void main(String[] args) {
		//创建对象
		Employee e = new Employee();
		//给成员变量赋值
		e.setemployeeId("传智播客9727");
		e.setName("唐伯虎");
		e.setAge(22);
		//获取数据
		System.out.println(e.getemployeeId()+"-"+e.getName()+"-"+e.getAge());
		e.show();
	}
}
