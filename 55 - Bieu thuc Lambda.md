# Lambda Expression - Biểu thức Lambda trong java 8

[TOC]

## Giới thiệu Lambda Expression trong Java

Lambda Expression - **Biểu thức Lambda trong java** là một tính năng mới và quan trọng được thêm vào trong Java SE 8. Nó cung cấp một cách rõ ràng và ngắn ngọn để đại diện cho một phương thức interface sử dụng một biểu thức. Nó rất hữu ích trong thư viện collection. Nó giúp duyệt, lọc và trích xuất dữ liệu từ collection.

Biểu thức Lambda được sử dụng để cung cấp bản cài đặt của một interface mà có interface chức năng. Nó tiết kiệm rất nhiều mã. Trong trường hợp biểu thức lambda, chúng ta không cần định nghĩa lại phương thức để cung cấp việc thực hiện. Ở đây, chúng ta chỉ cần viết mã thực thi.

Biểu thức Java lambda được coi như là một chức năng, do đó trình biên dịch không tạo tập tin .class.

### Functional Interface

Biểu thức Lambda cung cấp bản cài đặt cho *Functional Interface*. **Một interface \**chỉ có MỘT phương thức trừu tượng\** được gọi là \**\*Functional Interface\**\***. Java cung cấp một anotation @FunctionalInterface , được sử dụng để khai báo một interface như functional interface.

Ví dụ khai báo Functional Interface đúng:

![](D:\data\source\Học lập trình web\Java\img\bieu-thuc-lambda-trong-java-8-4.png)

Ví dụ khai báo Functional Interface không đúng: Lỗi cú pháp vì interface chỉ được chứa 1 phương thức trừu tượng.

![](D:\data\source\Học lập trình web\Java\img\bieu-thuc-lambda-trong-java-8-5.png)

## Tại sao sử dụng biểu thức Lambda

1. Cung cấp bản thực hiện cho interface Chức năng.
2. Viết ít code hơn.

## Cú pháp biểu thức Lambda trong java

> (argument-list) -> {body}

Biểu thức Lambda trong java gồm có 3 thành phần sau:

- **Argument-list**: Nó cũng có thể để trống hoặc không.
- **Arrow-token**: Nó được sử dụng để liên kết arguments-list và body của biểu thức.
- **Body**: Nó chứa các biểu thức và câu lệnh cho biểu thức lambda.

Hãy xem một kịch bản. Nếu chúng ta không sử dụng biểu thức Java lambda. Ở đây, chúng ta đang thực hiện một phương thức interface mà không sử dụng biểu thức lambda.

## Ví dụ không sử dụng biểu thức Lambda

```java
package vn.viettuts.java8;
 
interface Drawable {
    public void draw();
}
 
public class LambdaExpressionExample1 {
    public static void main(String[] args) {
        int width = 10;
 
        // không sử dụng biểu thức lambda, 
        // phải sử dụng lớp nặc danh để cài đặt phương thức draw() cho Drawable
        Drawable d = new Drawable() {
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        d.draw();
    }
}
//Drawing 10
```

## Ví dụ sử dụng biểu thức Lambda

Bây giờ, chúng ta áp dụng biểu thức lambda cho ví dụ trên:

```java
package vn.viettuts.java8;
 
//tùy chọn, nó đánh dấu lớp Drawable chỉ được có 1 method trừu tượng
@FunctionalInterface
interface Drawable {
    public void draw();
}
 
public class LambdaExpressionExample2 {
    public static void main(String[] args) {
        int width = 10;
 
        // sử dụng biểu thức lambda
        Drawable d2 = () -> {
            System.out.println("Drawing " + width);
        };
        d2.draw();
    }
}
//Drawing 10
```

Một biểu thức lambda có thể có không, một hoặc nhiều tham số. Số lượng tham số của biểu thức lambda phụ thuộc vào số lượng tham số của phương thức duy nhất của interface chức năng. Hãy xem các ví dụ sau:

## Ví dụ biểu thức Lambda không có tham số

