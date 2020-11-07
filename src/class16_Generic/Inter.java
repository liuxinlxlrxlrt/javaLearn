package class16_Generic;

/*
 * 泛型接口：把泛型定义在接口上，不能直接使用
 */

public interface Inter<T> {
	//接口中默认的方式是public abstract
	public abstract void show(T t);
}
