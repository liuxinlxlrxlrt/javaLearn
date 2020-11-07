package class10;
/*
 * 包的概述
		其实就是文件夹
		作用：
			A:把相同的类名放导不同包中
			B:对类进行分类管理
   包的划分：
	举例：
		学生的增加，删除，修改，查询
		老师的增加，删除，修改，查询
		
		方案1：按照功能分
			cn.itcast.add
				AddStudent
				AddTeacher
			cn.itcast.delete
				DeleteStudent
				Deleteteacher
			cn.itcast.update
				UpdateStudent
				Updateteacher
			
		方案2：按模块划分
			cn.itcast.Teacher
				AddTeacher
				Deleteteacher
				Updateteacher
			cn.itcast.Student
				AddStudent
				DeleteStudent
				UpdateStudent
				
	包的定义及注意事项：
		package 包名;
			多级包用.分开即可

	注意事项：
		A:package语句必须是程序的第一条可执行的代码
		B:package语句在一个java文件中只能有一个
		C:如果没有package，默认表示无包名
	
	带包的类的编译和运行
	 A:手动式
		a:javac编译当前类文件。
		b:手动建立包对应的文件夹。
		c:把a步骤的class文件放到b步骤的最终文件夹下。
		d:通过java命令执行。注意了：需要带包名称的执行
		java cn.itcast.HelloWorld
	B:自动式
		a:javac编译的时候带上-d即可
		javac -d . HelloWorld.java
		b:通过java命令执行。和手动式一样
	

 */

public class Package {
	public static void main(String[] args) {
		System.out.println("HelloWord");
	}
}
