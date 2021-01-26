## Từ khóa this trong lập trình hướng đối tượng

[TOC]

## 1. Từ khóa this làm gì?

Từ khóa **this** dùng để ánh xạ đối tượng hiện tại. Giống như trong lớp **Student** có rất nhiều đối tượng như bạn Châu, Long, Thanh,… thì khi xử lý các thuộc tính và phương thức ta sẽ dùng từ ‘bạn ấy’ để ám chỉ đối tượng hiện tại cần thực hiện.

## 2. Cách sử dụng this

### 2.1. Ánh xạ đối tượng khi cần sử dụng

Như những ví dụ trước. Nếu như không sử dụng **this** trong phương thức khởi tạo:

```java
public class Person {
	public String name;
	public int age;
	public float height;
	
	public Person(String name, int age, float height) {
		name = name;
		age = age;
		height = height;
	}

}
```

Ta hãy thử khởi tạo đối tượng và in thông tin ra:

```java
public class HelloWorld {

	public static void main(String[] args) {
		Person a = new Person("Chau", 21, 1.7f);
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.height);
	}
}
```

Ta thấy xuất hiệt giá trị mặc định của thuộc tính khi khởi tạo, có nghĩa việc gán giá trị khi khởi tạo không thành công. Bây giờ ta hãy quan sát lại cách hiển thị trên Eclipse:

![](D:\data\source\Hoc lap trinh web\Java\img\2_Từ khóa this trong lập trình hướng đối tượng_Howkteam_com.png)

Như cách Eclipse thể hiện thì những biến màu xanh biển là chính là thuộc tính, còn biến mà nâu là tham số trong phương thức. Như vậy, nếu không có this, ta đang gán giá trị tham số cho chính nó. Không tác động đến thuộc tính của đối tượng.

![](D:\data\source\Hoc lap trinh web\Java\img\3_Từ khóa this trong lập trình hướng đối tượng_Howkteam_com.png)

Chỉ cần thêm **this**, màu sắc đã thay đổi.

### 2.2. Gọi phương thức từ lớp hiện tại

Ngoài gọi được thuộc tính, thì this có thể gọi đến phương thức từ lớp hiện tại.

**Ví dụ:** viết phương thức trả thông tin Person và gọi mỗi lần khởi tạo đối tượng.

```java
public class Person {
	public String name;
	public int age;
	public float height;
	
	public Person(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.getInfo();
	}
	
	public void getInfo() {
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
		System.out.println("Height:"+this.height);
	}
}
```

Tại chương trình main

```java
public class HelloWorld {

	public static void main(String[] args) {
		Person a = new Person("Chau", 21, 1.7f);
		Person b = new Person("Long", 24, 1.7f);
	}
}
```

## 3. Gọi lại phương thức khởi tạo

Khi dùng **this()** thì sẽ triệu hồi phương thức khởi tạo **Constructor** của lớp hiện tại. Thường được sử dụng trong việc có nhiều phương thức khởi tạo và muốn tái sự dụng code nhiều lần:

**Ví dụ:** ta tạo 3 phương thức khởi tạo cho Person như sau

```java
public class Person {
	public String name;
	public int age;
	public float height;
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
		this(name);
		this.age = age;
	}
	
	public Person(String name, int age, float height) {
		this(name, age);
		this.height = height;
	}
	
	public void getInfo() {
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
		System.out.println("Height:"+this.height);
	}
}
```

Như vậy ở phương thức main, ta có thể khởi tạo đối tượng Person theo nhiều cách khác nhau:

```java
public class HelloWorld {

	public static void main(String[] args) {
		Person a = new Person("Chau");
		Person b = new Person("Chau", 21);
		Person c = new Person("Chau", 21, 1.7f);
	}
}
```

Việc chạy các phương thức khởi tạo có thể hiểu theo cách sau:

![](D:\data\source\Hoc lap trinh web\Java\img\5_Từ khóa this trong lập trình hướng đối tượng_Howkteam_com.png)

## 4. Trả về đối tượng (instance) của lớp hiện tại

Ta sẽ trả về **instance** của lớp hiện bằng từ khóa **this** như sau:

```java
public class Person {
	public String name;
	public int age;
	public float height;
		
	public Person(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
    
	@Override
	public String toString() {
		return "Person_2 [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
    
	public Person getInstance() {
		return this;
	}
}
```

```java
public class HelloWorld {

	public static void main(String[] args) {
		Person a = new Person("Chau", 21, 1.7f);
		System.out.println(a);
		System.out.println(a.getInstance());
		Person b = a;
		Person c = a.getInstance();
		System.out.println(b);
		System.out.println(c);
	}
}
```

Ở kết quả đều trả về chung một giá trị, giá trị in ra theo kiểu quy tắc kiểu dữ liệu tham chiếu : **[tên lớp]@[vị trí lưu trữ]**