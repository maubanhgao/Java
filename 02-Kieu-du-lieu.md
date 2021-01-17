# Kiểu dữ liệu

[TOC]

### Kiểu dữ liệu trong lập trình hướng đối tượng Java là gì 

**Có 2 loại kiểu dữ liệu đó là kiểu nguyên thuỷ và kiểu đối tượng.**

### 1. Kiểu dữ liệu Nguyên Thuỷ 

Kiểu nguyên thuỷ bao gồm có các loại sau. Ứng với mỗi loại **kiểu dữ liệu bộ nhớ sẽ cấp phát vùng nhớ tương ứng**

| kiểu dữ liệu | kích thướt | khoảng giá trị                                             |
| ------------ | ---------- | ---------------------------------------------------------- |
| byte         | 1 byte     | từ -128 đến 127                                            |
| short        | 2 bytes    | từ -32.768 đến 32.676                                      |
| int          | 4 bytes    | từ -2.147.483.648 đến 2.147.483.647                        |
| long         | 8 bytes    | từ -9.223.372.036.854.775.808 to 9.223.372.036.854.775.807 |
| float        | 4 bytes    | 6 đến 7 thập phân 1.000,1232321                            |
| double       | 8 bytes    | 15 dấu thập phân                                           |
| boolean      | 1 bit      | chứa giá trị true hoặc false                               |
| char         | 2 bytes    | chứa các ký tự đơn                                         |

### 2. Kiểu dữ liệu Integer Số nguyên

- **Byte **
- **Short** 
- **int** 
- **long** 

```java
byte myNum = 100;
System.out.println(myNum);

short myNum = 5000;
System.out.println(myNum);

int myNum = 100000;
System.out.println(myNum);

long myNum = 15000000000L;
System.out.println(myNum);
```

### 3. Kiểu dữ liệu Float Số thực

- **float** 
- **double** 

```java
float myNum = 5.75f;
System.out.println(myNum);

double myNum = 19.99d;
System.out.println(myNum);
```

### 4. Kiểu dữ liệu Khoa học 

**Chúng ta có thể dùng e để mô tả bội số của 10.**

```java
float f1 = 35e3f;
double d1 = 12E4d;
System.out.println(f1);
System.out.println(d1);
```

### 5. Kiểu dữ liệu Boolean 

```java
boolean isJavaFun = true;
boolean isFishTasty = false;
System.out.println(isJavaFun);     
System.out.println(isFishTasty); 
```

### 6. Kiểu dữ liệu ký tự 

- Kiểu char chỉ chứa 1 ký tự duy nhất

  ```java
  char myGrade = 'B';
  System.out.println(myGrade);
  ```

- Trong kiểu ký tự chúng ta có thể sử dụng bảng mã ASCII để hiển thị giá trị

  ```java
  char a = 65, b = 66, c = 67;
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
  ```

### 7. Kiểu dữ liệu chuỗi 

- Kiểu String dùng để lưu dạng chuỗi các ký tự

  ```java
  String greeting = "Hello World";
  System.out.println(greeting);
  ```

### 8. Kiểu dữ liệu đối tượng

**Kiểu dữ liệu đối tượng thường tham chiếu tới 1 đối tượng. **

```java
Student student = new Student()
```

