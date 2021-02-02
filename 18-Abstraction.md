# Tính trừu tượng trong lập trình hướng đối tượng

## **Tính trừu tượng trong lập trình hướng đối tượng Java là gì**

**Tính trừu tượng là cách mình dấu đi các chi tiết quan trọng và chỉ hiển thị những thông tin cần thiết.**

**Tính trừu tượng** là một tiến trình chỉ nói ra tính năng của người dùng, các khái niệm được định nghĩa trong quá trình phát triển, bỏ qua những chi tiết triển khai bên trong. Tính trừu tượng cho phép người lập trình tập trung cốt lõi cần thiết của đối tượng thay vì quan tâm sự phức tạo bên trong hoặc cách nó hoạt động.

![](D:\data\source\Hoc lap trinh web\Java\img\3_Bốn tính chất của hướng đối tượng Java_Howkteam_com.png)

**Trong một lớp abstract ta khai báo một phương thức abstract bằng từ khoá abstract tên method.**

```java
// Abstract class
abstract class Animal {
  public abstract void animalSound();
  public void sleep() {
    System.out.println("Zzz");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Pig myPig = new Pig(); 
    myPig.animalSound();
    myPig.sleep();
  }
}
```

Như vậy ta thấy lớp Animal có phương thức abstract là animalSound. Người sử dụng chỉ biết có phương thức đó thôi còn nội dung code bên trong cài đặt như thế nào thì không biết. Các em có thể tưởng tượng trong ví dụ Facebook ở trên của anh. cái hàm abstract void animalSound() tương ứng với việc là Facebook cho mình cái link và mình nhúng vào, còn nội dung bên trong thì mình không biết. Như vậy phương thức animalSound() ở lớp Animal giúp che giấu đi những code quan trọng và chỉ để lớp con của nó cài đặt những code thực thi. Người dùng chỉ biết gọi hàm animalSound và nhận kết quả.