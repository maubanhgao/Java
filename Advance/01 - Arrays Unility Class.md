# Lớp Arrarys trong Java (Arrays Utility Class)

[TOC]

Lớp **java.util.Arrays** trong java được sử dụng để thực hiện một số thao tác như sao chép, sắp xếp và tìm kiếm các phần tử trên các mảng. 

## 1. Phương thức toString()

Phương thức **toString()** của mảng được sử dụng để hiển thị tất cả các phần tử của một mảng. Phương thức này trả về chuỗi của tất cả các phần tử của một mảng. Chuỗi này bao gồm tất cả các phần tử được bao quanh trong “[]”. Tất cả các phần tử được phân tách bằng “,” (Dấu phẩy và khoảng cách).

Ví dụ:

```java
package com.gpcoder.arrays;
 
import java.util.Arrays;
 
public class ArraysClass1 {
    public static void main(String[] args) {
        // An array of byte
        byte[] b = { 10, 20, 30 };
 
        System.out.println(Arrays.toString(b)); // Output : [10, 20, 30]
 
        // An array of short
        short[] s = { 40, 50, 60, 70 };
        System.out.println(Arrays.toString(s)); // Output : [40, 50, 60, 70]
 
        // An array of int
        int[] i = { 12, 21, 42, 68 };
        System.out.println(Arrays.toString(i)); // Output : [12, 21, 42, 68]
 
        // An array of long
        long[] l = { 100, 110, 120, 130, 140, 150 };
        System.out.println(Arrays.toString(l)); // Output : [100, 110, 120, 130, 140, 150]
 
        // An array of double
        double[] d = { 12.5, 14.9, 87.4, 55.8 };
        System.out.println(Arrays.toString(d)); // Output : [12.5, 14.9, 87.4, 55.8]
 
        // An array of char
        char[] c = { 'A', 'B', 'C', 'D', 'E' };
        System.out.println(Arrays.toString(c)); // Output : [A, B, C, D, E]
 
        // An array of boolean
        boolean[] bln = { true, false, false, true };
        System.out.println(Arrays.toString(bln)); // Output : [true, false, false, true]
 
        // An array of String
        String[] str = { "welcome", "to", "gpcdoer" };
        System.out.println(Arrays.toString(str)); // Output : [welcome, to, gpcdoer]
    }
}
```

## 2. Phương thức **deepToString()**

Phương thức Arrays.deepToString () được sử dụng để nhận được biểu diễn chuỗi của các mảng đa chiều. Phương thức này trả về nội dung sâu của mảng được chỉ định. Nếu mảng được chỉ định chứa các mảng khác như là các phần tử thì nó sẽ trả lại nội dung của các mảng đó.

Ví dụ:

```java
package com.gpcoder.arrays;
 
import java.util.Arrays;
 
public class ArraysClass8 {
    public static void main(String[] args) {
        // One Dimensional Array
 
        String[] oneDArray = new String[] {
            "ONE", "TWO", "THREE", "FOUR", "FIVE"
        };
        System.out.println("One Dimensional Array : ");
        // Printing one dimensional array contents using deepToString() method
        System.out.println(Arrays.deepToString(oneDArray));
 
        // Two Dimensional Array
 
        String[][] twoDArray = new String[][] { 
            { "ONE", "TWO", "THREE", "FOUR" }, 
            { "FIVE", "SIX", "SEVEN" },
            { "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE" } 
        };
        System.out.println("Two Dimensional Array : ");
        // Printing two dimensional array contents using deepToString() method
        System.out.println(Arrays.deepToString(twoDArray));
 
        // Three Dimensional Array
        String[][][] threeDArray = new String[][][] { 
            { 
                { "ONE", "TWO", "THREE" }, 
                { "FOUR", "FIVE", "SIX", "SEVEN" } 
            }, { 
                { "EIGHT", "NINE", "TEN", "ELEVEN" }, 
                { "TWELVE", "THIRTEEN", "FOURTEEN" } 
            }, { 
                { "FIFTEEN", "SIXTEEN" }, 
                { "SEVENTEEN", "EIGHTEEN", "NINETEEN" }, 
                { "TWENTY", "TWENTY ONE" } 
            } 
        };
        System.out.println("Three Dimensional Array : ");
        // Printing three dimensional array contents using deepToString() method
        System.out.println(Arrays.deepToString(threeDArray));
    }
}
```

