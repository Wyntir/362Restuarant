package com.restaurant.erp.customer;

import com.restaurant.erp.utils.Constants;
import com.restaurant.erp.utils.JsonUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private List<Customer> customers = new ArrayList<>();

    public CustomerService() {
        loadCustomers();
    }

    private void loadCustomers() {
        try {
            Customer[] customerArray = JsonUtils.readFromFile(Constants.CUSTOMER_DATA_FILE, Customer[].class);
            if (customerArray != null) {
                for (Customer c : customerArray) {
                    customers.add(c);
                }
            }
        } catch (IOException e) {
            // Handle exception
        }
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        saveCustomers();
    }

    private void saveCustomers() {
        try {
            JsonUtils.writeToFile(Constants.CUSTOMER_DATA_FILE, customers);
        } catch (IOException e) {
            // Handle exception
        }
    }

    // Other customer-related methods
}
