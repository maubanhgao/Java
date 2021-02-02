# Tính đa hình trong lập trình hướng đối tượng

**Tính đa hình trong lập trình hướng đối tượng Java là gì**

**Tính đa hình** **có nghĩa là cùng một hành động nhưng ở những ngữ cảnh khác nhau thì cho ra những hành động khác nhau, hoặc cho ra các kết quả khác nhau.**

**Tính đa hình** có thể nói luôn tồn tại **song song với tính kế thừa**. Khi có nhiều lớp con kế thừa lớp cha nhưng có những tính chất khác nhau cũng gọi là đa hình, hoặc những tác vụ trong cùng một đối tượng được thể hiện nhiều cách khác nhau cũng gọi là đa hình. Tính đa hình là kết quả tất yếu khi ta phát triển khả năng kế thừa và nâng cấp chương trình.

**Ví dụ:** trong hình học tứ giác, hình thang có 3 lớp con là hình thang cân, hình thang vuông và hình bình hành. Vì 3 hình này có vài tính chất riêng biệt nên có thể gọi là tính đa hình.

![](D:\data\source\Hoc lap trinh web\Java\img\5_Bốn tính chất của hướng đối tượng Java_Howkteam_com.png)

**Ví dụ**

```java
class Animal {
  public void makeSound() {
    System.out.println("Động vật kêu");
  }
}

class Pig extends Animal {
  public void makeSound() {
    System.out.println("The pig says: ủn ỉn");
  }
}

class Dog extends Animal {
  public void makeSound() {
    System.out.println("The dog says: gâu gâu");
  }
}


class MyMainClass {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  
    Animal myPig = new Pig();  
    Animal myDog = new Dog();  
    myAnimal.makeSound(); //lúc này sẽ in ra là ("Động vật kêu")
    myPig.makeSound(); // lúc này sẽ in ra là ("The pig says: ủn ỉn");
    myDog.makeSound();// luc này sẽ in là là ("The dog says: gâu gâu")
  }
```

## **2. Tổng kết**

Như vậy chúng ta thấy đa hình ở chỗ myAnimal.makeSound(); myPig.makeSound() ; myDog.makeSound(). Cũng là một phương thức makeSound() như nếu là con chó thì kết quả khác, con heo là kết quả khác