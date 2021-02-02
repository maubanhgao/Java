# Sử dụng Access Modifier

[TOC]

## 1. Tầm quan trọng của access modifier 

**Phạm vi truy cập** (access modifiers) là xác định độ truy cập phạm vi vào dữ liệu của các thuộc tính, phương thức hoặc class.

**Package** (gói) là nhóm các **class**, **interface** hoặc các **package** con liên quan lại với nhau. Việc dùng package dùng để nhóm các class liên quan với nhau thành thư viện như thư viện swing, awt,…Ngoài ra, mục đích của package ngăn cản xung đột đặt tên, điều kiện truy cập, thuận tiện tìm kiếm và lưu trữ.

## 2. Từ khoá public dùng làm gì 

Đây phạm vi truy cập rộng, có thể truy cập bất cứ đâu trong **project Java**. Tất nhiên khi khác **package** để cần phải khai báo **import** để xác định ví trí của class như phần giải thích trên trên.

## 3. Từ khoá private dùng làm gì 

**Private** chỉ cho phép truy cập **nội bộ của một class.**

**Ví dụ:** cho thuộc tính age của class **Person** ở dạng **private**, thì chỉ có thể truy cập age trong class Person.

![](D:\data\source\Học lập trình web\Java\img\6_Các loại phạm vi truy cập trong lập trình hướng đối tượng_Howkteam_com.png)

## 4. Từ khoá default dùng làm gì 

Đây là phạm vị mặc định, khi bạn không ghi gì hết thì nó để phạm vị truy cập dạng này: Ở mặc định, phạm vi truy cập chỉ nằm trong **nội bộ package.**

**Ví dụ:** ta xóa tất cả phạm vị truy cập ở class Person như sau

```java
class Person {
	String name;
	int age;
	float height;
	
	void eat(String foodName) {
		System.out.println(name + " is eating "+ foodName);
	}
	
	int getAge() {
		return age;
	}
}
```

Nếu ta quay lại cho class **Person** và **HelloWorld** chung một package thì sử dụng được:

![](D:\data\source\Học lập trình web\Java\img\7_Các loại phạm vi truy cập trong lập trình hướng đối tượng_Howkteam_com.png)

Nhưng nếu để class **Person** ở package **mypack** thì sẽ báo lỗi:

![](D:\data\source\Học lập trình web\Java\img\8_Các loại phạm vi truy cập trong lập trình hướng đối tượng_Howkteam_com.png)

## 5. Từ khoá protected dùng làm gì 

**Protected** là phạm vi truy cập có thể từ **trong và ngoài package******, nhưng phải thông qua tính kế thừa.****

**Protected** chỉ có thể áp dụng bên trong class như thuộc tính, phương thức hay lớp con. Không thể áp dụng cho lớp ngoài hay **interface**.

**Ví du:** ta sửa class **Person** như sau:

```java
package mypack;
public class Person {
	protected String name;
	protected int age;
	protected float height;
	
	public Person(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	protected void eat(String foodName) {
		System.out.println(name + " is eating "+ foodName);
	}
	
	protected int getAge() {
		return age;
	}
}
```

Để truy cập được **Person**, ta sẽ cho class **HelloWorld** kế thừa class **Person**. Rồi sẽ tạo đối tượng **HelloWorld** trong main:

```java
import mypack.Person;

public class HelloWorld extends Person {

	protected HelloWorld(String name, int age, float height) {
		//phương thức khởi tạo HelloWorld sẽ gọi phương thức Person
		super(name, age, height);
	}

	public static void main(String[] args) {
		HelloWorld a = new HelloWorld("Chau", 21, 1.7f);
		a.eat("Rice");
	}
}
```

![](D:\data\source\Học lập trình web\Java\img\9_Các loại phạm vi truy cập trong lập trình hướng đối tượng_Howkteam_com.png)

## 6. Từ khoá static dùng làm gì 

**Static : khi mình muốn chia sẽ (dùng chung, và là duy nhất tron cả hệ thống) cái biến đó cho các object khác có thể sử dụng được.**

```java
public class Card {

  public static int cardNumber;

}
```

## 7. Từ khoá final dùng làm gì 

**Final : Khi mình muốn giá trị là** **hằng số và không thể thay đổi được** **(Ví dụ final double PI = 3.14).**

```java
public class Card {

  public final int CARNUMBER = 123123321233;

}
```

## 8. Tổng kết

Việc sự dụng đúng scope (phạm vi) của biến rất quan trọng trong lập trình .Đối với các thuộc tính có tính bảo mật cao ta chỉ cho phép nội bộ của nó có thể thấy và thay đổi được giá trị . Nếu ta không làm như vậy thì lớp nào cũng thấy và sẽ thay đổi giá trị đó làm cho việc kiểm soát và bảo mật không còn nữa dẫn đến chương trình chạy sai ý định của mình , đồng thời ai cũng thấy và sẽ thay đổi được giá trị của biến