package class16_JDK5newfeature;

/*
 * �ɱ���������巽����ʱ��֪���ö�����ٸ�����
 * ��ʽ��
 * 		���η� ����ֵ���� ������(�������͡�  ������){
 * 		}
 * ע�⣺
 * 		a.����ı�����ʵ��һ������
 * 		b.���һ�������пɱ�����������ж����������ô���ɱ�����϶������һ��
 */

public class ArgsDemo {
	public static void main(String[] args) {
		// ���
		int a = 10;
		int b = 20;
		int result = sum(a, b);
		System.out.println("result:" + result);

		// 3�����ݵ����
		int c = 30;
		result = sum(a, b, c);
		System.out.println("result:" + result);

		// 4�����ݵ����
		int d = 30;
		result = sum(a, b, c, d);
		System.out.println("result:" + result);

		// ������Ҫдһ����͵Ĺ��ܣ������Ǽ�����������أ�������֪���ҿ϶���֪����
		// Ϊ��������⣬java���ṩ��һ���������С��ɱ������
		// 5�����ݵ����
		result = sum(a, b, c, d, 40);
		System.out.println("result:" + result);

		result = sum(a, b, c, d, 40, 50);
		System.out.println("result:" + result);

	}

	public static int sum(int... a) {
//		System.out.println(a);
//		return 0;

		int s = 0;
		for (int x : a) {
			s += x;
		}
		return s;
	}

//	public static int sum(int a, int b,int c,int d) {
//		return a + b+ c +d;
//	}
//	
//	public static int sum(int a, int b,int c) {
//		return a + b+ c;
//	}
//
//	public static int sum(int a, int b) {
//		return a + b;
//	}
}