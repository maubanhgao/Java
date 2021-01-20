# Sử dụng Abstract

[TOC]

## 1. Abstract trong lập trình Java là gì 

Trừu tượng trong lập trình Java có nghĩa là tuyến trình che giấu đi những chi tiết quan trọng và chỉ hiển thị những thông tin cần thiết cho người sử dụng. Để thực hiện được tính trừu tượng chúng ta sử dụng từ khoá abstract hoặc interface. 

**Chúng ta có thể áp dụng từ khoá abstract cho class hoặc method.**

Khi áp dụng abstract cho class thì chúng ta không thể tạo đối tượng từ lớp abstract được. Abstract method chỉ được sử dụng và khai báo trong abstract class. Abstract method sẽ không có phần thân (code thực thi).

**Ví dụ hoàn chỉnh về abstract class và code thực thi abstract method trong lớp con**

```java
// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
```

## 2. Tại sao chúng ta sử dụng Abstract 

- ể đảm bảo tính bảo mật.
- Chúng ta chỉ đưa ra những thông tin cần thiết và che giấu những thông tin quan trọng.

## 3. Cách tạo abstract trong Java

