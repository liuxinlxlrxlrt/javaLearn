package class16_Generic;

/*
 * ʵ������ʵ�ֽӿڵ�ʱ��
 * 	1.��һ��������Ѿ�֪������ʲô���͵���
 * 	2.�ڶ������������֪����ʲô���͵�
 */

//public class InterImp1 implements Inter<String>{
//1.��һ��������Ѿ�֪������ʲô���͵���(������)
//	@Override
//	public void show(String t) {
//		System.out.println(t);
//	}
//}

//2.�ڶ������������֪����ʲô���͵ģ�������
public class InterImp1<T> implements Inter<T> {
	@Override
	public void show(T t) {
		System.out.println(t);
	}
}
