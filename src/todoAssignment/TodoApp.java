package todoAssignment;

import java.util.Scanner;

public class TodoApp {
	public static void main(String[] args) {

		System.out.println("=============================");
		System.out.println("  Welcome to your Todo List  ");
		System.out.println("=============================");

		ItemList itemList = new ItemList();
		// itemList.test();

		int option = 0;

		do {
			try {
				System.out.println("===========================");
				System.out.println("  Please choose an option  ");
				System.out.println("===========================");
				System.out.println("1. Enter a task");
				System.out.println("2. Search by index");
				System.out.println("3. Search by name");
				System.out.println("4. Remove a task by list");
				System.out.println("5. Remove by index");
				System.out.println("6. List size");
				System.out.println("7. Exit");
				System.out.println("0. Fill list with test data");

				Scanner input = new Scanner(System.in);
				String menu = input.nextLine();
				option = Integer.parseInt(menu);

				switch (option) {
				case 1:
					System.out.println("=================");
					System.out.println("  Add new task:  ");
					System.out.println("=================");
					itemList.add();

					break;

				case 2:
					System.out.println("======================================");
					System.out.println("  Please choose index number to search  ");
					System.out.println("======================================");

					itemList.search();

					break;

				case 3:

					System.out.println("===============================");
					System.out.println("  Please enter name to search  ");
					System.out.println("===============================");

					itemList.searchName();

					break;

				case 4:
					System.out.println("================");
					System.out.println("  Remove task:  ");
					System.out.println("================");

					itemList.removeItem();

					break;

				case 5:
					System.out.println("===========================================");
					System.out.println("  Please choose which index to be removed  ");
					System.out.println("===========================================");

					itemList.remove();

					break;

				case 6:

					itemList.count();

					break;

				case 0:
					itemList.test();

				}

			} catch (Exception e) {
				System.out.println("====================");
				System.out.println("  Must be a number  ");
				System.out.println("====================");
			}
		}

		while (option != 7);
		System.out.println("=================");
		System.out.println(" Program Exited  ");
		System.out.println("=================");

	}

}
