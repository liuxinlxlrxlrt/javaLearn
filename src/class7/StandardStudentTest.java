package class7;

public class StandardStudentTest {

	public static void main(String[] args) {
		//方式1给成员变量赋值
		//无参构造+setXxx()
		StandardStudent s1 = new StandardStudent();
		s1.setName("周慧敏");
		s1.setAge(25);
		//输出值
		System.out.println(s1.getName()+"---"+s1.getAge());
		s1.show();
		System.out.println("--------------------");
		//方式2给成员变量赋值
		StandardStudent s2 = new StandardStudent("杨铭铭",22);
		System.out.println(s2.getName()+"---"+s2.getAge());
		s2.show();
	}

}
