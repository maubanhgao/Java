# Mệnh đề If Else

[TOC]

### 1. Mệnh đề If 

```java
int x = 20;
int y = 18;
if (x > y) {
  System.out.println("x is greater than y");
}
```

### 2. Mệnh đề Else 

```java
int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
```

### 3. Mệnh đề If Else 

```java
int time = 22;
if (time < 10) {
  System.out.println("Good morning.");
} else if (time < 20) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
```

### 4. Mệnh đề If Else thu gọn

```java
int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
```

```java
int time = 20;
String result = (time < 18) ? "Good day." : "Good evening.";
```