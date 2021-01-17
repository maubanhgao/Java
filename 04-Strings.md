# String

[TOC]

### 1. Strings trong lập trình hướng đối tượng Java là gì?

**String được sử dụng để lưu trữ các giá trị Text (gồm nhiều ký tự).** 

```java
String greeting = "Hello";
```

###  2. String length 

**lấy độ dài của một chuỗi**

```java
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length());
```

### 3. String toUperCase và toLowerCase 

- Dùng để chuyển hoá chữ thành chữ hoa và chữ thường

  ```java
  String txt = "Hello World";
  System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
  System.out.println(txt.toLowerCase());   // Outputs "hello world"
  ```

### 4. String IndexOf 

- Dùng để trả về vị trí 1 ký tự trong chuỗi

  ```java
  String txt = "Please locate where 'locate' occurs!";
  System.out.println(txt.indexOf("locate")); // Outputs 7
  ```

### 5. String Concatenation 

- Dùng để nối 2 chuỗi lại với nhau

  ```java
  String firstName = "John";
  String lastName = "Doe";
  System.out.println(firstName + " " + lastName);
  ```

### 6. String hiển thị các giá trị đặt biệt 

- Dùng để hiển thị các ký tự như đấu 1 nháy, 2 nháy. Ví dụ khi ta biến sau

  ```java
  String text = " le vu" nguyen"
  ```

  Như vậy thì sẽ bị lỗi vì dấu 2 nháy sau chữ vu sẽ **gây nhầm lẫn cho trình biên dịch**. Như vậy làm sao sử dụng được chữ vu”. Thì ta dùng ký tự \ đằng trước đấu 2 nháy như sau.

  ```java
  String txt = "le vu\" nguyen";
  ```

**Ngoài ra String hỗ trợ các ký tự đặt biệt khác như**

- \n : dùng để xuống dòng.

  ```java
  String txt = "Hello\nWorld!";
  ```

- \t : cách nhau một khoảng tab

  ```java
   String txt = "Hello\tWorld!";
  ```

- \b : cách nhau một khoảng backspace

  ```java
  String txt = "Hello\tWorld!";
  ```

### 7. Dấu +

**Khi ta sử dụng dấu + thì đối với kiểu int thì nó là cộng 2 số, còn đối với kiểu String thì sẽ là concatenation (nối chuỗi)**

```java
int x = 10;
int y = 20;
int z = x + y;  // z là 30
```

```java
String x = "10";
String y = "20";
String z = x + y;   // z là chuỗi 1020 
```