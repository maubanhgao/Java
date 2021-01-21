# Ngoại lệ

[TOC]

## 1. Ngoại lệ (Exception) là gì ? 

**Exception** (ngoại lệ) trong **lập trình Java** là một vấn đề bất thường xảy ra trong quá trình thực hiện của chương trình mà mình có thể dự đoán hoặc không dự đoán trước.

**Exception** là một sự kiện mà phá vỡ luồng chuẩn của chương trình. Anh lấy ví dụ về rút tiền ATM ở máy rút tiền. Trong tài khoản mình chỉ có 1.000.000 nhưng nếu mình bấm trong máy ATM rút 2.000.000 thì lúc đó chương trình trong máy ATM sẽ báo lỗi vì số tiền mình yêu cầu rút lớn hơn số hiện tại. Đó chính là một Exception (ngoại lệ) xảy ra lúc chương trình đang chạy.

Đối với **lập trình viên Java** mình phải bắt và xử lý các **ngoại lệ** trong chương trình. Nếu không chương trình sẽ bị dừng. Thường các lập trình viên có thể bắt lại **Expection** trong lúc viết code hoặc dự đoán được Exception trong lúc chương trình đang chạy để từ đó lập trình viên có thể xử lý các ngoại lệ đó mà chương trình vẫn tiếp tục chạy.

## 2. Check Exception 

- Những lỗi developer có thể đoán trước được.
- Bắt buộc developer phải bắt và xử lý **ngoại lệ** trong lúc compile time (lúc đang code).

Ví dụ các lỗi mà trong lúc code **lập trình viên Java \**có thể đoán được.\****

- FileNotFoundException.
- InterruptException.
- Database Exception.
- IO Exception.

## 3. Uncheck Exception 

- Những lỗi xảy ra khi chương trình đang chạy và chúng ta không biết chắc nó có xảy ra hay không.
- Không yêu cầu developer phải bắt và xử lý ngoại lệ trong lúc compile time (lúc đang code). Nhưng mà phải dự đoán được có khả năng xảy ra lỗi ở những đoạn code nào từ đó bắt lỗi cho đoạn code đó.

**Ví dụ :** Khi viết một chương trình cho nhà bank với chức năng rút tiền. Sẽ có những trường hợp lỗi xảy ra khi chương trình đang chạy đó là việc khách hàng có thể rút tiền nhiều hơn số tiền họ hiện có trong tài khoản. Lúc này mình phải dự đoán cái hàm viết phương thức rút tiền có khả năng xảy ra lỗi và mình sẽ viết code để xử lý ngoại lệ đó .

## 4. Kiến trúc của ngoại lệ 

![](D:\data\source\Học lập trình web\Java\img\exception.png)

- Throwable : là cha của tất cả **ngoại lệ** xảy ra trong chương trình bao gồm lỗi (**Error**) và ngoại lệ (**Exception**).

- Error : là tất cả những lỗi được bắt từ JMV (Máy ảo Java). Ví dụ như Error OutOfMemory hoặc chia một số cho 0.Các em có thể tìm hiểu thêm về bộ nhớ của chương trình tại đây.

- Excepton : là cha của tất cả class Check Exception. Mình khai báo một Class và kế thừa Class Exception.

  ```java
  public class MyDepositException extends Exception {
  
  	public MyBusinessException(String message, Throwable cause, ErrorCode code) {
  		super(message, cause);
  		this.code = code;
  	}
  ```

  **sử dụng** **ngoại lệ** **MyDepositException như sau.**

  ```java
  private void wrapException(String input) throws MyDepositException {
  	try {
  		// do something
  	} catch (NumberFormatException e) {
  		throw new MyDepositException("Rut tien vuot dinh muc", e, 5004);
  	}
  }
  ```

