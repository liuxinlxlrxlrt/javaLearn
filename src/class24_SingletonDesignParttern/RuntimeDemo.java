package class24_SingletonDesignParttern;
/*
 * Runtime:ÿ�� Java Ӧ�ó�����һ�� Runtime ��ʵ����ʹӦ�ó����ܹ��������еĻ���������
 * exec(String command) ��
 * 
 */

import java.io.IOException;

public class RuntimeDemo {
	public static void main(String[] args) throws IOException {
		Runtime r =Runtime.getRuntime();
		r.exec("calc");//�򿪼��±�
		r.exec("notepad");//�򿪼�����
		r.exec("shutdowm -s -t 10000"); //10000s�ػ�
		r.exec("shutdown -a");//ȡ���ػ�����
	}
}
/*
 * class Runtime{
 * 		//���췽��˽��
 * 		private Runtime() {}
 * 		//����˽�еľ�̬�Ķ�����粻��ֱ���޸ģ�������ļ��ض�����
 * 		private static Runtime currentRuntime = new Runtime();
 * 		//�ṩһ��������ķ���������һ����Ķ���
 * 		public static Runtime getRuntime() {
        return currentRuntime;
    	}
    	
 * }
 * 
 */
