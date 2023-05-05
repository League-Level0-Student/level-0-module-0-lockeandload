package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String math = JOptionPane.showInputDialog("whats 1+1=?");
		// 2. If they say "yes", tell them they will rule the world.
if(math.equals("window")) {
	JOptionPane.showMessageDialog(null,"Your a banana ");
}
		// 3. Otherwise, tell them to sign up for classes at The League.

	}
}

