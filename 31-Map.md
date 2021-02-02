### **Map**

[TOC]

#### 1. Map trong lập trình Java là gì 

**Map lưu trữ các phần tử theo định dạnh key và value.**

**ví dụ** sinh viên thường có mã sinh viên và thông tin sinh viên. Như vậy key ở đây chính là mã sinh viên còn thông tin sinh viên chính là giá trị. Dựa vào key mà chúng ta có thể lấy ra sinh viên tương ứng. Key là giá trị duy nhất không trung lặp

#### 2. Các class thực thi của Map 

Chúng ta có những tập hợp sau cài đặt interface Map đó là

- HashMap
- Hashtable
- EnumMap
- IdendityHashMap
- LinkedHashMap
- Properties
- TreeMap
- WeakHashMap

Trong các tập hợp trên thì HashMap và TreeMap thường hay được sử dụng nhất. HashMap lưu trữ theo giá trị key và value nhưng các phần tử trong nó không được sắp xếp, ngược lại thì các phần tử trong TreeMap đều được sắp xếp.

#### 3. Tạo một Map 

```java
Map mapA = new HashMap();
Map mapB = new TreeMap();
```

- Tạo một Hashmap

```java
import java.util.HashMap; // import the HashMap class

HashMap<String, String> capitalCities = new HashMap<String, String>();
```

#### 4. Thêm một phần tử vào HashMap 

Chúng ta sử dụng phương thức put để thêm phần tử vào Map

```java
public class MyClass {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
  }
}
```

#### 5. Lấy một phần tử trong HashMap 

Để lấy một phần tử trong Map ta sử dụng phương thức get với tham số là key

```java
Map map = new HashMap();

map.put("key1", "value 1");

String element1 = (String) map.get("key1");
```

#### 6. Thêm các phần tử từ một HashMap khác 

Chúng ta sử dụng phương thức putAll để thêm các phần tử từ một tập hợp Map khác

```java
Map<String, String> mapA = new HashMap<>();
mapA.put("key1", "value1");
mapA.put("key2", "value2");

Map<String, String> mapB = new HashMap<>();
mapB.putAll(mapA);
```

#### 7. Xoá một phần tử trong Map 

Chúng ta sử dụng phương thức remove để xoá một phần tử trong Map. Tham số truyền vào là key

```java
capitalCities.remove("England");
```

- Xoá hết các phần tử ta dùng phương thức clear

```java
capitalCities.clear();
```

#### 8. Lấy kích thướt của Map 

Chúng ta sử dụng phương thức size để lấy kích thước của Map

```java
capitalCities.size();
```

#### 9. Duyệt qua các phần tử trong Map 

```java
for (String i : capitalCities.keySet()) {
  System.out.println(i);
}
```

#### 10. Kiểm tra Map có chứa key đã tồn tại chưa 

Chúng ta sử dụng phương thức containsKey để kiểm tra key đã tồn tại trong Map chưa?

```java
boolean hasKey = map.containsKey("123");
```

#### 11. Kiểm tra Map có chứa giá trị đã tồn tại chưa

Chúng ta có thể kiểm tra giá trị đã tồn tại trong mảng chưa bằng phương thức containsValue

```java
boolean hasValue = map.containsValue("value 1");
```