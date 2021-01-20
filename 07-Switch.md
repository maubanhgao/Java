# Mệnh đề Switch

**Cú pháp**

```java
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}
```

- switch : sẽ kiểm tra giá trị expression
- case : nếu giá trị trong expression mà đúng với case thì sẽ chạy khối lệnh trong case
- break : dùng để thoát ra khỏi switch
- default : khi không có giá trị nào thoả mãn thì sẽ chạy khối lệnh trong default
- Trong ví dụ dưới đây ta kiểm tra xem hôm nay là thứ mấy. Trong mệnh đề switch ta có 7 trường hợp xảy ra từ thứ 2 đến thứ 7. Tuỳ vào giá trị truyền vào là số nào thì sẽ vào case tương ứng. Như ví dụ dưới đây ta truyền vào day = 4 thì nó sẽ rơi vào case 4 và in ra là thứ 5

```java
int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
//Kết quả là "Thursday" (day 4)
```