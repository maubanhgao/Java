# Tham trị và tham chiếu

[TOC]

## 1. Gán giá trị 

- Bộ nhớ chương trình gồm có 2 thành phần chính là địa chỉ bộ nhớ và dữ liệu được lưu trữ trong bộ nhớ đó

- Ví dụ khi mình gán một biến cho một giá trị như test = 3. Như vậy bộ nhớ cần lưu trữ chữ test và giá trị 3 của nó vào bộ nhớ như sau

  | Địa chỉ bộ nhớ | Giá trị ô nhớ |
  | -------------- | ------------- |
  | xx1            | test          |
  | xx2            | 3             |

## 2.Tham trị là gì (pass by value) 

**Tham trị** **Pass by value** : nghĩa là mình sẽ clone (tạo ra một giá trị mới bằng cách copy giá trị gốc), và mình chỉ thao tác giá trị với bản copy. Khi chúng ta thay đổi các giá trị của đối tượng, thì không ảnh hưởng đến giá trị gốc. Pass-by-value được hiểu là khi bạn thay đổi biến trong hàm thì ngoài hàm sẽ không bị ảnh hưởng.

![](D:\data\source\Học lập trình web\Java\img\passbyvalue.png)

- Ở ví dụ trên ta thấy rất rõ giá trị của biến someValue

- Ở hàm main chúng ta khai báo nó là giá trị 7 . Sau đó ta gọi hàm process(int value) và truyền giá trị 7 vào.

- Mặc dù ta gián lại giá trị someValue = 10 . Nhưng khi kết thúc hàm process thì giá trị someValue là bằng 7 chứ không phải là 10.

- Bởi vì chúng ta chỉ thao tác với giá trị copy chứ không phải giá trị gốc , nên ta gán someVaule = 10 là gián cho giá trị copy = 10.

- Như vậy dù trong hàm process(int value ) ta có thay đổi giá trị như thế nào đi chăng nữa thì lúc thoát ra khỏi hàm process(int value) giá trị gốc vẫn không thay đổi .

  ![](D:\data\source\Học lập trình web\Java\img\passbyvalue2.png)



## 3. Truyền tham chiếu 

**Tham chiếu** **Pass by reference. Ngược lại với Pass by value, giá trị gốc sẽ bị thay đổi** **Pass-by-reference** là khi bạn thay đổi biến trong hàm cũng làm ngoài hàm bị ảnh hưởng. Nó giống như bạn truyền đúng địa chỉ của biến đó vào hàm.

![](D:\data\source\Học lập trình web\Java\img\passbyreference.png)

Trong trường hợp này hàm process(int &value) trỏ thằng tới địa chỉ vùng nhớ nơi lưu giá trị 7. Như vậy khi ta thay đổi giá trị trong hàm nó thay đổi luôn giá trị khác .

## 4. Tổng kết

**Các bạn nên nhớ trong Java là 100% truyền tham trị (passed by value). Mình chỉ clone một giá trị từ giá trị gốc sau đó truyền đi cho các method cần dùng nó. Ta chỉ thay đổi giá trị Clone chứ không thay đổi trực tiếp giá trị vùng nhớ của đối tượng gốc**