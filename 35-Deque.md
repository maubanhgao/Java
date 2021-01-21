# Deque

[TOC]

## 1. Deque trong lập trình Java là gì 

**khi chúng ta sử dụng Queue thì chúng ta chỉ được phép thêm phần tử vào sau cùng của tập hợp và lấy ra từ phần đầu của tập hợp.**

Trong trường hợp như muốn thêm bất kỳ phần tử nào có thể thêm vào trước hoặc sau của một tập hợp chứ không theo nguyên lý lúc nào cũng thêm vào sau và lấy ra đầu thì ta sẽ sử dụng Deque.

- Các Class cài đặt Deque là
- LinkedList
- ArrayDeque

## 2. Tạo Deque 

```java
Deque deque = new LinkedList();

Deque deque = new ArrayDeque();
```

## 3. Thêm một phần tử vào Deque 

- Chúng ta có thể sử dụng các phương thức sau để thêm phần tử vào queue như add, addLast, addFirst, offer, offerFirst, offerLast
- Sử dụng phương thức add để thêm phần tử vào đuôi của tập hợp. Nếu không add được thì sẽ nhận kết quả là false

```java
Deque<String> deque = new ArrayDeque<>();

deque.add("element 1");
```

- Sử dụng phương thức addLast để thêm phần tử vào đuôi của tập hợp. Nếu không add được thì sẽ nhận được ngoại lệ được ném ra

```java
Deque<String> deque = new ArrayDeque<>();

deque.addLast("element 1");
```

- Sử dụng phương thức addFirst để thêm phần tử vào đầu của tập hợp. Nếu không thêm được sẽ nhận được lỗi ngoại lệ được ném ra

```java
Deque<String> deque = new ArrayDeque<>();

deque.addFirst("element 1");
```

- Sử dụng offer để thêm các phần tử vào đuôi của tập hợp. Nếu tập hợp đã đầy thì sẽ nhận được kết quả false

```java
Deque<String> deque = new ArrayDeque<>();

deque.offer("element 1");
```

- Sử dụng offerLast để thêm các phần tử vào đuôi của tập hợp

```java
Deque<String> deque = new ArrayDeque<>();

deque.offerLast("element 1");
```

- Sử dụng offerFirst để thêm các phần tử vào phần đầu của tập hợp

```java
Deque<String> deque = new ArrayDeque<>();

deque.offerFirst("element 1");
```

- Sử dụng phương thức push để thêm vào phần tử tại vị trí đầu tiên

```java
Deque<String> deque = new LinkedList<>();

deque.push("element 0");
```

## 4. Peek một phần tử trong Deque 

Để xem một phần tử ở đầu và ở cuối của deque chúng ta có thể sử dụng phương thức như peek, peekFirst, peekLast, getFirst, getLast

- Sử dụng peek

```java
Deque<String> deque = new ArrayDeque<>();

deque.add("first element");
deque.add("last element");

String firstElement = deque.peek();
```

- Sử dụng peekFirst

```java
Deque<String> deque = new ArrayDeque<>();

deque.add("first element");
deque.add("last element");

String firstElement = deque.peekFirst();
```

- Sử dụng peekLast

```java
Deque<String> deque = new ArrayDeque<>();

deque.add("first element");
deque.add("last element");

String lastElement = deque.peekLast();
```

- Sử dụng getFirst

```java
Deque<String> deque = new ArrayDeque<>();

deque.add("first element");
deque.add("last element");


String firstElement = deque.getFirst();
```

- Sử dụng getLast

```java
Deque<String> deque = new ArrayDeque<>();

deque.add("first element");
deque.add("last element");

String lastElement = deque.getLast();
```

## 5. Xoá một phần tử trong Deque 

Để xoá các phần tử trong Deque chúng ta có thể sử dụng phương thức remove, removeFirst, removeLast, poll, pollFirst, pollLast

- Sử dụng remove

```java
Deque<String> deque = new LinkedList<>();

deque.add("element 0");

String removedElement = deque.remove();
```

- Sử dụng removeFirst

```java
Deque<String> deque = new LinkedList<>();

deque.add("element 0");

String removedElement = deque.removeFirst();
```

- Sử dụng removeLast

```java
Deque<String> deque = new LinkedList<>();

deque.add("element 0");
deque.add("element 1");
deque.add("element 2");

String removedElement = deque.removeLast();
```

## 6. Kiểm tra một phần tử đã có trong Deque 

- Chúng ta sử dụng contains để kiểm tra phần tử đã có trong Deque hay chưa.

```java
Deque<String> deque = new ArrayDeque<>();

deque.add("first element");

boolean containsElement1 = deque.contains("first element");
boolean containsElement2 = deque.contains("second element");
```

## 7. Duyệt qua các phần tử đã có trong Deque

- Chúng ta sử dụng Iterator hoặc foreach để duyệt qua các phần tử

```java
Deque<String> deque = new LinkedList<>();

deque.add("element 0");
deque.add("element 1");
deque.add("element 2");

Iterator<String> iterator = deque.iterator();
while(iterator.hasNext(){
  String element = iterator.next();
}
```

```java
Deque<String> deque = new LinkedList<>();

deque.add("element 0");
deque.add("element 1");
deque.add("element 2");

for(String element : deque) {
    System.out.println(element);
}
```

