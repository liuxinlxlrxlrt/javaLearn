package class22_login_regist;

public interface UserDao {

	/**
	 * �����û���¼����
	 * @param username  �û���
	 * @param password ����
	 * @return ���ص�¼�Ƿ�ɹ�
	 */
	boolean isLogin(String username, String password);

	/**
	 * �����û�ע�Ṧ��
	* @param user Ҫע����û���Ϣ
	 */
	void regist(User user);

}