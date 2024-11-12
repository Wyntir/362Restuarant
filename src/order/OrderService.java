package com.restaurant.erp.order;

import com.restaurant.erp.utils.Constants;
import com.restaurant.erp.utils.JsonUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<Order> orders = new ArrayList<>();

    public OrderService() {
        loadOrders();
    }

    private void loadOrders() {
        try {
            Order[] orderArray = JsonUtils.readFromFile(Constants.ORDER_DATA_FILE, Order[].class);
            if (orderArray != null) {
                for (Order o : orderArray) {
                    orders.add(o);
                }
            }
        } catch (IOException e) {
            // Handle exception
        }
    }

    public void placeOrder(Order order) {
        orders.add(order);
        saveOrders();
    }

    private void saveOrders() {
        try {
            JsonUtils.writeToFile(Constants.ORDER_DATA_FILE, orders);
        } catch (IOException e) {
            // Handle exception
        }
    }

    // Other order-related methods
}