Kết quả thực thi chương trình trên:

```markdown
One Dimensional Array : 
[ONE, TWO, THREE, FOUR, FIVE]
Two Dimensional Array : 
[[ONE, TWO, THREE, FOUR], [FIVE, SIX, SEVEN], [EIGHT, NINE, TEN, ELEVEN, TWELVE]]
Three Dimensional Array : 
[[[ONE, TWO, THREE], [FOUR, FIVE, SIX, SEVEN]], [[EIGHT, NINE, TEN, ELEVEN], [TWELVE, THIRTEEN, FOURTEEN]], [[FIFTEEN, SIXTEEN], [SEVENTEEN, EIGHTEEN, NINETEEN], [TWENTY, TWENTY ONE]]]
```

## 3. Phương thức sort()

Phương thức **sort()** được sử dụng để sắp xếp các phần tử của một mảng theo thứ tự tăng dần. Phương thức này, bên trong sử dụng thuật toán **Quicksort** để sắp xếp các phần tử có kiểu nguyên thủy (primitive type), sử dụng giải thuật **MergeSort** để sắp xếp các phần tử có kiểu đối tượng (Object).

> **Collections.sort hoặc Arrays.sort() objects**: sử dụng giải thuật **MergeSort**. Bởi vì, MergeSort sắp xếp tương đối nhanh và ổn định với độ phức tạp là **O(nlog(n))**, trong khi QuickSort không đảm bảo sắp xếp các đối tượng luôn ổn định với độ phức tạp O(nlog(n)). Với QuickSort, trong trường hợp tốt nhất là O(nlog2n), trường hợp trung bình O(nlog2n), trường hợp xấu nhất là O(n2).
>
> **Arrays.sort()** cho *primitive values* sử dụng giải thuật

Lưu ý: Không có phương thức sort() trong lớp Arrays cho các phần tử kiểu **boolean** của mảng.

Ví dụ:

```java
import java.util.Arrays;
 
public class ArraysClass2 {
    public static void main(String[] args) {
        // An array of byte
        byte[] b = { 51, 22, 8, 37 };
        Arrays.sort(b); // sorts elements of the specified array in ascending order
        System.out.println(Arrays.toString(b)); // Output : [8, 22, 37, 51]
 
        // An array of short
        short[] s = { 24, 5, 21, 12, 19 };
        Arrays.sort(s);
        System.out.println(Arrays.toString(s)); // Output : [5, 12, 19, 21, 24]
 
        // An array of int
        int[] i = { 42, 12, 68, 21 };
        Arrays.sort(i);
        System.out.println(Arrays.toString(i)); // Output : [12, 21, 42, 68]
 
        // An array of long
        long[] l = { 879, 412, 258, 985, 856 };
        Arrays.sort(l);
        System.out.println(Arrays.toString(l)); // Output : [258, 412, 856, 879, 985]
 
        // An array of double
        double[] d = { 12.5, 87.4, 41.24, 14.9, 55.8 };
        Arrays.sort(d);
        System.out.println(Arrays.toString(d)); // Output : [12.5, 14.9, 41.24, 55.8, 87.4]
 
        // An array of char
        char[] c = { 'Z', 'B', 'X', 'L', 'b', 'A' };
        Arrays.sort(c);
        System.out.println(Arrays.toString(c)); // Output : [A, B, L, X, Z, b]
 
        // An array of String
        String[] str = { "welcome", "to", "gpcdoer" };
        Arrays.sort(str);
        System.out.println(Arrays.toString(str)); // Output : [gpcdoer, to, welcome]
 
        // An array of boolean
        boolean[] bln = { true, false, false, true };
        // Arrays.sort(bln); // Compile time error
        // There is no sort method in Arrays class which sorts boolean type array
    }
}
```

## 4. Phương thức binarySearch()

Phương thức **binarySearch()** được sử dụng để tìm vị trí của phần tử trong mảng bằng phương thức tìm kiếm nhị phân (**binary search**). **Các phần tử trong mảng phải được sắp xếp trước khi gọi phương thức này**. Nếu chưa sắp xếp, kết quả sẽ không chính xác.

