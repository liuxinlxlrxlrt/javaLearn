package class20_IOStream_FileOutputStream;
/*
 * �����쳣������ֽ����������
 * 
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo04 {

	public static void main(String[] args){
		//�ֿ����쳣����
//		FileOutputStream fos = null;
//		try {
//			fos = new FileOutputStream("fos5.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		//д����
//		try {
//			fos.write("java".getBytes());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		//�ͷ���Դ
//		try {
//			fos.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//һ�����쳣����	
//		try {
//			FileOutputStream fos = new FileOutputStream("fos5.txt");
//			fos.write("java".getBytes());
//			fos.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//�Ľ�
		//Ϊ����finally�����ܹ���������ͱ��붨�嵽���棬Ϊ�˷��ʲ������⣬���������ʼ��ֵ
		FileOutputStream fos =null;
		try {
//			fos = new FileOutputStream("z:\\fos5.txt");
			fos = new FileOutputStream("fos5.txt");
			fos.write("java".getBytes());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//Ϊ�˱�֤close()һ����ִ�У��ͷŵ�������
			try {
				//���fos����null������Ҫclose()
				if(fos != null) {
					fos.close();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}

}
