package instanceof_56;

public class Example5 {

	public static void main(String[] args) {
		Object[] objArray = new Object[4];
		objArray[0] = "hello";
		objArray[1] = 1000L;
		objArray[2] = 20;
		objArray[3] = 'c';
		
		for (int i = 0; i < objArray.length; i++) {
			if(objArray[i] instanceof Integer) {
				System.out.println("Kieu integer: " + objArray[i]);
			} else if(objArray[i] instanceof Long) {
				System.out.println("Kieu long: " + objArray[i]);
			} else if(objArray[i] instanceof Character) {
				System.out.println("Kieu char: " + objArray[i]);
			} else {
				System.out.println("Kieu khac : " + objArray[i]);
			}
		}
	}

}