Nếu giá trị được tìm thấy trong mảng, nó trả lại giá trị index của phần tử trong mảng. Nếu không tìm thấy nó trả về giá trị < 0 **(-n-1).** Trong đó, n được gọi là điểm chèn (insertion). Điểm insertion là điểm mà ở đó giá trị tìm kiếm sẽ được chèn vào mảng được sắp xếp. Chẳng hạn, nó sẽ là index của phần tử đầu tiên lớn hơn giá trị tìm kiếm, hoặc nó sẽ là độ dài của mảng nếu tất cả các phần tử của mảng nhỏ hơn giá trị tìm kiếm.

Nếu một mảng chứa nhiều phần tử có giá trị giống nhau và giống với giá trị tìm kiếm, hàm này không đảm bảo chính xác vị trí cần tìm.

Lưu ý: Không có phương thức binarySearch() trong lớp Arrays cho các phần tử kiểu **boolean** của mảng.

Ví dụ:

```java
import java.util.Arrays;
 
public class ArraysClass3 {
    public static void main(String[] args) {
        // An array of int
        int[] i = { 24, 13, 45, 37, 84, 13, 28 };
 
        // Sorting the int array
        Arrays.sort(i);
 
        // Printing sorted array
        System.out.println(Arrays.toString(i)); // Output : [13, 13, 24, 28, 37, 45, 84]
 
        // Searching the value
        System.out.println(Arrays.binarySearch(i, 37)); // Output : 4
        System.out.println(Arrays.binarySearch(i, 13)); // Output : 1
        System.out.println(Arrays.binarySearch(i, 1));  // Output : -1
        System.out.println(Arrays.binarySearch(i, 55)); // Output : -7
 
        // An array of char
        char[] c = { 'X', 'n', 'F', 's', 'D', 'J', 'j', 'F' };
 
        // Sorting the char array
        Arrays.sort(c);
 
        // Printing Sorted array
        System.out.println(Arrays.toString(c)); // Output : [D, F, F, J, X, j, n, s]
 
        // Searching the character
        System.out.println(Arrays.binarySearch(c, 'F')); // Output : 1
        System.out.println(Arrays.binarySearch(c, 'J')); // Output : 3
        System.out.println(Arrays.binarySearch(c, 'H')); // Output : -4
        System.out.println(Arrays.binarySearch(c, 'Z')); // Output : -6
 
        // An array of String
        String[] str = { "First", "second", "Third", "second", "Four", "fifth" };
 
        // Sorting the String array
        Arrays.sort(str);
 
        // Printing Sorted array
        System.out.println(Arrays.toString(str)); // Output : [First, Four, Third, fifth, second, second]
 
        // Searching the string in the array
        System.out.println(Arrays.binarySearch(str, "Third"));  // Output : 2
        System.out.println(Arrays.binarySearch(str, "second")); // Output : 4
        System.out.println(Arrays.binarySearch(str, "One"));    // Output : -3
        System.out.println(Arrays.binarySearch(str, "sixth"));  // Output : -7
    }
}
```

## 5. Phương thức fill()

Phương thức **fill()** được sử dụng để gán giá trị xác định cho mỗi phần tử của một mảng. Phương thức này hữu ích trong việc khởi tạo tất cả các phần tử của một mảng với một giá trị.

Ví dụ:

```java
import java.util.Arrays;
 
public class ArraysClass4 {
    public static void main(String[] args) {
        // An array of int
        int[] i = new int[5];
        Arrays.fill(i, 10); // Assigns 10 to each element of the array
        System.out.println(Arrays.toString(i)); // Output : [10, 10, 10, 10, 10]
 
        // An array of double
        double[] d = { 12.5, 14.8, 45.9, 23.5 };
        Arrays.fill(d, 53.6); // Assigns 53.6 to each element of the array
        System.out.println(Arrays.toString(d)); // Output : [53.6, 53.6, 53.6, 53.6]
 
        // An array of boolean
        boolean[] bln = new boolean[5];
        Arrays.fill(bln, true); // Assigns true to each element of the array
        System.out.println(Arrays.toString(bln)); // Output : [true, true, true, true, true]
 
        // An array of char
        char[] c = new char[10];
        Arrays.fill(c, 'P'); // Assigns P to each element of the array
        System.out.println(Arrays.toString(c)); // Output : [P, P, P, P, P, P, P, P, P, P]
 
        // An array of String
        String[] str = { "Java", "Concepts", "basic java", "Arrays Class" };
        Arrays.fill(str, "value"); // Assigns value to each element of the array
        System.out.println(Arrays.toString(str)); // Output : [value, value, value, value]
    }
}
```

