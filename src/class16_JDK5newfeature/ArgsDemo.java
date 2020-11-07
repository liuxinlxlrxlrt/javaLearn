package class16_JDK5newfeature;

/*
 * 可变参数：定义方法的时候不知道该定义多少个参数
 * 格式：
 * 		修饰符 返回值类型 方法名(数据类型…  变量名){
 * 		}
 * 注意：
 * 		a.这里的变量其实是一个数组
 * 		b.如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是最后一个
 */

public class ArgsDemo {
	public static void main(String[] args) {
		// 求和
		int a = 10;
		int b = 20;
		int result = sum(a, b);
		System.out.println("result:" + result);

		// 3个数据的求和
		int c = 30;
		result = sum(a, b, c);
		System.out.println("result:" + result);

		// 4个数据的求和
		int d = 30;
		result = sum(a, b, c, d);
		System.out.println("result:" + result);

		// 需求：我要写一个求和的功能，到底是几个数据求和呢？但是我知道我肯定就知道了
		// 为了这个问题，java就提供了一个东西，叫“可变参数”
		// 5个数据的求和
		result = sum(a, b, c, d, 40);
		System.out.println("result:" + result);

		result = sum(a, b, c, d, 40, 50);
		System.out.println("result:" + result);

	}

	public static int sum(int... a) {
//		System.out.println(a);
//		return 0;

		int s = 0;
		for (int x : a) {
			s += x;
		}
		return s;
	}

//	public static int sum(int a, int b,int c,int d) {
//		return a + b+ c +d;
//	}
//	
//	public static int sum(int a, int b,int c) {
//		return a + b+ c;
//	}
//
//	public static int sum(int a, int b) {
//		return a + b;
//	}
}
