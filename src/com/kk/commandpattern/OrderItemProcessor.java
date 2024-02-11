package com.kk.commandpattern;

import java.util.ArrayList;
import java.util.List;

public class OrderItemProcessor {
	private List<OrderItemCommand> commandQueue = new ArrayList<>();

	public void addCommand(OrderItemCommand command) {
		commandQueue.add(command);
	}

	public void processOrderItems() {
		for (OrderItemCommand command : commandQueue) {
			command.execute();
		}
		commandQueue.clear();
	}
}
