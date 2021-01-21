# Enum

## Enum trong lập trình Java là gì

**Enum** **là một lớp đặt biệt trong java nó dùng để nhóm các biến có giá trị không thay đổi trong suốt chương trình vào một chỗ.**

Để khai báo 1 enum mình sử dụng từ khoá enum.

```java
enum Level {
  LOW,
  MEDIUM,
  HIGH
}
Level myVar = Level.MEDIUM;
```

Chúng ta có thể sử dụng Enum cho mệnh để Switch

```java
enum Level {
  LOW,
  MEDIUM,
  HIGH
}

public class MyClass {
  public static void main(String[] args) {
    Level myVar = Level.MEDIUM;

    switch(myVar) {
      case LOW:
        System.out.println("Low level");
        break;
      case MEDIUM:
         System.out.println("Medium level");
        break;
      case HIGH:
        System.out.println("High level");
        break;
    }
  }
}
```

- Chúng ta có thể chạy vòng lặp với Enum

  ```java
  for (Level myVar : Level.values()) {
    System.out.println(myVar);
  }
  ```

  