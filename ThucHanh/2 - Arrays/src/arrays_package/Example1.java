package arrays_package;

import java.util.Arrays;

//Arrays.toString() Phương thức này trả về chuỗi của tất cả các phần tử của một mảng. 
public class Example1 {

	public static void main(String[] args) {
		// an array of byte
		byte[] b = {10, 20, 30};
		System.out.println(Arrays.toString(b));
		
		// an array of short
		short[] s = { 40, 50, 60, 70 };
		System.out.println(Arrays.toString(s));
		
		// an array of int
		int[] i = { 12, 21, 42, 68 };;
		System.out.println(Arrays.toString(i));
		
		// an array of long
		long[] l = { 100, 110, 120, 130, 140, 150 };
		System.out.println(Arrays.toString(l));
		
		// An array of double
        double[] d = { 12.5, 14.9, 87.4, 55.8 };
        System.out.println(Arrays.toString(d));
        
		// an array of boolean 
		boolean[] bln =   { true, false, false, true };
		System.out.println(Arrays.toString(bln));
		
		// An array of String
        String[] str = { "welcome", "to", "gpcdoer" };
        System.out.println(Arrays.toString(str));
	}

}
