package Generic;

import java.util.Scanner;

public class Menu {
    private int option;
    public  void menuS() {
        System.out.println("Menu");
        System.out.println("1. Products List: ");
        System.out.println("2. Find A Product by ID: ");
        System.out.println("3. Add A New Product: ");
        System.out.println("4. Delete A Product By ID: ");
        System.out.println("5. Exit.");
       option();

    }
public void option() {
    Scanner sc = new Scanner(System.in);
    option = sc.nextInt();
    sc.nextLine();
}
    public int getOption() {
        return option;
    }
}
