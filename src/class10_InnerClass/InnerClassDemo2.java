package class10_InnerClass;
/*
 * 内部类的位置:
 * 		成员位置：在成员位置定义的类，被称为成员内部内
 * 		局部位置：在局部为值定义的类，被称为局部内部类
 */
class Outer2{
	private int num = 10;
	
	//成员位置
	class Inner201{
	}
	
	public void method() {
		//局部位置
		class Inner202{
		}
	}
}

public class InnerClassDemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
