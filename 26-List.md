# List

[TOC]

### 1. Tập hợp List là gì 

**Tập hợp List** **được sử dụng để lưu trữ các phần tử theo một thứ tự nhất định**

Các phần tử được chứa trong tập hợp list có thể được thêm mới vào, xoá ra hoặc chúng ta có thể lấy nó ra khỏi tập hợp.

Các phần tử trong List đều có một vị trí nhất định trong tập hợp. Ví trí của List luôn bắt đầu là 0, vị trí thứ 2 sẽ là 1. Biết được vị trí của phần tử trong tập hợp thì ta có thể lấy phần tử đó ra thông qua vị trí của nó.

Chúng ta có thể thêm vào các kiểu dữ liệu khác nhau trong List.

### 2. Các tập hợp cài đặt List 

Chúng ta có thể sử dụng các tập hợp sau để cài đặt Interface List :

- ArrayList
- LinkedList
- Vector
- Stack

Trong những tập hợp trên thì ArrayList được sử dụng nhiều nhất.

- Để tạo một tập hợp chúng ta có thể khai báo như sau :

  ```java
  List listA = new ArrayList();
  List listB = new LinkedList();
  List listC = new Vector();
  List listD = new Stack();
  ```

### 3. ArrayList là gì

**ArrayList** **là một trong những tập hợp trong bộ Java Collection.**

 **ArrayList có thể linh động co giản kích thướt tuỳ ý**  không như Array[] kích thước khai báo cố định

- Để sử tạo được ArrayList chúng ta sẽ import gói thư viện java util vào

  ```java
  mport java.util.ArrayList; // import the ArrayList class
  
  ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
  ```

- Để thêm 1 phần tử chúng ta dùng phương thức add

  ```java
  public class MyClass {
    public static void main(String[] args) {
      ArrayList<String> cars = new ArrayList<String>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("Mazda");
      System.out.println(cars);
    }
  }
  ```

  

- Để thêm một phần tử vào vị trí mà ta mong muốn

  ```java
  list.add(0, "element 4");
  ```

- Để thêm các phần tử từ một list có sẳn vào list khác ta sử dụng phương thức addAll()

  ```java
  List<String> listSource = new ArrayList<>();
  
  listSource.add("123");
  listSource.add("456");
  
  List<String> listDest   = new ArrayList<>();
  
  listDest.addAll(listSource);
  ```

  

- Để lấy một phần tử chúng ta dùng phương thức get và truyền vào vị trí ta muốn lấy

  ```java
  cars.get(0); 
  ```

- Để thay đổi giá trị trong phần tử chúng ta dùng phương thức set

  ```java
  cars.set(0, "Opel");
  ```

- Để tìm kiếm phần tử trong list ta sử dụng một trong 2 phương thức indexOf hoặc lastIndexOf

  ```java
  List<String> list = new ArrayList<>(); String element1 = "element 1"; String element2 = "element 2"; list.add(element1); list.add(element2); int index1 = list.indexOf(element1); int index2 = list.indexOf(element2); System.out.println("index1 = " + index1); System.out.println("index2 = " + index2); 
  //Kết quả index 1 là 0 và index 2 là 1
  ```

- Tìm kiếm phần tử cuối cùng của tập hợp ta sử dụng phương thức lastIndexOf như sau

  ```java
  List<String> list = new ArrayList<>();
  
  String element1 = "element 1";
  String element2 = "element 2";
  
  list.add(element1);
  list.add(element2);
  list.add(element1);
  
  int lastIndex = list.lastIndexOf(element1);
  System.out.println("lastIndex = " + lastIndex);
  //Kết quả lastIndex sẽ là 2.
  ```

- Để xoá một phần tử chúng ta dùng phương thức remove và truyền vào vị trí cần xoá

  ```java
  cars.remove(0);
  ```

- Để xoá tất cả các phần tử trong tập hợp ta dùng phương thức clear()

  ```java
  cars.clear();
  ```

- Để lấy tổng số phần tử trong tập hợp ta dùng phương thức size

  ```java
  cars.size();
  ```

- Kiểm tra xem phần tử có trong List hay không chúng ta sử dụng phương thức contains như sau

  ```java
  List<String> list = new ArrayList<>();
  
  String element1 = "element 1";
  
  list.add(element1);
  
  boolean containsElement =
      list.contains("element 1");
  
  System.out.println(containsElement); 
  // true
  ```

- Để duyệt các phần tử trong mảng chúng ta dùng vòng lặp

  ```java
  public class MyClass {
    public static void main(String[] args) {
      ArrayList<String> cars = new ArrayList<String>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("Mazda");
      for (int i = 0; i < cars.size(); i++) {
        System.out.println(cars.get(i));
      }
    }
  }
  ```

- Ngoài ra chúng ta còn có thể sử dụng for each

  ```java
  public class MyClass {
    public static void main(String[] args) {
      ArrayList<String> cars = new ArrayList<String>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("Mazda");
      for (String i : cars) {
        System.out.println(i);
      }
    }
  }
  ```

- Tạo một sub list từ một list có sẳn. Chúng ta sử dụng phương thức subList để tạo ra một List mới với số lượng phần tử ít hơn và được chọn lọc từ một list có sẳn

  ```java
  List<String> list      = new ArrayList<>(); list.add("element 1"); list.add("element 2"); list.add("element 3"); list.add("element 4"); List<String> sublist = list.subList(1, 3); 
  ```

- Chuyển tập hợp ArrayList thành tập hợp Array bằng phương thức toArray

  ```java
  List<String> list      = new ArrayList<>(); list.add("element 1"); list.add("element 2"); list.add("element 3"); list.add("element 3"); Object[] objects = list.toArray(); 
  ```

- Chuyển Array thì một ArrayList bằng phương thức asList

  ```java
  String[] values = new String[]{ "one", "two", "three" };
  
  List<String> list = (List<String>) Arrays.asList(values);
  ```

- Chuyển một ArrayList sang Set bằng phương thức addAll

  ```java
  List<String> list      = new ArrayList<>();
  
  list.add("element 1");
  list.add("element 2");
  list.add("element 3");
  list.add("element 3");
  
  Set<String> set = new HashSet<>();
  set.addAll(list);
  ```

  

  

  