# Collections

[TOC]

## I. Collection trong java

### I.1. Collection vs Collections

"Collection" và "Collections" trong java là hai khái niệm khác nhau.

**Collections trong java** là một khuôn khổ cung cấp một kiến trúc để lưu trữ và thao tác tới nhóm các đối tượng. Tất cả các hoạt động mà bạn thực hiện trên một dữ liệu như tìm kiếm, phân loại, chèn, xóa,... có thể được thực hiện bởi Java Collections.

**Collection trong java** là một root interface trong hệ thống cấp bậc Collection. Java Collection cung cấp nhiều interface (Set, List, Queue, Deque vv) và các lớp (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet vv).

![](D:\data\source\Hoc lap trinh web\Java\img\colection-vs-collections-trong-java.png)

## I.2. Hệ thống cấp bậc Collection trong java

Gói **java.util** chứa tất cả các lớp và interface của Collection.

![](D:\data\source\Hoc lap trinh web\Java\img\he-thong-cap-bac-colection-trong-java.png)

**Dưới đây là mô tả những interface chính của Collection**

- **Set:** là một collection không thể chứa 2 giá trị trùng lặp. Set được sử dụng để biểu diễn các bộ, chẳng hạn như bộ tú lu khơ, thời khóa biểu của học sinh, các tiến trình đang chạy trên máy tính...
- **List:** là một collection có thứ tự (đôi khi còn được gọi là một chuỗi). List có thể chứa các phần tử trùng lặp. Thường có quyền kiểm soát chính xác vị trí các phần tử được chèn vào và có thể truy cập chúng bằng chỉ số (vị trí của chúng).
- **Queue (hàng đợi):** là một collection được sử dụng để chứa nhiều phần tử trước khi xử lý. Bên cạnh các thao tác cơ bản của collection, Queue cung cấp các thao tác bổ sung như chèn, lấy ra và kiểm tra. Queue có thể được sử dụng như là FIFO (first-in, first-out - vào trước, ra trước)
- **Deque:** là một collection được sử dụng để chứa nhiều phần tử trước khi xử lý. Ngoài các thao tác cơ bản của collection, một Deque cung cấp các thao tác bổ sung như chèn, lấy ra và kiểm tra. Deques có thể được sử dụng như là FIFO (first-in, first-out - vào trước, ra trước) và LIFO (last-in, first-out - vào sau, ra trước). Trong một Deque, tất cả các phần tử mới có thể được chèn vào, lấy ra và lấy ra ở cả hai đầu.
- **Map:** là một đối tượng ánh xạ mỗi key tương úng với một giá trị. Map không thể chứa giá trị trùng lặp. Mỗi key có thể ánh xạ đến nhiều nhất một giá trị.

**Dưới đây là mô tả 2 interface được sắp xếp của Set mà Map**

- **SortedSet:** là một Set chứa các phần tử theo thứ tự tăng dần.
- **SortedMap:** là một Map chứa các phần tử được sắp xếp theo thứ tự tăng dần của key của chúng. Các SortedMap được sử dụng cho các collection theo thứ tự tự nhiên của cặp key/value, chẳng hạn như từ điển và danh bạ điện thoại.

### Iterable interface

Iterable interface chứa dữ liệu thành viên Iterator interface

### Iterator interface

Giao tiếp Iterator cung cấp phương tiện để lặp đi lặp lại các thành phần từ đầu đến cuối của một collection.

### Các phương thức của Iterator interface

Chỉ có ba phương pháp trong giao tiếp Iterator như sau:

| Phương thức              | Mô tả                                                        |
| :----------------------- | :----------------------------------------------------------- |
| public boolean hasNext() | Nó trả về true nếu iterator còn phần tử kế tiếp phần tử đang duyệt. |
| public object next()     | Nó trả về phần tử hiện tại và di chuyển con trỏ trỏ tới phần tử tiếp theo. |
| public void remove()     | Nó loại bỏ phần tử cuối được trả về bởi Iterator. Nó hiếm khi được sử dụng. |

## Các phương thức của interface Collection trong java

Có nhiều phương thức được khai báo trong interface Collection như sau:

