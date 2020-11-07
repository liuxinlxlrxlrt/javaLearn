package class21_exercise;
/*
 * ��Readerģ��BufferedReader��readLine()����
 * 
 * readline():һ�ζ�ȡһ�У�����ݻ��з��ж��Ƕ�������ֻ�������ݣ������ػ��з�
 */

import java.io.IOException;
import java.io.Reader;

public class MyBufferedReader {

		private Reader r;
		
		public MyBufferedReader(Reader r) {
			this.r = r;
		}
		
		/*
		 * ˼����дһ������������ֵ��һ���ַ���
		 * 
		 */
		public String readLine() throws IOException {
			/*
			 * ��Ҫ����һ���ַ�����Ҫ��ô���أ�
			 * ���Ǳ���ȥ����r�����ܹ���ȡʲô����
			 * ������ȡ������һ�ζ�ȡһ���ַ�����һ�ζ�ȡһ���ַ�����
			 * ��ô������Ҫ����һ���ַ���������һ�������ȽϺ��أ�
			 * ���Ǻ������뵽�ַ�����ȽϺ��أ������������ˣ������������ĳ����Ƕ೤�أ�
			 * ����û�а취��������ĳ��ȣ��㶨��೤��������
			 * ���ԣ�ֻ��ѡ��һ�ζ�ȡһ���ַ�
			 * �����أ����ַ�ʽ��ʱ�������ٶ�ȡ��һ���ַ���ʱ����һ���ַ��Ͷ�ʧ��
			 * ����������Ӧ�ö���һ����ʱ�洢�ռ�Ѷ�ȡ�����ַ����洢����
			 * �����ˮ�ȽϺ����أ����飬���ϡ��ַ��������������ɹ�ѡ��
			 * �����򵥵ķ���������ѡ��ʹ���ַ������������󣬲���ʹ�õ���StringBuilder
			 */
			StringBuilder sb = new StringBuilder();
			
			//�������ȡʱ�鷳�����жϽ����������ڽ���֮ǰӦ��һֱ��ȡ��ֱ��-1
			/*
			hello
			world
			java
			*/
			int ch = 0;
			while((ch = r.read())!=-1) {
				if(ch == '\r') {
					continue;
				}
				if(ch == '\n') {
					return sb.toString();
				}else {
					sb.append((char)ch);
				}
			}
			//Ϊ�˷�ֹ���ݶ�ʧ���ж�sb�ĳ��Ȳ��ܴ���0
			if(sb.length()>0) {
				return sb.toString();
			}
			return null;
		}
		
		/*
		 * ��дһ���رշ���
		 */
		public void close() throws IOException{
			this.r.close();
		}
	}


