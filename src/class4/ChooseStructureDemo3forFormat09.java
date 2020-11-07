package class4;

/*
 * 请统计1-1000之间同时满足如下条件的数据有多少个：
 *		对3整除余2
 *		对5整除余3
 *		对7整除余2
 * 分析：
 * 		A：定义一个统计变量
 * 		B: 1-1000告诉了我们范围
 * 		C: 获取一个三位数数据
 * 		D: 按照要求进行判断
 *		E: 如果满足要求就计数，输出统计变量
 */

public class ChooseStructureDemo3forFormat09 {
	public static void main(String[] args) {
		//定义统计变量，初始化值是0
		int count = 0;
		
		for(int x = 1;x<=1000;x++) {
		    if((x%3 == 2)&&(x%5 == 3)&&(x%7 == 2)) {
		    	//如果满足条件就输出控制台
		    		count++;
		    		System.out.println(x);
		    }
		}
		System.out.println("水仙花数共有"+count+"个");
	}
}
