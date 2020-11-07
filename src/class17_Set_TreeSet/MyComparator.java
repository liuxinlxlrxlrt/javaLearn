package class17_Set_TreeSet;

import java.util.Comparator;

public class MyComparator implements Comparator<Student2> {
	
	//为什么传的两个学生?
	//因为当时Student2类中本身有一个this可以代表当前类的对象
	//而在MyComparator类中的this代表的是MyComparator对象
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

}
