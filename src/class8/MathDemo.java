package class8;

import java.util.Random;

/*
 * Math：类包含用于执行基本数学运算的方法
 * 
  * 由于Math在java.lang下，所以不需要导包
 * 特点：
 * 	没有构造方法，因为它的成员全部是静态的。
 * 
 * 掌握有个方法：
 * 		获取随机数
 * 		public static double random()
 * 		返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。返回值是一个伪随机选择的数
 */

public class MathDemo {
	public static void main(String[] args) {
		//获取随机数
		double d = Math.random();
		System.out.println(d);
		
		//需求：我要取一个1-100之间的随机数，肿么办？
		//随机数的范围是大于等于 0.0 且小于 1.0，所以随机数*100的范围是0-99
		//所以取一个1-100之间的随机数：（随机数*100）+1
		for(int x=0;x<100;x++) {
			int number = (int)(Math.random()*100)+1;
			System.out.println(number);	
		}
	}
}
