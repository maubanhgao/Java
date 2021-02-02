# Tính kế thừa trong lập trình hướng đối tượng

## 1. Tính kế thừa trong lập trình hướng đối tượng Java là gì 

**Tính kế thừa** cho phép chúng ta cải tiến chương trình bằng cách kế thừa lại lớp cũ và phát triển những tính năng mới. Lớp con sẽ kế thừa tất cả những thành phần của lớp cha, nhờ sự chia sẻ này mới có thể mở rộng những đặc tính sẵn có mà không cần phải định nghĩa lại.

![](D:\data\source\Hoc lap trinh web\Java\img\4_Bốn tính chất của hướng đối tượng Java_Howkteam_com.png)

```java
class Vehicle {
  protected String model = "Ford"; 
  protected String color = "Red";   

  public void run() {                    
    System.out.println("Tuut, tuut!");
  }
}

class Bicycle extends Vehicle {
 
  public static void main(String[] args) {
    Bicycle myBike = Bicycle Car();
    myBike.run();
    System.out.println(myBike.color + " " + myBike.model);
  }
}

class Car extends Vehicle {

  private String modelName = "Mustang";    // Car attribute
 
  public static void main(String[] args) {
    Car myCar = new Car();
    myCar.run();
    System.out.println(myCar.color + " " + myCar.model);
  }
}
```

## 2. Không cho lớp con kế thừa 

Trong trường hợp mình có lớp cha nhưng không muốn cho lớp con kế thừa thì mình **dùng từ khoá final.**

```java
final class Vehicle {
  protected String model = "Ford"; 
  protected String color = "Red";   

  public void run() {                    
    System.out.println("Tuut, tuut!");
  }
}

class Bicycle extends Vehicle {
  public static void main(String[] args) {
    Bicycle myBike = Bicycle Car();
    myBike.run();
    System.out.println(myBike.color + " " + myBike.model);
  }
}
```

Như vậy khi chạy chương trình thì nó sẽ báo lỗi ở lớp Bicycle vì kế thừa lớp Vehicle. Chương trình sẽ thôgn báo cho chúng ta là lớp **Bicycle không thể kế thừa lớp Vehicle** được

## 3. Hướng dẫn cách tạo Kế thừa trong Java 

**Kế thừa** có nghĩa là thừa hưởng lại, ví dụ như tài sản của ba mẹ sẽ được giao lại cho con cái.

Kế thừa trong lập trình **(Inheritance)** có nghĩa là một lớp sẽ thừa hưởng lại những thuộc tính, phương thức từ lớp khác.

Việc sử dụng kế thừa nhằm tái sử dụng code đã viết trước đó, thuận tiện trong việc bảo trì và nâng cấp chương trình.

**Ví dụ:** ta có 2 lớp **Person** và **Student** như sau

![](D:\data\source\Hoc lap trinh web\Java\img\1_Kế thừa trong lập trình hướng đối tượng_Howkteam_com.png)



Ta thấy 2 lớp **Person** và **Student** có chung thuộc tính và phương thức. Ta sẽ để nguyên code ở lớp **Person** lại:

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
	
	public void getInfo() {
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
		System.out.println("Height:"+this.height);
	}	
}
```

Bây giờ ta chỉ cần cho lớp Student kế thừa Person như sau:

```java
public class Student extends Person{

	public Student(String name, int age, float height) {
		super(name, age, height);
	}	
}
```

Trong phương thức khởi tạo Student, ta sẽ dùng từ khóa **super** để cho lớp con truy cập các những thứ liên quan đến lớp cha. Như ví dụ trên thì ta dùng **super()** để gọi phương thức khởi tạo lớp cha.

Tiếp theo, ta thử khởi tạo đối tượng Student và gọi phương thức **getInfo()**:

```java
public class HelloWorld {

	public static void main(String[] args) {
		Student a = new Student("Chau", 21, 1.7f);
		a.getInfo();
	}
}
```

### *Slogan đặc trưng kế thừa: “Cha có thì con có, con có chưa chắc cha đã có”*

Tính chất kế thừa các ngôn ngữ lập trình hướng đối tượng đa số đều tương đồng với nhau về tính chất. Có thể các bạn không nhớ khái niệm và cú pháp, nhưng chỉ cần hiểu câu nói trên là bạn đã hiểu về kế thừa.

**Ví dụ:** Như ví dụ trước thì lớp Student kế thừa Person, ngoài những thuộc tính kế thừa ra, ta muốn thêm thuộc tính **universityName** cho Student

```java
public class Student extends Person {
	
	public String universityName;

	public Student(String name, int age, float height, String universityName) {
		super(name, age, height);
		this.universityName = universityName;
	}	
}
```

Như vậy theo đúng tính chất: lớp cha Person có name, age, height thì lớp con Student có. Lớp con Student có **universityName** thì lớp cha Person không có.

**Tận dụng từ khóa super để bảo trì và nâng cấp code**

Từ khóa super mục đích chính truy cập những phương thức của lớp cha. Trong việc phát triển phần mềm, ta cần nâng cấp chương trình. Việc tận dụng từ khóa super sẽ giúp ta vừa tận dụng những dòng code trước đó và viết tiếp code mới.

**Ví dụ:** ta thấy phương thức **getInfo()** chỉ trả về thông tin name, age, height. Bây giờ, ta sẽ nâng cấp phương thức có thể trả về thông tin universityName ở lớp Student

```java
public class Student extends Person {
	
	public String universityName;

	public Student(String name, int age, float height, String universityName) {
		super(name, age, height);
		this.universityName = universityName;
	}
	
	public void getInfo() {
		super.getInfo();
		System.out.println("University Name:"+this.universityName);
	}
	
}
```

Ta thử khởi tạo để kiểm tra:

```java
public class HelloWorld {

	public static void main(String[] args) {
		Student a = new Student("Chau", 21, 1.7f, "UTE");
		a.getInfo();
	}
}
```

Flow của chương trình có thể hiểu như sau:

![](D:\data\source\Hoc lap trinh web\Java\img\4_Kế thừa trong lập trình hướng đối tượng_Howkteam_com.png)

## 4. Tại sao lại sử dụng kế thừa. Mục đích sử dụng kế thừa trong lập trình