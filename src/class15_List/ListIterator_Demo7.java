package class15_List;


/*
 * �б������
 * 		ListIterator listIterator();//List�������еĵ�����
 * 		ListIterator�̳���Iterator�����������ԾͿ���ֱ������ŷŵ��hasNext()��next()����
 * 
 * ���й���:
 * 		Object previous();��ȡ��һ��Ԫ��
 * 		boolean hasPrevious();�ж��Ƿ���Ԫ��
 * 
 * ע�⣺ListIterator����ʵ��������������Ա��������������Ȼ��������������һ�㲻ʹ��
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_Demo7 {

	public static void main(String[] args) {
		//�������϶���
		List list = new ArrayList();
		
		//���Ԫ��
		list.add("hello");
    	list.add("world");
    	list.add("java");
    	
    	//�б�������ӿ�ListIterator listIterator();//List�������еĵ�����
    	//�б������Ҳ���Ա���Ԫ�أ����ǲ���ʹ������Ϊʲô��
    	//��Ϊ���ListIterator�б����������ͨ�õ�����
    	ListIterator lit = list.listIterator();//�ӿڷ��ص�����������ʵ�������
    	while(lit.hasNext()) {
    		String s = (String) lit.next();
    		System.out.println(s);
    	}
    	
//    	System.out.println(lit.previous());
//    	System.out.println(lit.previous());
//    	System.out.println(lit.previous());
    	//������Χ����NoSuchElementException
    	//System.out.println(lit.previous());
    System.out.println("-----------------------");
    	
    	while(lit.hasPrevious()) {
    		String s = (String) lit.previous();
    		System.out.println(s);
    	}
    System.out.println("-----------------------");
    	//������,���ܷ������
    	Iterator it = list.iterator();
    	while(it.hasNext()) {
    		String s = (String) it.next();
    		System.out.println(s);
    	}
    	
    	System.out.println("-----------------------");
	}
}
