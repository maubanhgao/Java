# Bộ nhớ Heap và Stack

[TOC]

## 1. Các thuật ngữ 

![](D:\data\source\Hoc lap trinh web\Java\img\cacthuatngu.png)



- Runtime : khoản thời gian chương trình chạy.
- Java Heap Memory : Vùng nhớ Heap trong Java.
- Java Stack Memory: Vùng nhớ Stack trong Java.
- JVM : máy ảo Java Vitural Machine để chạy các chương trình Java.
- Object : là đối tượng được khởi tạo từ khoá new từ một class. Ví dụ Persion persion = new Person().

## 2. Heap và Stack 

Bộ nhớ Heap và Stack là một phần của bộ nhớ được JVM sử dụng để chạy chương trình Java của bạn. Khi bạn chạy chương trình Java, JVM sẽ yêu cầu hệ điều hành (Ví dụ như Window,Mac, ) cấp cho một không gian bộ nhớ trong RAM để dùng cho việc chạy chương trình. JVM sẽ chia bộ nhớ này thành 2 vùng nhớ Heap và Stack cho việc quản lý.

![](D:\data\source\Hoc lap trinh web\Java\img\stackandheap.png)

## 3. Bộ nhớ Heap 

- **Bộ nhớ Heap** là bộ nhớ được sử dụng ở runtime (Khi chương trình đang chạy) để lưu các Objects(các đối tượng) . Bất cứ khi nào ở đâu trong chương trình của bạn khi bạn tạo Object thì nó sẽ được lưu trong Heap (thực thi toán tử new).
- Các objects trong Heap đều được truy cập bởi tất cả các các nơi trong ứng dụng, bởi các threads khác nhau.
- Thời gian sống của object phụ thuộc vào chương trình **Garbage Collector** (GC ) của java. Khi một object bị null hoặc không tham chiếu tới một đối tượng nào thì GC sẽ xoá nó khỏi bộ nhớ.
- Dung lượng sử dụng của Heap sẽ tăng giảm phụ thuộc vào Objects sử dụng.
- Dung lượng Heap thường lớn hơn Stack.

## 4. Bộ nhớ Stack 

- Bộ nhớ để lưu các biến local trong hàm.

- Các biến local bao gồm loại nguyên thuỷ (primitive) và loại tham chiếu tới đối tượng trong heap (reference) khai báo trong hàm, hoặc đối số được truyền vào hàm, thường có thời gian sống ngắn.

- Bộ nhớ stack thường nhỏ.

- Cơ chế hoạt động thức của **Stack** là những phương thức , biến chạy sau thì sẽ bị giải phóng đầu .

- Khi hàm được gọi thì một vùng nhớ được tạo ra trong stack và lưu các biến trong hàm đó. Khi hàm thực hiện xong, khối bộ nhớ cho hàm sẽ bị xoá, và giải phóng bộ nhớ trong stack.

- Ví dụ về **bộ nhớ Heap** và **bộ nhớ Stack**

  ![](D:\data\source\Hoc lap trinh web\Java\img\vdheapstack.png)

```java
public class Memory {

    public static void main (String[] args,) { // line 1
        int i = 1 ; //line 2
        Object obj = new Object(); // line 3
        Memory mem = new Memory(); // line 4
        mem.foo(obj); // line 5
    }//line 9

    private static void foo(Object param) { // line 6
        String str = param.toString(); // line 7
        System.out.println(str)// line 8
    }
}
```

- Dòng 1 phương thức public static void main sẽ lưu bên Stack (vì stack sẽ cấp phát vùng nhớ cho phương thức).
- Dòng 2 khai báo biến i = 2 thì nằm bên stack vì stack lưu các biến.
- Dòng 3 khai báo biến Object obj = new Object thì biến obj nằm bên stack vì stack lưu các biến còn đối tượng Object được lưu bên Heap và biến obj sẽ tham chiếu đến đối tượng Object bên bộ nhớ Heap .
- Dòng 4 Memory mem = new Memory thì đối tượng Memory sẽ lưu bên bộ nhớ heap còn biến mem thì lưu bên bộ nhớ stack , và mem tham chiếu tới đối tượng Memory bên Heap.
- Dòng 5 mem.foo() thì phương thức foo() được tạo ra ở dòng 5. Phương thức foo này là nằm trong phương thức main . Như ta thấy bên bộ nhớ Stack Hình chữ nhật bự nhất bao ở ngoài là hàm main () . Bên trong hàm main là bộ nhớ phương thức foo. Khi chương trình chạy xong thì bộ nhớ foo() sẽ được giải phóng trước sau đó mới đến main.
- Dòng 6 private void foo() thì hàm foo() được lưu trong bộ nhó Stack.
- Dòng 7 String str = param.toString() . Trong java String là kiểu đặc biệt . Nó là kiểu Object và được quản lý bởi String Pool riêng. Chính vì vậy nó được lưu bên Heap.

## 5. Sự khác nhau giữa heap và stack

| Heap                                                         | Stack                                                        |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Bộ nhớ Heap** là bộ nhớ được sử dụng ở runtime (Khi chương trình đang chạy) để lưu các Objects(các đối tượng) . Bất cứ khi nào ở đâu trong chương trình của bạn khi bạn tạo Object thì nó sẽ được lưu trong Heap (thực thi toán tử new). | Lưu các biến local và lời gọi hàm ở runtime,  trong một Thread Java. Các biến bao gồm các biến nguyên thủy (primitive), loại tham chiếu đến đối tượng  trong heap (reference), khai báo trong hàm hoặc một đối số truyền vào |
| Thời gian sống của bộ nhớ heap dài hơn bộ nhớ Stack          | Thời gian sống ngắn                                          |
| Thời gian sống của heap phụ thuộc vào Garbage colector. Garbage colector sẽ chạy trên bộ nhớ heap để xóa các Object không được sử dụng nữa, nghĩa là các object không được reference trong chương trình |                                                              |
| Các object trong heap điều được truy cập ở tất cả các nơi trong ứng dụng bởi các Threads khác nhau | Stack chỉ được sử dụng cho một Thread duy nhất. Thread ngoài không thể truy cập vào được |
| Dung lượng Heap thường lớn hơn dung lượng Stack              | Bộ nhớ stack thường nhỏ                                      |
| Cơ chế quản lý heap thường phức tạp. Heap được phân thành 2 loại là : Young-Generation và Old- Generation. Đọc thêm và Garbage Collection để hiểu. | Cơ chế hoạt động LIFO (Last in first out) chạy sau chết trước |
| Sử dụng -Xms để định nghĩa dung lượng bắt đầu và dung lượng tối đa của bộ nhớ heap. | Dùng -Xss để định nghĩa dung lượng tối đa bộ nhớ stack       |
| Khi Head đầy thì chương trình sẽ báo lỗi java.lang.OutOfMemoryError:Java Heap Space | Khi stack bị đầy bộ nhớ chương trình hiển lỗi java.lang.StaclOverFlowError |
| Dung lượng của Heap tăng giảm phụ thuộc số lượng Object sử dụng | Bất cứ khi nào gọi 1 hàm, một khối bộ nhớ mới sẽ được tạo ra trong Stack cho hàm đói để lưu các biến local. Khi hàm thực hiện xong, khối bộ nhớ cho hàm sẽ bị xóa, và giải phóng bộ nhớ trong stack. |

