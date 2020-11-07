package class22_login_regist;

public interface UserDao {

	/**
	 * 这是用户登录功能
	 * @param username  用户名
	 * @param password 密码
	 * @return 返回登录是否成功
	 */
	boolean isLogin(String username, String password);

	/**
	 * 这是用户注册功能
	* @param user 要注册的用户信息
	 */
	void regist(User user);

}