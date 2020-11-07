package class10_FormalParameter;
/*
 * 形式参数：
 * 		基本类型
 * 		引用类型：
 * 			类：(匿名对象的时候其实外面已经讲过了)需要的是该类的对象
 * 			抽象类：需要的是该抽象类的子类对象
 * 			接口：
 */
//抽象类作为形式参数
abstract class Person{
	public abstract void study();
}

class PersonDemo{
	public void method(Person p) {
		//p;p = new Student1();Person p = new Student1();//多态
		p.study();
	}
}
//定义一个具体的学生类
class Student1 extends Person{
	public void study() {
		System.out.println("Good Good study,Day up");
	}
}
public class PersonTest {

	public static void main(String[] args) {
		//目前是没有办法使用的
		//因为抽象类没有对应的具体类
		//那么我们就应该定义一个具体类
		//需求：我要使用PersonDemo类中的method()方法
		PersonDemo pd = new PersonDemo();
		Person p = new Student1();
		pd.method(p);
		System.out.println("----------------------");
		new PersonDemo().method(new Student1());
	}
}
