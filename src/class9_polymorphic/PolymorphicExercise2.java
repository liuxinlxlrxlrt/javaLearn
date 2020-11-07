package class9_polymorphic;
/*
 * 不同地方饮食文化不同的案例
 */
class Person{
	public void eat() {
		System.out.println("吃饭");
	}
}
class SouthPerson extends Person{
	public void eat() {
		System.out.println("吃米饭");
	}
	public void business() {
		System.out.println("经商");
	}
}

class NorthPerson extends Person{
	public void eat() {
		System.out.println("炖菜,吃馒头");
	}
	public void research() {
		System.out.println("研究");
	}
}

public class PolymorphicExercise2 {
	public static void main(String[] args) {
		//测试
		Person p = new SouthPerson();
		p.eat();
		System.out.println("-----");
		SouthPerson sp = (SouthPerson)p;
		sp.eat();
		sp.business();
		System.out.println("------");
		p = new NorthPerson();
		p.eat();
		System.out.println("------");
		NorthPerson np= (NorthPerson)p;
		np.eat();
		np.research();
	}
}
