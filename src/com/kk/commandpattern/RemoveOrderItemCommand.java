package com.kk.commandpattern;

//Concrete command for removing an item from the order
public class RemoveOrderItemCommand implements OrderItemCommand {
	private String itemName;

	public RemoveOrderItemCommand(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public void execute() {
		System.out.println("Removing item from order: " + itemName);
		//Additional logic for removing an item from the order
	}
}
