package class16_Generic;

public class ObjectTool {
	
	private Object obj;
	
	public Object getObj() {
		return obj;
	}
	
	public void setObj(Object obj) {//Object obj = new Integer(30);父引用指向子对象，叫多态
		this.obj = obj;
	}
}
