package class8;

public class CharAarrySwicthToString {

	public static void main(String[] args) {
		//���ַ�����ת�����ַ���
		
		//����1��ֱ���ڹ���Stringʱת��
		//�ַ�����
		char[] ch1 = {'a','b','c','d','e','1'};
		String str1  = new String(ch1);
		System.out.println(str1);
		
		//����2������String��ķ���ת��
		String str21  = String.valueOf(ch1);
		System.out.println(str21);
	}

}
