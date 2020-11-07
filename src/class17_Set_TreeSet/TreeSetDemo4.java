package class17_Set_TreeSet;

import java.util.Comparator;
import java.util.TreeSet;
import class17_Set_TreeSet.Student2;
/*
 * 
 * 需求3：请按照姓名的长度排序
 * TreeSet集合保证元素的排序和唯一性的原理：
 * 唯一性：是根据比较的返回是0来决定的。
 * 排序：
 * 		A：自然排序
 * 			让元素所属的类实现自然排序接口Comparable
 * 		B：比较器排序
 * 			让集合的构造方法接收一个比较器接口的子类对象Comparator
 */

public class TreeSetDemo4 {
	public static void main(String[] args) {
		//创建集合对象
		//TreeSet<Student1> ts = new TreeSet<Student1>();//自然排序
		//public TreeSet(Comparator comparator)//比较器排序
		//TreeSet<Student2> ts = new TreeSet<Student2>(new MyComparator());
		
		//如果一个方法的参数是接口,那么真正要的是接口的是实现类的对象
		//而匿名内部类就可以实现这个东西(只用一次的话):类名/接口名(里面重写改方法)
		//代表的是实现了该接口或者是继承了该类的子类的对象，传的是接口，恰好传的是子类对象
		TreeSet<Student2> ts = new TreeSet<Student2>(new Comparator<Student2>() {
			@Override
			public int compare(Student2 s1, Student2 s2) {
				//int num = this.name.length()-s.name.length();
				//this---s1
				//s---s2
				//姓名长度
				int num = s1.getName().length()-s2.getName().length();
				//姓名内容
				int num2 = num == 0 ? s1.getName().compareTo(s2.getName()):num;
				//年龄
				int num3 =num2 ==0? s1.getAge()-s2.getAge():num2;
				return num3;
			}
		});
		//创建元素
		Student2 s1 = new Student2("linqingxia",27);
		Student2 s2 = new Student2("zhangguorong",29);
		Student2 s3 = new Student2("wanglihong",23);
		Student2 s4 = new Student2("linqingxia",27);
		Student2 s5 = new Student2("liushishi",22);
		Student2 s6 = new Student2("wuqilong",40);
		Student2 s7 = new Student2("fengqingy",22);
		Student2 s8 = new Student2("linqingxia",29);
		
		//添加元素
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		ts.add(s8);
		
		//遍历
		//ClassCastException: class15_Collection.Student cannot be cast to java.lang.Comparable
		for(Student2 s: ts) {
			System.out.println(s.getName()+"---"+s.getAge());
		}
		

	}

}
