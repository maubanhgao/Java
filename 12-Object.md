# Đối tượng

[TOC]

### 1. Object là gì 

**Mọi thứ trong** **lập trình Java** **đều liên quan đến** **Object (đối tượng)**

Đối tượng ở đây ta thể hiểu như khái niệm bên ngoài: Con người, Xe máy, Nhà cửa…

Trong một đối tượng sẽ bao gồm 2 thông tin: **thuộc tính** và **phương thức.**

- **Thuộc tính:** là những thông tin của đối tượng. Ví dụ: con người có họ tên, chiều cao, độ tuổi,…
- **Phương thức:** là những thao tác, hành động mà đối tượng đó có thể thực hiện. Ví dụ: con người có những hành động ăn, ngủ, đi lại,…

### 2. Tạo một Class 

Lớp chính là định nghĩa của đối tượng, ta sẽ xây dựng lớp để tạo ra những đối tượng khác nhau.

Như vậy **con người** chính là **lớp**, **Nguyễn Văn A** và **Lê Văn B** là **đối tượng**.

```java
public class Person {
  string name = "Nguyen van A";
}
```

### 3. Tạo một Object 

**Từ 1 class chúng ta tạo ra Object thông qua từ khoá new**

```java
public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    System.out.println(myObj.x);
  }
}
```

### 4. Tạo nhiều Object từ một Class 

```java
public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj1 = new MyClass();  // Object 1
    MyClass myObj2 = new MyClass();  // Object 2
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}
```

### 5. Hàm khởi tạo constructor 

```java
public class Car {
  int x;  // Create a class attribute

  // Create a class constructor for the Car class
  public Car() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    Car myObj = new Car(); // Create an object of class Car (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}
```

### 6. Hàm khởi tạo constructor có tham số 

```java
public class MyClass {
  int x;

  public MyClass(int y) {
    x = y;
  }

  public static void main(String[] args) {
    MyClass myObj = new MyClass(5);
    System.out.println(myObj.x);
  }
}
```

### 7. Hàm khởi tạo constructor có nhiều tham số 

```java
public class Car {
  int modelYear;
  String modelName;

  public Car(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Car myCar = new Car(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}
```

### 8. Thuộc tính 

```java
public class Car {
  
  private String color;
  
  private int model

}
```

### 9. Thao tác với thuộc tính 

```java
public class Car {
  private int model = 2020;

  public static void main(String[] args) {
    Car myObj = new Car();
    int modelCar = myObj.model;
    
  }
}
```

### 10. Phương thức

**Phương thức là những hành động của một đối tượng.**

```java
public class Car {

  static void run() {
    System.out.println("Xe đang chay");
  }
}
```