package class22_login_regist;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UserDaoImpl implements UserDao {
/**
 * 这是用户操作的具体实现类(IO版)
 * @author 周欣妤
 * @verson V1.1
 */
	//为了保证文件一加载就创建
	private static File file = new File("user.txt");
	
	//静态代码块：随着类的加载而执行，只执行一次
	static {
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("创建文件失败");
			e.printStackTrace();
		}
	}
	@Override
	public boolean isLogin(String username, String password) {
		boolean flag = false;
		BufferedReader br= null;
		
		try {
//			br = new BufferedReader(new FileReader("user.ext"));	
			br = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = br.readLine())!=null) {
				//用户名==密码
				String[] datas = line.split("=");
				if(datas[0].equals(username)&&datas[1].equals(password)) {
					flag = true;
					break;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("用户登录找不到信息所在的文件");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("用户登录失败");
			e.printStackTrace();
		}finally {
			try {
				if(br!=null) {
					br.close();
				}
			} catch (IOException e) {
				System.out.println("用户登录释放资源失败");
				e.printStackTrace();
			}
		}
		return flag;
	}

	@Override
	public void regist(User user)  {
	/*
	 * 为了让注册的数据有一定的规则，我就自己定义了一个规则
	 * 用户名==密码
	 */
		BufferedWriter bw = null;
	try {
//		bw = new BufferedWriter(new FileWriter("user.txt"));
//		bw = new BufferedWriter(new FileWriter(file));
		//为了保证数据是追加写入，必须加true
		bw = new BufferedWriter(new FileWriter(file,true));
		bw.write(user.getUsername()+"="+user.getPassword());
		bw.newLine();
		bw.flush();

	} catch (IOException e) {
		System.out.println("用户注册失败");
		e.printStackTrace();
	}finally {
		if(bw!=null) {
		try {
			bw.close();
		} catch (IOException e) {
			System.out.println("用户注册释放资源失败");
			e.printStackTrace();
		}
		}
	}
	
	
		

	}

}
