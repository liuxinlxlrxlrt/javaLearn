package class21_exercise;

import java.io.IOException;
import java.io.Reader;

import class21_exercise.MyBufferedReader;

public class MyLineNumberReader2 extends MyBufferedReader{
	private Reader r;
	
	public MyLineNumberReader2(Reader r) {
		super(r);
	}
	
	private int lineNumber = 0;
	
	public int getLineNumber() {
		return lineNumber;
	}


	public void setLineNumber(int lineNumber) {
		
		this.lineNumber = lineNumber;
	}

	@Override
	public String readLine() throws IOException {
		lineNumber++;
		return super.readLine();
	}

}
