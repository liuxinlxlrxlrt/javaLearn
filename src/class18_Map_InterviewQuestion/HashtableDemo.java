package class18_Map_InterviewQuestion;

import java.util.Hashtable;

/*1.HashMap��Hashtable������
 * Hashtable:�̰߳�ȫ��Ч�ʵ�,������null����nullֵ
 * HashMap���̲߳���ȫ��Ч�ʸ�,����null����nullֵ
 * 
 * 2.List,Set,Map�Ƚӿ��Ƿ񶼼̳���Map�ӿ�
 * List,Set���Ǽ̳���Map�ӿڣ����Ǽ̳���Collection�ӿ�
 * Map�ӿڱ������һ������ӿ�
 */

public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable<String,String> hm = new Hashtable<String,String>();
		
		hm.put("it001", "hello");
		
		//hm.put(null, "world");
		//����NullPointerException
		//hm.put("java", null);
		//����NullPointerException
		System.out.println(hm);
		
		//����NullPointerException
	}
}
