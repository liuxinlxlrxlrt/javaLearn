package class22_login_regist;
/**
 * ��������û����в����Ľӿ�
 * @author ��¹��
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
