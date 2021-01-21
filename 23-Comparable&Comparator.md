# **So sánh Comparable và Comparator**

[TOC]

## I. **Comparable** trong java

Giao diện **Comparable trong java** được sử dụng để sắp xếp các đối tượng của lớp do người dùng định nghĩa (user-defined). Giao diện này thuộc về gói java.lang và chỉ chứa một phương thức có tên compareTo(Object).

Chúng ta có thể sắp xếp các phần tử của:

1. Các đối tượng String.
2. Các đối tượng của lớp Wrapper.
3. Các đối tượng của lớp do người dùng định nghĩa (User-defined).

### 1. Phương thức **compareTo**(Object obj)

**public int compareTo (Object obj)**: được sử dụng để so sánh đối tượng hiện tại với đối tượng được chỉ định.

### 2. Lớp Collections trong java

**Lớp Collections trong java** cung cấp các phương thức static để sắp xếp các phần tử của collection. Nếu các phần tử collection thuộc kiểu Set hoặc Map, chúng ta có thể sử dụng TreeSet hoặc TreeMap. Nhưng chúng ta không thể sắp xếp các phần tử của List. Collections cung cấp phương thức **sort()** để phân sắp xếp các phần tử của List.

![](D:\data\source\Học lập trình web\Java\img\sorting-trong-collections.png)

### 3. Ví dụ về Comparable trong java

Lớp Student implements giao diện **java.lang.Comparable** để cài đặt **phương thức compareTo()**. Bạn cần phải cài đặt tiêu chí để so sánh trong phương thức compareTo() để so sánh các đối tượng Student với nhau, dưới đây là ví dụ sắp xếp các đối tượng Student tăng dần theo name:

Tạo lớp Student.java

```java
package vn.viettuts.collection;
 
/**
 * Student class
 * 
 * @author viettuts.vn
 */
class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int age;
    private String address;
 
    public Student() {
    }
 
    public Student(int id, String name, int age, String address) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
 
    // getter & setter
     
    @Override
    public String toString() {
        return "Student@id=" + id + ",name=" + name 
                + ",age=" + age + ",address=" + address;
    }
 
    @Override
    public int compareTo(Student student) {
        // sort student's name by ASC
        return this.getName().compareTo(student.getName());
    }
}
```

Tạo lớp ComparableExample.java

```java
package vn.viettuts.collection;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
/**
 * ComparableExample class
 * 
 * @author viettuts.vn
 */
public class ComparableExample {
    public static void main(String[] args) {
        // create list students
        List<Student> listStudents = new ArrayList<Student>();
        // add students to list
        listStudents.add(new Student(1, "Vinh", 19, "Hanoi"));
        listStudents.add(new Student(2, "Hoa", 19, "Hanoi"));
        listStudents.add(new Student(3, "Phu", 20, "Hanoi"));
        listStudents.add(new Student(4, "Quy", 22, "Hanoi"));
        // sort list student
        Collections.sort(listStudents);
        // show list students
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }
    }
}
/*
Student@id=2,name=Hoa,age=19,address=Hanoi
Student@id=3,name=Phu,age=20,address=Hanoi
Student@id=4,name=Quy,age=22,address=Hanoi
Student@id=1,name=Vinh,age=19,address=Hanoi
*/
```



## II. **Comparator** trong java

Giao diện **Comparator trong java** được sử dụng để sắp xếp các đối tượng của lớp do người dùng định nghĩa (user-defined). Giao diện này thuộc về gói java.util và chứa hai phương thức có tên compare(Object obj1,Object obj2) và equals(Object element).

Chúng ta có thể sắp xếp các phần tử của:

1. Các đối tượng String.
2. Các đối tượng của lớp Wrapper.
3. Các đối tượng của lớp do người dùng định nghĩa (User-defined).

### 1. Phương thức compare()

**public int compare(Object obj1,Object obj2)**: so sánh đối tượng đầu tiên với đối tượng thứ hai.

### 2. Lớp Collections trong java

**Lớp Collections trong java** cung cấp các phương thức static để sắp xếp các phần tử của collection. Nếu các phần tử collection thuộc kiểu Set hoặc Map, chúng ta có thể sử dụng TreeSet hoặc TreeMap. Nhưng chúng ta không thể sắp xếp các phần tử của List.

