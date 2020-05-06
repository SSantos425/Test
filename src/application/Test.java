package application;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vector[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");
		}
		System.out.println();
		System.out.println("Its int github now");
		System.out.println("Typer a number to be removed");
		int number=sc.nextInt();
		for (int i = 0; i < vector.length-1; i++) {
			if(vector[i]==number) {
				vector[i]=vector[i--];
			}
		}
		System.out.println();
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");
		}
		sc.close();
	}

	
}