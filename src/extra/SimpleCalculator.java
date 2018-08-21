package extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
String n1 = JOptionPane.showInputDialog("Enter First Number...");
String n2 = JOptionPane.showInputDialog("Enter Second Number...");
		// 1. Get 2 numbers from the user and convert them to integer.
int nu1 = Integer.parseInt(n1);
int nu2 = Integer.parseInt(n2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, n1 + " _ " + n2, "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "+", "-", "*", "%" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
static void add(int nu1, int nu2) { 
	int add1 = nu1 + nu2;
	JOptionPane.showMessageDialog(null, nu1 + " + " + nu2 + " = " + add1);
}

	// 4. Create similar methods for subtraction, multiplication and division.
}