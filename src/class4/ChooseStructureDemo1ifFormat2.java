package class4;

/*
 * if语句格式2:
 *     if(表表达式){
 *         语句体1;
 *     }else{
 *        语句体2;
 *     }
 * 
 * 执行流程：
 *          先计算比较表达式的值,看其返回值是ture还是false;
 *          如果是ture,就执行语句;
 *          如果是false,就不执行语句;
 *          
 * 注意：else后面没有比较表达式,只有if后面有
 */

public class ChooseStructureDemo1ifFormat2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		if (a == b) {
			System.out.println("a等于b");
		}else {
			System.out.println("a不等于b");
		}
	}
}
