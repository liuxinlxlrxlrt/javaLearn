package class4;
/*
 * 需求：在控制台输出九九乘法表。
 * 1x1=1     
 * 1x2=2 2x2=3
 * 1x3=3 2x3=6 3x3=9
 * 1x4=4 2x4=8 3x4=12 4x4=16
 * 1x5=5 2x5=10 3x5=15 4x5=20 5x5=25
 * 
 * 我们先把这个九九乘法表看出是这样一个形状
 *          *
			**
			***
			****
			*****
  
  注意：
  "\x" x标识任意，这种做法叫转义字符
  '\t' tab键的位置
  '\r' 回车
  '\a' 换行
 */

public class ChooseStructureDemo6Test03 {
	public static void main(String[] args) {
		for (int x = 1; x <= 9; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------");

		for (int x = 1; x <= 9; x++) {
			for (int y = 1; y <= x; y++) {
				// int sum = y*x;
				// System.out.print(y+"*"+x+"="+sum);
				// System.out.print(" ");
				System.out.print(y + "*" + x + "=" + y * x + "\t");
			}
			System.out.println();
		}
	}
}
