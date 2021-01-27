# Toán tử instanceof trong java

[TOC]

## 1. Toán tử instanceof trong java

Toán tử instanceof trong java được sử dụng để kiểm tra một đối tượng có phải là thể hiển của một kiểu dữ liệu cụ thể không (lớp, lớp con, interface).

instanceof trong java được gọi là toán tử so sánh kiểu vì nó so sánh thể hiện với kiểu dữ liệu. Nó trả về giá trị boolean là true hoặc false. Nếu bạn dùng toán tử instanceof với bất kỳ biến nào mà có giá trị null, giá trị trả về sẽ là false.

#### Ví dụ về toán tử instanceof trong java

```java
public class Simple1 {
 public static void main(String args[]) {
  Simple1 s = new Simple1();
  System.out.println(s instanceof Simple1);// true
 }
}
//true
```

Một đối tượng có kiểu của lớp con thì cũng có kiểu của lớp cha. Ví dụ, nếu Dog kế thừa Animal thì đối tượng của Dog có thể tham chiếu đến cả hai lớp Dog và Animal.

#### Ví dụ về toán tử instanceof trong java

```java
public class Simple1 {
 public static void main(String args[]) {
  Simple1 s = new Simple1();
  System.out.println(s instanceof Simple1);// true
 }
}
//true
```

Một đối tượng có kiểu của lớp con thì cũng có kiểu của lớp cha. Ví dụ, nếu Dog kế thừa Animal thì đối tượng của Dog có thể tham chiếu đến cả hai lớp Dog và Animal.

#### Ví dụ khác về toán tử instanceof trong java

```java
class Animal {}
 
public class Dog extends Animal {// Dog inherits Animal
 
 public static void main(String args[]) {
  Dog dog = new Dog();
  System.out.println(dog instanceof Animal);// true
 }
}
// true
```

## 2. instanceof trong java với biến có giá trị null

Nếu bạn sử dụng toán tử instanceof với biến có kiểu bất kỳ có giá trị null thì giá trị trả về luôn là null. Ví dụ.

```java
public class Dog2 {
 public static void main(String args[]) {
  Dog2 d = null;
  System.out.println(d instanceof Dog2);// false
 }
}
//false
```

## 3. Downcasting với toán tử instanceof trong java

Khi kiểu của lớp con tham chiếu tới đối tượng của lớp cha được gọi là downcasting. Nếu bạn thực hiện tham chiếu trực tiếp thì trình biên dịch sẽ báo lỗi biên dịch. Nếu bạn thực hiện bằng việc ép kiểu thì lỗi ngoại lệ ClassCastException được ném ra lúc runtime. Nhưng nếu bạn sử dụng toán tử instanceof thì downcasting được.

- Con không thể tạo đối tượng bằng cha một cách trực tiếp được
- Nhưng cha có thể tạo đối tượng thông qua downcasting. 

Tham chiếu trực tiếp:

```java
Dog d=new Animal();//Compilation error  
```

Sử dụng ép kiểu dữ liệu:

```java
Dog d=(Dog)new Animal(); 
// Compile ok, nhưng lỗi ngoại lệ ClassCastException lúc runtime
```

#### Ví dụ downcasting với instanceof

```java
class Animal {}
 
public class Dog3 extends Animal {
 static void method(Animal a) {
  if (a instanceof Dog3) {
   Dog3 d = (Dog3) a;// downcasting
   System.out.println("downcasting is ok");
  }
 }
 
 public static void main(String[] args) {
  Animal a = new Dog3();
  Dog3.method(a);
 }
}
//downcasting is ok
```

#### Ví dụ downcasting không sử dụng instanceof

```java
class Animal {}
 
public class Dog4 extends Animal {
 static void method(Animal a) {
  Dog4 d = (Dog4) a;// downcasting
  System.out.println("downcasting is ok");
 }
 
 public static void main(String[] args) {
  Animal a = new Dog4();
  Dog4.method(a);
 }
}
//downcasting is ok
```

Hãy đi sâu vào vấn đề gần hơn chút, thực tế đối tượng được tham chiếu bởi biến a là một đối tượng của lớp Dog4. Vì vậy chúng ta thực hiện downcasting nó thì ok. Nhưng nếu code như sau thì chuyện gì sẽ xảy ra?

```java
Animal a=new Animal();  
Dog.method(a);  
// lỗi ngoại lệ ClassCastException
```

#### Ví dụ sử dụng toán tử instanceof để xác định kiểu phần tử của mảng

```java
public class Test6 {
 public static void main(String[] args) {
  Object[] objArray = new Object[4];
  objArray[0] = "hello";
  objArray[1] = 1000L;
  objArray[2] = 20;
  objArray[3] = 'c';
 
  for (int i = 0; i < objArray.length; i++) {
   if (objArray[i] instanceof Integer) {
    System.out.println("kieu integer: " + objArray[i]);
   } else if (objArray[i] instanceof Long) {
    System.out.println("kieu long: " + objArray[i]);
   } else if (objArray[i] instanceof Character) {
    System.out.println("kieu char: " + objArray[i]);
   } else {
    System.out.println("kieu khac: " + objArray[i]);
   }
  }
 }
}
/*
kieu khac: hello
kieu long: 1000
kieu integer: 20
kieu char: c
*/
```

