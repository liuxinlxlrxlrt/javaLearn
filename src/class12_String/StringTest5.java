package class12_String;
/*
 * ���󣺰�һ���ַ���������ĸת���ɴ�д������ת����Сд����ֻ����Ӣ�Ĵ�Сд��ĸ�ַ���
 * ������
 * 		helloWORLD
 * �����
 * 		Helloworld
 * 
 * ������
 * ��		A���Ȼ�ȡ��һ���ַ�
 * 		B����ȡ���˵�һ���ַ�������ַ�
 * 		C����Aת���ɴ�д
 * 		D����B����Сд
 * 		E��Cƴ��D
 */

public class StringTest5 {

	public static void main(String[] args) {
		//����һ���ַ���
		String s = "helloWORLD";
		
		//�Ȼ�ȡ��һ���ַ�
		String s1 = s.substring(0,1);
		//��ȡ���˵�һ���ַ�������ַ�
		String s2 = s.substring(1);
		//��Aת���ɴ�д
		String s3 = s1.toUpperCase();
		//��B����Сд
		String s4 = s2.toLowerCase();
		//Cƴ��D
		String s5 = s3.concat(s4);
		System.out.println(s5);
		
		//�Ż���Ĵ���
		String result = s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase());
		System.out.println(result);
		
	}

}
