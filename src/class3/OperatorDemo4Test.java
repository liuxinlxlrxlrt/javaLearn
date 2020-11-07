package class3;
/*
 * 面试题
 * 1. short s=1, s = s+1; 2. short s=1, s+=1;
 * 上面两个代码有没有问题，如果有，那里有问题
 *     第一个有问题：short s类型 参与运算，首先转成int类型，然后在运算，然后转成short类型，可能损失精度 
 *     
 *     为什么第二个没有问题呢？
 *        扩展的赋值运算符其实隐含了一个强制类型转换
 *        
 *        s +=1;
 *        不等价于 s = s +1;
 *        而是等价于 s =(s的数据类型)(s+1)
 */

public class OperatorDemo4Test {
	public static void main(String[] args) {
		//short s=1;
		//s = s+1;
		//System.out.println(s);
		//short s类型 参与运算，首先转成int类型，然后在运算，然后转成short类型，可能损失精度
     
		short s=1;
		s+=1; //好像是 s = s+1;
		System.out.println(s);
	}
}
