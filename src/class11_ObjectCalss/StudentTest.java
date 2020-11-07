package class11_ObjectCalss;
/*
 * Object：类Object是类层次结构的根类。每个类都使用 Object 作为超类
 * 所有类都直接或者间接的继承自该类
 * 
 * Object的方法  ：
 *      public int hashCode()：返回该对象的哈希码值
 * 		  注意：哈希值是根据哈希算法计算出的一个值，这个值和地址值有关，但不是地址值
 * 				你可以理解为地址值
 * 		
 * 		public final Class getClass()
 * 			class类的方法：
 * 				public String getName()：以 String 的形式返回此 Class 对象所表示的实体（类、接口、数组类、基本类型或 void）名称。 
 */

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.hashCode());
		//结果是：865113938
		
		Student s2 = new Student();
		System.out.println(s2.hashCode());
		//结果是：1442407170
		
		Student s3 = new Student();
		System.out.println(s3.hashCode());
		//结果是：1028566121
		System.out.println("---------------");
		Student s4 = new Student();
		Class c = s4.getClass();
		String str = c.getName();
		System.out.println(str);
		
		//链式编程
		String str2 = s.getClass().getName();
		System.out.println(str2);
	}
}
