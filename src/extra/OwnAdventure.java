package extra;

import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("You find yourself stranded on an outcast island... \n"
				+ "What do you do, build a fire to call nearby airplanes(1) or search for fresh water and food(2) ");
		if(a.equals("1")) {
			JOptionPane.showMessageDialog(null, "Scavaging wood wasn't too hard, but building the fire would eventually break your glasses \n"
					+ "and now you have no fire and no food");
			String b = JOptionPane.showInputDialog("Now what should you do? spell SOS in the sand(1) or \n"
					+ " or look for food and water(2)");
			if(b.equals("1")) {
				JOptionPane.showMessageDialog(null, "lucky you, a nearby military plane found your signal and you escaped on day 1");
			}
			else if(b.equals("2")) {
				JOptionPane.showMessageDialog(null, "While looking for food, your stomach pain gets worse and you die...");
			}
		}
		else if(a.equals("2")) {
			JOptionPane.showMessageDialog(null, "Good choice, you gather water and food and build a paradise in which you will never leave...");
		}
		
		
	}
}
