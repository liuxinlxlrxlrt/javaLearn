package class11_ObjectCalss;

public class Student3 {
	private String name;
	private int age;
	public Student3() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student3(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student3 other = (Student3) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
//	@Override
//	public boolean equals(Object obj) {
//		//return super.equals(obj);
//		//return true;
//		//这要改进，根据这里比较的成员变量来决定返回true还是false
//		//这里要比较的是name和age
//		//但是，name是String类型的，而是String是引用类型的，所以，这里不能直接用==比较，应该equels()比较
//		//String的equels()方法是重写 的Object类的，比较的是字符串的内容是否相同
//		//this==s1
//		//this==s2
//		//我们要使用的是学生类 的特有成员，所以要向下转型
//		Student3 s5 = (Student3)obj;
//		if(this.name.equals(s5.name)&&this.age == s5.age){
//			return true;
//		}else {
//			return false;
//		}
//	}
	
//	@Override
//	public boolean equals(Object obj) {
//		//为了提高效率
//		if(this ==obj) {
//			return true;
//		}
//		
//		//为了提高程序的健壮性
//		//我先判断obj是不是学生的对象，如果是在做向下转型，如果不是直接返回false
//		//这个时候，我们要判断的是对象是否是某个类的对象
//		//记住一个格式：对象名 instanceof 类名
//		//表示：判断该对象是否是该类名的对象
//		
//		if(!(obj instanceof Student3)) {
//			return  false;
//		}
//		Student3 s6 = (Student3)obj;
//		//System.out.println("同一个对象,还需要向下转型比较吗");
//		return this.name.equals(s6.name)&&this.age ==s6.age;
//	}
}