```java
package vn.vietttuts.java8;
interface Sayable{
	public String say();
}
public class LambdaExpressionExample3 {
    public static void main(String[] args) {
        Sayable s = () -> {
            return "I have nothing to say.";
        };
        System.out.println(s.say());
    }
}
//I have nothing to say.
```

## Ví dụ biểu thức Lambda có một tham số duy nhất

```java
package vn.viettuts.java8;
 
interface Sayable {
    public String say(String word);
}
 
public class LambdaExpressionExample4 {
    public static void main(String[] args) {
        Sayable s = (word) -> {
            return word;
        };
        System.out.println(s.say("Meo meo!"));
    }
}
//Meo meo!
```

##  Ví dụ biểu thức Lambda có nhiều tham số 

 Ví dụ: TH không cần chỉ định kiểu của tham số: 

```java
package vn.viettuts.java8;
 
interface Operation {
    public int add(int a, int b);
}
 
public class LambdaExpressionExample5 {
    public static void main(String[] args) {
        Operation operation = (a, b) -> {
            return a + b;
        };
        System.out.println("a + b = " + operation.add(10, 20));
    }
}
//a + b = 30
```

Ví dụ: TH chỉ định kiểu của tham số:

```java
package vn.viettuts.java8;
 
interface Operation {
    public int add(int a, int b);
}
 
public class LambdaExpressionExample5 {
    public static void main(String[] args) {
        Operation operation = (int a, int b) -> {
            return a + b;
        };
        System.out.println("a + b = " + operation.add(10, 20));
    }
}
// a + b = 30
```

## Ví dụ biểu thức Lambda: sử dụng và không sử dụng từ khóa return

Trong biểu thức java lambda, nếu chỉ có một câu lệnh, bạn có thể sử dụng hoặc không sử dụng **từ khoá return**. Bạn phải sử dụng từ khóa return khi biểu thức lambda chứa nhiều câu lệnh.

```java
package vn.viettuts.java8;
 
interface Addable {
    int add(int a, int b);
}
 
public class LambdaExpressionExample6 {
    public static void main(String[] args) {
 
        // không sử dụng từ khóa return
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));
 
        // sử dụng từ khóa return
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(100, 200));
    }
}
//
//30
//300
```

##  Ví dụ biểu thức Lambda với forEach() 

 Ví dụ biểu thức Lambda với forEach(): 

```java
package vn.viettuts.java8;
import java.util.ArrayList;
import java.util.List;
 
public class LambdaExpressionExample7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("PHP");
        list.add("C++");
        list.add("Python");
 
        list.forEach((element) -> {
            System.out.println(element);
        });
    }
}
/*
Java
PHP
C++
Python
*
```

### Mổ sẻ hàm ArrayList.forEach()

Chúng ta sẽ cùng tìm hiểu bản chất của biểu thức Lambda trong hàm forEarch().

Đây là nội dung của hàm java.util.ArrayList.forEach().

![](D:\data\source\Học lập trình web\Java\img\bieu-thuc-lambda-trong-java-8-1.png)

Hàm forEach() có một tham số truyền vào là đối tượng **Consumer** với tên biến là action. Sau đó nó gọi hàm action.accept(), hàm này có tham số là các phần tử của ArrayList.

java.util.function.Consumer là một Functional Interface có duy nhất một hàm accept() được định nghĩa như sau:

![](D:\data\source\Học lập trình web\Java\img\bieu-thuc-lambda-trong-java-8-2.png)

Có nghĩa là chúng ta cần phải tạo một đối tượng nặc danh từ Consumer interface để cung cấp thân hàm cho accept().

Chúng ta có thể viết lại chương trình ví dụ biểu thức Lambda với forEach() như sau:

java.util.function.Consumer là một Functional Interface có duy nhất một hàm accept() được định nghĩa như sau:

![](D:\data\source\Học lập trình web\Java\img\bieu-thuc-lambda-trong-java-8-3.png)

Kết quả

```java
Java
PHP
C++
Python
```

## Ví dụ biểu thức Lambda với Thread

Bạn có thể sử dụng biểu thức lambda để chạy thread. Trong ví dụ sau, chúng ta đang cài đặt phương thức run() bằng cách sử dụng biểu thức lambda.

