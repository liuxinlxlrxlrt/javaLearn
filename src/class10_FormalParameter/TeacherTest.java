package class10_FormalParameter;
/*
 * 形式参数：
 * 		基本类型
 * 		引用类型：
 * 			类：(匿名对象的时候其实外面已经讲过了)需要的是该类的对象
 * 			抽象类：需要的是该抽象类的子类对象
 * 			接口：需要的是该 接口的实现类对象
 */
//接口作为形式参数
//定义一个爱好的接口
interface Love{
	public abstract void love();
}
class LoveDemo{
	public void method(Love l) {
		//l;l = new Teacher();Love l = new Teacher();//多态
		l.love();
	}
}
//定义具体类实现接口
class Teacher implements Love{
	public void love() {
		System.out.println("老师爱学生,爱java,爱刘烨(张晓曦)");
	}
}

public class TeacherTest {
	public static void main(String[] args) {
		//需求：我要测试LoveDemo类中love()方法
		LoveDemo ld = new LoveDemo();
		Love l = new Teacher();
		l.love();
		System.out.println("---------------");
		new LoveDemo().method(new Teacher());
	}
}
