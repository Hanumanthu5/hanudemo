package mypack;

public class ArithematicOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 20;
        int num2 = 8;

        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("--------------------------");

        // 1. Addition (+)
        int sum = num1 + num2;
        System.out.println("Addition (num1 + num2): " + sum);

        // 2. Subtraction (-)
        int difference = num1 - num2;
        System.out.println("Subtraction (num1 - num2): " + difference);

        // 3. Multiplication (*)
        int product = num1 * num2;
        System.out.println("Multiplication (num1 * num2): " + product);

        // 4. Division (/)
        // Note: When dividing two integers, Java performs integer division,
        // which truncates (cuts off) the decimal part.
        int integerDivision = num1 / num2;
        System.out.println("Integer Division (num1 / num2): " + integerDivision);

        // To get a precise decimal result, cast one of the numbers to a double.
        double decimalDivision = (double) num1 / num2;
        System.out.println("Decimal Division ((double) num1 / num2): " + decimalDivision);

        // 5. Modulus (%)
        // This gives the remainder of a division.
        int remainder = num1 % num2;
        System.out.println("Modulus/Remainder (num1 % num2): " + remainder);

	}

}