## 6. Phương thức copyOf()

Phương thức **copyOf()** được sử dụng để sao chép mảng được chỉ định vào mảng mới của cùng một kiểu. Trong khi sao chép, mảng mới có thể được cắt ngắn hoặc có đệm với các giá trị mặc định để nó có chiều dài chỉ định.

Ví dụ:

```java
import java.util.Arrays;
 
public class ArraysClass5 {
    public static void main(String[] args) {
        // An array of int
        int[] i = { 1, 21, 15, 48, 79 };
        // Copying array i into array i1
        int[] i1 = Arrays.copyOf(i, 10);
        System.out.println(Arrays.toString(i1)); // Output : [1, 21, 15, 48, 79, 0, 0, 0, 0, 0]
 
        // An array of double
        double[] d = { 12.5, 45.8, 56.2, 47.9, 23.6, 89.5 };
        // Copying array d into array d1
        double[] d1 = Arrays.copyOf(d, 4);
        System.out.println(Arrays.toString(d1)); // Output : [12.5, 45.8, 56.2, 47.9]
 
        // An array of boolean
        boolean[] bln = { true, false, true, true, false };
        // Copying array bln into array bln1
        boolean[] bln1 = Arrays.copyOf(bln, 10);
        System.out.println(Arrays.toString(bln1)); // Output : [true, false, true, true, false, 
                                                    // false, false, false, false, false]
 
        // An array of char
        char[] c = { 'X', 'B', 'Z', 'H', 'I', 'J' };
        // Copying array c into array c1
        char[] c1 = Arrays.copyOf(c, 5);
        System.out.println(Arrays.toString(c1)); // Output : [X, B, Z, H, I]
 
        // An array of String
        String[] str = { "java", "j2ee", "struts", "hibernate" };
        // Copying array str into array str1
        String[] str1 = Arrays.copyOf(str, 7);
        System.out.println(Arrays.toString(str1)); // [java, j2ee, struts, hibernate, null, null, null]
    }
}
```

## 7. Phương thức copyOfRange()

Phương thức **copyOfRange()** được sử dụng để sao chép một phần của một mảng vào mảng khác cùng kiểu. Trong khi sao chép mảng mới có thể được cắt ngắn hoặc đệm với các giá trị mặc định để có được chiều dài yêu cầu.

Ví dụ

```java
import java.util.Arrays;
 
public class ArraysClass6 {
    public static void main(String[] args) {
        // An array of int
        int[] i = { 1, 21, 15, 48, 79 };
        // Copying some part of array i into array i1
        int[] i1 = Arrays.copyOfRange(i, 2, 7);
        System.out.println(Arrays.toString(i1)); // Output : [15, 48, 79, 0, 0]
 
        // An array of double
        double[] d = { 12.5, 45.8, 56.2, 47.9, 23.6, 89.5 };
        // Copying some part of array d into array d1
        double[] d1 = Arrays.copyOfRange(d, 2, 5);
        System.out.println(Arrays.toString(d1)); // Output : [56.2, 47.9, 23.6]
 
        // An array of boolean
        boolean[] bln = { true, false, true, true, false };
        // Copying some part of array bln into array bln1
        boolean[] bln1 = Arrays.copyOfRange(bln, 1, 8);
        System.out.println(Arrays.toString(bln1)); // Output : [false, true, true, false, false, false, false]
 
        // An array of char
        char[] c = { 'X', 'B', 'Z', 'H', 'I', 'J' };
        // Copying some part of array c into array c1
        char[] c1 = Arrays.copyOfRange(c, 2, 4);
        System.out.println(Arrays.toString(c1)); // Output : [Z, H]
 
        // An array of String
        String[] str = { "java", "j2ee", "struts", "hibernate" };
        // Copying some part of array str into array str1
        String[] str1 = Arrays.copyOfRange(str, 4, 8);
        System.out.println(Arrays.toString(str1)); // Output : [null, null, null, null]
    }
}
```

## 8. Phương thức asList()

Phương thức **asList()** được sử dụng để tạo một danh sách từ một mảng được chỉ định.

