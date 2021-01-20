# Hằng trong Java

[TOC]

## 1. Hằng là gì? Lý do sử dụng hằng

**Hằng** là một biến mà **giá trị không đổi** trong suốt chương trình, tất nhiên ta đã khởi tạo giá trị ngay từ đầu.

Lý do sử dụng hằng:

- Tạo ra những giá trị vốn thực tế không cho thay đổi, làm chương trình an toàn hơn.
- Giúp người đọc biết ý nghĩa con số vô cảm trong khoa học như có thể áp dụng giá trị số PI, gia tốc trọng trường,...
- Sẽ cảnh báo nếu người dùng cố tình thay đổi giá trị sau này. Đảm bảo tính toán vẹn của giá trị.

## 2. Cách sử dụng hằng

Trong bài này sẽ chỉ nói về **hằng số trong biến**. Ngoài ra khái niệm hằng còn có liên quan đến phương thức

**Cú pháp khai báo hằng là:**

> **final**  <kiểu dữ liệu> <tên biến> = <giá trị hằng>;

**Ví dụ:** Ta sẽ tạo một hằng lưu giá trị số PI và tính chu vi hình tròn. Ngoài ra ta sử đổi giá trị PI

```java
public class HelloWorld{

     public static void main(String []args){
        final double PI = 3.1415926535897;
        int r = 3;
        System.out.print(2*r*PI);
     }
}
```

```java
public class HelloWorld{

     public static void main(String []args){
        final double PI = 3.1415926535897;
        PI = 3.14;
     }
}
// ERROR
```

