package class13_Integer;
/*
 *JDK5��������
 *�Զ�װ�䣺�ѻ�������ת��Ϊ��װ������
 *�Զ����䣺�Ѱ�װ������ת��Ϊ����������
 *
 *ע��һ��С���⣺
 *		��ʹ��ʱ��Integer  x = null;����Ĵ���ͻ����NullPointerException��
 *		�������ж��Ƿ�Ϊnull��Ȼ����ʹ��
 */

public class IntegerDemo5 {
	public static void main(String[] args) {
		//������һ��int���͵İ�װ�����͵ı���
		//Integer i = new Integer(100);
		//JDK5������
		Integer ii = 100;//�Զ�װ��
		ii += 200;//�Զ����䡣ͨ��intValue����
		System.out.println("ii��"+ii);
		//ͨ��������
		//Integer ii = Integer.valueOf(100);//�Զ�װ��
		//ii = Integer.valueOf(ii.intValue()+200);//�Զ�����
		//System.out.println(new StringBuilder("ii��").append(ii).toString());
		
		//ֻҪ�Ƕ����ȿ�����Ϊnull
		Integer iii = null;
		//NullPointerException
		if(iii !=null) {
			iii +=1000;
			System.out.println(iii);
		}
	}
}
