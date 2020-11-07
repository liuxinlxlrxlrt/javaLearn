package class16_Generic;

/*
 * 泛型定义在类上
 */
//这是一个泛型类
//格式:public class 类名<泛型类型1,…>
//注意:泛型类型必须是引用类型

public class ObjectTool2<T> {
	
	private T obj;
	
	//shift+ail+s+r
	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}
