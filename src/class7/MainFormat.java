package class7;
/*
 * main�����ĸ�ʽ���⣺
 * 		public static void main(String[] args){...}
 * 
 * public :
 * �����ģ�����Ȩ���������main�����Ǳ�jvm���ã�����Ȩ��Ҫ����
 * static :
 * ��̬�ģ�����Ҫ��������ͨ�����������ԣ�����jvm����
 * void :
 * ��Ϊ��������˵�������ķ���ֵ�Ƿ��ظ�ͨ���⣬��main�����Ǳ�jvm���ã��㷵�ص����ݸ�jvmû������
 * main :
 * ��һ�ֳ����ķ�����ڣ��Ҽ��������Զ�����main��Ϊ���
 * String[] args :
 * ����һ���ַ�������,ֵȥ�����ˣ�
 * �������������ʲô�ð�?��ô��ֵ��?
 * 		�������������δ�����ռ���¼������ݵ�
 * 		��ʽ
 * 		cmd��������:java MainFormat hello word java
 */

public class MainFormat {
	public static void main(String[] args) {
//	System.out.println(args);//[Ljava.lang.String;@7852e922����ǵ�ַ��˵��������
//	System.out.println(args.length);//0
//	System.out.println(args[0]);//ArrayIndexOutOfBoundsException��Ϊû��ֵ������Խ����

		// �ӽ������ݺ�
		System.out.println(args);
		System.out.println(args.length);
		// System.out.println(args[0]);
		// cmd��������:java MainFormat hello word
		for (int x = 0; x < args.length; x++) {
			System.out.println(args[x]);
		}
	}
}
