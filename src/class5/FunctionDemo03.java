package class5;

/*
 * ������Ҫ���������ĺ�
 * 
 * ���ǵ����󲻶ϵķ����ı䣬���ǾͶ�Ӧ���ṩ�˶����͵ķ���
 * �����أ����ǵ������ǲ�һ����
 * ��������Ҫ�󷽷�����������������֪��
 * ��ô����ô���أ�
 * �����������������Ĺ�����ͬ�������б�ͬ�������Ϊ�˼���֪�⣬Java����������һ��������
 * 
 * ��ʵ�����������һ��רҵ���ʣ���������
 * 
 * �������أ�
 * 		��ͬһ�����У���������ͬ�������б�ͬ���뷵��ֵ�����޹�
 * 		
 */

public class FunctionDemo03 {

	public static void main(String[] args) {
		//jvm����ݲ�ͬ�Ĳ���ȥ���ò�ͬ����
		System.out.println(sum(10,20));
		System.out.println(sum(10,20,30));
		System.out.println(sum(10,20,30,40));
		System.out.println(sum(10.5f,20));
	}
	//����1�� ���������ĺ�
	/*public static int sum1(int a,int b) {
		return a+b;
	}*/
	public static int sum(int a,int b) {
		System.out.println("int");
		return a+b;
	}
	
	//����2�� ���������ĺ�
	/*public static int sum2(int a,int b,int c) {
		return a+b+c;
	}*/
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
	
	//����2�� ���ĸ����ĺ�
	/*public static int sum3(int a,int b,int c,int d) {
		return a+b+c+d;
	}*/
	public static int sum(int a,int b,int c,int d) {
		return a+b+c+d;
	}
	public static float sum(float a,float b) {
		System.out.println("float");
		return a+b;
	}
}
