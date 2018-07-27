package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/* You MUST use the above boolean variables in your code */

		int option = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		System.out.println(option);
		if (option == 1) {
			isWeekday = false;
		} else {
			isWeekday = true;
		}
		int option2 = JOptionPane.showConfirmDialog(null, "Are you on vacation?", "Sleepy Head",
				JOptionPane.YES_NO_OPTION);
		if (option2 == 1) {
			isVacation = false;
		} else {
			isVacation = true;
		}
		if (isWeekday == true && isVacation == true) {
			JOptionPane.showMessageDialog(null, "sleep in");
		} else if (isWeekday == false) {
			JOptionPane.showMessageDialog(null, "sleep in");
		} else if (isWeekday == true && isVacation == false) {
			JOptionPane.showMessageDialog(null, "Wake up! Sleepy head!");
		}
		/*
		 * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!�? If it is a weekday, and we are on vacation, print “sleep
		 * in�?.
		 */
	}
}
