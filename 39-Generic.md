# Generic

[TOC]

## 1. Generic trong lập trình Java là gì 

**Generic – tham số hoá kiểu dữ liệu****, một thuật ngữ được nhắc đến thường xuyên trong quá trình các bạn học** **ngôn ngữ lập trình Java**

**Generic** có nghĩa là ta viết các phương thức và lớp để tái sử dụng cho các đối tượng thuộc các kiểu dữ liệu khác nhau (Kiểu dữ liệu như Person , Car , Student, Hotel vv).

- Danh sách học sinh

```java
List<Student> students = new ArrayList<Student>();
```

- Danh sách giáo viên

```java
List<Teacher> teachers = new ArrayList<Teacher>();
```

## 2. Cách tạo Generic Class và Generic method 

### 1. Cách tạo Generic Class

 **Ví dụ** ta tạo Generic Class tên là Box. Mọi người chú ý để tạo 1 class là generic ta thêm < T > vào sau class. <T> là ký hiệu của Generic , ta sẽ tìm hiểu ở phần tiếp theo.

```java
public class Box<T> {
      private T t;

      public void add(T t) {
         this.t = t;
      }

      public T get() {
         return t;
      }

      public static void main(String[] args) {
         Box<Integer> integerBox = new Box<Integer>();
         Box<String> stringBox = new Box<String>();

         integerBox.add(new Integer(10));
         stringBox.add(new String("Hello World"));

         System.out.printf("Integer Value :%d\n\n", integerBox.get());
         System.out.printf("String Value :%s\n", stringBox.get());
      }
   }
//Integer Value :10
//String Value :Hello World
```

Như vậy ví dụ trên ta tạo một class Box là generic có 2 phương thức là add và get .Khi ta sử dụng Generic Box trong hàm main ( 58,59) . Tuỳ vào ngữ cảnh mà Generic Box có thể chứa kiểu đối tượng Integer (Box ) hay nó chứa kiểu dữ liệu là String (Box\<String\>) . Dù kiểu dữ liệu Integer hay String ta đều sử dụng được phương thức get và set đã được định nghỉa trong lớp Generic Box. Như vậy mình thấy sử dụng Generic mình đỡ phải viết code nhiều. Mình có thể tái sử dụng code cho các đối tượng khác nhau.

### 2. Cách tạo Generic method 

Ví dụ ta viết một phương thức in tất cả các phần tử là Generic. Mọi người chú ý tham số truyền vào trong phương thức là chữ <E> đó là tham khi ta muốn viết một hàm generic. Tuỳ vào tham số truyền vào là kiểu dữ liệu gì . Ta cũng in được các phần tử con trong tập hợp đó Ví dụ ta viết phương thức printArrayGeneric sau truyền vào tham số là một kiểu generic. Ký tự <E> ta sẽ bàn trong phần tiếp.

```java
 public class GenericMethodTest {
      // generic method printArrayGeneric
      public static < E > void printArrayGeneric( E[] inputArrayGeneric ) {
         // Display array elements
         for(E elementGeneric : ArrayGeneric) {
            System.out.printf("%s ", elementGeneric);
         }
         System.out.println();
      }

      public static void main(String args[]) {
         // Create arrays of Integer, Double and Character
         Integer[] intArrayGeneric = { 2,4,6,8,10 };
         Double[] doubleArrayGeneric = { 2.1, 3.2, 4.3, 5.4 };
         Character[] charArrayGeneric = { 'L', 'E', 'V', 'U', 'O' };

         System.out.println("Array intArrayGeneric contains:");
         printArrayGeneric(intArrayGeneric);   // pass an Integer array

         System.out.println("\nArray doubleArray contains:");
         printArrayGeneric(doubleArrayGeneric);   // pass a Double array

         System.out.println("\nArray characterArray contains:");
         printArrayGeneric(charArrayGeneric);   // pass a Character array
      }
   }
 // Array intArrayGeneric contains: 2 4 6 8 10

//Array doubleArrayGeneric contains: 2.1 3.2 4.3 5.4

/Array characterArray contains: L E V U O
```