### 3. Phương thức của lớp Collections để sắp xếp các phần tử của List

**public void sort(List list, Comparator c)**: được sử dụng để sắp xếp các phần tử của List theo cài đặt đối tượng Comparator.

![](D:\data\source\Học lập trình web\Java\img\sorting-trong-collections.png)

### 4. Ví dụ về Comparator trong java

Tạo đối tượng nặc danh **java.util.Comparator** để cài đặt **phương thức compare()**. Bạn cần phải cài đặt tiêu chí để so sánh trong phương thức compare() để so sánh các đối tượng Student với nhau, dưới đây là ví dụ sắp xếp các đối tượng Student tăng dần theo name:

Tạo lớp Student.java

```java
package vn.viettuts.collection;
 
/**
 * Student class
 * 
 * @author viettuts.vn
 */
class Student {
    private int id;
    private String name;
    private int age;
    private String address;
 
    public Student() {
    }
 
    public Student(int id, String name, int age, String address) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
 
    // getter & setter
     
    @Override
    public String toString() {
        return "Student@id=" + id + ",name=" + name 
                + ",age=" + age + ",address=" + address;
    }
}
```

Tạo lớp ComparatorExample.java

Trong ví dụ này chúng ta tạo ra 2 đối tượng nặc danh của lớp Comparator như 2 tiêu chí sắp xếp các đối tượng của lớp Student theo **name** và **age**.

```JAVA
package vn.viettuts.collection;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
 
/**
 * ComparatorExample class
 * 
 * @author viettuts.vn
 */
public class ComparatorExample {
    public static void main(String[] args) {
        // create list students
        List<Student> listStudents = new ArrayList<Student>();
        // add students to list
        listStudents.add(new Student(1, "Vinh", 19, "Hanoi"));
        listStudents.add(new Student(2, "Hoa", 24, "Hanoi"));
        listStudents.add(new Student(3, "Phu", 20, "Hanoi"));
        listStudents.add(new Student(4, "Quy", 22, "Hanoi"));
         
        // sort list student by it's name ASC
        System.out.println("sort list student by it's name ASC: ");
        Collections.sort(listStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        // show list students
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }
         
        // sort list student by it's age ASC
        System.out.println("sort list student by it's age ASC: ");
        Collections.sort(listStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() > o2.getAge() ? 1 : -1;
            }
        });
        // show list students
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }
    }
}
/*
sort list student by it's name ASC: 
Student@id=2,name=Hoa,age=24,address=Hanoi
Student@id=3,name=Phu,age=20,address=Hanoi
Student@id=4,name=Quy,age=22,address=Hanoi
Student@id=1,name=Vinh,age=19,address=Hanoi
sort list student by it's age ASC: 
Student@id=1,name=Vinh,age=19,address=Hanoi
Student@id=3,name=Phu,age=20,address=Hanoi
Student@id=4,name=Quy,age=22,address=Hanoi
Student@id=2,name=Hoa,age=24,address=Hanoii
*/
```



## III. Sự khác nhau giữa Comparable và Comparator

Comparable và Comparator cả hai đều là các giao diện và có thể được sử dụng để sắp xếp các phần tử của collection.

Có nhiều sự khác nhau giữa Comparable và Comparator được đưa ra dưới đây.

| Comparable                                                   | Comparator                                                   |
| :----------------------------------------------------------- | :----------------------------------------------------------- |
| 1) Bạn phải implements giao tiếp Comparable cho lớp đối tượng cần được so sánh. | Bạn **KHÔNG** phải implements giao tiếp Comparator cho lớp đối tượng cần được so sánh. |
| 2) Comparable cung cấp **phương thức compareTo()** để sắp xếp các phần tử. | Comparator cung cấp **phương thức compare()** để sắp xếp các phần tử. |
| 3) Comparable thuộc về **java.lang** package.                | Comparator thuộc về **java.util** package.                   |
| 4) Chúng ta có thể sắp xếp các phần tử của kiểu Comparable bởi **phương thức Collections.sort(List)** . | Chúng ta có thể sắp xếp các phần tử của kiểu Comparator bởi **phương thức Collections.sort(List,Comparator)**. |