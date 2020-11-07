package class21_exercise;
/*
 * 需求：键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低存入文本文件
 * 
 * 分析：
 * 		A：创建学生对象
 * 		B：创建集合对象
 * 			TreeSet<Student>
 * 		C：键盘录入学生信息
 * 		D：遍历集合，把数据写到文本文件
 */

public class Student {
	//姓名,语文成绩,数学成绩,英语成绩
	private String name;
	private int chninese;
	private int math;
	private int english;
	public Student(String name, int chninese, int math, int english) {
		super();
		this.name = name;
		this.chninese = chninese;
		this.math = math;
		this.english = english;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChninese() {
		return chninese;
	}
	public void setChninese(int chninese) {
		this.chninese = chninese;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	
	public int getSum() {
		return this.chninese+this.math+this.english;
	}
}
