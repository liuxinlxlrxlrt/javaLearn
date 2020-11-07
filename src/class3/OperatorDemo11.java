package class3;

/*
 * 单目运算符：~3
 * 双目运算符：3+4
 * 三目运算符：
 *      格式：表达式？表达式1：表达式2;
 *      
 *      比较表达式：结果是一个boolean类型
 *      
 *      执行流程：
 *          根据比较表达式的计算返回一个ture或者false
 *          如果是ture,就把表达式1作为结果
 *          如果是false，就把表达式2作为结果
 * 
 */

public class OperatorDemo11 {

	public static void main(String[] args) {
	   int x = 100;
	   int y = 200;
	   
	   int z = ((x > y)? x: y);
	   int q = ((x < y)? x: y);
	   int w = ((x == y)? x: y);
	   //int e = ((x = y)? x: y);
			   
	   System.out.println("z:"+z);
	   System.out.println("q:"+q);
	   System.out.println("w:"+w);
	   //System.out.println("e:"+e);
	}

}
