# Sử dụng Method

[TOC]

### 1. Method trong ngôn ngữ lập trình Java là gì 

**Method là một khối tập trung các dòng lệnh code để thực hiện mục đích của method khi chương trình gọi method.** 

### 2. Tạo Method 

```java
public class MyClass {

  public void myMethod() {

    // code to be executed
  }

}
```

### 3. Gọi Method 

```java
public class MyClass {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}
```

### 4. Gọi Method nhiều lần 

```java
public class MyClass {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
    myMethod();
    myMethod();
  }
}
```

### 5. Truyền tham số trong phương thức 

```java
public class MyClass {
  static void myMethod(String fname) {
    System.out.println(fname + " Refsnes");
  }

  public static void main(String[] args) {
    myMethod("Liam");
    myMethod("Jenny");
    myMethod("Anja");
  }
}
// Liam Refsnes
// Jenny Refsnes
// Anja Refsnes
```

### 6. Truyền nhiều tham số trong phương thức 

```java
public class MyClass {
  static void myMethod(String fname, int age) {
    System.out.println(fname + " is " + age);
  }

  public static void main(String[] args) {
    myMethod("Liam", 5);
    myMethod("Jenny", 8);
    myMethod("Anja", 31);
  }
}

// Liam is 5
// Jenny is 8
```

### 7. Trả về kết quả trong phương thức 

```java
public class MyClass {
  static int myMethod(int x) {
    return 5 + x;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(3));
  }
```

- Chú ý hàm void thì không có return trả về

  ```java
  public class MyClass {
    static void myMethod(int x) {
        System.out.println("không có return")
    }
  
    public static void main(String[] args) {
        myMethod();
    }
  }
  ```

### 8. Phương thức override

Nhiều phương thức có thể có **cùng tên nhưng khác tham số và kiểu dữ liệu** truyền vào cũng hợp lệ

```java
static int plusMethodInt(int x, int y) {
  return x + y;
}

static double plusMethodDouble(double x, double y) {
  return x + y;
}

public static void main(String[] args) {
  int myNum1 = plusMethodInt(8, 5);
  double myNum2 = plusMethodDouble(4.3, 6.26);
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
}
```