```java
package vn.viettuts.java8;
 
public class LambdaExpressionExample9 {
    public static void main(String[] args) {
 
        // ví dụ Thread không sử dụng biểu thức lambda
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Thread1 is running...");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
         
        // ví dụ Thread sử dụng biểu thức lambda
        Runnable r2 = () -> {
            System.out.println("Thread2 is running...");
        };
        Thread t2 = new Thread(r2);
        t2.start();
    }
}
```

Kết quả:

```java
Thread1 is running...
Thread2 is running...
```

Giao diện Runable được đánh dấu bởi @FunctionalInterface và chỉ có một phương thức trừu tượng, vậy nó là một giao diện chức năng nên chúng ta có thể áp dụng biểu thức lambda với giao diện Runable.

##  Ví dụ biểu thức Lambda với Comparator 

 Biểu thức Java lambda có thể được sử dụng trong collection. Nó cung cấp cách hiệu quả và ngắn gọn để duyệt, lọc và lấy dữ liệu. Sau đây là một số ví dụ biểu thức lambda với Comparator. 

```java
package vn.viettuts.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
class Product {
    int id;
    String name;
    float price;
 
    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
 
public class LambdaExpressionExample10 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();
 
        // Add cac san pham
        list.add(new Product(1, "Dell Laptop", 25000f));
        list.add(new Product(3, "Keyboard", 300f));
        list.add(new Product(2, "Dell Mouse", 150f));
 
        System.out.println("Sap xep cac san pham theo ten: ");
 
        // cai dat bieu thuc lambda
        Collections.sort(list, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });
        for (Product p : list) {
            System.out.println(p.id + " " + p.name + " " + p.price);
        }
    }
}
```

Kết quả:

```java
Sap xep cac san pham theo ten: 
1 Dell Laptop 25000.0
2 Dell Mouse 150.0
3 Keyboard 300.0
```

## Ví dụ biểu thức Lambda với Filter Collection Data

Dưới đây là ví dụ biểu thức Lambda với Filter Collection Data.

```java
package vn.viettuts.java8;
 
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
 
class Product {
    int id;
    String name;
    float price;
 
    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
 
public class LambdaExpressionExample11 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();
        list.add(new Product(1, "Samsung A8", 17000f));
        list.add(new Product(3, "Iphone 8X", 65000f));
        list.add(new Product(2, "Sony Xperia X8", 25000f));
        list.add(new Product(4, "Nokia L7", 15000f));
        list.add(new Product(5, "Redmi Note 7", 26000f));
        list.add(new Product(6, "Lenevo Vibe", 19000f));
 
        // sử dụng biểu thức lambda để filter data
        Stream<Product> filtered_data = list.stream()
                .filter(p -> p.price > 20000);
 
        // sử dụng lambda duyệt các phần tử của collection
        filtered_data.forEach(product -> {
            System.out.println(product.name + ": " + product.price);
        });
    }
}
```

Kết quả:

```java
Iphone 8X: 65000.0
Sony Xperia X8: 25000.0
Redmi Note 7: 26000.0
```

## Tổng kết Lambda Expression trong Java

Bản chất của Lambda Expression - **Biểu thức Lambda trong java** là tạo ra một đối tượng nặc danh cho một Functional Interface, và cung cấp thân hàm cho phương thức trừu tượng duy nhất của Functional Interface. Functional Interface trong Java là một interface chỉ được chứa một hàm trừu tượng duy nhất.

Tại sao Functional Interface chỉ chứa MỘT hàm trừu tượng duy nhất? Bởi vì biểu thức Lambda chỉ chứa các tham số và thân hàm, không chỉ định tên hàm. Do vậy nếu có nhiều hơn 1 phương thức trong Functional Interface thì biểu thức Lambda sẽ bị bế tắc vì nó không biết cấp thân hàm cho phương thức nào.

Rất đơn giản đúng không ạ? Hy vọng qua bài này các bạn sẽ không còn sợ khi đối mặt với biểu thức lambda trong Java nói riêng, và các ngôn ngữ khác nói chung.