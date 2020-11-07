package class2;

/* +是一个运算符（我们等会讲解）、做加法运算的
 * 一般来所，我们在运算的时候，要求参与运算的数据类型必须一致
 * 
 * 注意：
 *    boolean类型不能转换为其他的数据类型
 *    
 * 默认转换：（从小到大的转换）
 *      A：byte,short,char-int-long-float-double
 *      B:byte,short,char相互之间不转换，他们参与的运算首先转换为int类型
 */

public class DataTypeDemo3 {

	public static void main(String[] args) {
		//直接输出的方式做加法
		System.out.println(3+4);
		
		//两个int类型做加法
		int x = 3;
		int y = 4;
		int z = x + y;
		System.out.println(z);
		
		//定义一个byte类型，一个int类型，做加法
		byte a =3;
		int b = 4;
		System.out.println(a+b);
		
		//可能损失经度
		//byte c =a +b;
		//System.out.println(c);
		/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			Type mismatch: cannot convert from int to byte

			at class2.DataTypeDemo3.main(DataTypeDemo3.java:31)*/
        /*byte a=3;
         * int b =4;
         * byte c =a+b //有问题 
         * int d = a+b;  //没问题
         * 
         * 首先计算出数据对应的二进制
         * 十进制的3对应的二进制的11(00000011)
         * 十进制的4对应的二进制的100(00000000 00000000 00000000 00000100)
         * byte a=3    int b = 4
         * 00000011(类型byte首先转换成int类型)+00000000 00000000 00000000 00000100(int类型)
         * (byte,short,char相互之间不转换，他们参与的运算首先转换为int类型)
         *  00000000 00000000 00000000 00000011(int类型)
         * +00000000 00000000 00000000 00000100(int类型)
         * =00000000 00000000 00000000 00000111(int类型)
         * 如果是byte c =a+b，int(4字节)类型转换成byte(1字节)类型可能会损失精度
         */
	}

}
