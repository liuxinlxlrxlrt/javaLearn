package class23_Thread02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;


public class ThreadDemo {

	public static void main(String[] args) {
		//线程安全的类
		StringBuffer sb = new StringBuffer();
		//没有泛型就报错
		Vector<String> v = new Vector<String>();
		Hashtable<String,String> ht = new Hashtable<String,String>();
		
		//Vector是线程安全的时候才去考虑使用的，但是我还说过即使要安全也不用
		//那么用谁呢？
		//public static <T> List<T> synchronizedList(List<T> list)
		List<String> list1 = new ArrayList<String>();//线程不安全的
		List<String> list2 = Collections.synchronizedList(new ArrayList<String>());//线程安全的

	}

}
