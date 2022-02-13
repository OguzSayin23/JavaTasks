package test.java;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> groceryList = new ArrayList<>();
        choiceItems();

        a:while (true){
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 0) {
                choiceItems();


            }else if (choice == 1) {
                if (groceryList.isEmpty()) {
                    System.out.println("You have 0 items in your grocery list");
                }else{
                    System.out.println("You have "+groceryList.size()+" items in your grocery list");
                    System.out.println(groceryList.toString());
                }
            }else if (choice == 2) {
                System.out.print("Please enter the grocery item:");
                sc.nextLine();
                groceryList.add(sc.nextLine());
            }else if (choice == 3) {
                System.out.print("Enter item number:");
                int a = sc.nextInt();
                System.out.print("Enter replacement item:");
                sc.nextLine();
                String q = sc.nextLine();
                groceryList.set(a-1,q);
                System.out.println("Grocery item "+a+" has been modified");
            }else if (choice == 4) {
                System.out.print("Please enter  item number:");
                sc.nextLine();
                groceryList.remove(sc.nextInt()-1);
            }else if (choice == 5) {
                System.out.print("Item to search for:");
                sc.nextLine();
                String search = sc.nextLine();
                if (groceryList.contains(search)) {
                    System.out.println("Found "+search+" in our grocery list");
                }else{
                    System.out.println("Not found "+search+" in our grocery list");
                }
            }else if (choice == 6) {
                break a;
            }
        }
    }

    public static void choiceItems (){
        System.out.println("Press");
        System.out.println("1 - To print the list of grocery items.");
        System.out.println("2 - To add an item to the list.");
        System.out.println("3 - To modify an item in the list.");
        System.out.println("4 - To remove an item from the list.");
        System.out.println("5 - To search an item from the list.");
        System.out.println("6 - To quit the application.");

    }
}
