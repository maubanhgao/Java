# SortedSet

[TOC]

### 	1. SortedSet trong lập trình Java là gì 

**SortedSet** là **một interface con của Set** nó có đủ các chức năng mà Set có như giới thiệu ở bài trước. Ngoài ra có một cái đặt biệt đó là tất cả phần tử trong SortedSet là đều được sắp xếp theo một thứ tự, một trật tự nhất định là sắp xếp tăng dần hay giảm dần.

### 2. Tập hợp SortedSet 

- Tập hợp TreeSet là lớp thực thi implementation interface SortedSet. Chúng ta khai báo TreeSet như sau

  ```java
  SortedSet sortedSet = new TreeSet();
  ```

### 3. Thêm một phần tử vào SortedSet 

```java
SortedSet sortedSet = new TreeSet();
sortedSet.add("one");
```

### 4. Xoá một phần tử ra khỏi SortedSet 

```java

```

### 5. Lấy phần tử đầu tiên SortedSet 

```java
Object firstElement = sortedSet.first();
```

### 6. Lấy phần tử cuối cùng SortedSet 

```java
Object lastElement = sortedSet.last();
```

### 7. Duyệt các phần tử SortedSet 

```java
SortedSet sortedSet = new TreeSet();

sortedSet.add("one");
sortedSet.add("two");
sortedSet.add("three");

Iterator iterator = sortedSet.iterator();
while(iterator.hasNext()) {
    String element = (String) iterator.next();
    System.out.println(element);
}
```

### 8. Sắp xếp các phần tử SortedSet 

**Mặc định tính năng sắp xếp các phần tử (Sort) là sort theo thứ tự tăng dần.**

Tuy nhiên chúng ta có thể tự viết ra một thuật toán so sánh khác bằng việc truyền vào một Comparator do chính chúng ta viết vào constructor của TreeSet như sau.

```java
Comparator comparator = new MyComparator();
SortedSet sortedSet = new TreeSet(comparator); 
```

- Khi chúng ta duyệt qua các phần tử trong TreeSet mặt định nó sẽ duyệt từ nhỏ đến lớn. Chúng ta cũng có thể nói TreeSet duyệt ngược lại từ lớn đến nhỏ thông qua phương thức descendingIterator như sau

  ```java
  TreeSet treeSet = new TreeSet();
  
  treeSet.add("one");
  treeSet.add("two");
  treeSet.add("three");
  
  Iterator iterator = treeSet.descendingIterator();
  while(iterator.hasNext()) {
      String element = (String) iterator.next();
      System.out.println(element);
  }
  ```

### 9. Lấy các phần tử đầu SortedSet 

- SortedSet cung cấp cho chúng ta phương thức headSet() trả về một SortedSet mới với tất cả các phần tử nhỏ hơn phần tử truyền vào. Ví dụ anh có tập hợp là a,b,c,d,e. Khi anh truyền vào chữ c thì nó sẽ trả cho anh về một SortedSet mới là a và b vì a và b là nhỏ hơn giá trị c mà anh truyền vào.

  ```java
  SortedSet sortedSet = new TreeSet(); 
  sortedSet.add("a"); 
  sortedSet.add("b"); 
  sortedSet.add("c"); 
  sortedSet.add("d"); 
  sortedSet.add("e"); 
  SortedSet headSet = sortedSet.headSet("c"); 
  ```

### 10. Lấy các phần tử sau SortedSet

- SortSet cung cấp phương thức tailSet trả về một SortedSet mới với tất cả các giá trị lớn hơn và bằng giá trị truyền vào . Cũng như ví dụ trên a có tập hợp là a,b,c,e,d. Khi anh truyền vào chữ c thì anh sẽ nhận được SortedSet mới là c,d,e

```java
SortedSet sortedSet = new TreeSet();

sortedSet.add("a");
sortedSet.add("b");
sortedSet.add("c");
sortedSet.add("d");
sortedSet.add("e");

SortedSet tailSet = sortedSet.tailSet("c");
```

