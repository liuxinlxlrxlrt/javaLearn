package class21_exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyLineNumberReaderTest {

	public static void main(String[] args) throws IOException {
//		MyLineNumberReader mlnr = new MyLineNumberReader(new FileReader("MyBufferedReader.txt"));
		MyLineNumberReader2 mlnr = new MyLineNumberReader2(new FileReader("MyBufferedReader.txt"));
//		mlnr.setLineNumber(10);
//		System.out.println(mlnr.getLineNumber());
//		System.out.println(mlnr.getLineNumber());
//		System.out.println(mlnr.getLineNumber());
		
		String line = null;
		while((line = mlnr.readLine())!=null) {
			System.out.println(mlnr.getLineNumber()+"£º"+line);
		}
		mlnr.close();
	}

}
