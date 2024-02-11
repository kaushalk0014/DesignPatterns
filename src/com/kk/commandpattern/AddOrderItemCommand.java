package com.kk.commandpattern;

//Concrete command for adding an item to the order
public class AddOrderItemCommand implements OrderItemCommand {
	private String itemName;

	public AddOrderItemCommand(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public void execute() {
		System.out.println("Adding item to order: " + itemName);
		//Additional logic for adding an item to the order
	}
}
