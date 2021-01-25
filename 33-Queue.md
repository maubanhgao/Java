# Queue

[TOC]

## 1. Queue trong lập trình Java là gì 

**tập hợp Queue được sử dụng để lưu trữ các phần tử theo một thứ tự, nó cũng tương tự như List nhưng cơ chế hoạt động của Queue là First In First Out.** 

## 2. Các class thực thi cài đặt Queue 

Chúng ta có thể sử dụng các tập hợp của Queue như sau

- Linkedlist
- PriorityQueue

```java
Queue queueA = new LinkedList();

Queue queueB = new PriorityQueue();
```

## 3. Thêm một phần tử vào Queue 

**Chúng ta có 2 cách để thêm giá trị vào Queue.**

Các phần tử sẽ được add vào cuối của Queue, chúng ta có thể sử dụng phương thức add hoặc offer để add các phần tử vào cuối. Sự khác nhau giữa add và offer là khi Queue đã đầy nếu ta sử dụng phương thức add thì sẽ nhận được ngoại lệ (Exception) còn offer thì chúng ta nhận được giá trị false

```java
Queue<String> queue = new LinkedList<>();
queue.add("element 1");

queue.offer("element 2");
```

## 4. Xóa một phần tử từ Queue 

Chúng ta có thể sử dụng phương thức poll và remove để lấy phần tử đầu tiên của Queue để xóa. Sự khác nhau giữa poll và remove là nếu Queue là rỗng thì phương thức remove sẽ ném lỗi còn poll sẽ trả về giá trị null.

```java
Queue<String> queue = new LinkedList<>();

queue.add("element 1");
queue.add("element 2");

String element1 = queue.poll();

String element2 = queue.remove();
```

## 5. Lấy một phần tử đầu tiên từ Queue 

Để lấy phần tử đầu tiên của Queue chúng ta có thể sử dụng phương thức element hoặc peek. Phương thức element sẽ ném ra ngoại lệ nếu Queue là rỗng, còn peek sẽ trả về là null

```java
Queue<String> queue = new LinkedList<>();

queue.add("element 1");
queue.add("element 2");
queue.add("element 3");

String firstElement = queue.element();
String firstElement = queue.peek();
```

## 6. Xoá phần tử đầu tiên từ Queue 

Để xoá một phần tử chúng ta dùng phương thức remove

```java
Queue<String> queue = new LinkedList<>();

queue.add("element 0");
queue.add("element 1");

String removedElement = queue.remove();
```

## 7. Xoá tất cả phần tử trong Queue 

Chúng ta sử dụng phương thức clear để xoá hết các phần tử trong Queue

```java
queue.clear();
```

## 8. Kiểm tra phần tử đã có trong Queue 

Chúng ta sử dụng phương thức contains để kiểm tra phần tử đã tồn tại trong Queue chưa

```java
Queue<String> queue = new LinkedList<>();

queue.add("Mazda");

boolean containsMazda = queue.contains("Mazda");
boolean containsHonda = queue.contains("Honda");
```

## 9. Duyệt qua phần tử trong Queue

Chúng ta có thể sử dụng Iterator hoặc foreach để duyệt qua các phần tử trong Queue

```java
Queue<String> queue = new LinkedList<>();

queue.add("element 0");
queue.add("element 1");
queue.add("element 2");

//access via Iterator
Iterator<String> iterator = queue.iterator();
while(iterator.hasNext(){
  String element = iterator.next();
}

//access via new for-loop
for(String element : queue) {
    //do something with each element
}
```