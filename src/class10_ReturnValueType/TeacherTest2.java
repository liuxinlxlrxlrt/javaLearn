package class10_ReturnValueType;

/*
* 返回值类型：
 * 		基本类型：
 * 		引用类型：
 * 			类：返回的是该类的对象
 * 			抽象类：返回的是该抽象类的该子类对象
 * 			接口：返回的是该接口的实现类的对象
 */
//接口作为返回值类型
interface Love{
	public abstract void love();
}
class LoveDemo{
	public Love getLove() {
		//l;l = new Teacher();
		//Love l = new Teacher();//多态
		//return l;
		return new Teacher();
	}
}
	//定义具体类实现接口
class Teacher implements Love{
	public void love() {
		System.out.println("老师爱学生,爱java,爱刘烨(张晓曦)");
	}
}

public class TeacherTest2 {
	public static void main(String[] args) {
		//需求：我要测试Love类中love()方法
		LoveDemo ld = new LoveDemo();
		Love l = ld.getLove();
		l.love();
	}
}
