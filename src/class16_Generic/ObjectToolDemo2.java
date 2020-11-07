package class16_Generic;
/*
 * 泛型类的测试
 */

public class ObjectToolDemo2 {
	public static void main(String[] args) {
		// 一般用法
//		ObjectTool ot = new ObjectTool();
//		
//		ot.setObj(new String("风清扬"));
//		String s = (String) ot.getObj();
//		System.out.println("姓名是："+s);
//		
//		ot.setObj(new Integer(30));
//		Integer i = (Integer) ot.getObj();
//		System.out.println("年龄是："+i);

		System.out.println("--------------------");

		// 泛型类的标准用法
		ObjectTool2<String> ot = new ObjectTool2<String>();
		// ot.setObj(new Integer(27));这个时候编译期间就过不去
		ot.setObj(new String("林青霞"));
		String s = ot.getObj();
		System.out.println("姓名是：" + s);

		ObjectTool2<Integer> ot2 = new ObjectTool2<Integer>();
		// ot.setObj(new String("林青霞"));这个时候编译期间就过不去
		ot2.setObj(new Integer(27));
		Integer i = ot2.getObj();
		System.out.println("年龄是: " + i);
	}
}
