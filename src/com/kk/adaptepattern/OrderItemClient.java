package com.kk.adaptepattern;

import com.kk.commandpattern.AddOrderItemCommand;
import com.kk.commandpattern.OrderItemCommand;
import com.kk.commandpattern.OrderItemProcessor;
import com.kk.commandpattern.RemoveOrderItemCommand;

public class OrderItemClient {
	public static void main(String[] args) {
		OrderItemProcessor orderItemProcessor = new OrderItemProcessor();
		// Create concrete order item commands
		OrderItemCommand addCommand = new AddOrderItemCommand("Pizza");
		OrderItemCommand removeCommand = new RemoveOrderItemCommand("Burger");
		// Associate commands with the order item processor
		orderItemProcessor.addCommand(addCommand);
		orderItemProcessor.addCommand(removeCommand);
		// Process the commands
		orderItemProcessor.processOrderItems();
	}
}
