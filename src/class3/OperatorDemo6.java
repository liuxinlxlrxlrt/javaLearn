package class3;

/*
 * 逻辑运算符：
 *      &,|,^,!,&&,||
 *      
 * 特点：
 *    逻辑运算符一般用于连接boolean类型的表达式或者值。
 *    
 *    表达式：就是用运算符把常量或者变量连接起来的符合java语法的式子。
 *         算数表达式：a + b
 *         比较运算符：a == b
 *         
 *  结论：
 *    &逻辑与：有false则false
 *    ！逻辑或：有ture则ture
 *    ^逻辑异或：相同为false,不同为ture.
 *        举例：情侣关系：男男，男女，男女，女女
 *    !逻辑非：非false则ture,非ture则false
 *        特点：偶数个！不改变本身，奇数个！改变本身
 */

public class OperatorDemo6 {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;
		
		//&逻辑与
		System.out.println((a > b)&(a > c));//false & false = false
		System.out.println((a > b)&(a < c));//false & ture = false
		System.out.println((a < b)&(a > c));//ture & false = false
		System.out.println((a < b)&(a < c));//ture & ture = ture
		System.out.println("------------------------------------");
		
		//|逻辑或
		System.out.println((a > b)|(a > c));//false & false = false
		System.out.println((a > b)|(a < c));//false & ture = ture
		System.out.println((a < b)|(a > c));//ture & false = ture
		System.out.println((a < b)|(a < c));//ture & ture = ture
		System.out.println("------------------------------------");
		
		//^逻辑异或
		System.out.println((a > b)^(a > c));//false & false = false
		System.out.println((a > b)^(a < c));//false & ture = ture
		System.out.println((a < b)^(a > c));//ture & false = ture
		System.out.println((a < b)^(a < c));//ture & ture = false
		System.out.println("------------------------------------");
		
		//！逻辑非
		System.out.println(! (a > b));//!false = ture
		System.out.println(!(a < b));//! ture = false
		System.out.println(!! (a > b));//!!false = false
		System.out.println(!!!(a > b));//!!!false = ture
	}
}
