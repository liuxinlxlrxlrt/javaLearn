package class4;

/*
 * 需求：求出1-10之间数据之和
 * 分析（求和思想sum +=x;）：
 * 	0+1=1
 * 		1+2=3
 * 			3+3=6
 * 				6+4=10
 * 					10+5=15
 * 						...
 *    由此可见我们要定义两个变量：
 *    	一个变量用于存储第一个加数，第一个加数其实保存的是以前的所有数据和，默认初始化值是0
 *    	一个变量用于存储第二个加数，第二个加数其实就是每次的数据变化的值。
 */

public class ChooseStructureDemo3forFormat03 {

	public static void main(String[] args) {
		//原始做法
		System.out.println(1+2+3+4+5+6+7+8+9+10);
		
		int sum =0;
		//定义第一个加数
		for(int x=1;x<=10;x++) {
			//sum =sum+x;
			//*0+1=2
			 // 1+2=3
			 //		3+3=6
			 // 			...
			 
			sum +=x;
		}
		System.out.println(sum);
	}
}
