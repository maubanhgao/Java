# 05 Điều Cần Biết Về Java Exception

**Trong quá trình học tập, nghiên cứu hoặc trong một bài phỏng vấn về ngôn ngữ Java. Xử lý ngoại lệ là một vấn đề quan trọng giúp chúng ta có thể hoàn thiện, tối ưu một chương trình Java. Sau đây mình sẽ đề xuất 05 điều bạn cần biết về ngoại lệ và xử lý ngoại lệ trong Java.**

![](D:\data\source\Hoc lap trinh web\Java\img\Exception-flow-Java-Exception-Handling-Edureka.png)

### **1. Ngoại lệ trong Java là gì?**

Một ngoại lệ (Exception) trong Java là một vấn đề phát sinh trong quá trình thực thi chương trình. Khi xảy ra ngoại lệ, luồng xử lý (flow) bị gián đoạn, chương trình/ứng dụng dừng bất thường. Nó là một đối tượng được ném ra tại Runtime.

Ngoại lệ trong Java có thể xảy ra vì nhiều lý do khác nhau:

- Nhập dữ liệu không hợp lệ.
- Không tìm thấy file cần mở.
- Kết nối mạng bị ngắt trong quá trình thực hiện giao tác.
- JVM hết bộ nhớ.
- Truy cập vượt ngoài chỉ số của mảng, v…v…

Ngoại lệ xảy ra có thể do người dùng, lập trình viên hoặc số khác do tài nguyên bị lỗi. Java Exeption được triển khai bằng cách sử dụng các lớp như **T****hrowable, Exception, RuntimeException** và các từ khóa như **throw, throws, try, catch và finally.**

Dựa vào tính chất các vấn đề, người ta chia ngoại lệ thành ba loại:

- Ngoại lệ được kiểm tra (Checked Exceptions).
- Ngoại lệ không được kiểm tra (Unchecked Exceptions).
- Lỗi (Error).

![](D:\data\source\Hoc lap trinh web\Java\img\unnamed.png)

### **2. Sự khác nhau giữa "Checked Exceptions" và "Unchecked Exceptions" trong Java?**

**Checked Exceptions:** Là một ngoại lệ được kiểm tra và thông báo bởi trình biên dịch tại thời điểm biên dịch, chúng cũng có thể được gọi là ngoại lệ thời gian biên dịch *(Compile-time Exceptions)*. Và lập trình viên không thể lường trước.

*Ví dụ:* Bạn muốn mở một file để đọc nhưng tệp được chỉ định lại không tồn tại. Thì FileNotFoundExeption sẻ xảy ra và trình biên dịch sẽ thông báo tới lập trình viên nhằm xử lý ngoại lệ đó.

**Unchecked Exceptions:** Là một ngoại lệ không được kiểm tra trong quá trình biên dịch. Chúng cũng được gọi là ngoại lệ thời gian chạy *(Runtime Exceptions).* Là ngoại lệ có thể tránh được bởi lập trình viên. Unchecked Exceptions kế thừa từ Runtime Exception.

*Ví dụ:* ArithmaticException, ArrayIndexOutOfBoundsException, NullPointerException,…chúng được kiểm tra tại Runtime.

### 3. Sự khác nhau giữa hai từ khóa "`throw`" và "`throws`" trong Java?

Mặc dù trông giống nhau và đều được sử dụng trong xử lý ngoại lệ nhưng `throw` và `throws` khác nhau về cách thức sử dụng và nơi chúng được sử dụng trong code. 

Về **throw,** nó được sử dụng để ném ra một ngoại lệ cụ thể. Chúng ta có thể ném một trong hai ngoại lệ checked hoặc unchecked trong java bằng từ khóa này. Từ khóa throw chủ yếu được sử dụng để ném ngoại lệ do người dùng tự định nghĩa.

*Ví dụ:*

```java
public class TestException {
    public static void main(String[] args) {
        ageValid(19);
        System.out.println("------");
        ageValid(17);
    }
    public static void ageValid(int age){
        if(age<18){
            throw new ArithmeticException("Age not valid!");
        }else{
            System.out.println("Welcome!");
        }
    }    
}
```

***Kết quả:\***

