//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
public static void main(String[] args) {
	
Random ran = new Random();
	// 2. Get the user to enter a question for the 8 ball to answer
	JOptionPane.showInputDialog("welcome to the random 8 ball,ask a yes no question?");

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3

	int random = ran.nextInt(4);
	
	// 4. If the random number is 0
if(random==0) {
	
	// -- tell the user "Yes"
JOptionPane.showMessageDialog(null,"yes");
}
	// 5. If the random number is 1
if(random==1) {
	

	// -- tell the user "No"
JOptionPane.showMessageDialog(null,"no");
}
	// 6. If the random number is 2
if(random==2) {
	JOptionPane.showMessageDialog(null,"maybe you should ask google's opinion");
}
	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3
if(random==3) {
	JOptionPane.showMessageDialog(null,"go away");
}
	// -- write your own answer
}
}
