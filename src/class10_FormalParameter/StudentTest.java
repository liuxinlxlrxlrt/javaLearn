package class10_FormalParameter;
/*
 * 形式参数：
 * 		基本类型
 * 		引用类型：
 * 			类：(匿名对象的时候其实外面已经讲过了)需要的是该类的对象
 * 			抽象类：
 * 			接口：
 */
//类作为形式参数
class Student{
	public void study(){
		System.out.println("Good Good study,Day up");
	}
}
class StudentDemo{
	public void method(Student s) {//类作为形参
		//ss,ss= newnew Student();Student s = new Student();
		s.study();
	}
}

public class StudentTest {
	public static void main(String[] args) {
		//需求：我要测试Student类的study()方法
		Student s = new Student();
		s.study();
		System.out.println("------------------");
		//需求：我要测试StudentDemo类的study()方法
		StudentDemo sd = new StudentDemo();
		Student ss = new Student();
		sd.method(ss);
		System.out.println("------------------");
		//匿名对象用法
		//匿名对象调方法,参数是对象
		new StudentDemo().method(new Student());
	}
}
