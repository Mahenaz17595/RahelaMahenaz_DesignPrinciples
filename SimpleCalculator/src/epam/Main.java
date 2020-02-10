package epam;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		float n1 = 0;
		float n2 = 0;
		
		Calculator calci = new Calculator();
		System.out.println("Calculator!!!");
		System.out.println("Available Operations");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Exit");
		
		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Select an option from 1 to 5");
				
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Enter the first number:");
					n1 = sc.nextFloat();
					System.out.println("Enter the second number:");
					n2 = sc.nextFloat();
					System.out.println("Sum of " + n1 + "+" + n2 +"=" +(calci.sum(n1, n2)));
					break;
				case 2:
					System.out.println("Enter the first number:");
					n1 = sc.nextFloat();
					System.out.println("Enter the second number:");
					n2 = sc.nextFloat();
					System.out.println("Difference of " + n1 + "+" + n2 +"=" +(calci.difference(n1, n2)));
					break;
				case 3:
					System.out.println("Enter the first number:");
					n1 = sc.nextFloat();
					System.out.println("Enter the second number:");
					n2 = sc.nextFloat();
					System.out.println("Multiplication of " + n1 + "+" + n2 +"=" +(calci.multiplication(n1, n2)));
					break;
				case 4:
					System.out.println("Enter the first number:");
					n1 = sc.nextFloat();
					System.out.println("Enter the second number:");
					n2 = sc.nextFloat();
					System.out.println("Division of " + n1 + "+" + n2 +"=" +(calci.division(n1, n2)));
					break;
				case 5:
					System.exit(1);
				default:
					System.out.println("Sorry!! Please select from the available options:");
					break;
					
				}
			} catch(Exception e) {
				System.out.println("Please enter the valid input");
			}
		}
	}

}
