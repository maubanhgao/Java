# Tính đóng gói trong lập trình hướng đối tượng

[TOC]

## Tính đóng gói trong lập trình hướng đối tượng Java là gì 

**Tính đóng gói đảm bảo rằng dữ liệu nhạy cảm và quan trọng sẽ bị ẩn đi từ người dùng.**

**Tính đóng gói** nhằm bảo vệ đối tượng không bị truy cập từ code bên ngoài vào để thay để giá trị các thuộc tính hay có thể truy cập trực tiếp. Việc cho phép truy cập các giá trị của đối tượng tùy theo sự đồng ý của người viết ra lớp của đối tượng đó. Tính chất này đảm bảo sự bảo mật, toàn vẹn của đối tượng trong Java.

![](D:\data\source\Hoc lap trinh web\Java\img\2_Bốn tính chất của hướng đối tượng Java_Howkteam_com.png)

Để làm được tính đóng gói ẩn dữ liệu quan trọng thì ta sử dụn**g từ khoá private** cho các thuộc tính và cung cấp **phương thức get và set** cho các đối tượng khác muốn cập nhật giá trị hoặc lấy giá trị.

```java
public class Person {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
}
public class MyClass {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.name = "John";  // error
    System.out.println(myObj.name); // error 
  }
}
```

