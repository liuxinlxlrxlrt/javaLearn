package class3;

/*
 * ��Ŀ�������~3
 * ˫Ŀ�������3+4
 * ��Ŀ�������
 *      ��ʽ�����ʽ�����ʽ1�����ʽ2;
 *      
 *      �Ƚϱ��ʽ�������һ��boolean����
 *      
 *      ִ�����̣�
 *          ���ݱȽϱ��ʽ�ļ��㷵��һ��ture����false
 *          �����ture,�Ͱѱ��ʽ1��Ϊ���
 *          �����false���Ͱѱ��ʽ2��Ϊ���
 * 
 */

public class OperatorDemo11 {

	public static void main(String[] args) {
	   int x = 100;
	   int y = 200;
	   
	   int z = ((x > y)? x: y);
	   int q = ((x < y)? x: y);
	   int w = ((x == y)? x: y);
	   //int e = ((x = y)? x: y);
			   
	   System.out.println("z:"+z);
	   System.out.println("q:"+q);
	   System.out.println("w:"+w);
	   //System.out.println("e:"+e);
	}

}
