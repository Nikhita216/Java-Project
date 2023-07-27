package projectcollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class JavaMiniProject2 {

	public static void main(String[] args) {
	
		         Scanner scanner = new Scanner(System.in);
		         
		         int choice;

		         ArrayList<String> arrayList = new ArrayList<>();
		         LinkedList<String> linkedList = new LinkedList<>();
		         Vector<String> vector = new Vector<>();
		         Stack<String> stack = new Stack<>();
		         HashSet<String> hashSet = new HashSet<>();

		         do {
		             System.out.println("----- Collection Framework Menu -----");
		             System.out.println("1. ArrayList");
		             System.out.println("2. LinkedList");
		             System.out.println("3. Vector");
		             System.out.println("4. Stack");
		             System.out.println("5. HashSet");
		             System.out.println("6. Exit");
		             System.out.print("Enter your choice: ");
		             choice = scanner.nextInt();

		             switch (choice) {
		                 case 1:
		                     performOperations(arrayList, scanner);
		                     break;
		                 case 2:
		                     performOperations(linkedList, scanner);
		                     break;
		                 case 3:
		                     performOperations(vector, scanner);
		                     break;
		                 case 4:
		                     performOperations(stack, scanner);
		                     break;
		                 case 5:
		                     performOperations(hashSet, scanner);
		                     break;
		                 case 6:
		                     System.out.println("Exiting program...");
		                     break;
		                 default:
		                     System.out.println("Invalid choice. Please try again.");
		             }

		             System.out.println();
		         } while (choice != 6);
		     }

		     private static void performOperations(Collection<String> collection, Scanner scanner) {
		         int choice;

		         do {
		             System.out.println("----- Collection Operations -----");
		             System.out.println("1. Add Element");
		             System.out.println("2. Remove Element");
		             System.out.println("3. Display Data");
		             System.out.println("4. Search Element");
		             System.out.println("5. Go Back");
		             System.out.print("Enter your choice: ");
		             choice = scanner.nextInt();

		             switch (choice) {
		                 case 1:
		                     System.out.print("Enter element to add: ");
		                     String elementToAdd = scanner.next();
		                     collection.add(elementToAdd);
		                     System.out.println("Element added successfully.");
		                     break;
		                 case 2:
		                     System.out.print("Enter element to remove: ");
		                     String elementToRemove = scanner.next();
		                     boolean removed = collection.remove(elementToRemove);
		                     if (removed) {
		                         System.out.println("Element removed successfully.");
		                     } else {
		                         System.out.println("Element not found in the collection.");
		                     }
		                     break;
		                 case 3:
		                     System.out.println("Elements in the collection:");
		                     for (String element : collection) {
		                         System.out.println(element);
		                     }
		                     break;
		                 case 4:
		                     System.out.print("Enter element to search: ");
		                     String elementToSearch = scanner.next();
		                     boolean found = collection.contains(elementToSearch);
		                     if (found) {
		                         System.out.println("Element found in the collection.");
		                     } else {
		                         System.out.println("Element not found in the collection.");
		                     }
		                     break;
		                 case 5:
		                     System.out.println("Going back to the main menu...");
		                     break;
		                 default:
		                     System.out.println("Invalid choice. Please try again.");
		             }

		             System.out.println();
		         } while (choice != 5);
		     }
		
	}


