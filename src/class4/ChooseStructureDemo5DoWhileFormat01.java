package class4;

/*do…while循环语句格式：
基本格式
   do {
         循环体语句;
   }while((判断条件语句);
扩展格式
   初始化语句;
   do {
         循环体语句;
         控制条件语句;
    } while((判断条件语句);
 */

public class ChooseStructureDemo5DoWhileFormat01 {
	public static void main(String[] args) {
		// 输出10次helloworld

		int x = 0;
		do {
			System.out.println("helloworld");
			x++;
		} while (x < 10);
		System.out.println("---------------");

		// 求和1-100
		int sum = 0;
		int a = 1;
		do {
			sum += a;
			a++;
		} while (a <= 100);
		System.out.println(sum);
	}
}
