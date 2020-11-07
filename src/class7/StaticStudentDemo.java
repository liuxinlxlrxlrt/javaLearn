package class7;

public class StaticStudentDemo {
	public static void main(String[] args) {
		StaticStudent ss = new StaticStudent();
		System.out.println(ss.num);
		
		//
		System.out.println(StaticStudent.num2);
		System.out.println(ss.num2);
	}
}
