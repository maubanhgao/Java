# Ép kiểu tường minh và ngầm định



**Ép kiểu** là cách chuyển biến thuộc kiểu dữ liệu này thành biến thuộc kiểu dữ liệu khác.



## Phân loại ép kiểu trong java

Trong Java, có hai loại ép kiểu dữ liệu:

1. **Nới rộng (widening):** Là quá trình làm tròn số từ kiểu dữ liệu có kích thước nhỏ hơn sang kiểu có kích thước lớn hơn. Kiểu biến đổi này không làm mất thông tin.
2. **Thu hẹp (narrowwing):** Là quá trình làm tròn số từ kiểu dữ liệu có kích thước lớn hơn sang kiểu có kích thước nhỏ hơn. Kiểu biến đổi này có thể làm mất thông tin



## 1. Nới rộng (widening)

![](D:\data\source\Hoc lap trinh web\Java\img\ep-kieu-du-lieu-noi-rong.jpg)

**Nới rộng (widening):** Là quá trình làm tròn số từ kiểu dữ liệu có kích thước nhỏ hơn sang kiểu có kích thước lớn hơn. Kiểu biến đổi này không làm mất thông tin. Ví dụ chuyển từ int sang float. Chuyển kiểu loại này có thế được thực hiện ngầm định bởi trình biên dịch.

Ví dụ:

```java
public class TestWidening {
    public static void main(String[] args) {
        int i = 100;
        long l = i;    // không yêu cầu chỉ định ép kiểu
        float f = l;   // không yêu cầu chỉ định ép kiểu
        System.out.println("Giá trị Int: " + i);
        System.out.println("Giá trị Long: " + l);
        System.out.println("Giá trị Float:  " + f);
    }
}
//Giá trị Int: 100
//Giá trị Long: 100
//Giá trị Float:  100.0
```



## 2.Thu hẹp (narrowwing)

![](D:\data\source\Hoc lap trinh web\Java\img\ep-kieu-du-lieu-thu-hep.jpg)

**Thu hẹp (narrowwing):** Là quá trình làm tròn số từ kiểu dữ liệu có kích thước lớn hơn sang kiểu có kích thước nhỏ hơn. Kiểu biến đổi này có thể làm mất thông tin như ví dụ ở trên. Chuyển kiểu loại này không thể thực hiện ngầm định bởi trình biên dịch, người dùng phải thực hiện chuyển kiểu tường minh.

**Ví dụ:**

```java
public class TestNarrowwing {
    public static void main(String[] args) {
        double d = 100.04;
        long l = (long) d; // yêu cầu chỉ định kiểu dữ liệu (long)
        int i = (int) l; // yêu cầu chỉ định kiểu dữ liệu (int)
 
        System.out.println("Giá trị Double: " + d);
        System.out.println("Giá trị Long: " + l);
        System.out.println("Giá trị Int:  " + i);
 
    }
}

//Giá trị Double: 100.04
//Giá trị Long: 100
//Giá trị Int:  100
```

### Cách sử dụng ép kiểu

Trong bài này chỉ nói đến ép kiểu dữ liệu đối với **dữ liệu nguyên thủy** (**Primitive Data Types**), còn đối với ép kiểu **dữ liệu tham chiếu** (**Reference Types**) thì cách ép kiểu là những **hàm** (**phương thức**) **ép kiểu** do người ta viết riêng cho mỗi kiểu dữ tham chiếu đó.

Thì trong ép kiểu trong kiểu dữ liệu nguyên thủy được chia ra làm 2 loại:

- Chuyển đổi kiểu ngầm định (implicit)
- Chuyển đổi kiểu tường minh (explicit)

### Kiểu chuyển đổi ngầm định (implicit) => widening

**Ví dụ:** Ta lấy một biến kiểu **int** gán giá trị cho biến kiểu **long**

```java
public class HelloWorld{

     public static void main(String []args){
        int a = 5;
        long b = a;
        System.out.print(b);
     }
}
```

### Kiểu chuyển đổi tường minh (explicit) => narrowwing

 Với ép kiểu theo cú pháp:

> (<Kiểu dữ liệu>) <Tên biến>;

```java
public class HelloWorld{

     public static void main(String []args){
        long a = 6;
        int b = (int) a;
        System.out.print(a);
     }
}
```

> **Lưu ý:** Nếu ép kiểu dữ liệu kí tự **char** sang **kiểu dữ liệu số** hoặc ngược lại.
>
> - Khi ép kiểu char sang số thì sẽ ép kiểu ngầm định chuyển kí tự sang hệ thập phân ASCII tương ứng kí tự đó.
> - Nếu ngược lại thì phải sử dụng ép kiểu tường minh để chuyển sang kiểu kí tự.

**Ví dụ:** Ta sẽ thử kí tự ‘**A**’ được biết hệ thập phân ASCII tương ứng

```java
public class HelloWorld{

     public static void main(String []args){
        char a = 'A';
        int b = a;
        char c = (char) b;
        System.out.println(b);
        System.out.println(c);     
    }
}
```