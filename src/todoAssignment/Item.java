package todoAssignment;

public class Item {

	public String itemName;
	public String itemDescription;

	/*
	 * Constructor that creates a blank object
	 */
	public Item() {
		itemName = "";
		itemDescription = "";

	}

	/*
	 * Constructor that creates object from user input
	 */
	public Item(String itemName, String itemDescription) {

		this.itemName = itemName;
		this.itemDescription = itemDescription;
	}

	/*
	 * Getter returns itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/*
	 * Setter sets itemName
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/*
	 * Getter returns itemDescription
	 */
	public String getItemDescription() {
		return itemDescription;
	}

	/*
	 * Setter sets itemDescription
	 */
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	/*
	 * Converts object to String
	 */
	public String toString() {

		return "Todo list name: " + this.itemName + ", Todo list description: " + this.itemDescription;
	}

}
