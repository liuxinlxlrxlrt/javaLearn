package class22_login_regist;

public interface UserDao3 {
	/**
	 * ��������û����в����Ľӿ�
	 * @author ������
	 * @version V1.1
	 *
	 */
   public abstract boolean isLogin(String username,String password);
   
   public abstract void regist(User user);
}
