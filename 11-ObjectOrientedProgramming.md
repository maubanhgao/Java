# Lập trình hướng đối tượng

[TOC]

### 1. Lập trình hướng đối tượng là gì 

Bản chất Java là ngôn ngữ thuần hướng đối tượng.

**Lập trình hướng đối tượng là 1 kỹ thuật lập trình, cho phép lập trình viên** **trừu tượng hóa** **các đối tượng thực tế thành các đối tượng trong code .**

```java
class KhachHang {
  private String name;
  private int age;
}
```

### 2. Các tính chất của lập trình hướng đối tượng và ví dụ minh hoạ 

- **Tính trừu tượng**
- **Tính đa hình**
- **Tính kế thừa**
- **Tính đóng gói**

### 3. Lợi ích của các tính chất lập trình hướng đối tượng

- ính kế thừa
  - Lớp con (lớp A) có thể tận dụng lại các thuộc tính và phương thức của lớp cha (lớp B) (nghĩa là các thuộc tính và phương thức của lớp B có thể được tái sử dụng bởi lớp A).
  - Lớp A có thể định nghĩa thêm thuộc tính và phương thức mới của riêng nó và có thể định nghĩa lại (hay còn gọi là ghi đè phương thức, overriding) phương thức được kế thừa từ lớp B cho phù hợp với mục đích của nó.
- Tính đóng gói
  - Tính đóng gói hay còn gọi là che dấu dữ liệu . Đối với những dữ liêu quan trọng chúng ta không muốn cho các lớp khác truy cập và sử dung thì ta hạn chế không cho các lớp khác truy cập vào biến hay phương thức bảo mật.
- Tính đa hình
  - Giúp chúng ta tái sử dụng code classes, methods.
  - Chúng có thể tái sử dụng trong nhiều trường hợp code khác nhau.
  - Giảm sự phụ thuộc (low coupling) giữa các object từ đó dể dàng mở rộng chức năng mà không sợ ảnh hưởng tới các chức năng liên quan.
- Tính trừu tượng
  - Khả năng tái sử dụng code.
  - Giúp chúng ta tập trung nghĩ về object có khả năng làm được gì hơn là nó hoạt động như thế nào.
  - Nhóm nhiều object có chung các tính chất và hành động lại với nhau.