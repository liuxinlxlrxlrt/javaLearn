package class16_Generic;

//public class ObjectTool3<T> {
////	//����������
//////	public void show(String s) {
//////		System.out.println(s);
//////
//////	}
//////	
//////	public void show(Integer i) {
//////		System.out.println(i);
//////	}
//////	
//////	public void show(Boolean b) {
//////		System.out.println(b);
//////	}
////	
////	public void show(T t) {
////	System.out.println(t);
////}
//
//	public void show(T t) {
//	System.out.println(t);
//	}
//}

public class ObjectTool3{
	//���Ͷ����ڷ����ϣ����÷�����ʱ���㴫ʲô���ͣ�<T>����ʲô����
	public <T> void show(T t) {
	System.out.println(t);
	}
}
