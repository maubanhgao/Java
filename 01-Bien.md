# Khai báo biến

[TOC]

### 1. Biến trong lập trình java là gì 

**Trong** **lập trình Java** **chúng ta sử dụng biến để lưu lại giá trị để thao tác**

### 2. Các loại biến trong ngôn ngữ lập trình java 

**Trong** **lập trình Java** **ta có các loại biến sau.**

- String : dùng để lưu các giá trị chuỗi ví dụ như tên sinh viên là Nguyễn Văn A
- int : dùng để lưu các giá trị số ví dụ như số điện thoại 0903049583
- float : dùng để lưu các giá trị số thập phân như tiền tệ 1.000.500 VND
- char : dùng để lưu 1 ký tự ví dụ ký tự a hoặc b
- boolean : dùng để lưu giá trị đúng hay sai.

### 3. Khai báo biến trong lập trình java 

**cú pháp**

> type variable = value;

- type : là loại biến có thể là String, int , float, char hoặc boolean
- variable : là tên của biến
- value : giá trị của biến

**Ví dụ**

```java
String name = "Le Vu Nguyen";

int phoneNumber = 15;

int num = 15;
num = 20;  // myNum is now 20
System.out.println(myNum);
```

**Biến được gán với từ khoá final thì giá trị sẽ không được thay đổi và gán giá trị mới.** 

```java
final int num = 15;
num = 20;
// gán lại giá trị 20 thì sẽ xảy ra lỗi, vì final là từ khoá mình dùng khai báo khi muốn giá trị đó là không thể thay đổi.
```

### 4. Hiển thị giá trị trong biến trong ngôn ngữ lập trình java

Để hiển thị giá trị trong biến ta sử dụng hàm **println()**

```java
String firstName = "Le ";
String lastName = "Vu Nguyen";
String fullName = firstName + lastName;
System.out.println(fullName);
```

