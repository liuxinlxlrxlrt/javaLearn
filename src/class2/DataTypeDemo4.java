package class2;

/*
 * 强制转换：
 *      从大的数据类型到小的数据类型。
 *      
 *      格式：
 *          目标数据类型  变量 =(目标 数据类型) (被转换的数据)
 *      注意：
 *         不要随意的去使用使用强制转换，因为它隐含了精度损失问题
 */
public class DataTypeDemo4 {

	public static void main(String[] args) {
		byte a = 3;
		int b = 4;
		
		//这个肯定没问题
		//int c = a + b;
		
		//byte c = 7;
		//这个肯定有问题
		//byte c =a+b;
		//用强制类型转换改进
		//int类型(a+b)，强制转成byte类型：(byte) (a+b)，再赋给byte类型c
		byte c = (byte) (a+b);
		System.out.println(c);
	}
}
