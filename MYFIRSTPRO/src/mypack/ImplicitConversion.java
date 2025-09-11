package mypack;

public class ImplicitConversion {

	public static void main(String[] args) {
		int myInt = 100;
        System.out.println("Original int value: " + myInt);

        // Implicit conversion from int to long
        long myLong = myInt;
        System.out.println("Implicitly converted long value: " + myLong);

        // Implicit conversion from int to double
        double myDouble = myInt;
        System.out.println("Implicitly converted double value: " + myDouble);
	}

}