Các thao tác trên danh sách được truyền đến mảng ban đầu. Điều này có nghĩa là nếu bạn trộn danh sách, mảng ban đầu cũng được xáo trộn, nếu bạn ghi đè lên một phần tử, nó sẽ bị ghi đè lên trong mảng nguyên bản, …. Một số thao tác trong danh sách không được thực hiện trên Wrapper, như thêm hoặc loại bỏ các yếu tố khỏi danh sách, chỉ có thể đọc hoặc ghi đè lên các phần tử.

Ví dụ:

```java
import java.util.Arrays;
import java.util.List;
 
public class ArraysClass7 {
    public static void main(String[] args) {
        // An array of Integer
        Integer arr[] = { 4, 6, 1, 8, 3, 9, 7, 4, 2 };
 
        // Creates a wrapper list over arr[]
        List<Integer> list = Arrays.asList(arr);
        System.out.println(list); // [4, 6, 1, 8, 3, 9, 7, 4, 2]
 
        // list.add(10); // UnsupportedOperationException
        // list.remove(0); // UnsupportedOperationException
 
        list.set(0, 5); // overwrite the elements
        System.out.println(list); // [5, 6, 1, 8, 3, 9, 7, 4, 2]
    }
}
```

## 9. Phương thức equals()

Phương thức **equals()** được sử dụng để so sánh hai mảng có bằng nhau hay không. Phương pháp này lấy hai mảng làm tham số và trả về true nếu cả hai mảng có cùng một số phần tử và các cặp tương ứng của các phần tử của cả hai mảng đều bằng nhau.

Ví dụ:

```java
import java.util.Arrays;
 
public class ArraysClass9 {
    public static void main(String[] args) {
        String[] s1 = { "java", "j2ee", "struts", "hibernate" };
        String[] s2 = { "jsp", "spring", "jdbc", "hibernate" };
        String[] s3 = { "java", "j2ee", "struts", "hibernate" };
        String[] s4 = { "java", "struts", "j2ee", "hibernate" };
 
        System.out.println(Arrays.equals(s1, s2)); // Output : false
        System.out.println(Arrays.equals(s1, s3)); // Output : true
        System.out.println(Arrays.equals(s1, s4)); // Output : false
    }
}
```

Nếu bạn muốn so sánh hai mảng có cùng một số phần tử và cùng một tập hợp các phần tử, nhưng ở các vị trí khác nhau, thì bạn có thể thực hiện như sau: trước tiên sắp xếp cả hai mảng bằng cách sử dụng phương thức Arrays.sort() và sau đó so sánh bằng cách sử dụng phương thức Arrays.equals().

Ví dụ:

```java
import java.util.Arrays;
 
public class ArraysClass10 {
    public static void main(String[] args) {
        String[] s1 = { "java", "j2ee", "struts", "hibernate" };
        String[] s2 = { "hibernate", "struts", "j2ee", "java" };
 
        System.out.println(Arrays.equals(s1, s2)); // Output : false
 
        Arrays.sort(s1);
        Arrays.sort(s2);
        System.out.println(Arrays.equals(s1, s2)); // Output : true
    }
}
```

## 10. Phương thức deepEquals()

Phương thức **deeprequals()** được sử dụng để so sánh hai **mảng hai chiều** có bằng nhau hay không thay vì phương thức equals(). Bởi vì, deepEquals() thực hiện so sánh tất cả các phần tử của mảng con của cả hai mảng.

Ví dụ:

```java
import java.util.Arrays;
 
public class ArraysClass11 {
    public static void main(String[] args) {
        String[][] s1 = { { "java", "swings", "j2ee" }, { "struts", "jsp", "hibernate" } };
        String[][] s2 = { { "java", "swings", "j2ee" }, { "struts", "jsp", "hibernate" } };
 
        System.out.println(Arrays.equals(s1, s2)); // Output : false
        System.out.println(Arrays.deepEquals(s1, s2)); // Output : true
    }
}
```

Trên đây là những ví dụ cơ bản về sử dụng các phương thức được cung cấp bởi lớp Arrays. Để dễ hiểu, tôi đã sử dụng kiểu dữ liệu nguyên thủy (primitive type) trong các ví dụ. Các bạn có thể sử dụng các phương thức này với các kiểu đối tượng (Object).