```markup
Welcome!
------
Exception in thread "main" java.lang.ArithmeticException: Age not valid!
	at testexception.TestException.ageValid(TestException.java:11)
	at testexception.TestException.main(TestException.java:7)
C:\Users\nmdit\AppData\Local\NetBeans\Cache\8.2rc\executor-snippets\run.xml:53: Java returned: 1
BUILD FAILED (total time: 0 seconds)
```

Chúng ta có thể lấy một ngoại lệ unchecked được ném bằng từ khóa throws.

Về **throws**, nó được sử dụng để khai báo một ngoại lệ. Nó thông báo cho lập trình viên rằng một ngoại lệ có thể xảy ra. Ngoại lệ checked được truyền ra ngay cả khi chỉ sử dụng từ khóa throws. Throws được khai báo ngay sau dấu đóng ngoặc đơn của phương thức.

*Ví dụ:*

```java
public class TestException { 
    void aMethod() throws IOException {
        throw new IOException("Device error");
    }
    //
    public static void main(String args[]) {
        try {
            TestException obj = new TestException();
            obj.aMethod();
        } catch (Exception e) {
            System.out.println("Exception handled!");
        }
 
        System.out.println("Hello Codelearn!");
    } 
}
```

*Kết quả:*

```markup
Exception handled!
Hello Codelearn!
BUILD SUCCESSFUL (total time: 0 seconds)
```

### 4. Ngoại lệ kết chuỗi (Chained Exception) trong Java là gì?

Ngoại lệ kết chuỗi là một khái niệm xử lý ngoại lệ phổ biến trong Java. Trong đó một ngoại lệ được đưa ra cho một ngoại lệ khác và tạo ra một chuỗi các ngoại lệ. Kỹ thuật này chủ yếu được sử dụng để gói một ngoại lệ được kiểm tra thành một ngoại lệ không được kiểm tra.

```java
try {
   //...
} catch (IOException e) {
   throw new SampleException("New Exception",e);
}
```

Đoạn code trên mô tả kỹ thuật ngoại lệ kết chuỗi, khi một ngoại lệ IOException bị bắt đã được ném cho một ngoại lệ mới SampleException xử lý.

Nếu bạn ném ngoại lệ cho một ngoại lệ khác nó luôn bao gồm ngoại lệ ban đầu, vì vậy để code xử lý có thể truy cập nguyên nhân gốc thì hãy sử dụng các phương thức như **getCause ()** và **initCause ()** của lớp Throwable.

### 5. Sự khác nhau giữa final, finalize, and finally trong Java?

Về **final**, nó là một từ khóa được sử dụng để áp dụng các hạn chế về lớp, phương thức và biến. Lớp final không thể được kế thừa, phương thức final không thể bị ghi đè và giá trị biến final không thể thay đổi.

*Ví dụ:*

```java
public class TestException { 
    public static void main(String args[]) {
        final double PI = 3.1416;
        PI = 3.14;
    } 
}
```

*Kết quả:*

```markup
Exception in thread "main" java.lang.RuntimeException: Uncompilable source code - cannot assign a value to final variable PI
	at testexception.TestException.main(TestException.java:7)
C:\Users\nmdit\AppData\Local\NetBeans\Cache\8.2rc\executor-snippets\run.xml:53: Java returned: 1
BUILD FAILED (total time: 0 seconds)
```

Về **finalize**, nó là một phương thức được sử dụng để thực hiện dọn dẹp xử lý ngay trước khi đối tượng là rác được thu thập.

*Ví dụ:*

```java
public class FinalizeTest {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalze() is called!");
    }   
    public static void main(String args[]) {
        FinalizeTest f1 = new FinalizeTest();
        f1=null;
        System.gc();
    } 
}
```

Về **finally**, nó là một khối được sử dụng cùng try, catch để đặt mã quan trọng, nó sẽ được thực thi cho dù ngoại lệ có được xử lý hay không.

Ví dụ:

```java
public class Finally {
    public static void main(String[] args) {
        try {
            int a = 5/0;
        } catch (ArithmeticException e) {
            System.out.println("Doesn't div by zero!");
        }finally{
            System.out.println("Finally block!");
        }
    }
}
```

*Kết quả:*

```markup
Doesn't div by zero!
Finally block!
BUILD SUCCESSFUL (total time: 0 seconds)
```