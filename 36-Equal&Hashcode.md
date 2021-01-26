# Equal và Hashcode

[TOC]

## 1. Equal trong lập trình Java là gì 

**Phương thức equals được sử dụng trong hầu hết các tập hợp để kiểm tra xem phần tử đã tồn tại trong tập hợp hay chưa.**

**Ví dụ** như mình muốn kiểm tra xem giá trị 123 đã có trong tập hợp list chưa ở ví dụ sau:

```java
List list = new ArrayList();
list.add("123");

boolean contains123 = list.contains("123");
```

- Ở ví dụ trên chúng ta sẽ duyệt qua hết các phần tử ở trong list sau đó thực thi phép so sánh từng phần tử list có bằng giá trị 123 không. Vì ta truyền vào là một chuỗi nên phương thức String.equals() được sử dụng để xem 2 chuỗi có bằng nhau hay không

- Phương thức equals ngoài được dùng cho việc tìm kiếm phần tử đã tồn tại trong tập hợp hay không thì nó cũng được dùng để xoá một phần tử ra khỏi tập hợp.

  ```java
  List list = new ArrayList();
  list.add("123");
  boolean removed = list.remove("123");
  ```

- Ở ví dụ trên thì list sẽ duyệt qua các phần tử sau đó thực thi phép so sánh nếu tham số truyền vào (123) có bằng với từng phần tử trong tập hợp không. Nếu bằng thì nó xoá đi.

- Ở 2 ví dụ trên ta thấy tham số truyền vào là một chuỗi nên chúng ta có thể so sánh là String.equals. Nhưng nếu như ta truyền là đối tượng thì sao. Lúc này chúng ta sẽ tự viết ra cách mà so sánh các đối tượng. Ví dụ như ta muốn so sánh 2 đối tượng Employee có bằng nhau hay không.

- có lớp Employee như sau

  ```java
  public class Employee {
      protected long   employeeId;
      protected String firstName;
      protected String lastName;
  }
  ```

  Ví dụ ta mong muốn nến 2 đối tượng Employee mà có cùng employeeId thì nó là bằng nhau. Ta tiến hành override phương thức equals như sau.

  ```java
  public class Employee {
    public boolean equals(Object o) {
  		if (o == null)
  			return false;
  		if (!(o instanceof Employee))
  			return false;
  
  		Employee other = (Employee) o;
  		return this.employeeID == other.employeeID;
  	}
  }
  ```

- Ngoài cách so sánh bằng employeeID chúng ta có thể hoàn toàn so sánh bằng firstName hoặc lastName.

Như vậy equals được sử dụng trong tập hợp để so sánh các phần tử nhằm mục đích kiểm tra phần tử có tồn tại hay chưa hoặc mình muốn xoá nó ra khỏi tập hợp.

## 2. HashCode trong lập trình Java là gì

có một lớp Student gồm có 2 thuộc tính là id và name như sau

```java
public class Student {
  
  private int id;
  private String name

  public Student(int id,String name) {
  	this.id = id;
  	this.name = name;
  }
  
}
```

- tạo một hàm main để in ra hashcode của đối tượng Student

  ```java
  public class Main {
    
    public static void main(String[] args) {
  
      Student nguyen = new Student(1,"Le Vu Nguyên")
      Student vu = new Student(2,"Le Nguyen Vu")
  
      System.out.println("HashCode Nguyên" + nguyen.hashCode())
      System.out.println("HashCode Vũ" + vu.hashCode())
  
    }
    
  }
  ```

- Như chúng ta thấy trong Java tất cả các đối tượng đều kế thừa từ một đối tượng cha là Object. Trong đối tượng Object có 11 phương thức và hashCode là một trong các phương thức đó. Do vậy khi ta tạo đối tượng là Student thì trong Student đã kế thừa phương thức hashCode. Chính vì vậy mà ta có thể gọi phương thức nguyen.hashCode() trong đối tượng nguyen và vu.hashCode() trong đối tượng vu.

- Khi ta chạy hàm main thì ta nhận được kết quả là một số nguyên như sau :

- HashCode Nguyên : 1852704110

- HashCode Vũ : 2032578917



Như vậy hàm hashCode có nghĩa là sẽ trả về một số duy nhất tương ứng với từng object. Mỗi Object trong java đều có 1 định danh và định danh để phân biệt mỗi object chính là giá trị hashcode. Tương tự như chúng ta đều có một số chứng minh nhân dân vậy.

- Vậy hashcode được tạo ra như thế nào.

Khi ta tạo một đối tượng thì đối tượng đó sẽ được lưu vào bộ nhớ HEAP và nó được lưu tại một địa chỉ trong bộ nhớ. Hashcode được tạo ra cho đối tượng bằng cách kết hợp giữa địa chỉ bộ nhớ cộng thêm các tác nhân khác (như nhân thêm 30 rồi cộng thêm 2) sau đó sẽ cho ra một mã hashcode.

- Như vậy hashcode không phải là địa chỉ vùng nhớ chứa đối tượng mà nó là một thành phần để tạo ra hashcode.