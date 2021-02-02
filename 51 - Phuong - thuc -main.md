## Phương thức main trong Java

### Cú pháp main? Giải thích

Khi khai báo phương thức main ta thường viết như sau:

> public static void main(String[] args) { }

Ý nghĩa của phương thức này là khi ta dùng lệnh java gọi đến lớp nào đó, Java VM sẽ cố gắng tìm phương thức main trong lớp. Quay lại những bài đầu tiên, ta dùng CMD gõ lệnh như sau:

![](D:\data\source\Hoc lap trinh web\Java\img\1_Phương thức main trong Java_Howkteam_com.png)

Như ta viết **java Helloworld** thì Java VM sẽ tìm phương thức main trong lớp HelloWorld để chạy chương trình. Nếu ta muốn viết main trong lớp khác cũng tương tự.

Ý nghĩa từng cú pháp của phương thức Main:

- **public**: Ta phải để quyền truy cập ở dạng **public** để JRE ở bên ngoài có thể truy cập được phương thức để thực thi. Nếu ta không có từ khóa **public** thì chương trình không thể tìm được như sau:

![](D:\data\source\Hoc lap trinh web\Java\img\2_Phương thức main trong Java_Howkteam_com.png)

- **static**: Khi JRE bắt đầu, chưa có đối tượng nào được khởi tạo. Vì vậy ta nên để phương thức ở dạng **static** để JVM có thể load class vào bộ nhớ và có thể gọi phương thức. Nếu không có **static** thì có lỗi như sau:

  ![](D:\data\source\Hoc lap trinh web\Java\img\3_Phương thức main trong Java_Howkteam_com.png)

- **void**: phương thức main bắt buộc là **void**, khi bạn thử **return** giá trị khác thì Eclipse sẽ cảnh báo:

![](D:\data\source\Hoc lap trinh web\Java\img\4_Phương thức main trong Java_Howkteam_com.png)

- **String[] args**: Đây là những tham số mà người dùng truyền vào sau tên lớp. Mặc định những giá trị người dùng sẽ nằm trong một mảng kiểu String tên **args**. Ta sẽ thử in ra như sau:

```java
public static void main(String[] args) {
	// TODO Auto-generated method stub
	for (String arg : args) {
		System.out.println(arg);
	}
}
```

![](D:\data\source\Hoc lap trinh web\Java\img\5_Phương thức main trong Java_Howkteam_com.png)

Nếu dùng Eclipse ta sẽ thêm các tham số như sau:

![](D:\data\source\Hoc lap trinh web\Java\img\6_Phương thức main trong Java_Howkteam_com.png)

![](D:\data\source\Hoc lap trinh web\Java\img\7_Phương thức main trong Java_Howkteam_com.png)

![](D:\data\source\Hoc lap trinh web\Java\img\8_Phương thức main trong Java_Howkteam_com.png)