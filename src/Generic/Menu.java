package Generic;

import java.util.Scanner;

public class Menu {
    public static int getOption() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Products List:");
        System.out.println("2. Find A Product by ID:");
        System.out.println("3. Add A New Product:");
        System.out.println("4. Delete A Product By ID:");
        System.out.println("5. Exit.");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        return choice;
    }
}