package generic_1;

class Box<T>{
	private T t;
	public void add(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
}
public class Example1 {

	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<Integer>();
		Box<String> strBox = new Box<String>();
		
		integerBox.add(new Integer(100));
		strBox.add(new String("Hello"));
		
		System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", strBox.get());
	}

}
