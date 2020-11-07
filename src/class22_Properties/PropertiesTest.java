package class22_Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
 * ����һ���ļ�(user.txt),��֪�������Ǽ�ֵ�Ե���ʽ�����ǲ�֪��������ʲô
 * ��дһ�������ж��Ƿ��С�list�������ļ����ڣ�����о͸ı���Ϊ��100��
 * 
 * ������
 * 	A�����ļ��е����ݼ��ص�������
 * 	B���������ϣ���ȡ�õ�ÿһ����
 * 	C���жϼ��Ƿ���"list",����о��޸���ֵΪ"100"
 * 	D���Ѽ����е��������¼��ش洢���ļ���
 */
public class PropertiesTest {
	public static void main(String[] args) throws IOException {
		//���ļ��е����ݼ��ص�������
		Properties prop = new Properties();
		Reader r = new FileReader("user.txt");
		prop.load(r);
		r.close();
		
		//�������ϣ���ȡ�õ�ÿһ����
		Set<String> set = prop.stringPropertyNames();
		for(String key:set) {
			if("list".equals(key)) {
				prop.setProperty(key, "100");
				break;
			}
		}
		
		//�Ѽ����е��������¼��ش洢���ļ���
		Writer w = new FileWriter("user.txt");
		prop.store(w, null);
		w.close();
		
		
	}
}
