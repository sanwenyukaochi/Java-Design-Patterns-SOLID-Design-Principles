package com.patterns.design.strategy.service;


import com.patterns.design.strategy.model.Order;
import com.patterns.design.strategy.orderPrinter.OrderPrinter;
import lombok.RequiredArgsConstructor;


import java.util.LinkedList;

//Context
@RequiredArgsConstructor
public class PrintService {

	private final OrderPrinter orderPrinter;
    
    public void printOrders(LinkedList<Order> orders) {
        orderPrinter.print(orders);
    }
}
