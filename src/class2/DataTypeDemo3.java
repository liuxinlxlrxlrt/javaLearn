package class2;

/* +��һ������������ǵȻὲ�⣩�����ӷ������
 * һ�������������������ʱ��Ҫ�����������������ͱ���һ��
 * 
 * ע�⣺
 *    boolean���Ͳ���ת��Ϊ��������������
 *    
 * Ĭ��ת��������С�����ת����
 *      A��byte,short,char-int-long-float-double
 *      B:byte,short,char�໥֮�䲻ת�������ǲ������������ת��Ϊint����
 */

public class DataTypeDemo3 {

	public static void main(String[] args) {
		//ֱ������ķ�ʽ���ӷ�
		System.out.println(3+4);
		
		//����int�������ӷ�
		int x = 3;
		int y = 4;
		int z = x + y;
		System.out.println(z);
		
		//����һ��byte���ͣ�һ��int���ͣ����ӷ�
		byte a =3;
		int b = 4;
		System.out.println(a+b);
		
		//������ʧ����
		//byte c =a +b;
		//System.out.println(c);
		/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			Type mismatch: cannot convert from int to byte

			at class2.DataTypeDemo3.main(DataTypeDemo3.java:31)*/
        /*byte a=3;
         * int b =4;
         * byte c =a+b //������ 
         * int d = a+b;  //û����
         * 
         * ���ȼ�������ݶ�Ӧ�Ķ�����
         * ʮ���Ƶ�3��Ӧ�Ķ����Ƶ�11(00000011)
         * ʮ���Ƶ�4��Ӧ�Ķ����Ƶ�100(00000000 00000000 00000000 00000100)
         * byte a=3    int b = 4
         * 00000011(����byte����ת����int����)+00000000 00000000 00000000 00000100(int����)
         * (byte,short,char�໥֮�䲻ת�������ǲ������������ת��Ϊint����)
         *  00000000 00000000 00000000 00000011(int����)
         * +00000000 00000000 00000000 00000100(int����)
         * =00000000 00000000 00000000 00000111(int����)
         * �����byte c =a+b��int(4�ֽ�)����ת����byte(1�ֽ�)���Ϳ��ܻ���ʧ����
         */
	}

}
