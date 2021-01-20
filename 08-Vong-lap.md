# Sử dụng vòng lặp

[TOC]

### 1. Vòng lặp While 

```java
int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}
```

### 2. Vòng lặp do While 

```java
int i = 0;
do {
  System.out.println(i);
  i++;
}
while (i < 5);
```

### 3. Vòng lặp For 

```java
for (statement 1; statement 2; statement 3) {
  // code block to be executed
 }
```

```java
for (int i = 0; i < 5; i++) {
  System.out.println(i);
}
```

```java
for (int i = 0; i <= 10; i = i + 2) {
  System.out.println(i);
}
```

### 4. Vòng lặp Foreach 

```java
for (type variableName : arrayName) {
  // code block to be executed
}
```

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}
```

### 5. Từ khoá Break 

- Chúng ta dùng từ khoá break để thoát khỏi vòng lặp như for, dowhile, while và switch

  ```java
  for (int i = 0; i < 10; i++) {
    if (i == 4) {
      break;
    }
    System.out.println(i);
  }
  
  kết quả nhận được là 0 ; 1 ; 2 ; 3
  ```

- Như vậy khi i = 4 thì mình thoát khỏi vòng lặp, những dòng code sau lệnh break sẽ ko thực thi nữa.

### 6. Từ khoá Continue

- Chúng ta dùng từ khoá continue để bỏ qua bước đang thực thi và chạy bước kế tiếp

  ```java
  for (int i = 0; i < 10; i++) {
    if (i == 4) {
      continue;
    }
    System.out.println(i);
  }
  ```

- Như vậy khi i=4 thì nó bỏ qua bước lặp này và các câu lệnh sau nó và chạy bươc kế tiếp. Kết quả thu được từ ví dụ trên sẽ là 0;1;2;3;5;6;7;8;9