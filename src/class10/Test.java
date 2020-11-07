package class10;
/*
 * test类，测试
 * 
 * 导包
	格式：import 包名;
	注意：
		这种方式导入是到类的名称。
		虽然可以最后写*，但是不建议。
		
	package,import,class有没有顺序关系(面试题)
		有。
		package->import->class
		
		Package:只能有一个
		import:可以有多个
		class:可以有多个，以后建议是一个

 */
import class10_FormalParameter.Demo;

public class Test {

	public static void main(String[] args) {
		System.out.println("也不是很卡");
		//Demo d = new Demo();
//		class10_FormalParameter.Demo d = new class10_FormalParameter.Demo();
//		System.out.println(d.sum(10,20));
//		class10_FormalParameter.Demo d2 = new class10_FormalParameter.Demo();
//		System.out.println(d.sum(10,20));
//		class10_FormalParameter.Demo d3 = new class10_FormalParameter.Demo();
//		System.out.println(d.sum(10,20));
//		class10_FormalParameter.Demo d4 = new class10_FormalParameter.Demo();
//		System.out.println(d.sum(10,20));
	}
}
/*
 * 第一个问题：找不到Demo
 * 第二个问题：程序包class10_FormalParameter不存在
 * 第三个问题：Demo中class10_FormalParameter不是公共的，无法从外部中进行访问
 * 
 */
