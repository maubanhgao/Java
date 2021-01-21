# Lớp Properties trong java

[TOC]

Lớp Properties trong java được sử dụng để tạo ra đối tượng chứa cặp khóa (key) và giá trị (value) như một chuỗi. Lớp java.util.Properties là một lớp con của Hashtable.

Nó có thể được sử dụng để lấy giá trị thuộc tính dựa trên khóa thuộc tính. Lớp Properties cung cấp các phương thức lấy dữ liệu từ các file .properties và lưu trữ dữ liệu vào file .properties. Hơn nữa, nó có thể được sử dụng để có được properties của hệ thống.

## Lợi thế của file properties

**Không cần biên dịch lại, nếu thông tin được thay đổi từ file .properties**: Nếu có bất kỳ thông tin nào được thay đổi từ file .properties, bạn không cần phải biên dịch lại lớp java. Nó được sử dụng để lưu trữ thông tin mà sẽ được thay đổi thường xuyên.

## Các phương thức của lớp Properties trong java

Các phương thức thường được sử dụng của lớp Properties được đưa ra như dưới đây.

| Method                                                       | Description                                                  |
| :----------------------------------------------------------- | :----------------------------------------------------------- |
| public void load(Reader r)                                   | tải dữ liệu từ đối tượng Reader.                             |
| public void load(InputStream is)                             | tải dữ liệu từ đối tượng InputStream.                        |
| public String getProperty(String key)                        | trả về giá trị dựa trên key.                                 |
| public void setProperty(String key,String value)             | đặt thuộc tính trong đối tượng thuộc tính.                   |
| public void store(Writer w, String comment)                  | ghi các thuộc tính trong đối tượng Writer.                   |
| public void store(OutputStream os, String comment)           | ghi các thuộc tính trong đối tượng OutputStream.             |
| storeToXML(OutputStream os, String comment)                  | ghi các thuộc tính trong đối tượng Writer để tạo tài liệu xml. |
| public void storeToXML(Writer w, String comment, String encoding) | ghi các thuộc tính trong đối tượng Writer để tạo ra tài liệu xml với mã hoá được chỉ định. |

## Ví dụ về lớp Properties trong java

Ví dụ đọc thông tin của file db.properties, đầu tiên tạo một file vào thư mục gốc của project như sau:

File: db.properties

```properties
null user=admin password=1234567890
```

Tạo lớp PropertiesExample1.java

```java
package vn.viettuts.collection;
 
import java.io.FileReader;
import java.util.Properties;
 
public class PropertiesExample1 {
    public static void main(String[] args) throws Exception {
        // create reader object
        FileReader reader = new FileReader("db.properties");
        // crate properties object
        Properties properties = new Properties();
        properties.load(reader);
        // show file info
        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));
    }
}
/*
admin
1234567890
*/
```

## Ví dụ về lớp Properties lấy ra các thuộc tính của hệ thông

Phương thức System.getProperties() được sử dụng để lấy ra các giá trị thuộc tính của hệ thống máy tính hiện tại.

```java
package vn.viettuts.collection;
 
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
 
public class PropertiesExample2 {
    public static void main(String[] args) throws Exception {
        // get system properties
        Properties properties = System.getProperties();
        Set set = properties.entrySet();
        // show system properties
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
 
    }
}
```

Kết quả:

```java
java.runtime.name = Java(TM) SE Runtime Environment
sun.boot.library.path = C:\Program Files\Java\jdk1.8.0_91\jre\bin
java.vm.version = 25.91-b15
user.country.format = JP
java.vm.vendor = Oracle Corporation
java.vendor.url = http://java.oracle.com/
path.separator = ;
java.vm.name = Java HotSpot(TM) 64-Bit Server VM
file.encoding.pkg = sun.io
user.country = US
user.script = 
sun.java.launcher = SUN_STANDARD
sun.os.patch.level = 
java.vm.specification.name = Java Virtual Machine Specification
user.dir = D:\wsjavaweb\java-collections
java.runtime.version = 1.8.0_91-b15
...
```

## Ví dụ về lớp Properties tạo file .properties

```java
package vn.viettuts.collection;
 
import java.io.FileWriter;
import java.util.Properties;
 
public class PropertiesExample3 {
    public static void main(String[] args) throws Exception {
        // create properties object
        Properties properties = new Properties();
        // add property into properties object
        properties.setProperty("user", "admin");
        properties.setProperty("password", "admin123");
        // write properties to a file
        properties.store(new FileWriter("info.properties"), "Comment here");
    }
}
```

Kết quả:

```java
#Comment here
#Fri Sep 08 13:48:56 ICT 2017
user=admin
password=admin123
```

