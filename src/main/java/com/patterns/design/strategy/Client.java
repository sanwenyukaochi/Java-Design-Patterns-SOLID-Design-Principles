package com.patterns.design.strategy;

import com.patterns.design.strategy.model.Order;
import com.patterns.design.strategy.orderPrinter.impl.DetailPrinter;
import com.patterns.design.strategy.orderPrinter.impl.SummaryPrinter;
import com.patterns.design.strategy.service.PrintService;
import lombok.extern.slf4j.Slf4j;


import java.util.LinkedList;

@Slf4j
public class Client {

    private static final LinkedList<Order> orders = new LinkedList<>();

    public static void main(String[] args) {
        createOrders();
        //print all orders
        
        PrintService serviceSummaryPrinter = new PrintService(new SummaryPrinter());
        serviceSummaryPrinter.printOrders(orders);
        log.info(serviceSummaryPrinter.toString());
        
        PrintService serviceDetailPrinter = new PrintService(new DetailPrinter());
        serviceDetailPrinter.printOrders(orders);
        log.info(serviceDetailPrinter.toString());
    }

    private static void createOrders() {
        Order o;

        o = new Order("200");
        o.addItem("Soda", 2);
        o.addItem("Chips", 10);
        orders.add(o);

        o = new Order("200");
        o.addItem("Cake", 20);
        o.addItem("Cookies", 5);
        orders.add(o);

        o = new Order("300");
        o.addItem("Burger", 8);
        o.addItem("Fries", 5);
        orders.add(o);
    }
}
