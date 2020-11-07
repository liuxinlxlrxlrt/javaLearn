package class16_List_LinkedList;



/*
 *ArrayList去除集合中字符串的重复值(字符串的内容相同)
	 	思路：创建一个新集合
	分析：
		a.创建集合对象
		b.添加多个字符串元素(包含相同的)
		c.创建新集合
		d.遍历旧集合，获取每一个元素
		e.拿到这个元素到新集合去找,看有没有
				有：不搭理它
				没有：就添加到新集合
		F：遍历新集合
 */
import java.util.ArrayList;
import java.util.Iterator;

public class AarryListDemo3 {
	public static void main(String[] args) {
		//创建集合对象
		ArrayList array =  new ArrayList();
		
		//创建字符串对象
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
		
		//创建新集合
		ArrayList newArray =  new ArrayList();
		
		//遍历旧集合，获取每一个元素
		Iterator it = array.iterator();
		while(it.hasNext()) {
			String s = (String)it.next();
			if(!newArray.contains(s)) {
				newArray.add(s);
			}
		}
		
		System.out.println("----------------------");
		
		//遍历
		for(int x=0;x<newArray.size();x++) {
			String s = (String) newArray.get(x);
			System.out.println(s);
		}		
	}
}
