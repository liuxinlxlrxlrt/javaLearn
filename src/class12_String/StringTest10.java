package class12_String;
/*
 *ͳ�ƴ���С�����ֵĴ���
 *���������ַ����� woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun��
 *	 ��java������5��
 *	 
 *	����˼·��
 *		ǰ�����Ѿ��ҵõ��˴󴮺�С��
 *		A������һ��ͳ�Ʊ�������ʼ��ֵ��0��
 *		B���Ȼ�ȡһ��Java��������ַ����е�һ�γ��ֵ�����
 *			a���������ֵ��-1����˵�������ڣ�����ͳ�Ʊ���
 *			b���������ֵ����-1����˵�����ڣ�ͳ�Ʊ���++
 *		�����ж�һ�Σ���java�������������Ƿ���� ��
 *		C���Ѹղŵ�����+С���ĳ�����Ϊ��ʼλ�ý�ȡ��һ�δ�Ϊԭʼ�󴮣�
 *			����һ���µ��ַ��������Ѹ��ַ������¸�ֵ����
 *		D���ص�B
 */

public class StringTest10 {

	public static void main(String[] args) {
		//�����
		String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		//����С��
		String minString = "java";
		
		//д����ʵ��
		int count =getCount(maxString, minString);
		System.out.println("Java�ڴ��г����ˣ�"+count+"��");
}
/*
 * ������ȷ��
 * ����ֵ���ͣ�int
 * �������ͣ������ַ���
 */
public static int getCount(String maxString, String minString) {
	//����һ��ͳ�Ʊ�������ʼ��ֵ��0
	int count = 0;
	
	/*
	//���ڴ��в���һ��С����һ�γ��ֵ�λ��
	int index = maxString.indexOf(minString);
	
 	//a���������ֵ��-1����˵�������ڣ�����ͳ�Ʊ���
	while(index != -1) {
		count++;
		//�Ѹղŵ�����+С���ĳ�����Ϊ��ʼλ�ý�ȡ��һ�δ�Ϊԭʼ�󴮣�
		 //����һ���µ��ַ��������Ѹ��ַ������¸�ֵ����
//		int startIndex = index + minString.length();
//		maxString = maxString.substring(startIndex);
		//�Ľ��棺
		maxString =maxString.substring(index + minString.length());
		//������
		index = maxString.indexOf(minString);
	}
	*/
	int index;
	while((index=maxString.indexOf(minString)) !=-1) {
		count++;
		maxString =maxString.substring(index + minString.length());
	}
 	//b���������ֵ����-1����˵�����ڣ�ͳ�Ʊ���++
	return count;
 }
}