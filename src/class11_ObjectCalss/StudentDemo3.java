package class11_ObjectCalss;
/*
 * public boolean equals(Object obj):指示其他某个对象是否与此对象“相等”。 
 * 这个方法默认比较的是地址值,比较地址值意义不大，所以我们要重写该方法
 * 怎么重写 呢？
 * 	一般是用来比较对象的成员变量值是否相同。
 * 
 * 重写代码的优化：提高效率，提高程序的健壮性
 * 最终版：
 * 		其实还是自动生成
 * 
 * 看源码：
 *    public boolean equals(Object obj) {
 *     //this=s1
 *     //obj=s2
        return (this == obj);
    }
    
 * ==:
 * 		基本类型：比较的就是指是否相同
 * 		引用类型：比较的就是地址值是否相同
 * 		
 * equals方法：
 * 		引用类型：默认情况，下比较的是地址值
 * 		不过，根据情况重写该方法，一般重写都是自动生成，比较对象的成员变量值是否相同。
 */

public class StudentDemo3 {
	public static void main(String[] args) {
		Student3 s1 = new Student3("梁田",22);
		Student3 s2 = new Student3("梁田",22);
		System.out.println(s1==s2);//false
		Student3 s3 =s1;
		System.out.println(s1 == s3);//true
		System.out.println("---------------");
		System.out.println(s1.equals(s2));//obj=21;false
//		 * 看源码：
//		 *    public boolean equals(Object obj) {
//		 *     //this=s2
//		 *     //obj=s1
//		        return (this == obj);
//		    }
		System.out.println(s1.equals(s1));
		System.out.println(s1.equals(s3));
		System.out.println("------------");
		Student3 s4 = new Student3("刘烨",25);
		System.out.println(s1.equals(s4));
		System.out.println("------------");
		
		
		Demo d = new Demo();
		System.out.println(s1.equals(d));
		//ClassCastException:obj接收的Demo
		//向下转型出现问题：Student3 s6 = (Student3)obj;
	}
}
class Demo{
	
}

