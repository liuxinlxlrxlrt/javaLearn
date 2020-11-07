package class4;

/* 
 * 需求：在控制台输出所有的”水仙花数”
 * 
 * 分析：
 * 	我们不知道什么叫“水仙花数”，你让我怎么做呢？
 * 		所谓的水仙花数指一个三位数，其个位数字的立方和等于该数本身
 * 		举例：153就是一个水仙花数
 * 			153 = 1*1*1+5*5*5+3*3*3=1+125+27
 * 		A:三位数其实是该诉了我们范围
 * 		B：通过for循环我们就可以实现获取每一位数
 * 		   但是麻烦是如何获取这三位数的个，十，百位上的数据
 * 
 * 			我们如何获取一个数据的个，十，百呢？
 * 				假设有一个数据：153
 * 				ge：153%10=3
 * 				shi:153/10%10=5
 * 				bai:153/10/10%10=1
 * 				qian:x/10/10/10%10
 *          	wan:x/10/10/10/10/%10
 *          ...
 *          
 * 		C：让"ge*ge*ge+shi*shi*shi+bai*bai*bai"和该数据比较
 * 			如果相同，就把该数输出控制台
 */

public class ChooseStructureDemo3forFormat06 {

	public static void main(String[] args) {
		for(int x = 100;x<1000;x++) {
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
			
			//让"ge*ge*ge+shi*shi*shi+bai*bai*bai"和该数据比较
		    if(x == (ge*ge*ge+shi*shi*shi+bai*bai*bai)) {
		    	//如果相同，就把该数据在控制台输出
		    	System.out.println(x);
		    }
		}
	}
}
