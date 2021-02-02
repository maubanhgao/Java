# Ghi đè phương thức trong java

[TOC]

## Ghi đè phương thức (method overriding)

**Ghi đè phương thức** trong java xảy ra nếu lớp con có phương thức giống lớp cha.

Nói cách khác, nếu lớp con cung cấp sự cài đặt cụ thể cho phương thức đã được cung cấp bởi một lớp cha của nó được gọi là ghi đè phương thức (method overriding) trong java.

## Sử dụng ghi đè phương thức trong java

- Ghi đè phương thức được sử dụng để cung cấp cài đặt đặc biệt của một phương thức mà đã được định nghĩa ở lớp cha.
- Ghi đè phương thức được sử dụng cho đa hình runtime.

## Các nguyên tắc ghi đè phương thức trong java

1. Phương thức phải có tên giống với lớp cha.
2. Phương thức phải có tham số giống với lớp cha.
3. Lớp con và lớp cha có mối quan hệ kế thừa.

## Ví dụ ghi đè phương thức trong java

Trong ví dụ này, chúng ta định nghĩa phương thức run() trong lớp con giống như đã được định nghĩa trong lớp cha, nhưng được cài đặt rõ ràng trong lớp con. Tên và tham số của phương thức là giống nhau, 2 lớp cha và con có quan hệ kế thừa.

```java
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}
 
public class Bike2 extends Vehicle {
    void run() {
        System.out.println("Bike is running safely");
    }
 
    public static void main(String args[]) {
        Bike2 obj = new Bike2();
        obj.run();
    }
}
//Bike is running safely
```

## Ví dụ thực tế về ghi đè phương thức trong java

Giả sử Bank là một lớp cung cấp chức năng xem thông tin tỷ lệ lãi suất. Nhưng mỗi ngân hàng có một lãi xuất khác nhau, ví dụ các ngân hàng SBI, ICICI và AXIS có tỷ lệ lãi suất lần lượt là 8%, 7% và 9%.

![](D:\data\source\Hoc lap trinh web\Java\img\ghi-de-phuong-thuc-trong-java1.png)

Dưới đây là cài đặt cho ví dụ trên:

```java
class Bank {
    int getRateOfInterest() {
        return 0;
    }
}
 
class SBI extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}
 
class ICICI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}
 
class AXIS extends Bank {
    int getRateOfInterest() {
        return 9;
    }
}
 
public class Test2 {
    public static void main(String args[]) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
    }
}
/*
SBI Rate of Interest: 8
ICICI Rate of Interest: 7
AXIS Rate of Interest: 9
*/
```

## Câu hỏi về ghi đè phương thức trong java

##### Có ghi đè được phương thức static không?

Không, phương thức static không thể ghi đè được, bằng chứng là đa hình runtime, vấn đề này sẽ được học trong bài sau.

##### Tại sao không ghi đè được phương thức static?

Vì phương thức static được ràng buộc với class còn phương thức instance được ràng buộc với đối tượng. Static thuộc về vùng nhớ class còn instance thuộc về vùng nhớ heap.

##### Có ghi đè phương thức main được không?

Không, vì main là phương thức static.