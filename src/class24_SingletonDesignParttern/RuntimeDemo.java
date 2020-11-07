package class24_SingletonDesignParttern;
/*
 * Runtime:每个 Java 应用程序都有一个 Runtime 类实例，使应用程序能够与其运行的环境相连接
 * exec(String command) ：
 * 
 */

import java.io.IOException;

public class RuntimeDemo {
	public static void main(String[] args) throws IOException {
		Runtime r =Runtime.getRuntime();
		r.exec("calc");//打开记事本
		r.exec("notepad");//打开计算器
		r.exec("shutdowm -s -t 10000"); //10000s关机
		r.exec("shutdown -a");//取消关机命令
	}
}
/*
 * class Runtime{
 * 		//构造方法私有
 * 		private Runtime() {}
 * 		//创建私有的静态的对象，外界不能直接修改，随着类的加载而加载
 * 		private static Runtime currentRuntime = new Runtime();
 * 		//提供一个公共类的方法，返回一个类的对象
 * 		public static Runtime getRuntime() {
        return currentRuntime;
    	}
    	
 * }
 * 
 */
