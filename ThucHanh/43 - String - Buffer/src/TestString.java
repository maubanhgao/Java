import java.util.GregorianCalendar;

public class TestString {

	public static void main(String[] args) {
		System.gc();
		long start = new GregorianCalendar().getTimeInMillis();
		long startMemory = Runtime.getRuntime().freeMemory();
		StringBuilder sb = new StringBuilder();
		// StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 10000000; i++) {
			sb.append(":").append(i);
		}
		long end = new GregorianCalendar().getTimeInMillis();
		long endMemory = Runtime.getRuntime().freeMemory();
		System.out.println("Time Takend: " + (end - start));
		System.out.println("Memory used: " + (startMemory - endMemory));
	}

}
