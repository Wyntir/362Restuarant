package com.restaurant.erp.menu;

import com.restaurant.erp.utils.Constants;
import com.restaurant.erp.utils.JsonUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MenuService {
    private List<MenuItem> menuItems = new ArrayList<>();

    public MenuService() {
        loadMenuItems();
    }

    private void loadMenuItems() {
        try {
            MenuItem[] menuArray = JsonUtils.readFromFile(Constants.MENU_DATA_FILE, MenuItem[].class);
            if (menuArray != null) {
                for (MenuItem m : menuArray) {
                    menuItems.add(m);
                }
            }
        } catch (IOException e) {
            // Handle exception
        }
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
        saveMenuItems();
    }

    private void saveMenuItems() {
        try {
            JsonUtils.writeToFile(Constants.MENU_DATA_FILE, menuItems);
        } catch (IOException e) {
            // Handle exception
        }
    }

    // Other menu-related methods
}