Như vậy ở ví dụ trên ta tạo ra một phương thức in ra màn hình là generic . Tuỳ thuộc vào đối số truyền vào là Integer , String, hay Double thì phương thức in đều in ra được các phần tử Nếu ta truyền đối số là Integer thì sẽ nhận được kết quả là các số nguyên trong tập hợp được in ra . Nếu ta truyền đối số là Double thì ta sẽ nhận được các số thực được in ra . Như vậy ta chỉ viết code 1 lần và sử dụng được cho tất cả các đối số là những kiểu dữ liệu khác nhau.

## 3. Các ký tự trong Generic 

Như ta thấy ở các ví dụ trên ta dùng các ký tự đặt biệt như <T> hay <E> để đặt tên các kiểu dữ liệu và tham số. Ta có thể dùng các từ khác cũng được như X,Y,Z . Nhưng do <T> hay <E> là các qui ước chung cho các lập trình viên đọc cho dể hiểu, dể bảo trì nên ta không nên đặt các từ khác gây nhầm lẫn. Chúng ta có các qui ước sau.

- E- Element (Phần tử như Student , Teacher)
- K – Key (Giống như key trong tập hợp Map)
- V – Value (V là giá trị giống như kiểu Value trong M )
- N – Number (Kiểu số)
- T – Type (Loại đối tượng ví dụ như con chó , gà , mèo thuộc loại động vật

## 4. Generic với các ký tự đại diện 

Trong Generic nhiều lúc chúng ta sẽ gặp các ký tự đại diên như : (?),(wildcard), nó đại diện cho một loại dữ liệu không rõ ràng.

- Collection<?>
- List<? extends Number>
- Comparator<? super String>
- Pair<String,?>.

1. Ký tự đại diện <?> chấp nhận tất cả các loại đối số (chứa mọi kiểu đối tượng). Ví dụ: Collection<?> mô tả một tập hợp chấp nhận tất cả các loại đối số kiểu String, Integer, Boolean, …
2. Ký tự đại diện <? extends type>: Các đối tượng bất kỳ nào cũng được nhưng bắt buộc phải có cùng kiểu dữ liệu mới hợp lệ . Ví dụ: List<? extends Number> mô tả một danh sách, nơi mà các phần tử là kiểu Number hoặc kiểu con của Number.
3. Ký tự đại diện <? super type> chấp nhận bất ký đối tượng nào miễn là đối tượng này là cha của type hoặc đối tượng của type.

## 5. Generic trong abstract và intefacer 

**Trong** **lập trình** **chúng ta thường sử dụng nhiều generic trong** **Abstract** **và** **Interface** để code trở nên gọn hơn tái sử dụng được nhiều lần.

### 1. Generic trong Abstract được khai báo như sau 

```java
abstract class Animal<T> {

protected abstract <T> getAnimalName();
}
```

### 2. Generic trong Interface được khai báo như sau 

```java
public interface GenericDao<T> {

    void insert(T obj);

    void update(T obj);

}
```

## 6. Lợi ích khi dùng generic 

- **Kiểu dữ liệu** an toàn: Chúng ta chỉ có thể giữ được một loại đối tượng trong Generics. Nó không cho phép lưu trữ các loại đối tượng khác.
- Kiểm tra dữ liệu chặt chẽ ở Compile-time mà không phải là Runtime-error. Nên chúng ta sẽ dễ dàng kiểm soát lỗi hơn.
- Hạn chế việc **ép kiểu** (cast) thủ công mà không an toàn.
- Giúp chúng ta viết các thuật toán được sử dụng nhiều (reusable), dễ dàng thay đổi, an toàn dữ liệu và dễ đọc hơn.

## 7. Nhược điểm

- Không thể gọi Generics bằng kiểu **dữ liệu nguyên thủy** (Primitive type: int, long, double, …), thay vào đó sử dụng các kiểu dữ liệu Object.
- Không thể tạo instances của kiểu dữ liệu Generics.
- Không thể sử dụng static cho Generics.