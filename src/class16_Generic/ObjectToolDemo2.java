package class16_Generic;
/*
 * ������Ĳ���
 */

public class ObjectToolDemo2 {
	public static void main(String[] args) {
		// һ���÷�
//		ObjectTool ot = new ObjectTool();
//		
//		ot.setObj(new String("������"));
//		String s = (String) ot.getObj();
//		System.out.println("�����ǣ�"+s);
//		
//		ot.setObj(new Integer(30));
//		Integer i = (Integer) ot.getObj();
//		System.out.println("�����ǣ�"+i);

		System.out.println("--------------------");

		// ������ı�׼�÷�
		ObjectTool2<String> ot = new ObjectTool2<String>();
		// ot.setObj(new Integer(27));���ʱ������ڼ�͹���ȥ
		ot.setObj(new String("����ϼ"));
		String s = ot.getObj();
		System.out.println("�����ǣ�" + s);

		ObjectTool2<Integer> ot2 = new ObjectTool2<Integer>();
		// ot.setObj(new String("����ϼ"));���ʱ������ڼ�͹���ȥ
		ot2.setObj(new Integer(27));
		Integer i = ot2.getObj();
		System.out.println("������: " + i);
	}
}
