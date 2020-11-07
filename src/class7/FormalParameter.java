package class7;

//形式参数Formal parameters
/*
 * 形式参数的问题：
 * 		基本类型：形式参数的改变不影响实际参数
 * 		引用类型：形式参数的改变直接影响实际参数
 */
//形式参数是基本类型
class Demo01{
	public int sum(int a, int b) {
		return a+b;
	}
}
//形式参数是引用类型
class Student01{
	public void show() {
		System.out.println("我爱学习");
	}
}
class StudentDemo01{
	//如果你看到了一个方法形式参数是一个”类“类型(引用类型).这里其实需要的是该类的对象。
	public void mothod(Student01 s) {//调用的时候，把main方法中的s的地址传递到了这里Student s = new Student();
		s.show();
		//如何创建class StudentDemo调用mothod方法？
	}
}
public class FormalParameter {
	public static void main(String[] args) {
		//形式参数基本类型的调用
		Demo01 d = new Demo01();
		int result = d.sum(10, 20);
		System.out.println("result:"+result);
	
		//形式参数是用用类型的调用
		//需求。我要调用StudentDemo类中的mothod()方法
		StudentDemo01 sd = new StudentDemo01();
		//创建学生对象
		Student01 s = new Student01();
		sd.mothod(s);
	}
}
