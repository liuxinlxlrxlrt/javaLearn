package class24_SingletonDesignParttern;

public class TeacherDemo {

	public static void main(String[] args) {
		Teacher t1 = Teacher.getTeacher();
		Teacher t2 = Teacher.getTeacher();
		System.out.println(t1 == t2);
		
		//������ˣ�t1=t2�Ͳ���null�ˣ��ǵ�ֵַ
		System.out.println(t1);//class24_SingletonDesignParttern.Teacher@7852e922
		System.out.println(t2);//class24_SingletonDesignParttern.Teacher@7852e922
	}

}
