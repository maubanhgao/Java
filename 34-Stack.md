# Stack

[TOC]

## 1. Stack trong lập trình Java là gì 

**chúng ta sử dụng** **Stack** **để lưu trữ các phần tử theo dạng ngăn xếp.**

**Nó khác với Queue là phần tử nào được thêm đầu tiên sẽ được lấy ra đầu tiên.**

- Tạo một Stack

```java
Stack stack = new Stack();
```

## 2. Thêm một phần tử vào Stack 

- Chúng ta sử dụng phương thức push để thêm một phần tử vào Stack

```java
Stack<String> stack = new Stack<String>();

stack.push("1");
```

## 3. Lấy một phần tử ra khỏi Stack 

- Chúng ta sử dụng phương thức pop để lấy một phần tử ra Stack

```java
Stack<String> stack = new Stack<String>();

stack.push("1");

String topElement = stack.pop();
```

## 4. Xem phần tử đầu tiên Stack 

- Chúng ta có thể xem phần tử đầu tiên của Stack là gì mà không cần phải lấy nó ra khỏi Stack thông qua phương thức peek

```java
Stack<String> stack = new Stack<String>();

stack.push("1");

String topElement = stack.peek();
```

## 5. Tìm kiếm trong Stack 

- Chúng ta sử dụng phương thức search để tìm kiếm giá trị trong Queue

```java
Stack<String> stack = new Stack<String>();

stack.push("1");
stack.push("2");
stack.push("3");

int index = stack.search("3");     //index = 3
```

## 6. Kích thướt của Stack 

Để xem kích thướt của Stack ta dùng phương thức size như sau

```java
Stack<String> stack = new Stack<String>();

stack.push("1");
stack.push("2");
stack.push("3");

int size = stack.size();
```

## 7. Duyệt qua các phần tử trong Stack

- Chúng ta sử dụng Iterator để duyệt qua các phần tử trong Stack

```java
Stack<String> stack = new Stack<String>();

stack.push("123");
stack.push("456");
stack.push("789");

Iterator iterator = stack.iterator();
while(iterator.hasNext()){
    Object value = iterator.next();
}
```