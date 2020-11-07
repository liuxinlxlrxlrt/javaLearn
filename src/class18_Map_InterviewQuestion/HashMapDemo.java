package class18_Map_InterviewQuestion;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		
		hm.put("it001", "hello");
		hm.put(null, "world");
		hm.put("java", null);
		
		System.out.println(hm);
		//∑µªÿ÷µ£∫{null=world, java=null, it001=hello}
	}

}
