# Sử dụng Interface

### Interface trong lập trình Java là gì

**Interface** là một kiểu dữ liệu tham chiếu trong Java. Nó là tập hợp các phương thức **abstract** (trừu tượng). Khi một lớp kế thừa **interface**, thì nó sẽ kế thừa những phương thức **abstract** của **interface** đó.

&&& Interface chính là 100% abstract class có nghĩa là trong abstract class ta có 10 phương thức như ta chỉ cần 5 phương thức abstract cũng được. 5 phương thức còn lại là các phương thức bình thường. Tuy nhiên nếu Abstract Class có 10 phương thức abstract thì lớp con phải Override lại 10 phương thức. Cũng tương tự như vậy tất cả các phương thức trong interface nếu có lớp con kế thừa nó thì bắt buộc lớp con phải Override lại 10 phương thức giống như abstract class vậy.

Một số đặc điểm của interface: 

- Không thể khởi tạo, nên không có phương thức khởi tạo.
- Tất cả các phương thức trong interface luôn ở dạng public abstract mà không cần khai báo.
- Các thuộc tính trong interface luôn ở dạng public static final mà không cần khai báo, yêu cầu phải có giá trị.

Mục đích của interface là để thay thế đa kế thừa lớp của những ngôn ngữ khác (ví dụ như C++, Python…). Ngoài ra, interface sẽ giúp đồng bộ và thống nhất trong việc phát triển hệ thống trao đổi thông tin.

**Cú pháp**

> **interface <tên interface> {**
>
> ​    **// Khai báo các thành phần bên trong interface**
>
> **}**

 **Ví dụ 1:**

Bây giờ ta sẽ tạo ra interface **IStudy** giành riêng cho class **Student**, ta vẫn tạo file .java như mọi khi và viết chương trình như sau:

```java
interface IStudy {
	void study();
}
```

Ta cho class **Student** kế thừa nó như sau:

```java
public class Student extends Person implements IStudy{
```

 Nếu dùng Eclipse, bạn sẽ thấy IDE yêu cầu override lại phương thức **study()** của **IStudy** ngay:

![](D:\data\source\Học lập trình web\Java\img\1_Interface trong lập trình hướng đối tượng Java_Howkteam_com.png)

Ta sẽ overriding, thêm đoạn chương trình trong lớp **Student** như sau:

```java
@Override
public void study() {
	// TODO Auto-generated method stub
	System.out.println(this.name+" is studing");
}
```

Một class có thể kế thừa nhiều interface, ta sẽ thử tạo thêm interface **ISpeak**:

```java
interface ISpeak {
	void speak();
}
```

 Ta thêm interface **ISpeak** vào class **Student** bằng cách sau:

```java
public class Student extends Person implements IStudy, ISpeak {}
```

 Hoặc, ta thử thêm **ISpeak** ở lớp cha Person:

```java
public abstract class Person implements ISpeak{}
```

 Bởi vì class **Person** là lớp ảo, nên **Person** không cần override phương thức **speak()**. Ngoài ra, **Student** là lớp con **Person**, nên mặc dù **Student** không kế thừa **ISpeak** trực tiếp nhưng vẫn phải override phương thức **speak()**. Ta sẽ thấy Eclipse yêu cầu khai báo:

![](D:\data\source\Học lập trình web\Java\img\2_Interface trong lập trình hướng đối tượng Java_Howkteam_com.png)

Ta sẽ hoàn thiện lớp **Student** như sau:

```java
public class Student extends Person implements IStudy{
	
	public String universityName;

	public Student(String name, int age, float height, String universityName) {
		super(name, age, height);
		this.universityName = universityName;
	}
	

	public void getInfo() {
		super.getInfo();
		System.out.println("University Name:"+this.universityName);
	}


	@Override
	public Object clone() {
		Student other = new Student(this.name, this.getAge(), this.height, this.universityName);
		return other;
	}


	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println(this.name+" is studing");
	}


	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(this.name+" is speaking");
	}
}
```

**Ví dụ 2:**

```java
/ Interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
```

Nhưng trong Interface chúng ta có thể thực hiện đa kế thừa được.

```java
interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Some text..");
  }
  public void myOtherMethod() {
    System.out.println("Some other text...");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}
```