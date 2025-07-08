package com.patterns.design.strategy.orderPrinter;

import com.patterns.design.strategy.model.Order;

import java.util.Collection;

//Strategy
public interface OrderPrinter {
	
	void print(Collection<Order> orders);
}
