package class13_Charactor;
/*
 * Character 类在对象中包装一个基本类型 char 的值
 *此外，该类提供了几种方法，以确定字符的类别（小写字母，数字，等等），并将字符从大写转换成小写，反之亦然
 *
 *构造方法：
 *public Character(char value)
 */

public class CharactorDemo {
	public static void main(String[] args) {
		//创建对象
		//Character ch = new Character((char) 97);
		Character ch = new Character('a');
		//如果打印的地址值，没有重写toString()
		//如果打印的是a，重写toString()
		System.out.println("ch："+ch);//ch：a
	}
}
