package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScore {

	public static void main(String[] args) {

		String a = JOptionPane.showInputDialog("What was your test score? (decimals included)");
		double b = Double.parseDouble(a);
		if (b >= 90) {
			JOptionPane.showMessageDialog(null, "Wow! Good job, you must of studied hard!");
		} else if (b <= 50) {
			JOptionPane.showMessageDialog(null, "You really need to study more, if you studied");
		} else if (b < 90 && b > 50) {
			JOptionPane.showMessageDialog(null,
					"You should really study more, but atleast you arn't the worst in the class!");
		}

	}
}
