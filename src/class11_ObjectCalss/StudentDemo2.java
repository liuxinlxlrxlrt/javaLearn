package class11_ObjectCalss;
/*
 * public String toString()
 * 
 * Integer类下的一个静态方法:
 * 		public static String toHexString(int i):把一个整数转成一个十六进制表示的字符串
 * 
 * 这个信息的组成我们讲解完毕了，但是这个信息是没有任何意义的，所以建议所有子类都重写该方法
 * 
 * 怎么重写呢？
 * 		把该类的所有成员变量值组成返回即可
 * 
 * 重写的自动版方案就是自动生成toString()方法
 * 
 *注意：
 *   直接输出一个对象的名称，其实就是调用该对象的toString()方法
 */

public class StudentDemo2 {
	public static void main(String[] args) {
		Student2 s5 = new Student2();
		System.out.println(s5.hashCode());
		System.out.println(s5.getClass());
		System.out.println(s5.getClass().getName());
		System.out.println("-------------");
		System.out.println(s5.toString());
		//结果是：class11_ObjectCalss.Student@33909752
		System.out.println("-------------");
		//toString()方法的值等价于它
		//getClass().getName() + '@' + Integer.toHexString(hashCode())
		//this.getClass().getName()+'@'+Integer.toHexString(hashCode())
		System.out.println(s5.getClass().getName()+'@'
				+Integer.toHexString(s5.hashCode()));
		System.out.println("-------------");
		System.out.println(s5.toString());
		
		//直接输入对象的名称
		System.out.println(s5);
	}
}
