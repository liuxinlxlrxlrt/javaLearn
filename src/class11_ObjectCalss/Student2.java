package class11_ObjectCalss;

public class Student2 {
		private String name;
		private int age;
		public Student2(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		public Student2() {
			super();
			// TODO Auto-generated constructor stub
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
		public String toString() {
			return "Student2 [name=" + name + ", age=" + age + "]";
		}
	
//		@Override
//		public String toString() {
//		//return super.toString();
//		//return "hello";
//		return "����:"+name+",����:"+age;
//		}
}
