# Set

[TOC]

## 1. Tập hợp Set trong lập trình Java là gì 

**Tập hợp Set** **được sử dụng để lưu trữ các phần tử duy nhất không bị trùng lặp nhau trong tập hợp.**

**Đây chính là điều khác biệt của Set so với các tập hợp khác.**

**Các phần tử trong Set là duy nhất, chúng ta có thể thêm, xoá, sửa các phần tử trong Set.**

- Ví dụ tạo một Set như sau

```java
import java.util.HashSet;

public class SetExample {

    public static void main(String[] args) {

        Set setA = new HashSet();

        setA.add(element);

        System.out.println( setA.contains(element) );
    }
}
```

Trong ví dụ trên ta tạo ra một **tập hợp Set với implementation (lớp thực thi) là HashSet.** Ngoài HashSet thì chúng ta có những lớp implementation của Set như sau

- EnumSet
- HashSet
- LinkedHashSet
- TreeSet

Mỗi một implementation của Set đều chứa đựng sự khác biệt về cách sử dụng và tốc độ sử lý các phần tử trong tập hợp. Tuỳ vào yêu cầu bài toán mà ta có thể chọn các loại tập hợp Set tương ứng. Chi tiết mỗi tập hợp sẽ được nói trong từng bài cụ thể sau.

- Ví dụ tạo ra một Set như sau

```java
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        Set setA = new HashSet();
        Set setB = new LinkedHashSet();
        Set setC = new TreeSet();

    }
}
```

## 2. Thêm phần tử vào Set 

- Để thêm một phần tử vào Set ta sử dụng phương thức add như sau

  ```java
  import java.util.HashSet;
  import java.util.LinkedHashSet;
  import java.util.Set;
  import java.util.TreeSet;
  
  public class SetExample {
  
      public static void main(String[] args) {
  
         Set<String> setA = new HashSet<>();
        setA.add("element 1");
        setA.add("element 2");
        setA.add("element 3");
  
      }
  }
  ```

## 3. Duyệt qua các phần tử trong Set 

- Sử dụng Iterator để duyệt qua các phần tử. Các em có thể xem chi tiết iterator hoạt động tại đây

  ```java
  Set<String> setA = new HashSet<>();
  
  setA.add("element 1");
  setA.add("element 2");
  setA.add("element 3");
  
  Iterator<String> iterator = set.iterator();
  
  while(iterator.hasNext(){
    String element = iterator.next();
  }
  ```

- Sử dụng For Each để duyệt qua các phần tử

  ```java
  Set set = new HashSet();
  
  for(Object object : set) {
      String element = (String) object;
  }
  ```

## 4. Xoá một phần tử trong Set 

- Chúng ta sử dụng phương thức remove để xoá phần tử trong Set

  ```java
  set.remove("object-to-remove");
  ```

## 5. Xoá tất cả các phần tử trong Set 

- Để xoá tất cả các phần tử ta sử dụng phương thức clear

  ```java
  set.clear(); 
  ```

## 6. Thêm tất cả các phần tử từ một tập hợp Set khác 

- Set cung cấp cho chúng ta phương thức addAll để thêm các phần tử từ một tập hợp khác vào trong Set.

  ```java
  Set<String> set = new HashSet<>();
  set.add("one");
  set.add("two");
  set.add("three");
  
  Set<String> set2 = new HashSet<>();
  set2.add("four");
  
  set2.addAll(set)
  ```

## 7. Kiểm tra kích thước của Set 

- Chúng ta sử dụng phương thức size để xem có bao nhiêu phần tử trong Set

```java
Set<String> set = new HashSet<>();

set.add("123");
set.add("456");
set.add("789");

int size = set.size();
```

## 8. Kiểm tra Set có rỗng không 

- Để kiểm tra Set có rỗng không ta sử dụng phương thức isEmpty

  ```java
  Set<String> set = new HashSet<>(); boolean isEmpty = set.isEmpty(); 
  ```

## 9. Kiểm tra một phần tử đã tồn tại trong Set chưa 

Chúng ta sử dụng phương thức contains để kiểm tra xem phần tử đã tồn tại trong Set chưa

```java
Set<String> set = new HashSet<>();

set.add("123");
set.add("456");

boolean contains123 = set.contains("123");
```

## 10. Chuyển tập hợp Set thành List

- Chúng ta có thể cover một tập hợp Set thành List bằng phương thức addAll như sau

```java
Set<String> set = new HashSet<>();
set.add("123");
set.add("456");

List<String> list = new ArrayList<>();
list.addAll(set);
```