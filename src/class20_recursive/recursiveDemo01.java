package class20_recursive;
/*
 * 需求：求你5的阶乘
 * 
 * 5! = 1*2*3*4*5
 * 5! = 5*4!
 * 
 * 有几种方案实现呢？
 * 		A：循环实现
 * 		B：递归实现
 * 			a：做递归要写一个方法
 * 			b：出口条件
 * 			c：规律
 * 
 * 
 * 递归解决的思想：
 * 		分解法：
 * 		合并法：
 */

public class recursiveDemo01 {

	public static void main(String[] args) {
//		int jc = 1;
//		for(int x=2;x<=5;x++) {
//			jc *= x;
//		}
//		System.out.println("5的阶乘是："+jc);
		
		System.out.println("5的阶乘是："+jieCheng(5));
	}
	
	/*
	 * 做递归要写一个方法：
	 * 		返回值类型：int
	 * 		参数列表：int n
	 * 出口条件是：
	 * 		if(n==1){return 1;}
	 * 规律：
	 * 		if(n!=1){return n*方法名(n-1)}
	 */
	public static int jieCheng(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n*jieCheng(n-1);
		}
	}

}
