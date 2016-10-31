import java.util.Scanner;

/**
 * 
 */

/**
 * @author h.hu
 *
 */
public class Theaveragecalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**

		 *

		 * Name: h

		 * Teacher: Mr.Hardman

		 * Assignment 3, Program 1

		 * Date Last Modified:10/31/2016

		 *

		 */
		Scanner userInput = new Scanner(System.in);
		
		double firstmark;
		double secondmark;
		double thirdmark;
		double fourthmark;
		double fifthmark;
		
		double average;
		
		System.out.println("Hello user!");
		
		System.out.print("please enter first mark:");
		firstmark=userInput.nextDouble();
		
		System.out.print("please enter secondmark mark:");
		secondmark=userInput.nextDouble();
		
		System.out.print("please enter thirdmark mark:");
		thirdmark=userInput.nextDouble();
		
		System.out.print("please enter fourthmark mark:");
		fourthmark=userInput.nextDouble();
		
		System.out.print("please enter fifthmark mark:");
		fifthmark=userInput.nextDouble();
		
		average=(firstmark+secondmark+thirdmark+fourthmark+fifthmark)/5;
		
		System.out.println("\n"+String.format("Grade 1:%15s",firstmark));
		System.out.println(String.format("Grade 2:%15s",secondmark));
		System.out.println(String.format("Grade 3:%15s",thirdmark));
		System.out.println(String.format("Grade 4:%15s",fourthmark));
		System.out.println(String.format("Grade 5:%15s",fifthmark));
		System.out.println(String.format("\n"+"The average calculator: %8s",average));
		
		
		userInput.close();
	}

}
