package class7;
/*
 * main方法的格式讲解：
 * 		public static void main(String[] args){...}
 * 
 * public :
 * 公共的，访问权限最大，由于main方法是被jvm调用，所以权限要够大
 * static :
 * 静态的，不需要创建对象，通过类名都可以，方便jvm调用
 * void :
 * 因为我们曾经说，方法的返回值是返回给通用这，而main方法是被jvm调用，你返回的内容给jvm没有意义
 * main :
 * 是一种常见的方法入口，我见过的语言都是以main作为入口
 * String[] args :
 * 这是一个字符串数组,值去哪里了？
 * 这个东西到底有什么用啊?怎么给值啊?
 * 		这个东西早期是未给接收键盘录入的数据的
 * 		格式
 * 		cmd命令运行:java MainFormat hello word java
 */

public class MainFormat {
	public static void main(String[] args) {
//	System.out.println(args);//[Ljava.lang.String;@7852e922打的是地址，说明是数组
//	System.out.println(args.length);//0
//	System.out.println(args[0]);//ArrayIndexOutOfBoundsException因为没有值，所以越界了

		// 从接收数据后
		System.out.println(args);
		System.out.println(args.length);
		// System.out.println(args[0]);
		// cmd命令运行:java MainFormat hello word
		for (int x = 0; x < args.length; x++) {
			System.out.println(args[x]);
		}
	}
}
