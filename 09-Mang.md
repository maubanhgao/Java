# Sử dụng Mảng

[TOC]

### 1. Mảng trong ngôn ngữ lập trình Java là gì 

**Mảng được sử dụng để lưu nhiều giá trị vào một biến.**

- Chúng ta sử dụng [] để khai báo mảng

  ```java
  String[] cars;
  ```

- Chúng ta có thể khai báo mảng và chưa các giá trị như sau

  ```java
  String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; 
  ```

### 2. Lấy giá trị phần tử trong mảng thông qua vị trí index 

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
// Kết quả Volvo
```

### 3. Cập nhật giá trị phần tử trong mảng thông qua vị trí index 

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
cars[0] = "Opel";
System.out.println(cars[0]);
// kết quả là Opel chứ không phải là Volvo
```

### 4. Độ dài của mảng 

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

System.out.println(cars.length);

// kích thước sẽ là 4. Mảng có chứ 4 phần tử
```

### 5. Duyệt qua các phần tử của mảng 

- Chúng ta có thể sử dụng vòng lặp for hoặc for-each để duyệt qua các phần tử

  ```java
  String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
  for (int i = 0; i < cars.length; i++) {
    System.out.println(cars[i]);
  }
  ```

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}
```

### 6. Mảng nhiều chiều

**Mảng nhiều chiều hay còn gọi là mảng của mảng chứ một hoặc nhiều mảng.**

**Khai báo mảng nhiều chiều bằng dấu [][]. Trong ví dụ này là mảng 2 chiều**

```java
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
```

**Duyệt qua mảng nhiều chiều ta sử dụng 2 vòng lặp. Vòng lặp đầu tiên truy xuất các phần tử trong mảng đầu tiên còn vòng lặp thứ 2 duyệt qua các giá trị trong mảng thứ 2**

```java
public class MyClass {
  public static void main(String[] args) {
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
  }
}
```