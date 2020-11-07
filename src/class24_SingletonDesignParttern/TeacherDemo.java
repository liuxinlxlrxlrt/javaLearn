package class24_SingletonDesignParttern;

public class TeacherDemo {

	public static void main(String[] args) {
		Teacher t1 = Teacher.getTeacher();
		Teacher t2 = Teacher.getTeacher();
		System.out.println(t1 == t2);
		
		//造对象了，t1=t2就不是null了，是地址值
		System.out.println(t1);//class24_SingletonDesignParttern.Teacher@7852e922
		System.out.println(t2);//class24_SingletonDesignParttern.Teacher@7852e922
	}

}
