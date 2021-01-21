# TreeMap

[TOC]

## 1. TreeMap trong lập trình Java là gì 

**Trong** **lập trình Java**, cũng giống như HashMap thì TreeMap dùng để lưu trữ các giá trị theo kiểu key và value. Tuy nhiên có một số đặt điểm mà TreeMap khác với HashMap là

- HashMap có thể chứa key là null nhưng **TreeMap** chúng ta **không thể chứa key là null được**
- Các phần tử trong HashMap thì không sắp xếp theo một trật tự còn các phần tử trong TreeMap là được sắp xếp tăng dần

## 2. Tạo TreeMap 

```java
// Chúng ta sử dụng phương thức put để thêm phần tử vào tập hợp

class TreeMap1{  
 public static void main(String args[]){  
   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(100,"Amit");    
      map.put(102,"Ravi");    
      map.put(101,"Vijay");    
      map.put(103,"Rahul");    
        
      for(Map.Entry m:map.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());    
      }    
 }  
}  
```

## 3. Xoá phần tử trong TreeMap 

- Chúng ta sẽ dụng phương thức remove để xoá phần tử ra khỏi tập hợp

```java
public class TreeMap2 {  
   public static void main(String args[]) {  
    TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(100,"Amit");    
      map.put(102,"Ravi");    
      map.put(101,"Vijay");    
      map.put(103,"Rahul");    
      System.out.println("Before invoking remove() method");  
      for(Map.Entry m:map.entrySet())  
      {  
          System.out.println(m.getKey()+" "+m.getValue());      
      }  
      map.remove(102);      
      System.out.println("After invoking remove() method");  
      for(Map.Entry m:map.entrySet())  
      {  
          System.out.println(m.getKey()+" "+m.getValue());      
      }  
      }  
}  
```

## 4. SortedMap

- Chúng ta sẽ dụng phương thức remove để xoá phần tử ra khỏi tập hợp

```java
class TreeMap4{  
 public static void main(String args[]){  
   SortedMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(100,"Amit");    
      map.put(102,"Ravi");    
      map.put(101,"Vijay");    
      map.put(103,"Rahul");    
      //Returns key-value pairs whose keys are less than the specified key.  
      System.out.println("headMap: "+map.headMap(102));  
      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
      System.out.println("tailMap: "+map.tailMap(102));  
      //Returns key-value pairs exists in between the specified key.  
      System.out.println("subMap: "+map.subMap(100, 102));    
 }  
}  
```

- Phương thức headMap sẽ trả về cho chúng ta những key nhỏ hơn 102 (tham số truyền vào)
- Phương thức tailMap sẽ trả về cho chúng ta những key có giá trị lớn hoặc bằng 102
- Phương thức subMap sẽ trả về cho chúng ta những key nằm giữa 100 và 102.