| Phương thức                              | Mô tả                                                        |
| :--------------------------------------- | :----------------------------------------------------------- |
| public boolean add(Object element)       | Được sử dụng để chèn một phần tử vào collection.             |
| public boolean addAll(Collection c)      | Được sử dụng để chèn các phần tử collection được chỉ định vào collection gọi phương thức này. |
| public boolean remove(Object element)    | Được sử dụng để xóa phần tử từ collection.                   |
| public boolean removeAll(Collection c)   | Được sử dụng để xóa tất cả các phần tử của collection được chỉ định từ collection gọi phương thức này. |
| public boolean retainAll(Collection c)   | Được sử dụng để xóa tất cả các thành phần từ collection gọi phương thức này ngoại trừ collection được chỉ định. |
| public int size()                        | Trả lại tổng số các phần tử trong collection.                |
| public void clear()                      | Loại bỏ tổng số của phần tử khỏi collection.                 |
| public boolean contains(Object element)  | Được sử dụng để tìm kiếm phần tử.                            |
| public boolean containsAll(Collection c) | ược sử dụng để tìm kiếm collection được chỉ định trong collection. |
| public Iterator iterator()               | Trả về một iterator.                                         |
| public Object[] toArray()                | Chuyển đổi collection thành mảng (array).                    |
| public boolean isEmpty()                 | Kiểm tra nếu collection trống.                               |
| public boolean equals(Object element)    | So sanh 2 collection.                                        |
| public int hashCode()                    | Trả về số hashcode của collection.                           |

### I.3. Non-generic Collection và Generic Collection

Collection trong java là non-generic trước JDK 1.5. Từ JDK 1.5 là generic.

Generic Collection trong java cho phép chỉ có một kiểu đối tượng trong collection. Đây là một kiểu an toàn vì không cần phải ép kiểu tại runtime.

Ví dụ về non-generic collection - kiểu cũ

```JAVA
ArrayList list = new ArrayList();
```

Ví dụ về generic collection - kiểu mới

```java
ArrayList<String> list = new ArrayList<String>(); 
```

Trong generic collection, chúng ta phải chỉ định kiểu dữ liệu được đặt trong <...>. Từ JDK 1.5, khi sử dụng ArrayList bắt buộc phải chỉ định kiểu dữ liệu cho nó. Nếu bạn cố gắng thêm một đối tượng có kiểu khác vào, chương trình sẽ báo lỗi *compile-time*.

![](D:\data\source\Hoc lap trinh web\Java\img\vi-du-generic-collection-trong-java.png)

## Duyệt các phần tử của collection

Có 2 cách để duyệt các phần tử của collection trong java.

1. Sử dụng Iterator interface.
2. Sử dụng vòng lặp for-each.

Ví dụ 1: ArrayListExample1.java

```java
import java.util.ArrayList;
import java.util.Iterator;
 
public class ArrayListExample1 {
    public static void main(String args[]) {
        // Creating arraylist
        ArrayList<String> list = new ArrayList<String>();
        // Add objects to arraylist
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
        // Show list through Iterator
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        // Show list through for-each
        System.out.println();
        for (String obj : list) {
            System.out.print(obj + ", ");
        }
        // Show list through index
        System.out.println();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i) + ", ");
        }
    }
}
//Java, C++, PHP, Java, 
//Java, C++, PHP, Java, 
//Java, C++, PHP, Java, 
```

Ví dụ 2: HashSetExample1.java

```java
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
 
public class HashSetExample1 {
    public static void main(String[] args) {
        // Creating hashset
        Set<String> set = new HashSet<String>();
        // Add objects to hashset
        set.add("Java");
        set.add("C++");
        set.add("PHP");
        set.add("Java");
        // Show set through Iterator
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        // Show set through for-each
        System.out.println();
        for (String obj : set) {
            System.out.print(obj + ", ");
        }
    }
}

//Java, C++, PHP, 
//Java, C++, PHP, 
```



**những phương thức được sử dụng phổ biến nhất hiện nay trong** **ngôn ngữ lập trình hướng đối tượng Java****.**

