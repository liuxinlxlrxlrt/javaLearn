package class22_login_regist;

public interface UserDao3 {
	/**
	 * 这是针对用户进行操作的接口
	 * @author 杨铭铭
	 * @version V1.1
	 *
	 */
   public abstract boolean isLogin(String username,String password);
   
   public abstract void regist(User user);
}
