//Fruit and Vegetable Management System

import java.util.*;

 class Item{

	//Instance variable
	private String name;
	private String type;
	private double price;

	//creating constructor
	public Item(String name,String type,double price){
	this.name=name;
	this.type=type;
	this.price=price;
	}

	//Getter Method

	//getName() method
	public String getName(){
		return name;
		}

	//getType() method
	public String getType(){
		return type;
		}

	//getPrice() method
	public double getPrice(){
		return price;
		}
}


//Creating another class name Inventory
 class Inventory{
	ArrayList<Item>items=new ArrayList<>();

	//method to add item
	public void addItem(Item item){
		items.add(item);
		}

	//method for displayItem
	public void displayItems(){
		if(items.isEmpty()){
			System.out.println("Inventory is Empty!");
			}
		for(Item item:items){
			System.out.printf("Name:%s, Type:%s, Price:%.2f%n",item.getName(),item.getType(),item.getPrice());
			}
		}

	//method for categoryWiseDisplay
	public void categoryWiseDisplay(String type){

		System.out.println("Items in category"+type);
		for(Item item:items){

			if(item.getType().equalsIgnoreCase(type)){
				System.out.printf("Name:%s, Price:%.2f%n",item.getName(),item.getPrice());
				return;
				}
			}

			System.out.println("Type of item not found");
		}

	    // Method to search for an item by name
	    public void searchItem(String name) {
	        for (Item item : items) {

	            if (item.getName().equalsIgnoreCase(name)) {
	                System.out.printf("Item found: Name: %s, Type: %s, Price: %.2f%n", item.getName(), item.getType(), item.getPrice());
	                return;
	            }
	        }

	        System.out.println("Item not found!");
    	}


		// Method to purchase an item
		public void purchaseItem(String name, int quantity) {
		     for (Item item : items) {
		         if (item.getName().equalsIgnoreCase(name)) {
		             double totalPrice = item.getPrice() * quantity;
		             System.out.printf("Purchased %d of %s. Total Price: %.2f%n", quantity, name, totalPrice);
		             return;
		         }
		     }
		     System.out.println("Item not available for purchase!");
		 }
	}

// Main class
public class favms {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        // Adding sample items
        inventory.addItem(new Item("Apple", "Fruit", 1.2));
        inventory.addItem(new Item("Carrot", "Vegetable", 0.8));
        inventory.addItem(new Item("Banana", "Fruit", 1.0));
        inventory.addItem(new Item("Potato", "Vegetable", 0.5));

        // Menu-driven program
        int choice;
        do {
            System.out.println("\n1. Add Item");
            System.out.println("2. Display All Items");
            System.out.println("3. Display Category-wise Items");
            System.out.println("4. Search Item");
            System.out.println("5. Purchase Item");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Item Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Item Type (Fruit/Vegetable): ");
                    String type = scanner.nextLine();
                    System.out.print("Enter Item Price: ");
                    double price = scanner.nextDouble();
                    inventory.addItem(new Item(name, type, price));
                }
                case 2 -> inventory.displayItems();
                case 3 -> {
                    System.out.print("Enter Type (Fruit/Vegetable): ");
                    String type = scanner.nextLine();
                    inventory.categoryWiseDisplay(type);
                }
                case 4 -> {
                    System.out.print("Enter Item Name: ");
                    String name = scanner.nextLine();
                    inventory.searchItem(name);
                }
                case 5 -> {
                    System.out.print("Enter Item Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    inventory.purchaseItem(name, quantity);
                }
                case 6 -> System.out.println("Exiting Program...");
                default -> System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}