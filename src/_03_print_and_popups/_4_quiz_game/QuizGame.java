package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
	
		// ASK A QUESTION AND CHECK THE ANSWER
		JOptionPane.showMessageDialog(null, "Don't capitalize  your answers.");

		String zelda_quiz = JOptionPane.showInputDialog("What dose TOTK stand for");
		if(zelda_quiz.equals("tears of the kingdom")) {
			score += 1;
			}
		else {
			score -= 1;
		}
		String zelda_quiz1 = JOptionPane.showInputDialog("Who do you play as in TOTK");
		if(zelda_quiz1.equals("link")) {
		score += 1;
		}
		else {
			score -= 1;	
		}
		String zelda_quiz2 = JOptionPane.showInputDialog("Who do you try to save in TOTK");
		if(zelda_quiz2.equals("zelda")) {
		score += 1;
		}
		else {
			score -= 1;	
		}
		String zelda_quiz3 = JOptionPane.showInputDialog("what are the bird people called in TOTK");
		if(zelda_quiz3.equals("rito")) {
		score += 1;
		}
		else {
			score -= 1;	
		}
		String zelda_quiz4 = JOptionPane.showInputDialog("What dose BOTW stand for");
		if(zelda_quiz4.equals("breath of the wild")) {
		score += 1;
		}
		else {
			score -= 1;	
		}
		String zelda_quiz5 = JOptionPane.showInputDialog("What's a wet surfaces called in BOTW");
		if(zelda_quiz5.equals("an impassable wall")) {
		score += 1;
		}
		else {
			score -= 1;	
		}
		String zelda_quiz6 = JOptionPane.showInputDialog("Where do you start in BOTW");
		if(zelda_quiz6.equals("the great plateau")) {
		score += 1;
		}
		
		else {
			score -= 1;
		}
		String zelda_quiz7 = JOptionPane.showInputDialog("dose link talk, yes or no");
		if(zelda_quiz7.equals("yes")) {
		score += 1;
		}
		else {
			score -= 1;
		}
		
		
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		JOptionPane.showMessageDialog(null, score);

		
		// After all the questions have been asked, tell the user their final score 
	}
}
