package class5;

/*
 * 需求：在控制台输出如下的形状
 * 			*****
 * 			*****
 * 			*****
 * 			*****
 * 
 * void类型的返回值的方法的调用：
 *    	单独调用
 *    	输出调用（错误）
 *    	赋值调用（错误）
 * 		
 */

public class FunctionDemo02Test01 {

	public static void main(String[] args) {
		//for循环嵌套输出图形
		for(int x =0;x<4;x++) {
			for(int y=0;y<5;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------");
		
		//需求：在控制台输出6行7列的星形形状
		for(int x =0;x<6;x++) {
			for(int y=0;y<7;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------");
		
		//所以需求继续改变，我们就考虑使用方法改进
		//单独调用
		pringxing(3,4);
		System.out.println("----------------");
		pringxing(5,6);
		System.out.println("----------------");
		pringxing(7,8);
		System.out.println("----------------");
		
		//输出调用
		//此处不允许使用‘空’类型
		//System.out.println(pringxing(1,2));
		
		//赋值调用
		//非法的表达式开始
		//void v = pringxing(3,2);
	
				
	}
	/*
	 * 写一个什么样的放大呢？写一个m行n列的代码
	 * 两个明确：
	 * 		返回值类型：这个时候没有明确的返回值，不写东西还不行，这里记住是void
	 * 		参数列表：int m, int n
	 */
	
	public static void pringxing(int m,int n) {
		for(int x =0;x<m;x++) {
			for(int y=0;y<n;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
