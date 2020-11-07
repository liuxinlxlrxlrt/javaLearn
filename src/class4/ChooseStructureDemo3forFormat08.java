package class4;

/*
 * 需求：统计“水仙花数”有多少个
 * 
 * 分析：
 * 		A：首先必须知道什么是水仙花数
 * 			所谓的水仙花数指一个三位数，其个位数字的立方和等于该数本身
 * 			举例：153就是一个水仙花数
 * 			153 = 1*1*1+5*5*5+3*3*3=1+125+27
 * 		B：定义一个统计变量，初始化值
 * 		C:三位数告诉了什么范围，所以for循环就可以搞定
 * 		D:获取一个三位数的个，十，百的数据
 * 		E：按照要求进行判断
 * 		F：如果满足要求就计数
 */

public class ChooseStructureDemo3forFormat08 {
	public static void main(String[] args) {
		//定义统计变量，初始化值是0
		int count = 0;
		for(int x = 100;x<1000;x++) {
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
			
		    if(x == (ge*ge*ge+shi*shi*shi+bai*bai*bai)) {
		    	//如果相同，就把该数据在控制台输出
		    count++;
		    }
		}
		System.out.println("水仙花数共有"+count+"个");
	}
}
