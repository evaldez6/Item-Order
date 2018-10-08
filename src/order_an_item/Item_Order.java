/*
 * Coded by Euddy Valdez
 
 * What I want to do:
 * Order either a Switch Pro Controller, a Joycon or a GCN Controller.
 * Select color and how many.
 * Show total price.
 * Ask if user is going to invoice something else.
 */

package order_an_item;

import java.util.Scanner;

public class Item_Order {

	public static void main(String[] args) {
		
		/*
		
		To remember (just a test. you can ignore this.)
		
		Scanner var = new Scanner(System.in);
		
		String item;
		boolean invalid = false;
		
		do {
			
			if (invalid){
				System.out.print("\nWrong input, try again.\n");
			}
			
			System.out.print("Type 'hi' or 'no': ");
			
			item = var.nextLine();
			
			switch (item) {
			
			case "hi":
				System.out.println("\nYou wrote " + item + ".");
				invalid = false;
				break;
			case "no":
				System.out.println("\nYou wrote " + item + ".");
				invalid = false;
				break;
			default:
				invalid = true;			
			}
			
		} while(invalid);
		
		*/
		
		Scanner sc = new Scanner(System.in);
		String item;
		String color;
		String finisht;
		int num = 1;
		int total = 0 ;
		boolean finish = true;
		boolean error = false;
		
		do {
			
			do {
				
				if (error) {
					System.out.print("\n" + "The selected option is invalid. Please try again." + "\n\n");
				}
				
				error = false;
				System.out.print("Select the item the customer would like to order:" + "\n\n"
				+ "1. Joycon Controller." + "\n"
				+ "2. Pro Controller." + "\n"
				+ "3. Gamecube Controller." + "\n\n"
				+ "Select a number: ");	
						
				item = sc.nextLine();
						
				switch (item) {
							
					case "1":
						item = "Joycon Controller";
						total = 40;
						break;
					case "2":
						item = "Pro Controller";
						total = 60;
						break;
					case "3":
						item = "Gamecube Controller";
						total = 20;
						break;
					default:
						error = true;
					}
				
			} while (error);
			
			do {
				
				if (error) {
					System.out.print("\n" + "The selected option is invalid. Please try again." + "\n");
				}
				
				error = false;
				System.out.print("\n" + "Select the color the customer would like to order:" + "\n\n"
				+ "1. Black." + "\n"
				+ "2. White." + "\n"
				+ "3. Red/Blue." + "\n"
				+ "4. Blue" + "\n\n"
				+ "Select a number: ");
				color = sc.nextLine();	
				
				switch (color) {
				
				case "1":
					color = "Black";
					break;
				case "2":
					color = "White";
					break;
				case "3":
					color = "Red/Blue";
					break;
				case "4":
					color = "Blue";
					break;
				default:
					error = true;
				}
				
			} while (error);
			
			do {
				
				if (!(num >= 1 && num <= 10)){
					System.out.print("\n" + "The value inserted is incorrect. Try again." + "\n");
				}
				
				System.out.print("\n" + "How many does the customer would like to order (max 10): ");
				num = sc.nextInt();
				
				
			} while (!(num >= 1 && num <= 10));
			
			total = total * num;
			
			if (num == 1) {
				System.out.print("\n" + "The customer ordered a " + color + " " + item + " ");	
			} else {
				System.out.print("\n" + "The customer ordered " + num + " " + color + " " + item + "s ");
			}
			
			System.out.println("at the cost of $" + total + ".");
			sc.nextLine();
			
			do {
			
				if (error) {
					System.out.print("\n" + "The selected option is invalid. Please try again." + "\n");
				}
				
				error = false;
				finish = true;
				System.out.print("\n" + "Planning to order something else?" + "\n"
				+ "1. Yes." + "\n"
				+ "2. No." + "\n\n"
				+ "Select a number: ");
				finisht = sc.nextLine();
				
				switch (finisht) {
				
				case "1":
					System.out.print("\n" + "Restarting..." + "\n\n");
					finish = false;
					break;
				case "2":
					System.out.println("\n" + "Program finished!");
					break;
				default:
					error = true;
				
				}
				
			} while (error);
						
		} while (!(finish));
		
	}
	
}
