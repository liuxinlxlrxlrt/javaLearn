package class8_Inheritance;
//Inheritance/ɪn'hɛrɪtəns/ n. 继承；遗传；遗产

/*
 * 首先我来写两个代码
 * 
 */

//定义学生类
//class Student{
//	String name;
//	int age;
//	
//	//无参构造方法
//	public Student() {}
//	
//	//getXxx()/setXxx()
//	
//	public void eat() {
//		System.out.println("吃饭");
//	}
//}
//定义老师类
//class Teacher{
//	String name;
//	int age;
//	
//	//无参构造方法
//	public Teacher() {}
//	
//	//getXxx()/setXxx()
//	
//	public void eat() {
//		System.out.println("吃饭");
//	}
//}
/*我们观察上面的代码：
    //发现name,age成员变量，以及//getXxx()/setXxx(),还有eat()等都是相同的。
	如果我们后来继续定义类，举例：工人类、军人类，我们是不是也具备这些内容。
	那么，我们每一次定义这样的类的时候，都要把这些充分的内容都重新定义一遍。
	麻烦不？麻烦，所以，我们要考虑改进？
  如何改进呢?
  	我这样想的，我能不能把这些相同内容给到一个独立的类中
  	然后，让这多个类和这个独立的类产生一个喘息，有个这个关系后,
  	这多个类就可以具备这个独立的类的功能
  	为了实现这个效果，java就提供了一个技术：继承
  	
  	父亲：
  		4个儿子
  继承怎么表示呢？继承的格式是什么样子的呢？

class Fu{}

class  zi extends Fu{
	
}
*/
//我们就回头修改我们的代码
class Person{
	String name;
	int age;
	
	//无参构造方法
	public Person() {}
	
	//getXxx()/setXxx()
	
	public void eat() {
		System.out.println("吃饭");
	}
}

class Studentlx extends Person{
	public Studentlx() {}
}
class Teacherlx extends Person{
	public Teacherlx() {}
}

public class StudentDemolx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
