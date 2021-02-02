# Sử dụng các tập hợp

[TOC]

## 1. Các collection trong lập trình java 

![](D:\data\source\Hoc lap trinh web\Java\img\he-thong-cap-bac-colection-trong-java.png)

## 2. List 

**Là một** **cấu trúc dữ liệu** **có thứ tự (đôi khi còn được gọi là một chuỗi).** **List có thể chứa các phần tử trùng lặp****. Thường có quyền kiểm soát chính xác vị trí các phần tử được chèn vào và có thể truy cập chúng bằng chỉ số (vị trí của chúng)**

```java
List<String> list = new ArrayList<String>();
list.add("Le Vu Nguyen ");
list.add("Java ");
list.add("Collection List ");
```

## 3. Vector 

**Là một** **cấu trúc dữ liệu** có thể chứa các phần tử trùng lặp. Duy trì thứ tự của phần tử được thêm vào. Vector là synchronized.

```java
Vector<String> list3 = new Vector<String>();
        list3.add("Le Vu Nguyen ");
        list3.add("Collection");
```

## 4. Set 

Là một **cấu trúc dữ liệu** không thể chứa 2 giá trị trùng lặp.

```java
Set<Integer> hashsetInteger = new HashSet<>();
    hashsetInteger.add(1);
    hashsetInteger.add(2);
    hashsetInteger.add(3);
```

## 5. Queue (hàng đợi) 

**Là một** **cấu trúc dữ liệu** được sử dụng để chứa nhiều phần tử trước khi xử lý. Bên cạnh các thao tác cơ bản của collection, Là tập hợp cho phép các phần tử trùng lặp, Không cho phép phần tử null Queue cung cấp các thao tác bổ sung như chèn, lấy ra và kiểm tra. Queue có thể được sử dụng như là FIFO (first-in, first-out - vào trước, ra trước).

```java
 Queue<String> names = new LinkedList<String>();
    names.add("Le Vu Nguyen");
    names.add("Qu");
```

## 6. Deque 

Là một **cấu trúc dữ liệu** cung cấp các thao tác bổ sung như chèn, lấy ra và kiểm tra. **Deque** có thể được sử dụng như là FIFO (first-in, first-out - vào trước, ra trước) và LIFO (last-in, first-out - vào sau, ra trước). Trong một Deque, tất cả các phần tử mới có thể được chèn vào, lấy ra và lấy ra ở cả hai đầu.

```java
Deque<String> deque = new LinkedList<String>();
        deque.add("Nguyên "); // add vào đuôi
        deque.addFirst("Le Vu ");
        deque.addLast("Deque");
        deque.push("Name   (Head)"); //add vào đầu
        deque.offer("Age  5 (Tail)");
```

## 7. Map

Là một đối tượng ánh xạ mỗi key tương úng với một giá trị. **Map** không thể chứa giá trị trùng lặp. Mỗi key có thể ánh xạ đến nhiều nhất một giá trị.

```java
Map<Integer, String> hashMap = new HashMap<>();
    hashMap.put(1, "One");
    hashMap.put(0, "Zero");
    hashMap.put(2, "Two");
    hashMap.put(4, "Four");
    hashMap.put(21, "Twenty first");
    hashMap.put(5, "Five");
```

##  8. Phân biệt Collection vs Collections 

- **Collections trong java** là kiến trúc để lưu trữ và thao tác tới nhóm các đối tượng. Tất cả các hoạt động mà bạn thực hiện trên một dữ liệu như tìm kiếm, phân loại, chèn, xóa,… có thể được thực hiện bởi Java Collections.
- **Java Collection** cung cấp nhiều interface (Set, List, Queue, Deque vv) và các lớp (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet vv).

## 9. Sự khác nhau Array và ArrayList 

1. Array
   - là fix size , cố định số lượng phần tử trong mảng
   - Có thể lưu trữ dữ liệu kiểu nguyên thủy và đối tượng.
   - Tốc độ lưu trữ và thao tác nhanh hơn.
   - Chỉ có thuộc tính length
2. ArrayList
   - Số lượng phần tử co giản được
   - Chỉ có thể lưu trữ dữ liệu kiểu đối tượng. Kể từ Java 5, kiểu nguyên thủy được tự động chuyển đổi trong các đối tượng được gọi là auto-boxing.
   - Tốc độ lưu trữ vào thao tác chậm hơn.
   - Có nhiều phương thức để thao tác với dữ liệu.

## 10. Sự khác nhau Set và List 

- List các phần tử có thể trùng lặp
- Set các phần tử không trung lặp

## 11. Sự khác nhau ArrayList và Vector

1. ArrayList
   - ArrayList là KHÔNG synchronized
   - ArrayList tăng kích thước của nó bằng 50% kích thước mảng.
2. Vector
   - Vector là synchronized.
   - Vector tăng kích thước của nó bằng cách nhân đôi kích thước mảng.

## 12. Sự khác nhau ArrayList và LinkedList

1. ArrayList
   - ArrayList sử dụng một mảng động
   - ArrayList nhanh hơn trong việc trữ và lấy dữ liệu
2. LinkedList
   - LinkedList sử dụng danh sách liên kết doubly
   - LinkedList nhanh hơn trong việc thao tác dữ liệu

## 13. **Sự khác nhau HashSet và TreeSet**

HashSet không duy trì thứ tự nào, trong khi TreeSet duy trì thứ tự tăng dần

## 14. **Sự khác biệt giữa HashSet và HashMap**

- HashSet với cấu trúc chứa đựng chỉ là các giá trị.
- HashMap cấu trúc chứa đựng là key và value

## 15. **Sự khác biệt giữa HashMap và TreeMap**

HashMap duy trì không có thứ tự, trong khi TreeMap duy trì thứ tự tăng dần.

## 16. **Sự khác biệt giữa Sự khác nhau giữa HashMap và Hashtable**

1. HashMap
   - HashMap là KHÔNG synchronized
   - HashMap cấu trúc chỉ chứa một key null và nhiều giá trị null.
2. Hashtable
   - Hashtable là synchronized.
   - Hashtable cấu trúc không chứa bất kỳ key null hoặc giá trị null.

## 17. **Sự khác nhau Set và Map**

**Set chỉ chứa giá trị, trong khi Map chứa cặp key và value.**