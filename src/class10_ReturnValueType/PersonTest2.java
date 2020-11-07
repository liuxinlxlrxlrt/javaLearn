package class10_ReturnValueType;

/*
* 返回值类型：
 * 		基本类型：
 * 		引用类型：
 * 			类：返回的是该类的对象
 * 			抽象类：返回的是该抽象类的该子类对象
 * 			接口：
 */
//抽象类作为返回值类型
abstract class Person{
	public abstract void study();
}
class PersonDemo{
	public Person getPerson(){
		//Person p = new Student();
		//return p; 
		return new Student();
	}
	
class Student extends Person{
		public void study() {
			System.out.println("Good Good study,Day up");
		}
	}
}

public class PersonTest2 {
	public static void main(String[] args) {
		//需求：我要使用Person类中的study()方法
		PersonDemo pd = new PersonDemo();
		//pd.getPerson()=new Student();
		//Person p = new Student();//多态
		Person p =pd.getPerson();
		p.study();
	}
}
