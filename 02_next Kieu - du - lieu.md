# Các kiểu dữ liệu trong Java

[TOC]

## 1. Phân loại các kiểu dữ liệu

Java có 2 loại kiểu dữ liệu:

- Các kiểu dữ liệu nguyên thủy (Primitive Data Types)
- Các kiểu dữ liệu tham chiếu (Reference Types)

## 2. Primitive Data Types

Có đến 8 kiểu dữ liệu **primitive** trong Java. Kiểu dữ liệu Primitive đã được đặt ra trước và tên nó nằm trong từ khóa của Java. Bây giờ ta sẽ xem những kiểu dữ liệu đó:

### 2.1. Kiểu Boolean

Kiểu **Boolean** chỉ sử dụng lưu trữ cho 2 giá trị: **true** và **false**. Mục đích kiểu Boolean thường được cho những **câu điều kiện rẽ nhánh**.

- **Ví dụ:**

```java
Boolean isDone = false
```

### 2.2. Kiểu byte

Kiểu dữ liệu **Byte** dùng để lưu trữ kiểu số nguyên có kích cỡ bằng **1 byte** (8 bit). Giá trị có thể lưu được nằm trong khoảng từ **-128 ( -2^7)** đến **127 (2^7-1)**.

- **Ví dụ:**

```java
byte a = 100
```

### 2.3. Kiểu Short

Kiểu dữ liệu **Short** dùng để lưu trữ kiểu số nguyên có kích cỡ bằng **2 byte** (16 bit). Giá trị có thể lưu được nằm trong khoảng từ **-32,768 (-2^15)** đến **32,767 (2^15-1)**.

- **Ví dụ:**

```java
short a = 10000
```

### 2.4. Kiểu Int

Kiểu dữ liệu **Int** dùng để lưu trữ kiểu số nguyên có kích cỡ bằng **4 byte** (32 bit). Giá trị có thể lưu được nằm trong khoảng từ **-2,147,483,648 (-2^31)** đến **2,147,483,647 (2^31-1)**

- **Ví dụ:**

```java
int a = 20000000
```

### 2.5. Kiểu Long

Kiểu dữ liệu **Long** dùng để lưu trữ kiểu số nguyên có kích cỡ bằng **8 byte**. Giá trị có thể lưu lưu được nằm trong khoảng từ **-9,223,372,036,854,775,808 (-2^63)** đến **9,223,372,036,854,775,807 (2^63-1)**. Giá trị gán cần có kí tự ‘**l**’ phía sau.

- **Ví dụ:**

```java
 long a = 1001000l
```

### 2.6. Kiểu Float

Kiểu dữ liệu **Float** dùng để lưu trữ số thực có kích cỡ bằng **4 byte** (32 bit). Giá trị có thể lưu được nằm trong khoảng từ **-3.4028235 x 10^38** đến **-3.4028235 x 10^38**. Giá trị gán cần có kí tự ‘**f**’ phía sau.

- **Ví dụ:**

```java
 float a = 2.51f
```

### 2.7. Kiểu Double

Kiểu dữ liệu **Double** dùng để lưu trữ số thực có kích cỡ bằng **8 byte** (64 bit). Giá trị có thể lưu nằm trong khoảng từ **-1.7976931348623157 x 10^308** đến **-1.7976931348623157 x 10^308**. Giá trị gán có thể **có hoặc không** kí tự ‘**d**’ phía sau.

- **Ví dụ:**

```java
 double a = 2.52.d hoặc double a = 2.52
```

### 2.8. Kiểu Char

Kiểu dữ liệu **Char** dùng để lưu trữ kí tự có kích cỡ bằng **2 byte**. Bản chất Char lưu trữ code Unicode nhưng khi lại hiển thị ra ‘kí tự’ ứng với mã đó. Giá trị có thể lưu trữ nằm trong khoảng **‘u0000’** đến **‘uffff’**.

- **Ví dụ:** đây là bảng chứa ít kí tự Unicode

  ![](D:\data\source\Học lập trình web\Java\img\1_Các kiểu dữ liệu trong Java_Howkteam_com.png)

  Khi ta khai báo **char a = ‘Ă’** thì bộ nhớ sẽ lưu mã Unicode là **‘\u0102’**

## 3. Reference Types

**Kiểu dữ liệu tham chiếu** là kiểu dữ liệu của đối tượng. Biến của kiểu dữ liệu tham chiếu chỉ chứa địa chỉ của đối tượng dữ liệu tại bộ nhớ **Stack**. Đối tượng dữ liệu lại nằm ở bộ nhớ **Heap**. Một số kiểu dữ liệu cụ thể như các **mảng** (Array), **lớp đối tượng** (Class) hay kiểu **lớp giao tiếp** (Interface).

bản chất String là một mảng lưu nhiều kí tự (char). Việc khai báo **String name = ‘KTEAM’** có thể diễn đạt như sau:

![](D:\data\source\Học lập trình web\Java\img\2_Các kiểu dữ liệu trong Java_Howkteam_com.png)