**Bao gồm phương thức addAll, BinarySearch, Copy, Reverse, Shuffle, Sort, ReplaceAll.**

## 1. Phương thức addAll 

Chúng ta sử dụng phương thức addAll để add một hoặc nhiều phần tử vào trong một list có sẳn như sau

```java
List<String> list = new ArrayList<>();
Collections.addAll(list, "element 1", "element 2", "element 3");
```

## 2. Phương thức BinarySearch 

Chúng ta sử dụng binary search dùng để tìm kiếm phần tử trong List và sử dụng thuật toán Binary Search để tìm phần tử. Khi chúng ta áp dụng binary search cho List thì bắt buộc List phải được sắp xếp trước khi sử dụng Binary Search.

```java
List<String> list = new ArrayList<>();
list.add("one");
list.add("two");
list.add("three");
list.add("four");
list.add("five");

Collections.sort(list);

int index = Collections.binarySearch(list, "four");

System.out.println(index);
```

- Chúng ta sử dụng method Collections.sort(list) để sắp xếp các phần tử trong List.
- Ở ví dụ trên chúng ta tìm kiếm từ four trong tập hợp list bằng cách sử dụng phương thức Collections.binarySearch

## 3. Phương thức Copy 

Chúng ta sử dụng phưogn thức Copy để copy tất cả các giá trị từ một list vào một list khác.

```java
try {
			// creating object of Source list and destination List
			List<String> srclst = new ArrayList<String>(3);
			List<String> destlst = new ArrayList<String>(3);
			// Adding element to srclst
			srclst.add("Ram");
			srclst.add("Gopal");
			srclst.add("Verma");

			// Adding element to destlst // bat buoc phai co so luong phan tu truoc khong Empty
			 destlst.add("1");
			 destlst.add("2");
			 destlst.add("3");
			// copy element into destlst
			Collections.copy(destlst, srclst);

			// printing the srclst
			System.out.println("Value of source list: " + srclst);

			// printing the destlst
			System.out.println("Value of destination list: " + destlst);
		} catch (IllegalArgumentException e) {
			System.out.println("Exception thrown : " + e);
		}

		catch (IndexOutOfBoundsException e) {
			System.out.println("Exception thrown : " + e);
		}
```

- Chúng ta sử dụng hàm Collections.copy để copy.

## 4. Phương thức Reverse 

Chúng ta muốn thực hiện đảo ngược thứ tự vị trí trong các phần tử trong List thì sử dụng phương thức reverse() như sau

```java
List<String> list = new ArrayList<String>();

list.add("one");
list.add("two");
list.add("three");

Collections.reverse(list);
// Kết qủa in ra sẽ là 3,2,1
```

## 5. Phương thức shuffle 

Chúng ta muốn xáo trộn các phần tử trong List thì sử dụng phương thức shuffle như sau

```java
public class GFG 
{ 
    public static void main(String[] args) 
    { 
        ArrayList<String>  mylist = new ArrayList<String>(); 
        mylist.add("code"); 
        mylist.add("quiz"); 
        mylist.add("geeksforgeeks"); 
        mylist.add("quiz"); 
        mylist.add("practice"); 
        mylist.add("qa"); 
  
        System.out.println("Original List : \n" + mylist); 
  
        Collections.shuffle(mylist); 
  
        System.out.println("\nShuffled List : \n" + mylist); 
    } 
} 

Original List : 
[code, quiz, geeksforgeeks, quiz, practice, qa]

Shuffled List : 
[qa, quiz, practice, code, quiz, geeksforgeeks]
```

## 6. Phương thức Sort 

Dùng đề sắp xếp thứ tự các phần tử trong một List như sau

```java
List>String< list = new ArrayList<String>();

list.add("one");
list.add("two");
list.add("three");
list.add("four");

Collections.sort(list);
```

## 7. Phương thức ReplaceAll

Chúng ta sử dụng ReplaceAll để thay thế các phần tử có sẳn trong List bằng một phần tử khác.

```java
List source = new ArrayList();
source.add("A");
source.add("B");
source.add("A");

boolean replacedAny = Collections.replaceAll(source, "A", "C");
```