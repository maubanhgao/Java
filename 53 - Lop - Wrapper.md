## Lớp Wrapper trong java

Lớp Wrapper trong java cung cấp cơ chế để chuyển đổi kiểu dữ liệu nguyên thủy thành kiểu đối tượng và từ đối tượng thành kiểu dữ liệu nguyên thủy.

Từ J2SE 5.0, tính năng **autoboxing** và **unboxing** chuyển đổi kiểu dữ liệu nguyên thủy thành kiểu đối tượng và từ đối tượng thành kiểu dữ liệu nguyên thủy một cách tự động. Sự chuyển đổi tự động **kiểu dữ liệu nguyên thủy thành kiểu đối tượng được gọi là autoboxing** và ngược lại được gọi là unboxing.

Trong java, có 8 lớp Wrapper chúng được thiết kế trong gói java.lang.

| Kiểu nguyên thủy | Kiểu Wrapper |
| :--------------- | :----------- |
| boolean          | Boolean      |
| char             | Character    |
| byte             | Byte         |
| short            | Short        |
| int              | Integer      |
| long             | Long         |
| float            | Float        |
| double           | Double       |

#### Ví dụ chuyển kiểu dữ liệu nguyên thủy thành kiểu Wrapper

```java
public class WrapperExample1 {
    public static void main(String args[]) {
        // Đổi int thành Integer
        int a = 20;
        Integer i = Integer.valueOf(a);// đổi int thành Integer
        Integer j = a;// autoboxing, tự động đổi int thành Integer trong nội bộ trình biên dịch
 
        System.out.println(a + " " + i + " " + j);
    }
}
//20 20 20
```

#### Ví dụ chuyển kiểu Wrapper thành kiểu dữ liểu nguyên thủy

```java
public class WrapperExample2 {
    public static void main(String args[]) {
        // đổi Integer thành int
        Integer a = new Integer(3);
        int i = a.intValue();// đổi Integer thành int
        int j = a;// unboxing, tự động đổi Integer thành int trong nội bộ trình biên dịch
 
        System.out.println(a + " " + i + " " + j);
    }
} //3 3 3
```

//