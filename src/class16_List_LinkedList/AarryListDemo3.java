package class16_List_LinkedList;



/*
 *ArrayListȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
	 	˼·������һ���¼���
	������
		a.�������϶���
		b.��Ӷ���ַ���Ԫ��(������ͬ��)
		c.�����¼���
		d.�����ɼ��ϣ���ȡÿһ��Ԫ��
		e.�õ����Ԫ�ص��¼���ȥ��,����û��
				�У���������
				û�У�����ӵ��¼���
		F�������¼���
 */
import java.util.ArrayList;
import java.util.Iterator;

public class AarryListDemo3 {
	public static void main(String[] args) {
		//�������϶���
		ArrayList array =  new ArrayList();
		
		//�����ַ�������
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("java");
		array.add("world");
		
		//�����¼���
		ArrayList newArray =  new ArrayList();
		
		//�����ɼ��ϣ���ȡÿһ��Ԫ��
		Iterator it = array.iterator();
		while(it.hasNext()) {
			String s = (String)it.next();
			if(!newArray.contains(s)) {
				newArray.add(s);
			}
		}
		
		System.out.println("----------------------");
		
		//����
		for(int x=0;x<newArray.size();x++) {
			String s = (String) newArray.get(x);
			System.out.println(s);
		}		
	}
}
