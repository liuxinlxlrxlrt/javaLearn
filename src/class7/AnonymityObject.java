package class7;
/*
 * 匿名对象：就是没有名字的对象。
			是对象的一种简化表示形式
			
	匿名对象的两种使用情况
		A:对象调用方法仅仅一次的时候
				注意：调用多次的时候，不适合
				那么，这种匿名对象有什么好处呢？
				     有，匿名对象调用完毕后就是垃圾，可以被垃圾回收器回收
		B:可以作为实际参数传递
 */
class Student02{
	public void show() {
		System.out.println("我爱学习");
	}
}
class StudentDemo02{
	//如果你看到了一个方法形式参数是一个”类“类型(引用类型).这里其实需要的是该类的对象。
	public void mothod(Student02 s) {//调用的时候，把main方法中的s的地址传递到了这里Student s = new Student();
	s.show();
	//如何创建class StudentDemo调用mothod方法？
	}
}
public class AnonymityObject {
		public static void main(String[] args) {
			//带名字的对调用
			//同一对象调用两次方法
			Student02 s = new Student02();
			s.show();
			s.show();
			System.out.println("-------");
			//匿名对象
			//new Student();
			//匿名对象调用方法
			new Student02().show();
			new Student02().show();//这里其实是重新创建了一个新的对象
			System.out.println("-------");
			
			//匿名对象作为实际参数传递
			//需求。我要调用StudentDemo类中的mothod()方法
			StudentDemo02 sd = new StudentDemo02();
			//创建学生对象
			//Student ss = new Student();
			//sd.mothod(ss);//这里的ss是一个实际参数
			//匿名对象
			sd.mothod(new Student02());
			
			//再来一个
			new StudentDemo02().mothod(new Student02());
		}
}
