package class9_final;
/*
 * final���α����ĳ�ʼ��ʱ��
 * 		A:��final���εı���ֻ�ܸ�ֵһ��
 * 		B���ڹ��췽�����ǰ,���Ǿ�̬�ĳ�����
 */
class Demo{
	//��Ա������ʼ��
//	int num = 10;
//	final int num2 = 20;
	
	int num;
	final int num2;
	//���߹�������num2����ֵ
//	{
//		num2 = 2;
//	}
	
	public Demo() {
		//���췽���޸�num ��ֵ
		num =100;
		//final�������α������ñ������ܱ����¸�ֵ����Ϊ���������ʵ�ǳ���
		//�������ܱ���ֵ
		//num2 =200;
		
		//���final���εı���û�б���ֵ���ǿ��Ը�ֵ��
		num2 =200;
	}
}

public class FinalTest2 {
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.num);
		System.out.println(d.num2);
	}
}
