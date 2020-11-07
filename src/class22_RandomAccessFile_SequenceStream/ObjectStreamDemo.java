package class22_RandomAccessFile_SequenceStream;
/*
 * ���л������Ѷ�����һ���ķ�ʽ�����ı��ļ������������д��䡣����--�����ݣ�ObjectOutputStream
 * �����л������ı��ļ��е����������ݻ��������е�������ԭ�ɶ���������--����ObjectInputStream
 * 
 * ע�⣺
 * 		��һ�����п����кܶ�ĳ�Ա��������Щ�Ҳ���������л���������ô���أ�
 * 		ʹ��transient�ؼ�����������Ҫϵ�л��ĳ�Ա����
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//��������Ҫ�Զ������л������������Զ���һ����
		//���л�������ʵ���ǰѶ���д���ı��ļ�
//		write();
		read();
	}

	private static void read() throws IOException, ClassNotFoundException {
		//���������л�����
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
		
		//��ԭ����
		Object obj = ois.readObject();
		
		//�ͷ���Դ
		ois.close();
		
		//�������
		System.out.println(obj);
		
		
	}

	private static void write() throws IOException {
		//�������л�������
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
		
		//��������
		Person p = new Person("�ױ�",27);
		
		//public final void writeObject(Object obj)
		oos.writeObject(p);
		
		//�ͷ���Դ
		oos.close();
	}
}