- **Exception Runtime** : là cha của tất cả các class Uncheck. Anh khai báo một Class và kế thừa RuntimeExcepton. Những lỗi này thường xảy ra khi chương trình đang chạy.

  ```java
  public class MyDepositRuntimeException extends RuntimeException {
  
  
  	private final ErrorCode code;
  
  	public MyDepositRuntimeException(ErrorCode code) {
  		super();
  		this.code = code;
  	}
  
  	public MyDepositRuntimeException(String message, Throwable cause, ErrorCode code) {
  		super(message, cause);
  		this.code = code;
  	}
  
  	public MyDepositRuntimeException(String message, ErrorCode code) {
  		super(message);
  		this.code = code;
  	}
  
  	public MyDepositRuntimeException(Throwable cause, ErrorCode code) {
  		super(cause);
  		this.code = code;
  	}
  
  	public ErrorCode getCode() {
  		return this.code;
  	}
  }
  ```

- Mình sử dụng MyDepositRuntimeException như sau.

  ```java
  private void wrapException(String input) {
  	try {
  		// do something
  	} catch (NumberFormatException e) {
  		throw new MyDepositRuntimeException("Loi rut tien", e, 5005);
  	}
  }
  ```

## 5. Ném ngoại lệ bằng Throws hoặc throw 

- Trong các **ngôn ngữ lập trình Java** khi một **ngoại lệ** xảy ra ,mình dùng từ khoá **throw** hoặc **throws** để ném ngoại lệ đó ra.

- Trong **lập trình Java** mình có thể dùng từ khoá throws bên cạnh tên method để ném ngoại lệ. Ví dụ như public void deposit(int depositAmount) throws Exception . Phương thức nào mà gọi method deposit phải bắt lại ngoại lệ và xử lý . Để bắt ngoại lệ thì mình dùng khối **try**, **catch**, **finally** lệnh để bắt ngoại lệ bắt từ hàm deposit ném ra

- Ngoài cách dùng **Throws** ta có thể dùng **throw new Exception** bên trong method như ví dụ dưới đây .

  ```java
  /**
   * @exception FileNotFoundException ...
   */
  public Scanner(String fileName) throws FileNotFoundException {
     // ...
  }
  
  public void deposit(int depositAmount) throws Exception {
     if (depositAmount > getAmount()) {
         throw new Exception("Current Amount is less than Deposit");
     }
     System.out.println("Deposit is valid " + depositAmount);
  }
  ```

## 6. Bắt ngoại lệ bằng try catch 

**Chúng ta sử dụng từ khoá** **try****,** **catch** để bắt ngoại lệ và xử lý. Nếu chúng ta không bắt ngoại lệ lại và sử lý thì chương trình có nguy cơ bị đứng. Hoặc nghiêm trọng hơn là ứng dụng bị chết và không chạy được. Nhờ sử dụng try catch mà ta có thể sử lý ngoại lệ giúp chương trình tiếp tục chạy.

```
public int getPlayerScore(String playerFile) {
    try {
        Scanner contents = new Scanner(new File(playerFile));
        return Integer.parseInt(contents.nextLine());
    } catch (FileNotFoundException noFile) {
        throw new IllegalArgumentException("File not found");
    }
}
```

## 7. Bắt ngoại lệ bằng nhiều catch 

Khi gọi một method, nhưng nếu method đó ném ra nhiều hơn 1 ngoại lệ. Ta có thể sử dụng nhiều catch để bắt các ngoại lệ đó. Mỗi catch sẽ bắt một ngoại lệ tương ứng.

```java
public int getPlayerScore(String playerFile) {
    try (Scanner contents = new Scanner(new File(playerFile))) {
        return Integer.parseInt(contents.nextLine());
    } catch (IOException e) {
        logger.warn("Player file wouldn't load!", e);
        return 0;
    } catch (NumberFormatException e) {
        logger.warn("Player file was corrupted!", e);
        return 0;
    }
}
```

## 8. Khối lệnh Finally

Các đoạn code trong khối lệnh **Finally** luôn luôn chạy cho dù có xảy ra lỗi ở trong khối lệnh try hay catch . Khối lệnh Finally thường dùng để.

- Đóng kết nối xuống file .
- Đóng kết nối xuống database.
- Giải phóng bộ nhớ. Để hiểu thêm về bộ nhớ bạn có thể đọc bài viết tại đây

