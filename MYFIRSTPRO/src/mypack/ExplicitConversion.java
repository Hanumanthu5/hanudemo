package mypack;

public class ExplicitConversion {

	public static void main(String[] args) {
		double myDouble = 99.78;
        System.out.println("Original double value: " + myDouble);

        // Explicit conversion (casting) from double to long
        // The fractional part is lost
        long myLong = (long) myDouble;
        System.out.println("Explicitly converted long value: " + myLong);
        
        // Explicit conversion (casting) from double to int
        // The fractional part is lost
        int myInt = (int) myDouble;
        System.out.println("Explicitly converted int value: " + myInt);
	}

}
