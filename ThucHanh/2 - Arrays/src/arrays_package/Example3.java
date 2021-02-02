package arrays_package;

import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {
		// An array of byte
		byte[] b = { 51, 22, 8, 37 };
		Arrays.sort(b);
		// sort elements of the specified array in ascending order
		System.out.println(Arrays.toString(b));

		// An array of short
		short[] s = { 24, 5, 21, 12, 19 };
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));

		// An array of int
		int[] i = { 42, 12, 68, 21 };
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));

		// An array of long
		long[] l = { 879, 412, 258, 985, 856 };
		Arrays.sort(l);
		System.out.println(Arrays.toString(l));
		
		// An array of double
        double[] d = { 12.5, 87.4, 41.24, 14.9, 55.8 };
        Arrays.sort(d);
        System.out.println(Arrays.toString(d));
        
     // An array of char
        char[] c = { 'Z', 'B', 'X', 'L', 'b', 'A' };
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        
     // An array of String
        String[] str = { "welcome", "to", "gpcdoer" };
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        
        // An array of boolean
        boolean[] bln = { true, false, false, true };
        // Arrays.sort(bln); // Compile time error
        // There is no sort method in Arrays class which sorts boolean type array
	}

}
