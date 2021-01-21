# Toán tử dấu 2 chấm (::) trong Java 8

## Toán tử dấu 2 chấm (::) trong Java

**Toán tử dấu 2 chấm (::) trong Java hay còn được gọi là toán tử tham chiếu phương thức** trong java. Nó được sử dụng để gọi một phương thức của một lớp khác (cung cấp bản cài đặt cho phương thức trừu tượng của một Functional Interface).

Nó giống như biểu thức lambda. Chỉ khác nhau ở chỗ đó là toán tử :: tham chiếu đến phương thức bởi tên của phương thức.

Biểu thức Lambda cung cấp bản cài đặt cho *Functional Interface*. **Một interface \**chỉ có MỘT phương thức trừu tượng\** được gọi là \**\*Functional Interface\**\***.

## Ví dụ toán tử dấu 2 chấm (::) trong Java

Tạo một FunctionalInterface chỉ có một phương thức trừu tượng accept().

```java
package vn.viettuts.lambda;
 
@FunctionalInterface
public interface MyFunction {
    int accept(int a, int b);
}
```

Tạo lớp MyUtils có 2 phương thức add() và minus().

```java
package vn.viettuts.lambda;
 
public class MyUtils {
    public static int add(int a, int b) {
        return a + b;
    }
 
    public static int minus(int a, int b) {
        return a - b;
    }
}
```

Tạo lớp App có 2 phương thức action() và main() để chạy ứng dụng. Hàm action() xử lý giá trị của tham số a và b, lúc này chúng ta chưa biết hàm accept(a,b) trả về giá trị gì vì nó chỉ là một hàm trừu tượng chưa có thân hàm. Chúng ta sẽ cung cấp thân hàm cho phương thức MyFunction.accept() trong hàm main().

```java
package vn.viettuts.lambda;
 
public class App {
    /**
     * Xử lý giá trị của tham số a và b.
     * Lúc này chúng ta chưa biết hàm accept(a,b) trả về giá trị gì, 
     * vì nó chỉ là một hàm trừu tượng chưa có thân hàm.
     * Chúng ta sẽ cung cấp thân hàm cho phương thức MyFunction.accept() 
     * trong hàm main().
     */
    public int action(int a, int b, MyFunction func) {
        return func.accept(a, b);
    }
 
    public static void main(String[] args) {
        App app = new App();
        // tạo đối tượng nặc danh addFunc và cung cấp thân hàm cho hàm accept()
        // bây giờ hàm accept() sẽ có thân hàm giống như hàm MyUtils.add().
        // nghĩa là hệ thống copy hàm MyUtils.add() như một bản cài đặt 
        // cho hàm accept()
        MyFunction addFunc = MyUtils::add;
        int c1 = app.action(10, 2, addFunc);
        System.out.println("Tổng 2 số: " + c1);
         
        MyFunction minusFunc = MyUtils::minus;
        int c2 = app.action(10, 2, minusFunc);
        System.out.println("Hiệu 2 số: " + c2);
         
        MyFunction maxFunc = Math::max;
        int c3 = app.action(10, 2, maxFunc);
        System.out.println("MAX: " + c3);
         
        MyFunction minFunc = Math::min;
        int c4 = app.action(10, 2, minFunc);
        System.out.println("MIN: " + c4);
    }
}
// 
//Tổng 2 số: 12
//Hiệu 2 số: 8
//MAX: 10
//MIN: 2
```

