package class8_Inheritance;
/*
 * 类的组成：
 * 		成员变量：
 * 		构造方法：
 * 		成员方法：
 * 而现在我们又将了继承，所以我们就应该考虑一下，类的组成部分的各自关系
 * 
 * 继承中成员变量的关系：
 * 		A:子类中成员变量和父类中的成员变量名称不一样
 * 		B:子类中成员变量和父类中的成员变量名称不一样
 * 			在子类方法中访问一个变量的查找顺序(就近原则)：
 * 				a:在子类方法的局部范围找，有就使用
 * 				b:在子类的成员范围找，有就使用
 * 				c:在父类的成员范围找，有就使用
 * 
 * 
 * 
 */
class Father5{
	public int num = 10;
	
	public void method() {
		int num = 50;
	}
}
class Son5 extends Father5{
	public int num2 =20;
	public int num = 30;
	
	public void show() {
		int num = 40;
		System.out.println(num);
		System.out.println(num2);
//		System.out.println(num3);//错误
	}
}

public class ExtendsDemo5 {
		public static void main(String[] args) {
			//创建对象
			Son5 s = new Son5();
			s.show();
		}
}
