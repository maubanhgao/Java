# Phân biệt abstract và interface

[TOC]

### 1. Interface trong lập trình Java là gì 

**Interface chính là cách mình áp dụng tính trừu tượng trong lập trình. Interface chính là 100% abstract class (khi tạo một lớp abstract ta có thể có 5 phương thức là abstract còn lại 5 phương thức không cần abstract. Như vậy khi lớp con kế thừa thì bắt buộc cài đặt 5 phương thức còn 5 phương thức kia không cần cài đặt. Nếu một lớp abstract có 10 phương thức abstract thì bắt buộc lớp con phải cài đặt 10 phương thức, như vậy là cũng giống interface khi ta có 10 phương thức thì lớp con cũng phải cài đặt 10 phương thức. 

```java
// Interface
interface Animal {
  public void animalSound(); // method của Interface không có phần thân
  public void sleep(); //method của Interface không có phần thân
}

// Pig "implements"  Interface  Animal
class Pig implements Animal {
  public void animalSound() {
    // phần thân của interface sẽ được code  trong class PI
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    // phần thân của interface sẽ được code trong class PIG
    System.out.println("Zzz");
  }
}
```

Một số chú ý khi sử dụng Interface.

- Cũng giống như Abstract Class. Chúng ta không thể tạo đối tượng từ Interface bằng toán tử new
- Interface thì chứa method trống không có phần thân. Phần thân sẽ được code bởi những class implement (cài đặt) interface đó
- Lớp cài đặt Interface phải implement hết tất cả các method có trong interface. Nó định nghĩa một mẫu chung các hành động mà các lớp implements nó follow theo.
- Các method trong Interface mặc định là abstract public và
- Các biến (thuộc tính) trong Interface mặc định là public,static và final
- Các lớp có thể cài đặt (implements) một hoặc nhiều Interface.
- Interface thì không có constructor chính vì vậy mà ta không thể tạo object của một Interface được

### 2. Abstract trong lập trình Java là gì 

**Data Abstraction** là quá trình che giấu đi những dữ liệu quan trọng mình chỉ đưa ra những thông tin cần thiết cho người dùng. Để làm được abstraction trong lập trình, ta có thể sử dụng abstract và interface. Ta có thể sử dụng abstract cho class hoặc method. Chúng ta sử dụng từ khoá abstract để khai báo abstract class và method.

- **Abstract class** : cũng giống như Interface chúng ta không thể tạo đối tượng từ Abstract Class
- **Abstract method** : cũng giống như Interface chúng không có phần thân . Phần thân sẽ được cài đặt trong lớp kế thừa nó

```java
// Abstract class
abstract class Animal {
  // abstract class không có phần
  public abstract void animalSound();

  // abstract class không có phần thân
  public void sleep() {
    System.out.println("Zzz");
  }
}


class Pig extends Animal {
  public void animalSound() {
    // phần code thực thi của abstract method được viết bới lớp con kế thừa nó
    System.out.println("The pig says: wee wee");
  }
}
```

### 3. Sự khác nhau giữa abstract và interface 

<table class="table table-bordered">
  <thead>
    <tr>
      <th>Các điểm so sánh</th>
      <th>Abstract</th>
      <th>Interface</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Đa kế thừa</td>
      <td>Không hỗ trợ đa kế thừa</td>
      <td>Một class có thể kế thừa nhiều Interface</td>
    </tr>
    <tr>
      <td>Defaul (mặc định)</td>
      <td>Có thể định nghĩa thuộc tính , và thân phương thức có thể chứa code</td>
      <td>chỉ chứa hằng số , không có code trong phần thân method</td>
    </tr>
    <tr>
      <td>Access Modifier</td>
      <td>có thể đặt tất cả modifier</td>
      <td>Mọi phương thức và thuộc tính là  public</td>
    </tr>
    <tr>
      <td>Mục đích sử dụng</td>
      <td>IS  A (quan hệ cha con)</td>
      <td>HAS A (Can do, có khả năng làm được việc gì)</td>
    </tr>
  </tbody>
</table>

### 4. Khi nào dùng abstract 

- Khả năng mở rộng không cần xoá hết code làm lại.
- Tăng tính bảo mật che dấu các dữ liệu quan trọng
- Khi các lớp có mối liên hệ cha con với nhau ví dụ như con gà , chó , mèo chúng đều là động vật (Animal)

### 5. Khi nào dùng interface 

- Mục đích chính của interface là dùng cho tính đa hình. Khả năng thực hiện các hành động khác nhau trên các ngữ cảnh khác nhau.
- Chúng ta muốn chú trọng vào hành động hơn về cấu trúc đối tượng.
- Chúng ta muốn sử dụng đa thừa kế.
- Tăng cường tính bảo mật . Người dùng chỉ có thể thấy được method nhưng không thấy được nội dung code bên trong

### 6. Phân biệt Abstract và Interface