# So sánh hiệu năng khi sử dụng vòng lặp For, ForEach, Iterator và ListIterator trong Java Collection



```java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author HAVIETTRANG
 * @date Oct 19, 2016 10:31:15 PM
 * @website haviettrang.blogspot.com
 */
public class EffectiveIterator {
    ArrayList<Integer> list = new ArrayList<>();
    
    //Khoi tao list voi 100 phan tu
    public  EffectiveIterator() {
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
    }
    //Method tinh tong cac so tu 1 toi 100
    public void sum() {
        int tong = 0;
        for (int i = 0; i < 100; i++) {
            tong += i;
        }
    }
    
    public void duyetFor(int soLan) {
        int temp = 0;
        for (int i = 0; i < soLan; i++) {
            for (int j = 0; j < list.size(); j++) {
                temp = list.get(j);
            }
        }
    }
    
    public void duyetForEach(int soLan) {
        int temp = 0;
        for (int i = 0; i < soLan; i++) {
            for (Integer integer : list) {
                temp = integer;
            }
        }
    }
    
    public void duyetIterator(int soLan) {
        int temp = 0;
        Iterator<Integer> integers = list.iterator();
        for (int i = 0; i < soLan; i++) {
            while (integers.hasNext()) {
                temp = integers.next();
            }
        }
    }
        
    public void duyetListIterator(int soLan) {
        int temp = 0;
        ListIterator<Integer> listIterator = list.listIterator();
        for (int i = 0; i < soLan; i++) {
            while (listIterator.hasNext()) {
                temp = listIterator.next();
            }
        }
    }
    
    public static void main(String[] args) {
        EffectiveIterator test = new EffectiveIterator();
        
        long start = System.currentTimeMillis();
        test.duyetFor(10000000);
        long end = System.currentTimeMillis();
        
        System.out.println("Dung vong lap FOR mat: " + (end - start) + " ms");
        
        start = System.currentTimeMillis();
        test.duyetForEach(10000000);
        end = System.currentTimeMillis();
        
        System.out.println("Dung vong lap FOR EACH mat: " + (end - start) + " ms");
        
        start = System.currentTimeMillis();
        test.duyetIterator(10000000);
        end = System.currentTimeMillis();
        
        System.out.println("Dung vong lap ITERATOR mat: " + (end - start) + " ms");
        
        start = System.currentTimeMillis();
        test.duyetListIterator(10000000);
        end = System.currentTimeMillis();
        
        System.out.println("Dung vong lap LIST ITERATOR mat: " + (end - start) + " ms");
    }
}
```

Kết quả:

```java
Dung vong lap FOR mat: 2336 ms
Dung vong lap FOR EACH mat: 9604 ms
Dung vong lap ITERATOR mat: 92 ms
Dung vong lap LIST ITERATOR mat: 77 ms
```

Về nhất là ListIterator, tiếp đến là Iterator. Vòng For đã cho chúng ta thấy sự chậm chạp của mình, còn For Each thì... hít bụi.

Với ListIterator và Iterator khá ngang ngửa, thử tăng số lần gấp 10 giá trị cũ xem sao.
Kết quả:
Dung vong lap ITERATOR mat: 469 ms
Dung vong lap LIST ITERATOR mat: 453 ms

Lần này Iterator lại tốn ít thời gian hơn!!! Khá khó lý giải :)))

Như vậy khi duyệt giữa các phần tử trong Java Collection ta nên dùng Iterator hoặc ListIterator để đạt hiệu năng cao nhất.