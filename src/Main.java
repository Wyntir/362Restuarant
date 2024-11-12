import customer.Customer;
import customer.CustomerService;
import menu.MenuItem;
import menu.MenuService;
import order.Order;
import order.OrderService;


public class Main {
    public static void main(String[] args) {
        // Initialize services
        CustomerService customerService = new CustomerService();
        MenuService menuService = new MenuService();
        OrderService orderService = new OrderService();

        // Example usage
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("John Doe");
        customer.setEmail("john@example.com");
        customerService.addCustomer(customer);

        MenuItem menuItem = new MenuItem();
        menuItem.setId(1);
        menuItem.setName("Pizza");
        menuItem.setDescription("Delicious cheese pizza");
        menuItem.setPrice(9.99);
        menuService.addMenuItem(menuItem);

        Order order = new Order();
        order.setOrderId(1);
        order.setCustomerId(customer.getId());
        order.setItems(List.of(menuItem));
        order.setTotalAmount(menuItem.getPrice());
        orderService.placeOrder(order);

        // Continue with other operations
    }
}
