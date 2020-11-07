package class4;

/*练习：
 * 	请在控制台输出满足如下条件的五位数
 *	个位等于万位
 *	十位等于千位
 *	个位+十位+千位+万位=百位
 *
 *分析：(五位数就告诉了我们范围，分解每一个五位数的个，是，百，千，万位上的数据)
 *	A:ge = wan
 *	B:shi = qian
 *	C:ge+shi+qian+wan=bai
 */

public class ChooseStructureDemo3forFormat07 {

	public static void main(String[] args) {
		for(int x = 10000;x<100000;x++) {
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
			int qian =x/10/10/10%10;
			int wan = x/10/10/10/10%10;
			
			//让"ge*ge*ge+shi*shi*shi+bai*bai*bai"和该数据比较
		    if((ge == wan)&&(shi == qian)&&((ge+shi+qian+wan) == bai)) {
		    	//如果相同，就把该数据在控制台输出
		    	System.out.println(x);
		    }
		}
	}
}
