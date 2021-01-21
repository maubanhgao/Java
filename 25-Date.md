# Kiểu Date

[TOC]

### 1. Java Date trong lập trình Java là gì 

Để hiển thị được ngày tháng năm chúng ta sử dụng java date để hiển thị cho người dùng.

### 2. Hiển thị ngày tháng năm hiện tại 

- Chúng ta import thư viện java.time.LocalDate, sau đó sử dụng phương thức now() để lấy giá trị hiện tại

  ```java
  import java.time.LocalDate; // import the LocalDate class
  
  public class MyClass {
    public static void main(String[] args) {
      LocalDate myObj = LocalDate.now(); // Create a date object
      System.out.println(myObj); // Display the current date
    }
  }
  
  }
  ```

### 3. Hiển thị giờ phút giây hiện tại 

**Chúng ta import thư viện LocalTime và sử dụng hàm now()**

```java
import java.time.LocalTime;

public class MyClass {
  public static void main(String[] args) {
    LocalTime myObj = LocalTime.now();
    System.out.println(myObj);
  }
}
```

### 4. Hiển thị ngày tháng năm giờ phút giây hiện tại 

**Chúng ta import thư viện LocalDateTime và sử dụng phương thức now**

```java
import java.time.LocalDateTime; // import the LocalDateTime class

public class MyClass {
  public static void main(String[] args) {
    LocalDateTime myObj = LocalDateTime.now();
    System.out.println(myObj);
  }
}
```

### 5. Định dạng lại kiểu ngày tháng năm giờ phút giây

**Ở các nước Châu Âu và Mỹ họ thường sử dụng tháng trước ngày sau rồi đến năm. Ví dụ như ngày 15 tháng 1 năm 2020 được viết như sau 01/15/2020. Nhưng người Việt Nam mình sẽ ghi là 15/01/2020. 

**Như vậy để định dạng được kiểu ngày tháng ta sử dụng thư viện DateTimeFormatter để giải quyết vấn đề trên**

**Chúng ta sử dụng hàm ofPattern để định nghĩa kiểu ngày tháng là ngày/tháng/năm**. Nếu chúng ta muốn định nghĩa ngược lại là tháng ngày năm thì sẽ là MM-dd-yyyy. MM tượng trưng cho tháng, dd tượng trưng cho ngày, yyyy tượng trung cho năm có 4 số. HH tượng trưng cho giờ, mm tượng trương cho phút và ss tượng trưng cho giây.

```java
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class MyClass {
  public static void main(String[] args) {
    LocalDateTime myDateObj = LocalDateTime.now();
    System.out.println("Before formatting: " + myDateObj);
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
  }
}
```

