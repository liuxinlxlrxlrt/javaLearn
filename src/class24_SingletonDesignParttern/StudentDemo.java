package class24_SingletonDesignParttern;

/*
 * 单例模式：保证类在内存中只有一个对象
 * 
 * 如何保证类在内存中只有一个对象呢？
 * 		A：把构造方法私有
 * 		B：在成员位置自己造一个对象
 * 		C：通过一个公共的方法提供访问
 */

public class StudentDemo {

	public static void main(String[] args) {
//		Student s1 = new Student();
//		Student s2 = new Student();
//		System.out.println(s1 == s2);//false
//		//因为每一个都是在外面重新造的，所以单例模式最主要的解决的问题就是不让别人造对象
//		//只要别人能造对象，你就不可能是单例模式
		
		//通过单例如何得到对象呢？
		
//		Student.s = null;
		Student s1 = Student.getStudent();
		Student s2 = Student.getStudent();
		System.out.println(s1 == s2);//true
		
		System.out.println(s1);//null
		System.out.println(s2);//null
		//s1=s2=null无意义，不能让外界直接修改s的值
	}

}
