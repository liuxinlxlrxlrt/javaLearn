package class6;
/*
 * 在一个java文件中写两个类：一个基本的类，一个测试类
 * 注意：文件名和测试类一致
 * 
 * 如何使用呢？
 * 	 	创建对象使用
 * 
 * 何如创建对象呢？
 * 		格式：类名  对象名 = new 类名();
 * 
 * 如何使用成员变量呢？
 * 		对象名.变量名
 * 如何使用成员方法呢？
 * 		对象名.方法名
 */

public class StudentDemo {
	public static void main(String[] args) {
		//格式：类名  对象名 = new 类名();
		Student  s = new Student();
		
		//输出成员变量值
		//System.out.println(s.name);
		//System.out.println(s.age);
		//System.out.println(s.address);
		//改进写法
		System.out.println(s.name+"..."+s.age+"..."+s.address);
		
		//给成员变量赋值
		s.name ="周盺妤";
		s.age = 23;
		s.address = "重庆";
		//赋值后的输出
		System.out.println(s.name+"..."+s.age+"..."+s.address);
		
		//调用方法
		s.study();
		s.eat();
		s.sleep();
	}
}
