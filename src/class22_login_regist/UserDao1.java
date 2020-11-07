package class22_login_regist;
/**
 * 这是针对用户进行操作的接口
 * @author 钟鹿纯
 * @version V1.1
 *
 */


public abstract class UserDao1 implements UserDao {
/* (non-Javadoc)
 * @see class22_login_regist.UserDao#isLogin(java.lang.String, java.lang.String)
 */
	@Override
	public abstract boolean isLogin(String username,String password);
	/* (non-Javadoc)
	 * @see class22_login_regist.UserDao#regist(class22_login_regist.User)
	 */
	@Override
	public abstract void regist(User user);
}
