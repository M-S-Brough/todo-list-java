package todoAssignment;

import java.util.Scanner;

public class ItemList {

	public ArrayList itemList;
	public Item item;

	/*
	 * Constructor creates arraylist and item object
	 */
	public ItemList() {

		itemList = new ArrayList();
		item = new Item();
	}

	/*
	 * Method that adds item to arraylist by user input
	 */

	public void add() {

		Item newItem = new Item();

		System.out.println("=================");
		System.out.println("  Add todo name  ");
		System.out.println("=================");
		Scanner scanner1 = new Scanner(System.in);
		String i = scanner1.nextLine();
		newItem.setItemName(i);

		System.out.println("========================");
		System.out.println("  Add todo description  ");
		System.out.println("========================");
		Scanner scanner2 = new Scanner(System.in);
		String j = scanner2.nextLine();
		newItem.setItemDescription(j);

		itemList.add(newItem);

	}

	public void add(Item newItem) {
		itemList.add(newItem);
	}

	/*
	 * Method prints all objects in arraylist
	 */
	public void printDetails() {

		System.out.println("=============");
		System.out.println("  Todo List  ");
		System.out.println("=============");

		int n = 1;

		for (int i = 0; i < itemList.size(); i++) {

			System.out.println(n + ". " + itemList.get(i));
			n++;
		}
	}

	/*
	 * Method search arraylist but index entered by user
	 */

	public void search() {
		Scanner sSearchIndex = new Scanner(System.in);
		String indexSearch = sSearchIndex.nextLine();
		int si = Integer.parseInt(indexSearch);

		System.out.println(itemList.get(si));

	}

	/*
	 * Method prints objects number in arraylist for user to remove one
	 */

	public void removeItem() {

		System.out.println("=============");
		System.out.println("  Todo List  ");
		System.out.println("=============");
		int n = 1;

		for (int i = 0; i < itemList.size(); i++) {

			System.out.println(n + ". " + itemList.get(i));
			n++;
		}

		System.out.println("======================================================");
		System.out.println("  Please pick which number you would like to remove?  ");
		System.out.println("======================================================");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int i = Integer.parseInt(input);
		itemList.remove(itemList.get(i - 1));
		System.out.println("================");
		System.out.println("  Item removed  ");
		System.out.println("================");

	}

	/*
	 * Method that removes object from arraylist by index number
	 */

	public void remove() {

		Scanner sInputRemove = new Scanner(System.in);
		String inputRemove = sInputRemove.nextLine();
		int ir = Integer.parseInt(inputRemove);

		itemList.remove(itemList.get(ir - 1));

		System.out.println("================");
		System.out.println("  Item removed  ");
		System.out.println("================");
	}

	/*
	 * MEthod that outputs the size of arraylist
	 */
	public void count() {
		this.printDetails();

		System.out.println("======================================");
		System.out.println("  There are " + itemList.size() + " items in the todo list  ");
		System.out.println("======================================");
	}

	/*
	 * Method that searches arraylist but name of object
	 */

	public void searchName() {

		Scanner searchInput = new Scanner(System.in);
		String search = searchInput.nextLine();

		for (int i = 0; i < itemList.size(); i++) {

			String l = String.valueOf((itemList.get(i)));

			if (l.contains(search)) {

				System.out.println("==============");
				System.out.println("  Item found  ");
				System.out.println("==============");
				System.out.println(l);
			}
		}
		System.out.println("================");
		System.out.println("  Search Ended  ");
		System.out.println("================");

	}

	/*
	 * Method to create test data
	 */
	public void test() {

		Item test1 = new Item("Test1", "This is the 1st test");
		Item test2 = new Item("Test2", "This is the 2nd test");
		Item test3 = new Item("Test3", "This is the 3rd test");
		Item test4 = new Item("Test4", "This is the 4th test");
		Item test5 = new Item("Test5", "This is the 5th test");
		Item test6 = new Item("Test6", "This is the 6th test");

		itemList.add(test1);
		itemList.add(test2);
		itemList.add(test3);
		itemList.add(test4);
		itemList.add(test5);
		itemList.add(test6);
	}

}
