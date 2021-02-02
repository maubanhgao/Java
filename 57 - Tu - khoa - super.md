# Từ khóa super trong java

[TOC]

**Từ khóa super trong java** là một biến tham chiếu được sử dụng để tham chiếu trực tiếp đến đối tượng của lớp cha gần nhất.

Bất cứ khi nào bạn tạo ra instance(thể hiển) của lớp con, một instance của lớp cha được tạo ra ngầm định, nghĩa là được tham chiếu bởi biến **super**.

Trong java, từ khóa **super** có 3 cách sử dụng như sau:

1. Từ khóa super được sử dụng để tham chiếu trực tiếp đến biến instance của lớp cha gần nhất.
2. super() được sử dụng để gọi trực tiếp Constructor của lớp cha.
3. Từ khóa super được sử dụng để gọi trực tiếp phương thức của lớp cha.

## 1. Tham chiếu trực tiếp đến biến instance của lớp cha.

Từ khóa super được sử dụng để tham chiếu trực tiếp đến biến instance của lớp cha.

**Ví dụ:** khi không sử dụng từ khóa super

```java
class Vehicle {
    int speed = 50;
}
 
 public class Bike extends Vehicle {
    int speed = 100;
 
    void display() {
        System.out.println(speed); //in speed của lớp Bike   
    }
 
    public static void main(String args[]) {
        Bike b = new Bike();
        b.display();
    }
}
// 100
```

**Ví dụ:** khi sử dụng từ khóa super

```java
class Vehicle {
    int speed = 50;
}
 
public class Bike2 extends Vehicle {
    int speed = 100;
 
    void display() {
        System.out.println(super.speed);//in speed của lớp Vehicle  
    }
 
    public static void main(String args[]) {
        Bike2 b = new Bike2();
        b.display();
 
    }
}
// 50
```

## 2. Sử dụng super()

Trong java, super() được sử dụng để gọi trực tiếp Constructor của lớp cha.

```java
class Vehicle {
    Vehicle() {
        System.out.println("Vehicle is created");
    }
}
 
class Bike2 extends Vehicle {
    Bike2() {
        super();//gọi Constructor của lớp cha  
        System.out.println("Bike is created");
    }
 
    public static void main(String args[]) {
        Bike2 b = new Bike2();
    }
}
/*
Kết quả:
Vehicle is created
Bike is created
*/
```

**Note**: super() được tự động thêm vào mỗi Constructor của class bởi trình biên dịch.

![](D:\data\source\Học lập trình web\Java\img\tu-khoa-super-trong-java-1.jpg)

Như chúng ta đã biết Constructor được tạo ra tự động bởi trình biên dịch nhưng nó cũng thêm super() vào câu lệnh đầu tiên. Nếu bạn tạo Constructor và bạn không có this() hoặc super() ở dòng lệnh đầu tiên, trình biên dịch sẽ cung cấp super() của Constructor.

Một ví dụ khác của từ khóa super nơi super() được cung cấp ngầm định bởi trình biên dịch.

```java
class Vehicle {
    Vehicle() {
        System.out.println("Vehicle is created");
    }
}
 
public class Bike6 extends Vehicle {
    int speed;
 
    Bike6(int speed) {
        this.speed = speed;
        System.out.println(speed);
    }
 
    public static void main(String args[]) {
        Bike6 b = new Bike6(10);
    }
}
/*
Vehicle is created
10
*/
```

## 3. super được sử dụng để gọi trực tiếp phương thức của lớp cha.

Từ khóa super cũng có thể được sử dụng để gọi phương thức của lớp cha. Nó nên được sử dụng trong trường hợp lớp chứa các phương thức tương tự như lớp cha như trong ví dụ dưới đây:

```java
class Person {
    void message() {
        System.out.println("welcome");
    }
}
 
public class Student16 extends Person {
    void message() {
        System.out.println("welcome to java");
    }
 
    void display() {
        message();// gọi phương thức message() của lớp hiện tại
        super.message();// gọi phương thức message() của lớp cha
    }
 
    public static void main(String args[]) {
        Student16 s = new Student16();
        s.display();
    }
}
/*
welcome to java
welcome
*/
```

Trong ví dụ trên cả hai lớp Student và Person đều có phương thức message(). Nếu bạn gọi phương thức message() từ lớp Student thì phương thức message của Student sẽ đươc thực thi vì phương thức ở local sẽ được ưu tiên.

Trong TH không có phương thức ở class con giống class cha thì không cần phải sử dụng super. Ví dụ:

```java
class Person {
    void message() {
        System.out.println("welcome");
    }
}
 
public class Student17 extends Person {
 
    void display() {
        message();// will invoke parent class message() method
    }
 
    public static void main(String args[]) {
        Student17 s = new Student17();
        s.display();
    }
}
//welcome
```

