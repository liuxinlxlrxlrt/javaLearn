package class10_Interface;
/*
 教练和运动员案例(学生分析然后讲解)
		乒乓球运动员和篮球运动员。
		乒乓球教练和篮球教练。
		为了出国交流，跟乒乓球相关的人员都需要学习英语。
		请用所学知识：
		分析，这个案例中有哪些抽象类，哪些接口，哪些具体类。

分析：从具体到抽象
	乒乓球运动员(具体类)：
		成员变量：姓名，年龄
		构造方法：无参，有参
		成员方法：吃饭(),睡觉(),学习()
	篮球运动员(具体类)：
		成员变量：姓名，年龄
		构造方法：无参，有参
		成员方法：吃饭(),睡觉(),学习()
	乒乓球教练(具体类)：
		成员变量：姓名，年龄
		构造方法：无参，有参
		成员方法：吃饭(),睡觉(),教()
	篮球教练(具体类)：
		成员变量：姓名，年龄
		构造方法：无参，有参
		成员方法：吃饭(),睡觉(),教()
	运动员(抽象类):学习()
	教练(抽象类):教()
接口(学习英语)：口语()	
	共性：
		成员变量：姓名，年龄
		构造方法：无参，有参
		成员方法：吃饭(),睡觉()
	
实现:从抽象到具体
使用：使用具体的
*/
//定义一个说英语的接口
interface SpeakEnglish{
	//说英语
	public abstract void speak();
}
//定义人的抽象类
abstract class Person{
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void SetName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void SetAge(int age) {
		this.age = age;
	}
	//睡觉
	public void sleep() {
		System.out.println("人都要睡觉的");
	}
	//吃饭
	public abstract void eat();
}

//定义运动员抽象类
//athlete /'æθlit/ n. 运动员，体育家；身强力壮的人
abstract class Athlete extends Person{
	public Athlete() {}
	
	public Athlete(String name,int age) {
		super(name,age);
	}
	
	//学习
	public abstract void study();
}
//coach/kotʃ/n. 教练；旅客车厢；长途公车；四轮大马车
//vt. 训练；指导vi. 作指导；接受辅导；坐马车旅行
abstract class Coach extends Person{
	public Coach() {}
	
	public Coach(String name,int age) {
		super(name,age);
	}
	
	//学习
	public abstract void teach();
} 
//定义乒乓球运动员具体类
class PingPangAthlete extends Athlete implements SpeakEnglish{
	public PingPangAthlete () {}
	
	public PingPangAthlete(String name,int age) {
		super(name,age);
	}
	
	//吃
	public void eat() {
		System.out.println("吃大白菜，喝小米粥");
	}
	
	//学习
	public void study() {
		System.out.println("学习如何发球和接球");
	}
	
	//说英语
	public void speak() {
		System.out.println("乒乓球运动员学说英语");
	}
}

//定义篮球运动员具体类
class BasketballAthlete extends Athlete{
	public BasketballAthlete () {}
	
	public BasketballAthlete(String name,int age) {
		super(name,age);
	}
	
	//吃
	public void eat() {
		System.out.println("篮球运动员吃牛肉，喝牛奶");
	}
	
	//学习
	public void study() {
		System.out.println("学习如何运球和投篮");
	}
	
}

//定义乒乓球教练具体类
class PingPangCoach extends Coach implements SpeakEnglish{
	public PingPangCoach () {}
	
	public PingPangCoach(String name,int age) {
		super(name,age);
	}
	
	//吃
	public void eat() {
		System.out.println("乒乓球教练吃小白菜，喝大米粥");
	}
	
	//教
	public void teach() {
		System.out.println("乒乓球教练教如何发球和接球");
	}
	
	//说英语
	public void speak() {
		System.out.println("乒乓球教练学说英语");
	}
}
//定义篮球教练具体类
class BasketballCoach extends Coach {
	public BasketballCoach  () {}
	
	public BasketballCoach (String name,int age) {
		super(name,age);
	}
	
	//吃
	public void eat() {
		System.out.println("篮球教练吃羊肉，喝羊奶");
	}
	
	//教
	public void teach() {
		System.out.println("篮球教练教如何运球和投篮");
	}
	
}
public class InterfaceExercise {

	public static void main(String[] args) {
		//测试运动员
		//乒乓球运动员
		PingPangAthlete ppa = new PingPangAthlete();
		ppa.SetName("侯涓");
		ppa.SetAge(26);
		System.out.println(ppa.getName()+"-"+ppa.getAge());
		ppa.eat();
		ppa.study();
		ppa.speak();
		System.out.println("--------------");
		//通过带参构造给数据
		PingPangAthlete ppa2 = new PingPangAthlete("叶珂",27);
		System.out.println(ppa2.getName()+"-"+ppa2.getAge());
		ppa2.eat();
		ppa2.study();
		ppa2.speak();
		System.out.println("--------------");
		//篮球运动员
		Athlete bba = new BasketballAthlete();
		bba.SetName("袁梓优");
		bba.SetAge(28);
		System.out.println(bba.getName()+"-"+bba.getAge());
		bba.eat();
		bba.study();
		System.out.println("--------------");
		//通过带参构造给数据
		Athlete bba2 = new BasketballAthlete("林影",29);
		System.out.println(bba2.getName()+"-"+bba2.getAge());
		bba2.eat();
		bba2.study();
		System.out.println("--------------");		
		//测试教练自己做
	}
}
